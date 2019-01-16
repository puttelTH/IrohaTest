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
public final class OrderingGateTransportGrpcGrpc {

  private OrderingGateTransportGrpcGrpc() {}

  public static final String SERVICE_NAME = "iroha.ordering.proto.OrderingGateTransportGrpc";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getOnProposalMethod()} instead. 
  public static final io.grpc.MethodDescriptor<iroha.protocol.ProposalOuterClass.Proposal,
      com.google.protobuf.Empty> METHOD_ON_PROPOSAL = getOnProposalMethod();

  private static volatile io.grpc.MethodDescriptor<iroha.protocol.ProposalOuterClass.Proposal,
      com.google.protobuf.Empty> getOnProposalMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<iroha.protocol.ProposalOuterClass.Proposal,
      com.google.protobuf.Empty> getOnProposalMethod() {
    io.grpc.MethodDescriptor<iroha.protocol.ProposalOuterClass.Proposal, com.google.protobuf.Empty> getOnProposalMethod;
    if ((getOnProposalMethod = OrderingGateTransportGrpcGrpc.getOnProposalMethod) == null) {
      synchronized (OrderingGateTransportGrpcGrpc.class) {
        if ((getOnProposalMethod = OrderingGateTransportGrpcGrpc.getOnProposalMethod) == null) {
          OrderingGateTransportGrpcGrpc.getOnProposalMethod = getOnProposalMethod = 
              io.grpc.MethodDescriptor.<iroha.protocol.ProposalOuterClass.Proposal, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "iroha.ordering.proto.OrderingGateTransportGrpc", "onProposal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  iroha.protocol.ProposalOuterClass.Proposal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new OrderingGateTransportGrpcMethodDescriptorSupplier("onProposal"))
                  .build();
          }
        }
     }
     return getOnProposalMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrderingGateTransportGrpcStub newStub(io.grpc.Channel channel) {
    return new OrderingGateTransportGrpcStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrderingGateTransportGrpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new OrderingGateTransportGrpcBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrderingGateTransportGrpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new OrderingGateTransportGrpcFutureStub(channel);
  }

  /**
   */
  public static abstract class OrderingGateTransportGrpcImplBase implements io.grpc.BindableService {

    /**
     */
    public void onProposal(iroha.protocol.ProposalOuterClass.Proposal request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getOnProposalMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOnProposalMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                iroha.protocol.ProposalOuterClass.Proposal,
                com.google.protobuf.Empty>(
                  this, METHODID_ON_PROPOSAL)))
          .build();
    }
  }

  /**
   */
  public static final class OrderingGateTransportGrpcStub extends io.grpc.stub.AbstractStub<OrderingGateTransportGrpcStub> {
    private OrderingGateTransportGrpcStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrderingGateTransportGrpcStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderingGateTransportGrpcStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrderingGateTransportGrpcStub(channel, callOptions);
    }

    /**
     */
    public void onProposal(iroha.protocol.ProposalOuterClass.Proposal request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOnProposalMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class OrderingGateTransportGrpcBlockingStub extends io.grpc.stub.AbstractStub<OrderingGateTransportGrpcBlockingStub> {
    private OrderingGateTransportGrpcBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrderingGateTransportGrpcBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderingGateTransportGrpcBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrderingGateTransportGrpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty onProposal(iroha.protocol.ProposalOuterClass.Proposal request) {
      return blockingUnaryCall(
          getChannel(), getOnProposalMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class OrderingGateTransportGrpcFutureStub extends io.grpc.stub.AbstractStub<OrderingGateTransportGrpcFutureStub> {
    private OrderingGateTransportGrpcFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrderingGateTransportGrpcFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderingGateTransportGrpcFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrderingGateTransportGrpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> onProposal(
        iroha.protocol.ProposalOuterClass.Proposal request) {
      return futureUnaryCall(
          getChannel().newCall(getOnProposalMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ON_PROPOSAL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OrderingGateTransportGrpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OrderingGateTransportGrpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ON_PROPOSAL:
          serviceImpl.onProposal((iroha.protocol.ProposalOuterClass.Proposal) request,
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

  private static abstract class OrderingGateTransportGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OrderingGateTransportGrpcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return iroha.ordering.proto.Ordering.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OrderingGateTransportGrpc");
    }
  }

  private static final class OrderingGateTransportGrpcFileDescriptorSupplier
      extends OrderingGateTransportGrpcBaseDescriptorSupplier {
    OrderingGateTransportGrpcFileDescriptorSupplier() {}
  }

  private static final class OrderingGateTransportGrpcMethodDescriptorSupplier
      extends OrderingGateTransportGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OrderingGateTransportGrpcMethodDescriptorSupplier(String methodName) {
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
      synchronized (OrderingGateTransportGrpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OrderingGateTransportGrpcFileDescriptorSupplier())
              .addMethod(getOnProposalMethod())
              .build();
        }
      }
    }
    return result;
  }
}
