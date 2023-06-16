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

public val ThinGroup.ArticleNyTimes: ImageVector
    get() {
        if (_articleNyTimes != null) {
            return _articleNyTimes!!
        }
        _articleNyTimes = Builder(name = "ArticleNyTimes", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(160.0f, 108.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 156.0f, 104.0f)
                close()
                moveTo(240.0f, 132.0f)
                lineTo(160.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(240.0f, 164.0f)
                lineTo(160.0f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(240.0f, 196.0f)
                lineTo(72.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(240.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(80.0f, 172.0f)
                arcTo(51.94f, 51.94f, 0.0f, false, true, 33.2f, 97.41f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 44.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.94f, 0.5f)
                lineTo(117.0f, 92.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -1.0f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 0.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.94f, -0.5f)
                lineTo(72.83f, 76.59f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 76.0f, 163.81f)
                lineTo(76.0f, 120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(43.81f)
                arcToRelative(44.1f, 44.1f, 0.0f, false, false, 37.5f, -29.14f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.54f, 2.66f)
                arcTo(52.09f, 52.09f, 0.0f, false, true, 80.0f, 172.0f)
                close()
                moveTo(37.24f, 90.5f)
                arcTo(52.1f, 52.1f, 0.0f, false, true, 62.7f, 71.0f)
                lineTo(43.0f, 60.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 37.24f, 90.5f)
                close()
            }
        }
        .build()
        return _articleNyTimes!!
    }

private var _articleNyTimes: ImageVector? = null
