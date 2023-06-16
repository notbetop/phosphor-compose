package top.notbe.phosphor.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.LightGroup

public val LightGroup.Radio: ImageVector
    get() {
        if (_radio != null) {
            return _radio!!
        }
        _radio = Builder(name = "Radio", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(102.0f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(64.0f, 118.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(96.0f, 106.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 102.0f, 112.0f)
                close()
                moveTo(96.0f, 138.0f)
                lineTo(64.0f, 138.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(96.0f, 150.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(96.0f, 170.0f)
                lineTo(64.0f, 170.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(96.0f, 182.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(230.0f, 88.0f)
                lineTo(230.0f, 200.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(40.0f, 214.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                lineTo(26.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.28f, -5.75f)
                lineToRelative(160.0f, -48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.44f, 11.5f)
                lineTo(72.88f, 74.0f)
                lineTo(216.0f, 74.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 230.0f, 88.0f)
                close()
                moveTo(218.0f, 88.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(38.0f, 86.0f)
                lineTo(38.0f, 200.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(216.0f, 202.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                close()
                moveTo(198.0f, 144.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, true, -38.0f, -38.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, true, 198.0f, 144.0f)
                close()
                moveTo(186.0f, 144.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, -26.0f, 26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 186.0f, 144.0f)
                close()
            }
        }
        .build()
        return _radio!!
    }

private var _radio: ImageVector? = null
