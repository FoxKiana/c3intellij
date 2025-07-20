// This is a generated file. Not intended for manual editing.
package org.c3lang.intellij.psi.impl;

import static org.c3lang.intellij.psi.C3Types.*;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.c3lang.intellij.psi.*;
import org.jetbrains.annotations.*;

public class C3CallExprTailImpl extends C3PsiElementImpl implements C3CallExprTail {

  public C3CallExprTailImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull C3Visitor visitor) {
    visitor.visitCallExprTail(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof C3Visitor) accept((C3Visitor) visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public C3AccessIdent getAccessIdent() {
    return findChildByClass(C3AccessIdent.class);
  }

  @Override
  @Nullable
  public C3CallInvocation getCallInvocation() {
    return findChildByClass(C3CallInvocation.class);
  }

  @Override
  @Nullable
  public C3CompoundStatement getCompoundStatement() {
    return findChildByClass(C3CompoundStatement.class);
  }

  @Override
  @Nullable
  public C3GenericParameters getGenericParameters() {
    return findChildByClass(C3GenericParameters.class);
  }

  @Override
  @Nullable
  public C3RangeExp getRangeExp() {
    return findChildByClass(C3RangeExp.class);
  }

  @Override
  @Nullable
  public C3RangeLoc getRangeLoc() {
    return findChildByClass(C3RangeLoc.class);
  }
}
