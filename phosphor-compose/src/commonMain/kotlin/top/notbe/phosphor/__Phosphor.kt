package top.notbe.phosphor

import androidx.compose.ui.graphics.vector.ImageVector
import top.notbe.phosphor.phosphor.All
import top.notbe.phosphor.phosphor.Bold
import top.notbe.phosphor.phosphor.Duotone
import top.notbe.phosphor.phosphor.Fill
import top.notbe.phosphor.phosphor.Light
import top.notbe.phosphor.phosphor.Regular
import top.notbe.phosphor.phosphor.Thin
import kotlin.collections.List as ____KtList

public object Phosphor

private var __All: ____KtList<ImageVector>? = null

public val Phosphor.All: ____KtList<ImageVector>
  get() {
    if (__All != null) {
      return __All!!
    }
    __All= Bold.All + Duotone.All + Fill.All + Light.All + Regular.All + Thin.All + listOf()
    return __All!!
  }
