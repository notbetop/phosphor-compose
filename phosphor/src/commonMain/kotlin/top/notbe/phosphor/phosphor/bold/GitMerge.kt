package top.notbe.phosphor.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.BoldGroup

public val BoldGroup.GitMerge: ImageVector
    get() {
        if (_gitMerge != null) {
            return _gitMerge!!
        }
        _gitMerge = Builder(name = "GitMerge", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 108.0f)
                arcToRelative(36.07f, 36.07f, 0.0f, false, false, -33.94f, 24.0f)
                lineTo(152.0f, 132.0f)
                arcToRelative(36.16f, 36.16f, 0.0f, false, true, -28.8f, -14.4f)
                lineTo(99.62f, 86.16f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 68.0f, 89.94f)
                verticalLineToRelative(76.12f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 24.0f, 0.0f)
                lineTo(92.0f, 116.0f)
                lineToRelative(12.0f, 16.0f)
                arcToRelative(60.27f, 60.27f, 0.0f, false, false, 48.0f, 24.0f)
                horizontalLineToRelative(22.06f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 208.0f, 108.0f)
                close()
                moveTo(80.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 68.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 80.0f, 44.0f)
                close()
                moveTo(80.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 80.0f, 212.0f)
                close()
                moveTo(208.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 208.0f, 156.0f)
                close()
            }
        }
        .build()
        return _gitMerge!!
    }

private var _gitMerge: ImageVector? = null
