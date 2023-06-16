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

public val BoldGroup.ShieldChevron: ImageVector
    get() {
        if (_shieldChevron != null) {
            return _shieldChevron!!
        }
        _shieldChevron = Builder(name = "ShieldChevron", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 36.0f)
                lineTo(48.0f, 36.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 28.0f, 56.0f)
                lineTo(28.0f, 114.8f)
                curveToRelative(0.0f, 92.36f, 78.1f, 123.0f, 93.76f, 128.18f)
                arcToRelative(19.6f, 19.6f, 0.0f, false, false, 12.48f, 0.0f)
                curveTo(149.9f, 237.78f, 228.0f, 207.16f, 228.0f, 114.8f)
                lineTo(228.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 208.0f, 36.0f)
                close()
                moveTo(52.0f, 60.0f)
                lineTo(204.0f, 60.0f)
                verticalLineToRelative(54.8f)
                arcToRelative(113.07f, 113.07f, 0.0f, false, true, -6.6f, 39.14f)
                lineToRelative(-62.52f, -43.77f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -13.76f, 0.0f)
                lineTo(58.6f, 153.94f)
                arcTo(113.07f, 113.07f, 0.0f, false, true, 52.0f, 114.8f)
                close()
                moveTo(128.0f, 219.75f)
                curveToRelative(-10.07f, -3.53f, -39.26f, -15.79f, -58.39f, -44.22f)
                lineTo(128.0f, 134.65f)
                lineToRelative(58.39f, 40.88f)
                curveTo(167.26f, 204.0f, 138.07f, 216.22f, 128.0f, 219.75f)
                close()
            }
        }
        .build()
        return _shieldChevron!!
    }

private var _shieldChevron: ImageVector? = null
