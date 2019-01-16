package iroha.consensus.yac.proto;

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
    comments = "Source: yac.proto")
public final class YacGrpc {

  private YacGrpc() {}

  public static final String SERVICE_NAME = "iroha.consensus.yac.proto.Yac";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSendStateMethod()} instead. 
  public static final io.grpc.MethodDescriptor<iroha.consensus.yac.proto.YacOuterClass.State,
      com.google.protobuf.Empty> METHOD_SEND_STATE = getSendStateMethod();

  private static volatile io.grpc.MethodDescriptor<iroha.consensus.yac.proto.YacOuterClass.State,
      com.google.protobuf.Empty> getSendStateMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<iroha.consensus.yac.proto.YacOuterClass.State,
      com.google.protobuf.Empty> getSendStateMethod() {
    io.grpc.MethodDescriptor<iroha.consensus.yac.proto.YacOuterClass.State, com.google.protobuf.Empty> getSendStateMethod;
    if ((getSendStateMethod = YacGrpc.getSendStateMethod) == null) {
      synchronized (YacGrpc.class) {
        if ((getSendStateMethod = YacGrpc.getSendStateMethod) == null) {
          YacGrpc.getSendStateMethod = getSendStateMethod = 
              io.grpc.MethodDescriptor.<iroha.consensus.yac.proto.YacOuterClass.State, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "iroha.consensus.yac.proto.Yac", "SendState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  iroha.consensus.yac.proto.YacOuterClass.State.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new YacMethodDescriptorSupplier("SendState"))
                  .build();
          }
        }
     }
     return getSendStateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static YacStub newStub(io.grpc.Channel channel) {
    return new YacStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static YacBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new YacBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static YacFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new YacFutureStub(channel);
  }

  /**
   */
  public static abstract class YacImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendState(iroha.consensus.yac.proto.YacOuterClass.State request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSendStateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendStateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                iroha.consensus.yac.proto.YacOuterClass.State,
                com.google.protobuf.Empty>(
                  this, METHODID_SEND_STATE)))
          .build();
    }
  }

  /**
   */
  public static final class YacStub extends io.grpc.stub.AbstractStub<YacStub> {
    private YacStub(io.grpc.Channel channel) {
      super(channel);
    }

    private YacStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected YacStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new YacStub(channel, callOptions);
    }

    /**
     */
    public void sendState(iroha.consensus.yac.proto.YacOuterClass.State request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendStateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class YacBlockingStub extends io.grpc.stub.AbstractStub<YacBlockingStub> {
    private YacBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private YacBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected YacBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new YacBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty sendState(iroha.consensus.yac.proto.YacOuterClass.State request) {
      return blockingUnaryCall(
          getChannel(), getSendStateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class YacFutureStub extends io.grpc.stub.AbstractStub<YacFutureStub> {
    private YacFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private YacFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected YacFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new YacFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> sendState(
        iroha.consensus.yac.proto.YacOuterClass.State request) {
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
    private final YacImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(YacImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_STATE:
          serviceImpl.sendState((iroha.consensus.yac.proto.YacOuterClass.State) request,
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

  private static abstract class YacBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    YacBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return iroha.consensus.yac.proto.YacOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Yac");
    }
  }

  private static final class YacFileDescriptorSupplier
      extends YacBaseDescriptorSupplier {
    YacFileDescriptorSupplier() {}
  }

  private static final class YacMethodDescriptorSupplier
      extends YacBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    YacMethodDescriptorSupplier(String methodName) {
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
      synchronized (YacGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new YacFileDescriptorSupplier())
              .addMethod(getSendStateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
