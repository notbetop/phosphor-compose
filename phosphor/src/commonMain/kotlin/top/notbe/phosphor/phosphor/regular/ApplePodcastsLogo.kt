package top.notbe.phosphor.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.RegularGroup

public val RegularGroup.ApplePodcastsLogo: ImageVector
    get() {
        if (_applePodcastsLogo != null) {
            return _applePodcastsLogo!!
        }
        _applePodcastsLogo = Builder(name = "ApplePodcastsLogo", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(154.2f, 138.33f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -52.4f, 0.0f)
                arcToRelative(24.27f, 24.27f, 0.0f, false, false, -8.76f, 7.0f)
                arcToRelative(23.68f, 23.68f, 0.0f, false, false, -4.3f, 20.49f)
                lineToRelative(12.18f, 48.0f)
                arcTo(24.18f, 24.18f, 0.0f, false, false, 124.44f, 232.0f)
                horizontalLineToRelative(7.12f)
                arcToRelative(24.18f, 24.18f, 0.0f, false, false, 23.52f, -18.15f)
                lineToRelative(12.18f, -48.0f)
                arcToRelative(23.68f, 23.68f, 0.0f, false, false, -4.3f, -20.49f)
                arcTo(24.27f, 24.27f, 0.0f, false, false, 154.2f, 138.33f)
                close()
                moveTo(128.0f, 104.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 104.0f)
                close()
                moveTo(151.75f, 161.91f)
                lineTo(139.57f, 209.91f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, true, -8.0f, 6.09f)
                horizontalLineToRelative(-7.12f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, true, -8.0f, -6.09f)
                lineToRelative(-12.18f, -48.0f)
                arcToRelative(7.71f, 7.71f, 0.0f, false, true, 1.42f, -6.73f)
                arcToRelative(8.26f, 8.26f, 0.0f, false, true, 6.58f, -3.18f)
                horizontalLineToRelative(31.5f)
                arcToRelative(8.26f, 8.26f, 0.0f, false, true, 6.58f, 3.18f)
                arcTo(7.71f, 7.71f, 0.0f, false, true, 151.75f, 161.91f)
                close()
                moveTo(72.0f, 128.0f)
                arcToRelative(56.27f, 56.27f, 0.0f, false, false, 1.76f, 14.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -15.49f, 4.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, true, 139.46f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.74f, 6.0f)
                arcToRelative(8.12f, 8.12f, 0.0f, false, true, -2.0f, -0.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.75f, -9.74f)
                arcTo(56.0f, 56.0f, 0.0f, true, false, 72.0f, 128.0f)
                close()
                moveTo(232.0f, 128.0f)
                arcToRelative(103.86f, 103.86f, 0.0f, false, true, -46.49f, 86.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.86f, -13.32f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, false, -97.31f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 74.91f, 216.0f)
                arcToRelative(7.92f, 7.92f, 0.0f, false, true, -4.42f, -1.34f)
                arcTo(104.0f, 104.0f, 0.0f, true, true, 232.0f, 128.0f)
                close()
            }
        }
        .build()
        return _applePodcastsLogo!!
    }

private var _applePodcastsLogo: ImageVector? = null
