package iroha.protocol;

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
    comments = "Source: endpoint.proto")
public final class QueryService_v1Grpc {

  private QueryService_v1Grpc() {}

  public static final String SERVICE_NAME = "iroha.protocol.QueryService_v1";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFindMethod()} instead. 
  public static final io.grpc.MethodDescriptor<iroha.protocol.Queries.Query,
      iroha.protocol.QryResponses.QueryResponse> METHOD_FIND = getFindMethod();

  private static volatile io.grpc.MethodDescriptor<iroha.protocol.Queries.Query,
      iroha.protocol.QryResponses.QueryResponse> getFindMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<iroha.protocol.Queries.Query,
      iroha.protocol.QryResponses.QueryResponse> getFindMethod() {
    io.grpc.MethodDescriptor<iroha.protocol.Queries.Query, iroha.protocol.QryResponses.QueryResponse> getFindMethod;
    if ((getFindMethod = QueryService_v1Grpc.getFindMethod) == null) {
      synchronized (QueryService_v1Grpc.class) {
        if ((getFindMethod = QueryService_v1Grpc.getFindMethod) == null) {
          QueryService_v1Grpc.getFindMethod = getFindMethod = 
              io.grpc.MethodDescriptor.<iroha.protocol.Queries.Query, iroha.protocol.QryResponses.QueryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "iroha.protocol.QueryService_v1", "Find"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  iroha.protocol.Queries.Query.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  iroha.protocol.QryResponses.QueryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryService_v1MethodDescriptorSupplier("Find"))
                  .build();
          }
        }
     }
     return getFindMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFetchCommitsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<iroha.protocol.Queries.BlocksQuery,
      iroha.protocol.QryResponses.BlockQueryResponse> METHOD_FETCH_COMMITS = getFetchCommitsMethod();

  private static volatile io.grpc.MethodDescriptor<iroha.protocol.Queries.BlocksQuery,
      iroha.protocol.QryResponses.BlockQueryResponse> getFetchCommitsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<iroha.protocol.Queries.BlocksQuery,
      iroha.protocol.QryResponses.BlockQueryResponse> getFetchCommitsMethod() {
    io.grpc.MethodDescriptor<iroha.protocol.Queries.BlocksQuery, iroha.protocol.QryResponses.BlockQueryResponse> getFetchCommitsMethod;
    if ((getFetchCommitsMethod = QueryService_v1Grpc.getFetchCommitsMethod) == null) {
      synchronized (QueryService_v1Grpc.class) {
        if ((getFetchCommitsMethod = QueryService_v1Grpc.getFetchCommitsMethod) == null) {
          QueryService_v1Grpc.getFetchCommitsMethod = getFetchCommitsMethod = 
              io.grpc.MethodDescriptor.<iroha.protocol.Queries.BlocksQuery, iroha.protocol.QryResponses.BlockQueryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "iroha.protocol.QueryService_v1", "FetchCommits"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  iroha.protocol.Queries.BlocksQuery.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  iroha.protocol.QryResponses.BlockQueryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryService_v1MethodDescriptorSupplier("FetchCommits"))
                  .build();
          }
        }
     }
     return getFetchCommitsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryService_v1Stub newStub(io.grpc.Channel channel) {
    return new QueryService_v1Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryService_v1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new QueryService_v1BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryService_v1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new QueryService_v1FutureStub(channel);
  }

  /**
   */
  public static abstract class QueryService_v1ImplBase implements io.grpc.BindableService {

    /**
     */
    public void find(iroha.protocol.Queries.Query request,
        io.grpc.stub.StreamObserver<iroha.protocol.QryResponses.QueryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindMethod(), responseObserver);
    }

    /**
     */
    public void fetchCommits(iroha.protocol.Queries.BlocksQuery request,
        io.grpc.stub.StreamObserver<iroha.protocol.QryResponses.BlockQueryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFetchCommitsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                iroha.protocol.Queries.Query,
                iroha.protocol.QryResponses.QueryResponse>(
                  this, METHODID_FIND)))
          .addMethod(
            getFetchCommitsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                iroha.protocol.Queries.BlocksQuery,
                iroha.protocol.QryResponses.BlockQueryResponse>(
                  this, METHODID_FETCH_COMMITS)))
          .build();
    }
  }

  /**
   */
  public static final class QueryService_v1Stub extends io.grpc.stub.AbstractStub<QueryService_v1Stub> {
    private QueryService_v1Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryService_v1Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryService_v1Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryService_v1Stub(channel, callOptions);
    }

    /**
     */
    public void find(iroha.protocol.Queries.Query request,
        io.grpc.stub.StreamObserver<iroha.protocol.QryResponses.QueryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fetchCommits(iroha.protocol.Queries.BlocksQuery request,
        io.grpc.stub.StreamObserver<iroha.protocol.QryResponses.BlockQueryResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getFetchCommitsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class QueryService_v1BlockingStub extends io.grpc.stub.AbstractStub<QueryService_v1BlockingStub> {
    private QueryService_v1BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryService_v1BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryService_v1BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryService_v1BlockingStub(channel, callOptions);
    }

    /**
     */
    public iroha.protocol.QryResponses.QueryResponse find(iroha.protocol.Queries.Query request) {
      return blockingUnaryCall(
          getChannel(), getFindMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<iroha.protocol.QryResponses.BlockQueryResponse> fetchCommits(
        iroha.protocol.Queries.BlocksQuery request) {
      return blockingServerStreamingCall(
          getChannel(), getFetchCommitsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class QueryService_v1FutureStub extends io.grpc.stub.AbstractStub<QueryService_v1FutureStub> {
    private QueryService_v1FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryService_v1FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryService_v1FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryService_v1FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<iroha.protocol.QryResponses.QueryResponse> find(
        iroha.protocol.Queries.Query request) {
      return futureUnaryCall(
          getChannel().newCall(getFindMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND = 0;
  private static final int METHODID_FETCH_COMMITS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QueryService_v1ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QueryService_v1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND:
          serviceImpl.find((iroha.protocol.Queries.Query) request,
              (io.grpc.stub.StreamObserver<iroha.protocol.QryResponses.QueryResponse>) responseObserver);
          break;
        case METHODID_FETCH_COMMITS:
          serviceImpl.fetchCommits((iroha.protocol.Queries.BlocksQuery) request,
              (io.grpc.stub.StreamObserver<iroha.protocol.QryResponses.BlockQueryResponse>) responseObserver);
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

  private static abstract class QueryService_v1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryService_v1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return iroha.protocol.Endpoint.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QueryService_v1");
    }
  }

  private static final class QueryService_v1FileDescriptorSupplier
      extends QueryService_v1BaseDescriptorSupplier {
    QueryService_v1FileDescriptorSupplier() {}
  }

  private static final class QueryService_v1MethodDescriptorSupplier
      extends QueryService_v1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryService_v1MethodDescriptorSupplier(String methodName) {
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
      synchronized (QueryService_v1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryService_v1FileDescriptorSupplier())
              .addMethod(getFindMethod())
              .addMethod(getFetchCommitsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
