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

public val BoldGroup.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.0f, 96.05f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -17.26f, -13.72f)
                lineToRelative(-57.0f, -4.93f)
                lineToRelative(-22.3f, -53.14f)
                horizontalLineToRelative(0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -36.82f, 0.0f)
                lineTo(87.29f, 77.4f)
                lineToRelative(-57.0f, 4.93f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 18.87f, 117.4f)
                lineToRelative(43.32f, 37.8f)
                lineToRelative(-13.0f, 56.24f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 79.0f, 233.1f)
                lineToRelative(49.0f, -29.76f)
                lineToRelative(49.0f, 29.76f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 29.8f, -21.66f)
                lineToRelative(-13.0f, -56.24f)
                lineToRelative(43.32f, -37.8f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 243.0f, 96.05f)
                close()
                moveTo(176.25f, 138.67f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -6.35f, 19.63f)
                lineToRelative(11.39f, 49.32f)
                lineToRelative(-42.94f, -26.08f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -20.7f, 0.0f)
                lineTo(74.71f, 207.62f)
                lineTo(86.1f, 158.3f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -6.35f, -19.63f)
                lineTo(41.66f, 105.44f)
                lineTo(91.8f, 101.1f)
                arcToRelative(19.92f, 19.92f, 0.0f, false, false, 16.69f, -12.19f)
                lineTo(128.0f, 42.42f)
                lineToRelative(19.51f, 46.49f)
                arcTo(19.92f, 19.92f, 0.0f, false, false, 164.2f, 101.1f)
                lineToRelative(50.14f, 4.34f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
