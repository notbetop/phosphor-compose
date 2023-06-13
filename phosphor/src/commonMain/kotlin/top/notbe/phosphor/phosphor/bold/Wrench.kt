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

public val BoldGroup.Wrench: ImageVector
    get() {
        if (_wrench != null) {
            return _wrench!!
        }
        _wrench = Builder(name = "Wrench", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.47f, 67.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -19.26f, -4.32f)
                lineTo(172.43f, 99.0f)
                lineToRelative(-12.68f, -2.72f)
                lineTo(157.0f, 83.57f)
                lineToRelative(35.79f, -38.78f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -4.32f, -19.26f)
                arcTo(76.0f, 76.0f, 0.0f, false, false, 89.24f, 123.8f)
                lineTo(31.17f, 174.0f)
                curveToRelative(-0.22f, 0.19f, -0.44f, 0.39f, -0.64f, 0.6f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 50.91f, 50.91f)
                curveToRelative(0.21f, -0.2f, 0.41f, -0.42f, 0.6f, -0.64f)
                lineToRelative(50.16f, -58.07f)
                arcTo(76.0f, 76.0f, 0.0f, false, false, 230.47f, 67.5f)
                close()
                moveTo(160.0f, 148.0f)
                arcToRelative(52.1f, 52.1f, 0.0f, false, true, -25.13f, -6.46f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 120.0f, 144.2f)
                lineTo(64.21f, 208.75f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineTo(111.8f, 136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 2.65f, -14.89f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 160.0f, 44.0f)
                horizontalLineToRelative(0.89f)
                lineTo(135.17f, 71.87f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -2.91f, 10.65f)
                lineToRelative(5.66f, 26.35f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.21f, 9.21f)
                lineToRelative(26.35f, 5.66f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.65f, -2.91f)
                lineTo(212.0f, 95.12f)
                curveToRelative(0.0f, 0.3f, 0.0f, 0.59f, 0.0f, 0.89f)
                arcTo(52.06f, 52.06f, 0.0f, false, true, 160.0f, 148.0f)
                close()
            }
        }
        .build()
        return _wrench!!
    }

private var _wrench: ImageVector? = null
