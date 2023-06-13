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

public val BoldGroup.ArticleNyTimes: ImageVector
    get() {
        if (_articleNyTimes != null) {
            return _articleNyTimes!!
        }
        _articleNyTimes = Builder(name = "ArticleNyTimes", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 124.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(164.0f, 136.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 152.0f, 124.0f)
                close()
                moveTo(240.0f, 152.0f)
                lineTo(164.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(240.0f, 192.0f)
                lineTo(72.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(240.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(80.0f, 180.0f)
                arcToRelative(60.07f, 60.07f, 0.0f, false, true, -60.0f, -60.0f)
                arcToRelative(59.42f, 59.42f, 0.0f, false, true, 3.32f, -19.59f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 44.0f, 44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 5.83f, 1.51f)
                lineToRelative(68.6f, 38.11f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 116.0f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 0.0f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -5.83f, -1.51f)
                lineTo(71.51f, 85.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 68.0f, 153.94f)
                lineTo(68.0f, 124.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(29.91f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 114.0f, 132.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 22.63f, 8.0f)
                arcTo(60.1f, 60.1f, 0.0f, false, true, 80.0f, 180.0f)
                close()
                moveTo(36.49f, 78.76f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, 9.33f, -8.0f)
                lineToRelative(-4.25f, -2.36f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 36.0f, 76.0f)
                arcTo(8.22f, 8.22f, 0.0f, false, false, 36.49f, 78.76f)
                close()
            }
        }
        .build()
        return _articleNyTimes!!
    }

private var _articleNyTimes: ImageVector? = null
