// This is a generated file. Not intended for manual editing.
package org.c3lang.intellij.psi;

import java.util.List;
import org.jetbrains.annotations.*;

public interface C3AsmBlockStmt extends C3PsiElement {

  @NotNull
  List<C3AsmStmt> getAsmStmtList();

  @Nullable
  C3Attributes getAttributes();

  @Nullable
  C3Expr getExpr();
}
