package top.notbe.phosphor.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.FillGroup

public val FillGroup.ApplePodcastsLogo: ImageVector
    get() {
        if (_applePodcastsLogo != null) {
            return _applePodcastsLogo!!
        }
        _applePodcastsLogo = Builder(name = "ApplePodcastsLogo", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 144.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 128.0f, 144.0f)
                close()
                moveTo(143.75f, 144.0f)
                horizontalLineToRelative(-31.5f)
                arcToRelative(20.17f, 20.17f, 0.0f, false, false, -16.0f, 7.82f)
                arcToRelative(19.67f, 19.67f, 0.0f, false, false, -3.58f, 17.05f)
                lineToRelative(12.18f, 48.0f)
                arcTo(20.17f, 20.17f, 0.0f, false, false, 124.44f, 232.0f)
                horizontalLineToRelative(7.12f)
                arcToRelative(20.17f, 20.17f, 0.0f, false, false, 19.64f, -15.13f)
                lineToRelative(12.18f, -48.0f)
                arcToRelative(19.67f, 19.67f, 0.0f, false, false, -3.58f, -17.05f)
                arcTo(20.17f, 20.17f, 0.0f, false, false, 143.75f, 144.0f)
                close()
                moveTo(182.24f, 142.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.75f, 9.74f)
                arcToRelative(8.12f, 8.12f, 0.0f, false, false, 2.0f, 0.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.74f, -6.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, false, -139.46f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 15.49f, -4.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 108.48f, 0.0f)
                close()
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 70.49f, 214.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.09f, -2.23f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.24f, -11.09f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 97.31f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.86f, 13.32f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 128.0f, 24.0f)
                close()
            }
        }
        .build()
        return _applePodcastsLogo!!
    }

private var _applePodcastsLogo: ImageVector? = null
