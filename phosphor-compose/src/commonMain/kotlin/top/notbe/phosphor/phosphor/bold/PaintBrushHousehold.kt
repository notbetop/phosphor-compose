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

public val BoldGroup.PaintBrushHousehold: ImageVector
    get() {
        if (_paintBrushHousehold != null) {
            return _paintBrushHousehold!!
        }
        _paintBrushHousehold = Builder(name = "PaintBrushHousehold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(233.47f, 22.53f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -50.91f, 0.0f)
                curveToRelative(-0.16f, 0.15f, -0.3f, 0.31f, -0.45f, 0.47f)
                lineTo(130.0f, 81.0f)
                lineToRelative(-6.22f, -6.21f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -39.6f, 0.0f)
                lineTo(7.52f, 151.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                lineToRelative(80.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(76.7f, -76.7f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, -39.6f)
                lineTo(175.0f, 126.0f)
                lineToRelative(58.0f, -52.08f)
                curveToRelative(0.16f, -0.15f, 0.32f, -0.29f, 0.47f, -0.45f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 233.47f, 22.53f)
                close()
                moveTo(96.0f, 223.0f)
                lineTo(85.0f, 212.0f)
                lineToRelative(19.51f, -19.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                lineTo(68.0f, 195.0f)
                lineToRelative(-7.0f, -7.0f)
                lineToRelative(19.51f, -19.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                lineTo(44.0f, 171.0f)
                lineTo(33.0f, 160.0f)
                lineToRelative(39.0f, -39.0f)
                lineToRelative(63.0f, 63.0f)
                close()
                moveTo(216.69f, 56.28f)
                lineToRelative(-60.9f, 54.65f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -0.78f, 29.0f)
                lineToRelative(9.2f, 9.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.66f)
                lineTo(152.0f, 167.0f)
                lineTo(89.0f, 104.0f)
                lineToRelative(12.2f, -12.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                lineTo(116.0f, 101.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 29.0f, -0.78f)
                lineToRelative(54.65f, -60.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                close()
            }
        }
        .build()
        return _paintBrushHousehold!!
    }

private var _paintBrushHousehold: ImageVector? = null
