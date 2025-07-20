// This is a generated file. Not intended for manual editing.
package org.c3lang.intellij.psi.impl;

import static org.c3lang.intellij.psi.C3Types.*;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.c3lang.intellij.psi.*;
import org.jetbrains.annotations.*;

public class C3FuncDefinitionImpl extends C3PsiElementImpl implements C3FuncDefinition {

  public C3FuncDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull C3Visitor visitor) {
    visitor.visitFuncDefinition(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof C3Visitor) accept((C3Visitor) visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public C3FuncDef getFuncDef() {
    return findNotNullChildByClass(C3FuncDef.class);
  }

  @Override
  @Nullable
  public C3MacroFuncBody getMacroFuncBody() {
    return findChildByClass(C3MacroFuncBody.class);
  }
}
