package iroha.network.proto;

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
    comments = "Source: loader.proto")
public final class LoaderGrpc {

  private LoaderGrpc() {}

  public static final String SERVICE_NAME = "iroha.network.proto.Loader";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getRetrieveBlocksMethod()} instead. 
  public static final io.grpc.MethodDescriptor<iroha.network.proto.LoaderOuterClass.BlocksRequest,
      iroha.protocol.BlockOuterClass.Block> METHOD_RETRIEVE_BLOCKS = getRetrieveBlocksMethod();

  private static volatile io.grpc.MethodDescriptor<iroha.network.proto.LoaderOuterClass.BlocksRequest,
      iroha.protocol.BlockOuterClass.Block> getRetrieveBlocksMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<iroha.network.proto.LoaderOuterClass.BlocksRequest,
      iroha.protocol.BlockOuterClass.Block> getRetrieveBlocksMethod() {
    io.grpc.MethodDescriptor<iroha.network.proto.LoaderOuterClass.BlocksRequest, iroha.protocol.BlockOuterClass.Block> getRetrieveBlocksMethod;
    if ((getRetrieveBlocksMethod = LoaderGrpc.getRetrieveBlocksMethod) == null) {
      synchronized (LoaderGrpc.class) {
        if ((getRetrieveBlocksMethod = LoaderGrpc.getRetrieveBlocksMethod) == null) {
          LoaderGrpc.getRetrieveBlocksMethod = getRetrieveBlocksMethod = 
              io.grpc.MethodDescriptor.<iroha.network.proto.LoaderOuterClass.BlocksRequest, iroha.protocol.BlockOuterClass.Block>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "iroha.network.proto.Loader", "retrieveBlocks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  iroha.network.proto.LoaderOuterClass.BlocksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  iroha.protocol.BlockOuterClass.Block.getDefaultInstance()))
                  .setSchemaDescriptor(new LoaderMethodDescriptorSupplier("retrieveBlocks"))
                  .build();
          }
        }
     }
     return getRetrieveBlocksMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getRetrieveBlockMethod()} instead. 
  public static final io.grpc.MethodDescriptor<iroha.network.proto.LoaderOuterClass.BlockRequest,
      iroha.protocol.BlockOuterClass.Block> METHOD_RETRIEVE_BLOCK = getRetrieveBlockMethod();

  private static volatile io.grpc.MethodDescriptor<iroha.network.proto.LoaderOuterClass.BlockRequest,
      iroha.protocol.BlockOuterClass.Block> getRetrieveBlockMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<iroha.network.proto.LoaderOuterClass.BlockRequest,
      iroha.protocol.BlockOuterClass.Block> getRetrieveBlockMethod() {
    io.grpc.MethodDescriptor<iroha.network.proto.LoaderOuterClass.BlockRequest, iroha.protocol.BlockOuterClass.Block> getRetrieveBlockMethod;
    if ((getRetrieveBlockMethod = LoaderGrpc.getRetrieveBlockMethod) == null) {
      synchronized (LoaderGrpc.class) {
        if ((getRetrieveBlockMethod = LoaderGrpc.getRetrieveBlockMethod) == null) {
          LoaderGrpc.getRetrieveBlockMethod = getRetrieveBlockMethod = 
              io.grpc.MethodDescriptor.<iroha.network.proto.LoaderOuterClass.BlockRequest, iroha.protocol.BlockOuterClass.Block>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "iroha.network.proto.Loader", "retrieveBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  iroha.network.proto.LoaderOuterClass.BlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  iroha.protocol.BlockOuterClass.Block.getDefaultInstance()))
                  .setSchemaDescriptor(new LoaderMethodDescriptorSupplier("retrieveBlock"))
                  .build();
          }
        }
     }
     return getRetrieveBlockMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LoaderStub newStub(io.grpc.Channel channel) {
    return new LoaderStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LoaderBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LoaderBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LoaderFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LoaderFutureStub(channel);
  }

  /**
   */
  public static abstract class LoaderImplBase implements io.grpc.BindableService {

    /**
     */
    public void retrieveBlocks(iroha.network.proto.LoaderOuterClass.BlocksRequest request,
        io.grpc.stub.StreamObserver<iroha.protocol.BlockOuterClass.Block> responseObserver) {
      asyncUnimplementedUnaryCall(getRetrieveBlocksMethod(), responseObserver);
    }

    /**
     */
    public void retrieveBlock(iroha.network.proto.LoaderOuterClass.BlockRequest request,
        io.grpc.stub.StreamObserver<iroha.protocol.BlockOuterClass.Block> responseObserver) {
      asyncUnimplementedUnaryCall(getRetrieveBlockMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRetrieveBlocksMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                iroha.network.proto.LoaderOuterClass.BlocksRequest,
                iroha.protocol.BlockOuterClass.Block>(
                  this, METHODID_RETRIEVE_BLOCKS)))
          .addMethod(
            getRetrieveBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                iroha.network.proto.LoaderOuterClass.BlockRequest,
                iroha.protocol.BlockOuterClass.Block>(
                  this, METHODID_RETRIEVE_BLOCK)))
          .build();
    }
  }

  /**
   */
  public static final class LoaderStub extends io.grpc.stub.AbstractStub<LoaderStub> {
    private LoaderStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LoaderStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoaderStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LoaderStub(channel, callOptions);
    }

    /**
     */
    public void retrieveBlocks(iroha.network.proto.LoaderOuterClass.BlocksRequest request,
        io.grpc.stub.StreamObserver<iroha.protocol.BlockOuterClass.Block> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getRetrieveBlocksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void retrieveBlock(iroha.network.proto.LoaderOuterClass.BlockRequest request,
        io.grpc.stub.StreamObserver<iroha.protocol.BlockOuterClass.Block> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRetrieveBlockMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LoaderBlockingStub extends io.grpc.stub.AbstractStub<LoaderBlockingStub> {
    private LoaderBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LoaderBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoaderBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LoaderBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<iroha.protocol.BlockOuterClass.Block> retrieveBlocks(
        iroha.network.proto.LoaderOuterClass.BlocksRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getRetrieveBlocksMethod(), getCallOptions(), request);
    }

    /**
     */
    public iroha.protocol.BlockOuterClass.Block retrieveBlock(iroha.network.proto.LoaderOuterClass.BlockRequest request) {
      return blockingUnaryCall(
          getChannel(), getRetrieveBlockMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LoaderFutureStub extends io.grpc.stub.AbstractStub<LoaderFutureStub> {
    private LoaderFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LoaderFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoaderFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LoaderFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<iroha.protocol.BlockOuterClass.Block> retrieveBlock(
        iroha.network.proto.LoaderOuterClass.BlockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRetrieveBlockMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RETRIEVE_BLOCKS = 0;
  private static final int METHODID_RETRIEVE_BLOCK = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LoaderImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LoaderImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RETRIEVE_BLOCKS:
          serviceImpl.retrieveBlocks((iroha.network.proto.LoaderOuterClass.BlocksRequest) request,
              (io.grpc.stub.StreamObserver<iroha.protocol.BlockOuterClass.Block>) responseObserver);
          break;
        case METHODID_RETRIEVE_BLOCK:
          serviceImpl.retrieveBlock((iroha.network.proto.LoaderOuterClass.BlockRequest) request,
              (io.grpc.stub.StreamObserver<iroha.protocol.BlockOuterClass.Block>) responseObserver);
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

  private static abstract class LoaderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LoaderBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return iroha.network.proto.LoaderOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Loader");
    }
  }

  private static final class LoaderFileDescriptorSupplier
      extends LoaderBaseDescriptorSupplier {
    LoaderFileDescriptorSupplier() {}
  }

  private static final class LoaderMethodDescriptorSupplier
      extends LoaderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LoaderMethodDescriptorSupplier(String methodName) {
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
      synchronized (LoaderGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LoaderFileDescriptorSupplier())
              .addMethod(getRetrieveBlocksMethod())
              .addMethod(getRetrieveBlockMethod())
              .build();
        }
      }
    }
    return result;
  }
}
