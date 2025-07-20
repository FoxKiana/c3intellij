// This is a generated file. Not intended for manual editing.
package org.c3lang.intellij.psi;

import java.util.List;
import org.jetbrains.annotations.*;

public interface C3BinaryExpr extends C3Expr {

  @NotNull
  List<C3Expr> getExprList();

  @NotNull
  C3Expr getLeft();

  @Nullable
  C3Expr getRight();
}
