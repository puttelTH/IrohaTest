/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package jp.co.soramitsu.iroha;

public class GrantablePermissionSet {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GrantablePermissionSet(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GrantablePermissionSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        irohaJNI.delete_GrantablePermissionSet(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public GrantablePermissionSet() {
    this(irohaJNI.new_GrantablePermissionSet__SWIG_0(), true);
  }

  public GrantablePermissionSet(String bitstring) {
    this(irohaJNI.new_GrantablePermissionSet__SWIG_1(bitstring), true);
  }

  public String toBitstring() {
    return irohaJNI.GrantablePermissionSet_toBitstring(swigCPtr, this);
  }

  public static long size() {
    return irohaJNI.GrantablePermissionSet_size();
  }

  public GrantablePermissionSet reset() {
    return new GrantablePermissionSet(irohaJNI.GrantablePermissionSet_reset(swigCPtr, this), false);
  }

  public GrantablePermissionSet set() {
    return new GrantablePermissionSet(irohaJNI.GrantablePermissionSet_set__SWIG_0(swigCPtr, this), false);
  }

  public GrantablePermissionSet set(Grantable p) {
    return new GrantablePermissionSet(irohaJNI.GrantablePermissionSet_set__SWIG_1(swigCPtr, this, p.swigValue()), false);
  }

  public GrantablePermissionSet unset(Grantable p) {
    return new GrantablePermissionSet(irohaJNI.GrantablePermissionSet_unset(swigCPtr, this, p.swigValue()), false);
  }

  public boolean test(Grantable p) {
    return irohaJNI.GrantablePermissionSet_test(swigCPtr, this, p.swigValue());
  }

  public boolean none() {
    return irohaJNI.GrantablePermissionSet_none(swigCPtr, this);
  }

  public boolean isSubsetOf(GrantablePermissionSet r) {
    return irohaJNI.GrantablePermissionSet_isSubsetOf(swigCPtr, this, GrantablePermissionSet.getCPtr(r), r);
  }

  public boolean equal(GrantablePermissionSet r) {
    return irohaJNI.GrantablePermissionSet_equal(swigCPtr, this, GrantablePermissionSet.getCPtr(r), r);
  }

  public boolean not_equal(GrantablePermissionSet r) {
    return irohaJNI.GrantablePermissionSet_not_equal(swigCPtr, this, GrantablePermissionSet.getCPtr(r), r);
  }

  public GrantablePermissionSet bset_and(GrantablePermissionSet r) {
    return new GrantablePermissionSet(irohaJNI.GrantablePermissionSet_bset_and(swigCPtr, this, GrantablePermissionSet.getCPtr(r), r), false);
  }

  public GrantablePermissionSet bset_or(GrantablePermissionSet r) {
    return new GrantablePermissionSet(irohaJNI.GrantablePermissionSet_bset_or(swigCPtr, this, GrantablePermissionSet.getCPtr(r), r), false);
  }

  public GrantablePermissionSet bset_xor(GrantablePermissionSet r) {
    return new GrantablePermissionSet(irohaJNI.GrantablePermissionSet_bset_xor(swigCPtr, this, GrantablePermissionSet.getCPtr(r), r), false);
  }

  public void iterate(SWIGTYPE_p_std__functionT_void_fshared_model__interface__permissions__GrantableF_t f) {
    irohaJNI.GrantablePermissionSet_iterate(swigCPtr, this, SWIGTYPE_p_std__functionT_void_fshared_model__interface__permissions__GrantableF_t.getCPtr(f));
  }

  public GrantablePermissionSet(IntVector perms) {
    this(irohaJNI.new_GrantablePermissionSet__SWIG_2(IntVector.getCPtr(perms), perms), true);
  }

}
