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

public val ThinGroup.ApplePodcastsLogo: ImageVector
    get() {
        if (_applePodcastsLogo != null) {
            return _applePodcastsLogo!!
        }
        _applePodcastsLogo = Builder(name = "ApplePodcastsLogo", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(147.26f, 140.3f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -38.52f, 0.0f)
                arcToRelative(20.12f, 20.12f, 0.0f, false, false, -12.54f, 7.52f)
                arcToRelative(19.67f, 19.67f, 0.0f, false, false, -3.58f, 17.05f)
                lineToRelative(12.18f, 48.0f)
                arcTo(20.17f, 20.17f, 0.0f, false, false, 124.44f, 228.0f)
                horizontalLineToRelative(7.12f)
                arcToRelative(20.17f, 20.17f, 0.0f, false, false, 19.64f, -15.13f)
                lineToRelative(12.18f, -48.0f)
                arcToRelative(19.67f, 19.67f, 0.0f, false, false, -3.58f, -17.05f)
                arcTo(20.12f, 20.12f, 0.0f, false, false, 147.26f, 140.3f)
                close()
                moveTo(108.0f, 120.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 108.0f, 120.0f)
                close()
                moveTo(155.63f, 162.9f)
                lineTo(143.45f, 210.9f)
                arcToRelative(12.19f, 12.19f, 0.0f, false, true, -11.89f, 9.1f)
                horizontalLineToRelative(-7.12f)
                arcToRelative(12.19f, 12.19f, 0.0f, false, true, -11.89f, -9.1f)
                lineToRelative(-12.18f, -48.0f)
                arcToRelative(11.76f, 11.76f, 0.0f, false, true, 2.14f, -10.17f)
                arcToRelative(12.24f, 12.24f, 0.0f, false, true, 9.74f, -4.73f)
                horizontalLineToRelative(31.5f)
                arcToRelative(12.24f, 12.24f, 0.0f, false, true, 9.74f, 4.73f)
                arcTo(11.76f, 11.76f, 0.0f, false, true, 155.63f, 162.9f)
                close()
                moveTo(188.0f, 128.0f)
                arcTo(60.0f, 60.0f, 0.0f, true, false, 69.89f, 143.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.75f, 2.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, true, 131.72f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.87f, 3.0f)
                arcToRelative(3.81f, 3.81f, 0.0f, false, true, -1.0f, -0.13f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.88f, -4.87f)
                arcTo(60.4f, 60.4f, 0.0f, false, false, 188.0f, 128.0f)
                close()
                moveTo(228.0f, 128.0f)
                arcToRelative(99.87f, 99.87f, 0.0f, false, true, -44.7f, 83.33f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -4.43f, -6.66f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, false, -101.74f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -4.43f, 6.66f)
                arcTo(100.0f, 100.0f, 0.0f, true, true, 228.0f, 128.0f)
                close()
            }
        }
        .build()
        return _applePodcastsLogo!!
    }

private var _applePodcastsLogo: ImageVector? = null
