package org.c3lang.intellij.psi;

import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

public interface C3PsiElement extends PsiElement {

  default @NotNull C3ModuleDefinition getModuleDefinition() {
    return Objects.requireNonNull(PsiTreeUtil.getParentOfType(this, C3ModuleDefinition.class));
  }
}
