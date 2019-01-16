package iroha.ordering.proto;

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
    comments = "Source: ordering.proto")
public final class OrderingServiceTransportGrpcGrpc {

  private OrderingServiceTransportGrpcGrpc() {}

  public static final String SERVICE_NAME = "iroha.ordering.proto.OrderingServiceTransportGrpc";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getOnBatchMethod()} instead. 
  public static final io.grpc.MethodDescriptor<iroha.protocol.Endpoint.TxList,
      com.google.protobuf.Empty> METHOD_ON_BATCH = getOnBatchMethod();

  private static volatile io.grpc.MethodDescriptor<iroha.protocol.Endpoint.TxList,
      com.google.protobuf.Empty> getOnBatchMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<iroha.protocol.Endpoint.TxList,
      com.google.protobuf.Empty> getOnBatchMethod() {
    io.grpc.MethodDescriptor<iroha.protocol.Endpoint.TxList, com.google.protobuf.Empty> getOnBatchMethod;
    if ((getOnBatchMethod = OrderingServiceTransportGrpcGrpc.getOnBatchMethod) == null) {
      synchronized (OrderingServiceTransportGrpcGrpc.class) {
        if ((getOnBatchMethod = OrderingServiceTransportGrpcGrpc.getOnBatchMethod) == null) {
          OrderingServiceTransportGrpcGrpc.getOnBatchMethod = getOnBatchMethod = 
              io.grpc.MethodDescriptor.<iroha.protocol.Endpoint.TxList, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "iroha.ordering.proto.OrderingServiceTransportGrpc", "onBatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  iroha.protocol.Endpoint.TxList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new OrderingServiceTransportGrpcMethodDescriptorSupplier("onBatch"))
                  .build();
          }
        }
     }
     return getOnBatchMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrderingServiceTransportGrpcStub newStub(io.grpc.Channel channel) {
    return new OrderingServiceTransportGrpcStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrderingServiceTransportGrpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new OrderingServiceTransportGrpcBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrderingServiceTransportGrpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new OrderingServiceTransportGrpcFutureStub(channel);
  }

  /**
   */
  public static abstract class OrderingServiceTransportGrpcImplBase implements io.grpc.BindableService {

    /**
     */
    public void onBatch(iroha.protocol.Endpoint.TxList request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getOnBatchMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOnBatchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                iroha.protocol.Endpoint.TxList,
                com.google.protobuf.Empty>(
                  this, METHODID_ON_BATCH)))
          .build();
    }
  }

  /**
   */
  public static final class OrderingServiceTransportGrpcStub extends io.grpc.stub.AbstractStub<OrderingServiceTransportGrpcStub> {
    private OrderingServiceTransportGrpcStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrderingServiceTransportGrpcStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderingServiceTransportGrpcStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrderingServiceTransportGrpcStub(channel, callOptions);
    }

    /**
     */
    public void onBatch(iroha.protocol.Endpoint.TxList request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOnBatchMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class OrderingServiceTransportGrpcBlockingStub extends io.grpc.stub.AbstractStub<OrderingServiceTransportGrpcBlockingStub> {
    private OrderingServiceTransportGrpcBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrderingServiceTransportGrpcBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderingServiceTransportGrpcBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrderingServiceTransportGrpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty onBatch(iroha.protocol.Endpoint.TxList request) {
      return blockingUnaryCall(
          getChannel(), getOnBatchMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class OrderingServiceTransportGrpcFutureStub extends io.grpc.stub.AbstractStub<OrderingServiceTransportGrpcFutureStub> {
    private OrderingServiceTransportGrpcFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrderingServiceTransportGrpcFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderingServiceTransportGrpcFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrderingServiceTransportGrpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> onBatch(
        iroha.protocol.Endpoint.TxList request) {
      return futureUnaryCall(
          getChannel().newCall(getOnBatchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ON_BATCH = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OrderingServiceTransportGrpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OrderingServiceTransportGrpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ON_BATCH:
          serviceImpl.onBatch((iroha.protocol.Endpoint.TxList) request,
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

  private static abstract class OrderingServiceTransportGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OrderingServiceTransportGrpcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return iroha.ordering.proto.Ordering.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OrderingServiceTransportGrpc");
    }
  }

  private static final class OrderingServiceTransportGrpcFileDescriptorSupplier
      extends OrderingServiceTransportGrpcBaseDescriptorSupplier {
    OrderingServiceTransportGrpcFileDescriptorSupplier() {}
  }

  private static final class OrderingServiceTransportGrpcMethodDescriptorSupplier
      extends OrderingServiceTransportGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OrderingServiceTransportGrpcMethodDescriptorSupplier(String methodName) {
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
      synchronized (OrderingServiceTransportGrpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OrderingServiceTransportGrpcFileDescriptorSupplier())
              .addMethod(getOnBatchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
