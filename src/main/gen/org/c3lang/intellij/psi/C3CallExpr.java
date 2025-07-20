// This is a generated file. Not intended for manual editing.
package org.c3lang.intellij.psi;

import org.jetbrains.annotations.*;

public interface C3CallExpr extends C3Expr, C3CallExprMixin {

  @NotNull
  C3CallExprTail getCallExprTail();

  @NotNull
  C3Expr getExpr();

  boolean isDeprecated();
}
