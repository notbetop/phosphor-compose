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

public val DuotoneGroup.PaintBrushHousehold: ImageVector
    get() {
        if (_paintBrushHousehold != null) {
            return _paintBrushHousehold!!
        }
        _paintBrushHousehold = Builder(name = "PaintBrushHousehold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(163.48f, 131.48f)
                lineToRelative(9.21f, 9.21f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 22.62f)
                lineTo(152.0f, 184.0f)
                lineTo(72.0f, 104.0f)
                lineTo(92.69f, 83.31f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.62f, 0.0f)
                lineToRelative(9.21f, 9.21f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.61f, -0.32f)
                lineTo(191.0f, 31.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 225.0f, 65.0f)
                lineToRelative(-61.17f, 54.9f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 163.48f, 131.48f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.64f, 25.36f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -45.26f, 0.0f)
                curveToRelative(-0.1f, 0.1f, -0.2f, 0.2f, -0.29f, 0.31f)
                lineTo(130.18f, 86.85f)
                lineTo(121.0f, 77.64f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -33.95f, 0.0f)
                lineToRelative(-76.69f, 76.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.31f)
                lineToRelative(80.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.31f, 0.0f)
                lineTo(178.36f, 169.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, -33.95f)
                lineToRelative(-9.21f, -9.2f)
                lineToRelative(61.18f, -54.91f)
                arcToRelative(2.91f, 2.91f, 0.0f, false, false, 0.31f, -0.3f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 230.64f, 25.36f)
                close()
                moveTo(96.0f, 228.69f)
                lineTo(79.32f, 212.0f)
                lineToRelative(22.34f, -22.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, -11.31f)
                lineTo(68.0f, 200.68f)
                lineTo(55.32f, 188.0f)
                lineToRelative(22.34f, -22.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, -11.31f)
                lineTo(44.0f, 176.68f)
                lineTo(27.31f, 160.0f)
                lineTo(72.0f, 115.31f)
                lineTo(140.69f, 184.0f)
                close()
                moveTo(219.46f, 59.16f)
                lineToRelative(-61.0f, 54.75f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -0.62f, 23.22f)
                lineToRelative(9.2f, 9.21f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.31f)
                lineToRelative(-15.0f, 15.0f)
                lineTo(83.32f, 104.0f)
                lineToRelative(15.0f, -15.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.31f, 0.0f)
                lineToRelative(9.21f, 9.2f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 23.22f, -0.62f)
                horizontalLineToRelative(0.0f)
                lineToRelative(54.75f, -61.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.62f, 22.62f)
                close()
            }
        }
        .build()
        return _paintBrushHousehold!!
    }

private var _paintBrushHousehold: ImageVector? = null
