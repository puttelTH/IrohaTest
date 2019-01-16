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
public final class OnDemandOrderingGrpc {

  private OnDemandOrderingGrpc() {}

  public static final String SERVICE_NAME = "iroha.ordering.proto.OnDemandOrdering";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSendBatchesMethod()} instead. 
  public static final io.grpc.MethodDescriptor<iroha.ordering.proto.Ordering.BatchesRequest,
      com.google.protobuf.Empty> METHOD_SEND_BATCHES = getSendBatchesMethod();

  private static volatile io.grpc.MethodDescriptor<iroha.ordering.proto.Ordering.BatchesRequest,
      com.google.protobuf.Empty> getSendBatchesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<iroha.ordering.proto.Ordering.BatchesRequest,
      com.google.protobuf.Empty> getSendBatchesMethod() {
    io.grpc.MethodDescriptor<iroha.ordering.proto.Ordering.BatchesRequest, com.google.protobuf.Empty> getSendBatchesMethod;
    if ((getSendBatchesMethod = OnDemandOrderingGrpc.getSendBatchesMethod) == null) {
      synchronized (OnDemandOrderingGrpc.class) {
        if ((getSendBatchesMethod = OnDemandOrderingGrpc.getSendBatchesMethod) == null) {
          OnDemandOrderingGrpc.getSendBatchesMethod = getSendBatchesMethod = 
              io.grpc.MethodDescriptor.<iroha.ordering.proto.Ordering.BatchesRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "iroha.ordering.proto.OnDemandOrdering", "SendBatches"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  iroha.ordering.proto.Ordering.BatchesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new OnDemandOrderingMethodDescriptorSupplier("SendBatches"))
                  .build();
          }
        }
     }
     return getSendBatchesMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getRequestProposalMethod()} instead. 
  public static final io.grpc.MethodDescriptor<iroha.ordering.proto.Ordering.ProposalRequest,
      iroha.ordering.proto.Ordering.ProposalResponse> METHOD_REQUEST_PROPOSAL = getRequestProposalMethod();

  private static volatile io.grpc.MethodDescriptor<iroha.ordering.proto.Ordering.ProposalRequest,
      iroha.ordering.proto.Ordering.ProposalResponse> getRequestProposalMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<iroha.ordering.proto.Ordering.ProposalRequest,
      iroha.ordering.proto.Ordering.ProposalResponse> getRequestProposalMethod() {
    io.grpc.MethodDescriptor<iroha.ordering.proto.Ordering.ProposalRequest, iroha.ordering.proto.Ordering.ProposalResponse> getRequestProposalMethod;
    if ((getRequestProposalMethod = OnDemandOrderingGrpc.getRequestProposalMethod) == null) {
      synchronized (OnDemandOrderingGrpc.class) {
        if ((getRequestProposalMethod = OnDemandOrderingGrpc.getRequestProposalMethod) == null) {
          OnDemandOrderingGrpc.getRequestProposalMethod = getRequestProposalMethod = 
              io.grpc.MethodDescriptor.<iroha.ordering.proto.Ordering.ProposalRequest, iroha.ordering.proto.Ordering.ProposalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "iroha.ordering.proto.OnDemandOrdering", "RequestProposal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  iroha.ordering.proto.Ordering.ProposalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  iroha.ordering.proto.Ordering.ProposalResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OnDemandOrderingMethodDescriptorSupplier("RequestProposal"))
                  .build();
          }
        }
     }
     return getRequestProposalMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OnDemandOrderingStub newStub(io.grpc.Channel channel) {
    return new OnDemandOrderingStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OnDemandOrderingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new OnDemandOrderingBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OnDemandOrderingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new OnDemandOrderingFutureStub(channel);
  }

  /**
   */
  public static abstract class OnDemandOrderingImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendBatches(iroha.ordering.proto.Ordering.BatchesRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSendBatchesMethod(), responseObserver);
    }

    /**
     */
    public void requestProposal(iroha.ordering.proto.Ordering.ProposalRequest request,
        io.grpc.stub.StreamObserver<iroha.ordering.proto.Ordering.ProposalResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRequestProposalMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendBatchesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                iroha.ordering.proto.Ordering.BatchesRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_SEND_BATCHES)))
          .addMethod(
            getRequestProposalMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                iroha.ordering.proto.Ordering.ProposalRequest,
                iroha.ordering.proto.Ordering.ProposalResponse>(
                  this, METHODID_REQUEST_PROPOSAL)))
          .build();
    }
  }

  /**
   */
  public static final class OnDemandOrderingStub extends io.grpc.stub.AbstractStub<OnDemandOrderingStub> {
    private OnDemandOrderingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OnDemandOrderingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OnDemandOrderingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OnDemandOrderingStub(channel, callOptions);
    }

    /**
     */
    public void sendBatches(iroha.ordering.proto.Ordering.BatchesRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendBatchesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void requestProposal(iroha.ordering.proto.Ordering.ProposalRequest request,
        io.grpc.stub.StreamObserver<iroha.ordering.proto.Ordering.ProposalResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRequestProposalMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class OnDemandOrderingBlockingStub extends io.grpc.stub.AbstractStub<OnDemandOrderingBlockingStub> {
    private OnDemandOrderingBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OnDemandOrderingBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OnDemandOrderingBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OnDemandOrderingBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty sendBatches(iroha.ordering.proto.Ordering.BatchesRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendBatchesMethod(), getCallOptions(), request);
    }

    /**
     */
    public iroha.ordering.proto.Ordering.ProposalResponse requestProposal(iroha.ordering.proto.Ordering.ProposalRequest request) {
      return blockingUnaryCall(
          getChannel(), getRequestProposalMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class OnDemandOrderingFutureStub extends io.grpc.stub.AbstractStub<OnDemandOrderingFutureStub> {
    private OnDemandOrderingFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OnDemandOrderingFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OnDemandOrderingFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OnDemandOrderingFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> sendBatches(
        iroha.ordering.proto.Ordering.BatchesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendBatchesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<iroha.ordering.proto.Ordering.ProposalResponse> requestProposal(
        iroha.ordering.proto.Ordering.ProposalRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRequestProposalMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_BATCHES = 0;
  private static final int METHODID_REQUEST_PROPOSAL = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OnDemandOrderingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OnDemandOrderingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_BATCHES:
          serviceImpl.sendBatches((iroha.ordering.proto.Ordering.BatchesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_REQUEST_PROPOSAL:
          serviceImpl.requestProposal((iroha.ordering.proto.Ordering.ProposalRequest) request,
              (io.grpc.stub.StreamObserver<iroha.ordering.proto.Ordering.ProposalResponse>) responseObserver);
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

  private static abstract class OnDemandOrderingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OnDemandOrderingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return iroha.ordering.proto.Ordering.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OnDemandOrdering");
    }
  }

  private static final class OnDemandOrderingFileDescriptorSupplier
      extends OnDemandOrderingBaseDescriptorSupplier {
    OnDemandOrderingFileDescriptorSupplier() {}
  }

  private static final class OnDemandOrderingMethodDescriptorSupplier
      extends OnDemandOrderingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OnDemandOrderingMethodDescriptorSupplier(String methodName) {
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
      synchronized (OnDemandOrderingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OnDemandOrderingFileDescriptorSupplier())
              .addMethod(getSendBatchesMethod())
              .addMethod(getRequestProposalMethod())
              .build();
        }
      }
    }
    return result;
  }
}
