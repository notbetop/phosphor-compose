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

public val LightGroup.ArticleNyTimes: ImageVector
    get() {
        if (_articleNyTimes != null) {
            return _articleNyTimes!!
        }
        _articleNyTimes = Builder(name = "ArticleNyTimes", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(154.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(160.0f, 110.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 154.0f, 104.0f)
                close()
                moveTo(240.0f, 130.0f)
                lineTo(160.0f, 130.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(240.0f, 162.0f)
                lineTo(160.0f, 162.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(240.0f, 194.0f)
                lineTo(72.0f, 194.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(240.0f, 206.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(80.0f, 174.0f)
                arcTo(53.94f, 53.94f, 0.0f, false, true, 30.6f, 98.26f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 44.0f, 50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.91f, 0.75f)
                lineToRelative(70.52f, 39.18f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 116.0f, 62.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 0.0f, 52.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.91f, -0.75f)
                lineTo(72.46f, 78.67f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 74.0f, 161.56f)
                lineTo(74.0f, 120.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(41.56f)
                arcTo(42.06f, 42.06f, 0.0f, false, false, 119.61f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.32f, 4.0f)
                arcTo(54.11f, 54.11f, 0.0f, false, true, 80.0f, 174.0f)
                close()
                moveTo(36.64f, 87.9f)
                arcTo(54.29f, 54.29f, 0.0f, false, true, 58.05f, 70.67f)
                lineToRelative(-15.48f, -8.6f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 36.64f, 87.9f)
                close()
            }
        }
        .build()
        return _articleNyTimes!!
    }

private var _articleNyTimes: ImageVector? = null
