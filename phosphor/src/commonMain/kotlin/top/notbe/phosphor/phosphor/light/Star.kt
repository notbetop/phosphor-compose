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

public val LightGroup.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.3f, 97.9f)
                arcToRelative(13.78f, 13.78f, 0.0f, false, false, -12.08f, -9.6f)
                lineToRelative(-59.46f, -5.14f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.65f, -1.22f)
                lineTo(140.88f, 26.58f)
                horizontalLineToRelative(0.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -25.76f, 0.0f)
                lineTo(91.89f, 81.94f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.65f, 1.22f)
                lineTo(30.78f, 88.3f)
                arcTo(13.78f, 13.78f, 0.0f, false, false, 18.7f, 97.9f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 4.11f, 15.0f)
                lineToRelative(45.11f, 39.35f)
                arcToRelative(2.06f, 2.06f, 0.0f, false, true, 0.64f, 2.0f)
                lineTo(55.0f, 212.76f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 5.45f, 14.56f)
                arcToRelative(13.74f, 13.74f, 0.0f, false, false, 15.4f, 0.62f)
                lineToRelative(51.11f, -31.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 2.0f, 0.0f)
                lineToRelative(51.11f, 31.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 201.0f, 212.76f)
                lineToRelative(-13.52f, -58.53f)
                arcToRelative(2.06f, 2.06f, 0.0f, false, true, 0.64f, -2.0f)
                lineToRelative(45.11f, -39.35f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 237.3f, 97.9f)
                close()
                moveTo(225.3f, 103.82f)
                lineTo(180.19f, 143.17f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -4.44f, 13.76f)
                lineToRelative(13.52f, 58.53f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.79f, 2.13f)
                arcToRelative(1.81f, 1.81f, 0.0f, false, true, -2.14f, 0.09f)
                lineToRelative(-51.11f, -31.0f)
                arcToRelative(13.92f, 13.92f, 0.0f, false, false, -14.46f, 0.0f)
                lineToRelative(-51.11f, 31.0f)
                arcToRelative(1.81f, 1.81f, 0.0f, false, true, -2.14f, -0.09f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.79f, -2.13f)
                lineToRelative(13.52f, -58.53f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -4.44f, -13.76f)
                lineTo(30.7f, 103.82f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.59f, -2.19f)
                arcToRelative(1.86f, 1.86f, 0.0f, false, true, 1.7f, -1.38f)
                lineToRelative(59.47f, -5.14f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 103.0f, 86.58f)
                lineToRelative(23.23f, -55.36f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 3.62f, 0.0f)
                lineTo(153.0f, 86.58f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 11.68f, 8.53f)
                lineToRelative(59.47f, 5.14f)
                arcToRelative(1.86f, 1.86f, 0.0f, false, true, 1.7f, 1.38f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 225.3f, 103.82f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
