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

public val DuotoneGroup.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(184.13f, 147.7f)
                arcToRelative(8.08f, 8.08f, 0.0f, false, false, -2.54f, 7.89f)
                lineToRelative(13.52f, 58.54f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.89f, 8.69f)
                lineToRelative(-51.1f, -31.0f)
                arcToRelative(7.93f, 7.93f, 0.0f, false, false, -8.24f, 0.0f)
                lineToRelative(-51.1f, 31.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.89f, -8.69f)
                lineToRelative(13.52f, -58.54f)
                arcToRelative(8.08f, 8.08f, 0.0f, false, false, -2.54f, -7.89f)
                lineTo(26.76f, 108.35f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 31.3f, 94.28f)
                lineToRelative(59.46f, -5.14f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.67f, -4.88f)
                lineTo(120.66f, 28.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.68f, 0.0f)
                lineToRelative(23.23f, 55.36f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.67f, 4.88f)
                lineToRelative(59.46f, 5.14f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.54f, 14.07f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.2f, 97.29f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -13.81f, -11.0f)
                lineTo(166.0f, 81.17f)
                lineTo(142.72f, 25.81f)
                horizontalLineToRelative(0.0f)
                arcToRelative(15.95f, 15.95f, 0.0f, false, false, -29.44f, 0.0f)
                lineTo(90.07f, 81.17f)
                lineTo(30.61f, 86.32f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -9.11f, 28.06f)
                lineTo(66.61f, 153.8f)
                lineTo(53.09f, 212.34f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 23.84f, 17.34f)
                lineToRelative(51.0f, -31.0f)
                lineToRelative(51.11f, 31.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 23.84f, -17.34f)
                lineToRelative(-13.51f, -58.6f)
                lineToRelative(45.1f, -39.36f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 239.2f, 97.29f)
                close()
                moveTo(223.98f, 102.29f)
                lineTo(178.88f, 141.65f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -5.08f, 15.71f)
                lineTo(187.35f, 216.0f)
                verticalLineToRelative(0.0f)
                lineToRelative(-51.07f, -31.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, -16.54f, 0.0f)
                lineToRelative(-51.0f, 31.0f)
                horizontalLineToRelative(0.0f)
                lineTo(82.2f, 157.4f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -5.08f, -15.71f)
                lineTo(32.0f, 102.35f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, 0.0f, -0.09f)
                lineToRelative(59.44f, -5.14f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 13.35f, -9.75f)
                lineTo(128.0f, 32.08f)
                lineToRelative(23.2f, 55.29f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 13.35f, 9.75f)
                lineTo(224.0f, 102.26f)
                reflectiveCurveTo(224.0f, 102.32f, 224.0f, 102.33f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
