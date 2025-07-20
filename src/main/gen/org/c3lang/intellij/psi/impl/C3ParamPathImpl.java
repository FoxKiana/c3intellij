// This is a generated file. Not intended for manual editing.
package org.c3lang.intellij.psi.impl;

import static org.c3lang.intellij.psi.C3Types.*;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import java.util.List;
import org.c3lang.intellij.psi.*;
import org.jetbrains.annotations.*;

public class C3ParamPathImpl extends C3PsiElementImpl implements C3ParamPath {

  public C3ParamPathImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull C3Visitor visitor) {
    visitor.visitParamPath(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof C3Visitor) accept((C3Visitor) visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<C3ParamPathElement> getParamPathElementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, C3ParamPathElement.class);
  }
}
