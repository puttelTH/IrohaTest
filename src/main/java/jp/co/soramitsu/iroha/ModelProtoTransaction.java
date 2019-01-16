/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package jp.co.soramitsu.iroha;

public class ModelProtoTransaction {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ModelProtoTransaction(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ModelProtoTransaction obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        irohaJNI.delete_ModelProtoTransaction(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ModelProtoTransaction(UnsignedTx us) {
    this(irohaJNI.new_ModelProtoTransaction(UnsignedTx.getCPtr(us), us), true);
  }

  public ModelProtoTransaction signAndAddSignature(Keypair keypair) {
    return new ModelProtoTransaction(irohaJNI.ModelProtoTransaction_signAndAddSignature(swigCPtr, this, Keypair.getCPtr(keypair), keypair), true);
  }

  public Blob finish() {
    return new Blob(irohaJNI.ModelProtoTransaction_finish(swigCPtr, this), true);
  }

}
