package iroha.network.transport;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.8.0)",
    comments = "Source: mst.proto")
public final class MstTransportGrpcGrpc {

  private MstTransportGrpcGrpc() {}

  public static final String SERVICE_NAME = "iroha.network.transport.MstTransportGrpc";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSendStateMethod()} instead. 
  public static final io.grpc.MethodDescriptor<iroha.network.transport.Mst.MstState,
      com.google.protobuf.Empty> METHOD_SEND_STATE = getSendStateMethod();

  private static volatile io.grpc.MethodDescriptor<iroha.network.transport.Mst.MstState,
      com.google.protobuf.Empty> getSendStateMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<iroha.network.transport.Mst.MstState,
      com.google.protobuf.Empty> getSendStateMethod() {
    io.grpc.MethodDescriptor<iroha.network.transport.Mst.MstState, com.google.protobuf.Empty> getSendStateMethod;
    if ((getSendStateMethod = MstTransportGrpcGrpc.getSendStateMethod) == null) {
      synchronized (MstTransportGrpcGrpc.class) {
        if ((getSendStateMethod = MstTransportGrpcGrpc.getSendStateMethod) == null) {
          MstTransportGrpcGrpc.getSendStateMethod = getSendStateMethod = 
              io.grpc.MethodDescriptor.<iroha.network.transport.Mst.MstState, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "iroha.network.transport.MstTransportGrpc", "SendState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  iroha.network.transport.Mst.MstState.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new MstTransportGrpcMethodDescriptorSupplier("SendState"))
                  .build();
          }
        }
     }
     return getSendStateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MstTransportGrpcStub newStub(io.grpc.Channel channel) {
    return new MstTransportGrpcStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MstTransportGrpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MstTransportGrpcBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MstTransportGrpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MstTransportGrpcFutureStub(channel);
  }

  /**
   */
  public static abstract class MstTransportGrpcImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendState(iroha.network.transport.Mst.MstState request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSendStateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendStateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                iroha.network.transport.Mst.MstState,
                com.google.protobuf.Empty>(
                  this, METHODID_SEND_STATE)))
          .build();
    }
  }

  /**
   */
  public static final class MstTransportGrpcStub extends io.grpc.stub.AbstractStub<MstTransportGrpcStub> {
    private MstTransportGrpcStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MstTransportGrpcStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MstTransportGrpcStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MstTransportGrpcStub(channel, callOptions);
    }

    /**
     */
    public void sendState(iroha.network.transport.Mst.MstState request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendStateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MstTransportGrpcBlockingStub extends io.grpc.stub.AbstractStub<MstTransportGrpcBlockingStub> {
    private MstTransportGrpcBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MstTransportGrpcBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MstTransportGrpcBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MstTransportGrpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty sendState(iroha.network.transport.Mst.MstState request) {
      return blockingUnaryCall(
          getChannel(), getSendStateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MstTransportGrpcFutureStub extends io.grpc.stub.AbstractStub<MstTransportGrpcFutureStub> {
    private MstTransportGrpcFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MstTransportGrpcFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MstTransportGrpcFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MstTransportGrpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> sendState(
        iroha.network.transport.Mst.MstState request) {
      return futureUnaryCall(
          getChannel().newCall(getSendStateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_STATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MstTransportGrpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MstTransportGrpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_STATE:
          serviceImpl.sendState((iroha.network.transport.Mst.MstState) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MstTransportGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MstTransportGrpcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return iroha.network.transport.Mst.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MstTransportGrpc");
    }
  }

  private static final class MstTransportGrpcFileDescriptorSupplier
      extends MstTransportGrpcBaseDescriptorSupplier {
    MstTransportGrpcFileDescriptorSupplier() {}
  }

  private static final class MstTransportGrpcMethodDescriptorSupplier
      extends MstTransportGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MstTransportGrpcMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MstTransportGrpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MstTransportGrpcFileDescriptorSupplier())
              .addMethod(getSendStateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
