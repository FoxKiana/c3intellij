// This is a generated file. Not intended for manual editing.
package org.c3lang.intellij.psi.impl;

import static org.c3lang.intellij.psi.C3Types.*;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.c3lang.intellij.psi.*;
import org.jetbrains.annotations.*;

public class C3LocalDeclarationStmtImpl extends C3LocalDeclarationStmtMixinImpl
    implements C3LocalDeclarationStmt {

  public C3LocalDeclarationStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull C3Visitor visitor) {
    visitor.visitLocalDeclarationStmt(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof C3Visitor) accept((C3Visitor) visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public C3DeclStmtAfterType getDeclStmtAfterType() {
    return findChildByClass(C3DeclStmtAfterType.class);
  }

  @Override
  @Nullable
  public C3LocalDeclStorage getLocalDeclStorage() {
    return findChildByClass(C3LocalDeclStorage.class);
  }

  @Override
  @NotNull
  public C3OptionalType getOptionalType() {
    return findNotNullChildByClass(C3OptionalType.class);
  }
}
