package top.notbe.phosphor.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.DuotoneGroup

public val DuotoneGroup.StarFour: ImageVector
    get() {
        if (_starFour != null) {
            return _starFour!!
        }
        _starFour = Builder(name = "StarFour", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(226.76f, 135.48f)
                lineToRelative(-63.45f, 23.07f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.76f, 4.76f)
                lineToRelative(-23.07f, 63.45f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.0f, 0.0f)
                lineTo(97.45f, 163.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.76f, -4.76f)
                lineTo(29.24f, 135.48f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -15.0f)
                lineTo(92.69f, 97.45f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.76f, -4.76f)
                lineToRelative(23.07f, -63.45f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.0f, 0.0f)
                lineToRelative(23.07f, 63.45f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.76f, 4.76f)
                lineToRelative(63.45f, 23.07f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 226.76f, 135.48f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.5f, 113.0f)
                lineTo(166.07f, 90.0f)
                lineTo(143.0f, 26.5f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -30.0f, 0.0f)
                lineTo(90.0f, 89.93f)
                lineTo(26.5f, 113.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 30.0f)
                lineToRelative(63.43f, 23.0f)
                lineTo(113.0f, 229.5f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 30.0f, 0.0f)
                lineToRelative(23.07f, -63.44f)
                lineTo(229.5f, 143.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -30.0f)
                close()
                moveTo(160.57f, 151.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -9.54f, 9.54f)
                lineTo(128.0f, 223.9f)
                lineToRelative(-23.0f, -63.33f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 95.43f, 151.0f)
                lineTo(32.1f, 128.0f)
                lineToRelative(63.33f, -23.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 105.0f, 95.43f)
                lineTo(128.0f, 32.1f)
                lineToRelative(23.0f, 63.33f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 9.54f, 9.54f)
                lineToRelative(63.33f, 23.0f)
                close()
            }
        }
        .build()
        return _starFour!!
    }

private var _starFour: ImageVector? = null
