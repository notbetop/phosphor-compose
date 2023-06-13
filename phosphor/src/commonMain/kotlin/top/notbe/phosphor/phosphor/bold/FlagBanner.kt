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

public val BoldGroup.FlagBanner: ImageVector
    get() {
        if (_flagBanner != null) {
            return _flagBanner!!
        }
        _flagBanner = Builder(name = "FlagBanner", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.15f, 49.59f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 44.0f)
                horizontalLineTo(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.11f, 20.85f)
                lineTo(63.0f, 100.71f)
                lineTo(23.18f, 143.86f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 32.0f, 164.0f)
                horizontalLineTo(159.28f)
                lineToRelative(-26.11f, 54.84f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 21.66f, 10.32f)
                lineToRelative(80.0f, -168.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 234.15f, 49.59f)
                close()
                moveTo(170.71f, 140.0f)
                horizontalLineTo(59.41f)
                lineToRelative(29.41f, -31.86f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -0.71f, -17.0f)
                lineTo(62.85f, 68.0f)
                horizontalLineTo(205.0f)
                close()
            }
        }
        .build()
        return _flagBanner!!
    }

private var _flagBanner: ImageVector? = null
