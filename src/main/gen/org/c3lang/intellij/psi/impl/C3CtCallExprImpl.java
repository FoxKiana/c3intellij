// This is a generated file. Not intended for manual editing.
package org.c3lang.intellij.psi.impl;

import static org.c3lang.intellij.psi.C3Types.*;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.c3lang.intellij.psi.*;
import org.jetbrains.annotations.*;

public class C3CtCallExprImpl extends C3ExprImpl implements C3CtCallExpr {

  public C3CtCallExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull C3Visitor visitor) {
    visitor.visitCtCallExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof C3Visitor) accept((C3Visitor) visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public C3CtCall getCtCall() {
    return findNotNullChildByClass(C3CtCall.class);
  }

  @Override
  @NotNull
  public C3FlatPath getFlatPath() {
    return findNotNullChildByClass(C3FlatPath.class);
  }
}
