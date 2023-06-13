package top.notbe.phosphor.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.ThinGroup

public val ThinGroup.PaintBrushHousehold: ImageVector
    get() {
        if (_paintBrushHousehold != null) {
            return _paintBrushHousehold!!
        }
        _paintBrushHousehold = Builder(name = "PaintBrushHousehold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.8f, 28.2f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -39.6f, 0.0f)
                lineToRelative(-0.15f, 0.16f)
                lineToRelative(-54.9f, 61.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.81f, 0.16f)
                lineToRelative(-9.2f, -9.2f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.28f, 0.0f)
                lineTo(13.17f, 157.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.66f)
                lineToRelative(80.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 0.0f)
                lineToRelative(76.68f, -76.69f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, -28.28f)
                lineToRelative(-9.2f, -9.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.17f, -2.94f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.33f, -2.87f)
                lineTo(227.64f, 68.0f)
                lineToRelative(0.16f, -0.15f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 227.8f, 28.2f)
                close()
                moveTo(96.0f, 234.34f)
                lineTo(73.66f, 212.0f)
                lineToRelative(25.17f, -25.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, -5.66f)
                lineTo(68.0f, 206.34f)
                lineTo(49.66f, 188.0f)
                lineToRelative(25.17f, -25.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, -5.66f)
                lineTo(44.0f, 182.34f)
                lineTo(21.66f, 160.0f)
                lineTo(72.0f, 109.66f)
                lineTo(146.34f, 184.0f)
                close()
                moveTo(222.21f, 62.07f)
                lineTo(161.12f, 116.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -0.46f, 17.41f)
                lineToRelative(9.2f, 9.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                lineTo(152.0f, 178.34f)
                lineTo(77.66f, 104.0f)
                lineTo(95.51f, 86.14f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 0.0f)
                lineToRelative(9.2f, 9.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.41f, -0.46f)
                lineToRelative(54.83f, -61.09f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 28.28f, 28.28f)
                close()
            }
        }
        .build()
        return _paintBrushHousehold!!
    }

private var _paintBrushHousehold: ImageVector? = null
