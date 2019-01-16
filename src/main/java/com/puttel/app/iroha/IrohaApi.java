package com.puttel.app.iroha;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import iroha.protocol.*;
import jp.co.soramitsu.iroha.*;

import java.math.BigInteger;

public class IrohaApi {
    static {
        try {
            System.loadLibrary("irohajava");
            System.out.println("Load.......");
        } catch (UnsatisfiedLinkError e) {
            System.out.println("Native code library failed to load. \n" + e);
            System.out.println("java library path :: "+System.getProperty("java.library.path"));
        }
    }
    ModelCrypto crypto;
    Keypair keysAdmin;
    String gw="192.168.1.55";
    //String gw="172.31.58.205";
    String creator="admin@test";
    String domain="puttel";
    long startQueryCounter = 1;

    public IrohaApi(){
        crypto = new ModelCrypto();
        keysAdmin = crypto.convertFromExisting("46c26e4c2cd50e9552d80bd4967e30af7c0d2947d68a2c479269ee46077ff8b9","b9346eb49ea00fe4e8f6416e9411fd660a967969ecc6225698a97a06238b3ff4");
    }
    public String getlibPath(){
        return System.getProperty("java.library.path");
    }
    public String getAccount(String account) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(gw, 50051).usePlaintext(true).build();

        ModelQueryBuilder queryBuilder = new ModelQueryBuilder();
        long currentTime = System.currentTimeMillis();
        UnsignedQuery uquery = queryBuilder.creatorAccountId(creator)
                .queryCounter(BigInteger.valueOf(startQueryCounter))
                .createdTime(BigInteger.valueOf(currentTime))
                .getAccount(account)
                .build();
        ByteVector queryBlob = new ModelProtoQuery(uquery).signAndAddSignature(keysAdmin).finish().blob();
        byte bquery[] = toByteArray(queryBlob);
        Queries.Query protoQuery = null;
        try {
            protoQuery = Queries.Query.parseFrom(bquery);
        } catch (InvalidProtocolBufferException e) {
            System.err.println("Exception while converting byte array to protobuf:" + e.getMessage());
        }

        QueryService_v1Grpc.QueryService_v1BlockingStub queryStub = QueryService_v1Grpc.newBlockingStub(channel);
        QryResponses.QueryResponse queryResponse = queryStub.find(protoQuery);
        QryResponses.Account user = queryResponse.getAccountResponse().getAccount();
        System.out.println("Account ID = " + user.getAccountId());

        channel.shutdown();
        return user.getAccountId().trim();

    }

    public static byte[] toByteArray(ByteVector blob) {
        byte bs[] = new byte[(int)blob.size()];
        for (int i = 0; i < blob.size(); ++i) {
            bs[i] = (byte)blob.get(i);
        }
        return bs;
    }
}
