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

public val BoldGroup.Brain: ImageVector
    get() {
        if (_brain != null) {
            return _brain!!
        }
        _brain = Builder(name = "Brain", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.0f, 124.0f)
                arcToRelative(60.14f, 60.14f, 0.0f, false, false, -32.0f, -53.08f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, -92.0f, -32.11f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 36.0f, 70.92f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, 0.0f, 106.14f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 92.0f, 32.13f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 92.0f, -32.13f)
                arcTo(60.05f, 60.05f, 0.0f, false, false, 252.0f, 124.0f)
                close()
                moveTo(88.0f, 204.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -26.85f, -20.07f)
                curveToRelative(1.0f, 0.0f, 1.89f, 0.07f, 2.85f, 0.07f)
                horizontalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(64.0f, 160.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 52.0f, 90.05f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.0f, -11.32f)
                lineTo(60.0f, 72.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 56.0f, 0.0f)
                verticalLineToRelative(60.15f)
                arcToRelative(52.43f, 52.43f, 0.0f, false, false, -12.4f, -5.77f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.2f, 22.9f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 88.0f, 204.0f)
                close()
                moveTo(192.0f, 160.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.0f, 0.0f, 1.9f, 0.0f, 2.85f, -0.07f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -35.18f, -34.67f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.13f, -22.92f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 140.0f, 132.15f)
                lineTo(140.0f, 72.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 56.0f, 0.0f)
                verticalLineToRelative(6.73f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.0f, 11.32f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -12.0f, 70.0f)
                close()
                moveTo(208.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, -40.0f)
                lineTo(156.0f, 84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 208.0f, 116.0f)
                close()
                moveTo(60.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 76.0f, 88.0f)
                lineTo(76.0f, 84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(4.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 60.0f, 128.0f)
                close()
            }
        }
        .build()
        return _brain!!
    }

private var _brain: ImageVector? = null
