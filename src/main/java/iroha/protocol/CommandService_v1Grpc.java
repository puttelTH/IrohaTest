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
public final class CommandService_v1Grpc {

  private CommandService_v1Grpc() {}

  public static final String SERVICE_NAME = "iroha.protocol.CommandService_v1";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getToriiMethod()} instead. 
  public static final io.grpc.MethodDescriptor<iroha.protocol.TransactionOuterClass.Transaction,
      com.google.protobuf.Empty> METHOD_TORII = getToriiMethod();

  private static volatile io.grpc.MethodDescriptor<iroha.protocol.TransactionOuterClass.Transaction,
      com.google.protobuf.Empty> getToriiMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<iroha.protocol.TransactionOuterClass.Transaction,
      com.google.protobuf.Empty> getToriiMethod() {
    io.grpc.MethodDescriptor<iroha.protocol.TransactionOuterClass.Transaction, com.google.protobuf.Empty> getToriiMethod;
    if ((getToriiMethod = CommandService_v1Grpc.getToriiMethod) == null) {
      synchronized (CommandService_v1Grpc.class) {
        if ((getToriiMethod = CommandService_v1Grpc.getToriiMethod) == null) {
          CommandService_v1Grpc.getToriiMethod = getToriiMethod = 
              io.grpc.MethodDescriptor.<iroha.protocol.TransactionOuterClass.Transaction, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "iroha.protocol.CommandService_v1", "Torii"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  iroha.protocol.TransactionOuterClass.Transaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new CommandService_v1MethodDescriptorSupplier("Torii"))
                  .build();
          }
        }
     }
     return getToriiMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListToriiMethod()} instead. 
  public static final io.grpc.MethodDescriptor<iroha.protocol.Endpoint.TxList,
      com.google.protobuf.Empty> METHOD_LIST_TORII = getListToriiMethod();

  private static volatile io.grpc.MethodDescriptor<iroha.protocol.Endpoint.TxList,
      com.google.protobuf.Empty> getListToriiMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<iroha.protocol.Endpoint.TxList,
      com.google.protobuf.Empty> getListToriiMethod() {
    io.grpc.MethodDescriptor<iroha.protocol.Endpoint.TxList, com.google.protobuf.Empty> getListToriiMethod;
    if ((getListToriiMethod = CommandService_v1Grpc.getListToriiMethod) == null) {
      synchronized (CommandService_v1Grpc.class) {
        if ((getListToriiMethod = CommandService_v1Grpc.getListToriiMethod) == null) {
          CommandService_v1Grpc.getListToriiMethod = getListToriiMethod = 
              io.grpc.MethodDescriptor.<iroha.protocol.Endpoint.TxList, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "iroha.protocol.CommandService_v1", "ListTorii"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  iroha.protocol.Endpoint.TxList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new CommandService_v1MethodDescriptorSupplier("ListTorii"))
                  .build();
          }
        }
     }
     return getListToriiMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getStatusMethod()} instead. 
  public static final io.grpc.MethodDescriptor<iroha.protocol.Endpoint.TxStatusRequest,
      iroha.protocol.Endpoint.ToriiResponse> METHOD_STATUS = getStatusMethod();

  private static volatile io.grpc.MethodDescriptor<iroha.protocol.Endpoint.TxStatusRequest,
      iroha.protocol.Endpoint.ToriiResponse> getStatusMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<iroha.protocol.Endpoint.TxStatusRequest,
      iroha.protocol.Endpoint.ToriiResponse> getStatusMethod() {
    io.grpc.MethodDescriptor<iroha.protocol.Endpoint.TxStatusRequest, iroha.protocol.Endpoint.ToriiResponse> getStatusMethod;
    if ((getStatusMethod = CommandService_v1Grpc.getStatusMethod) == null) {
      synchronized (CommandService_v1Grpc.class) {
        if ((getStatusMethod = CommandService_v1Grpc.getStatusMethod) == null) {
          CommandService_v1Grpc.getStatusMethod = getStatusMethod = 
              io.grpc.MethodDescriptor.<iroha.protocol.Endpoint.TxStatusRequest, iroha.protocol.Endpoint.ToriiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "iroha.protocol.CommandService_v1", "Status"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  iroha.protocol.Endpoint.TxStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  iroha.protocol.Endpoint.ToriiResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CommandService_v1MethodDescriptorSupplier("Status"))
                  .build();
          }
        }
     }
     return getStatusMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getStatusStreamMethod()} instead. 
  public static final io.grpc.MethodDescriptor<iroha.protocol.Endpoint.TxStatusRequest,
      iroha.protocol.Endpoint.ToriiResponse> METHOD_STATUS_STREAM = getStatusStreamMethod();

  private static volatile io.grpc.MethodDescriptor<iroha.protocol.Endpoint.TxStatusRequest,
      iroha.protocol.Endpoint.ToriiResponse> getStatusStreamMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<iroha.protocol.Endpoint.TxStatusRequest,
      iroha.protocol.Endpoint.ToriiResponse> getStatusStreamMethod() {
    io.grpc.MethodDescriptor<iroha.protocol.Endpoint.TxStatusRequest, iroha.protocol.Endpoint.ToriiResponse> getStatusStreamMethod;
    if ((getStatusStreamMethod = CommandService_v1Grpc.getStatusStreamMethod) == null) {
      synchronized (CommandService_v1Grpc.class) {
        if ((getStatusStreamMethod = CommandService_v1Grpc.getStatusStreamMethod) == null) {
          CommandService_v1Grpc.getStatusStreamMethod = getStatusStreamMethod = 
              io.grpc.MethodDescriptor.<iroha.protocol.Endpoint.TxStatusRequest, iroha.protocol.Endpoint.ToriiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "iroha.protocol.CommandService_v1", "StatusStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  iroha.protocol.Endpoint.TxStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  iroha.protocol.Endpoint.ToriiResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CommandService_v1MethodDescriptorSupplier("StatusStream"))
                  .build();
          }
        }
     }
     return getStatusStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CommandService_v1Stub newStub(io.grpc.Channel channel) {
    return new CommandService_v1Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CommandService_v1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CommandService_v1BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CommandService_v1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CommandService_v1FutureStub(channel);
  }

  /**
   */
  public static abstract class CommandService_v1ImplBase implements io.grpc.BindableService {

    /**
     */
    public void torii(iroha.protocol.TransactionOuterClass.Transaction request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getToriiMethod(), responseObserver);
    }

    /**
     */
    public void listTorii(iroha.protocol.Endpoint.TxList request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getListToriiMethod(), responseObserver);
    }

    /**
     */
    public void status(iroha.protocol.Endpoint.TxStatusRequest request,
        io.grpc.stub.StreamObserver<iroha.protocol.Endpoint.ToriiResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStatusMethod(), responseObserver);
    }

    /**
     */
    public void statusStream(iroha.protocol.Endpoint.TxStatusRequest request,
        io.grpc.stub.StreamObserver<iroha.protocol.Endpoint.ToriiResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStatusStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getToriiMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                iroha.protocol.TransactionOuterClass.Transaction,
                com.google.protobuf.Empty>(
                  this, METHODID_TORII)))
          .addMethod(
            getListToriiMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                iroha.protocol.Endpoint.TxList,
                com.google.protobuf.Empty>(
                  this, METHODID_LIST_TORII)))
          .addMethod(
            getStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                iroha.protocol.Endpoint.TxStatusRequest,
                iroha.protocol.Endpoint.ToriiResponse>(
                  this, METHODID_STATUS)))
          .addMethod(
            getStatusStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                iroha.protocol.Endpoint.TxStatusRequest,
                iroha.protocol.Endpoint.ToriiResponse>(
                  this, METHODID_STATUS_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class CommandService_v1Stub extends io.grpc.stub.AbstractStub<CommandService_v1Stub> {
    private CommandService_v1Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private CommandService_v1Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommandService_v1Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommandService_v1Stub(channel, callOptions);
    }

    /**
     */
    public void torii(iroha.protocol.TransactionOuterClass.Transaction request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getToriiMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listTorii(iroha.protocol.Endpoint.TxList request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListToriiMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void status(iroha.protocol.Endpoint.TxStatusRequest request,
        io.grpc.stub.StreamObserver<iroha.protocol.Endpoint.ToriiResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void statusStream(iroha.protocol.Endpoint.TxStatusRequest request,
        io.grpc.stub.StreamObserver<iroha.protocol.Endpoint.ToriiResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getStatusStreamMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CommandService_v1BlockingStub extends io.grpc.stub.AbstractStub<CommandService_v1BlockingStub> {
    private CommandService_v1BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CommandService_v1BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommandService_v1BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommandService_v1BlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty torii(iroha.protocol.TransactionOuterClass.Transaction request) {
      return blockingUnaryCall(
          getChannel(), getToriiMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty listTorii(iroha.protocol.Endpoint.TxList request) {
      return blockingUnaryCall(
          getChannel(), getListToriiMethod(), getCallOptions(), request);
    }

    /**
     */
    public iroha.protocol.Endpoint.ToriiResponse status(iroha.protocol.Endpoint.TxStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<iroha.protocol.Endpoint.ToriiResponse> statusStream(
        iroha.protocol.Endpoint.TxStatusRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getStatusStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CommandService_v1FutureStub extends io.grpc.stub.AbstractStub<CommandService_v1FutureStub> {
    private CommandService_v1FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CommandService_v1FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommandService_v1FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommandService_v1FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> torii(
        iroha.protocol.TransactionOuterClass.Transaction request) {
      return futureUnaryCall(
          getChannel().newCall(getToriiMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> listTorii(
        iroha.protocol.Endpoint.TxList request) {
      return futureUnaryCall(
          getChannel().newCall(getListToriiMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<iroha.protocol.Endpoint.ToriiResponse> status(
        iroha.protocol.Endpoint.TxStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TORII = 0;
  private static final int METHODID_LIST_TORII = 1;
  private static final int METHODID_STATUS = 2;
  private static final int METHODID_STATUS_STREAM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CommandService_v1ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CommandService_v1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TORII:
          serviceImpl.torii((iroha.protocol.TransactionOuterClass.Transaction) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_TORII:
          serviceImpl.listTorii((iroha.protocol.Endpoint.TxList) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_STATUS:
          serviceImpl.status((iroha.protocol.Endpoint.TxStatusRequest) request,
              (io.grpc.stub.StreamObserver<iroha.protocol.Endpoint.ToriiResponse>) responseObserver);
          break;
        case METHODID_STATUS_STREAM:
          serviceImpl.statusStream((iroha.protocol.Endpoint.TxStatusRequest) request,
              (io.grpc.stub.StreamObserver<iroha.protocol.Endpoint.ToriiResponse>) responseObserver);
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

  private static abstract class CommandService_v1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CommandService_v1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return iroha.protocol.Endpoint.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CommandService_v1");
    }
  }

  private static final class CommandService_v1FileDescriptorSupplier
      extends CommandService_v1BaseDescriptorSupplier {
    CommandService_v1FileDescriptorSupplier() {}
  }

  private static final class CommandService_v1MethodDescriptorSupplier
      extends CommandService_v1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CommandService_v1MethodDescriptorSupplier(String methodName) {
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
      synchronized (CommandService_v1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CommandService_v1FileDescriptorSupplier())
              .addMethod(getToriiMethod())
              .addMethod(getListToriiMethod())
              .addMethod(getStatusMethod())
              .addMethod(getStatusStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
