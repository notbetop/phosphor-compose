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

public val FillGroup.ArticleNyTimes: ImageVector
    get() {
        if (_articleNyTimes != null) {
            return _articleNyTimes!!
        }
        _articleNyTimes = Builder(name = "ArticleNyTimes", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 96.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(160.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(152.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 248.0f, 96.0f)
                close()
                moveTo(240.0f, 136.0f)
                lineTo(160.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(248.0f, 144.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 240.0f, 136.0f)
                close()
                moveTo(240.0f, 184.0f)
                lineTo(72.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(240.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(248.0f, 192.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 240.0f, 184.0f)
                close()
                moveTo(80.0f, 168.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, true, -56.0f, -56.0f)
                arcToRelative(55.49f, 55.49f, 0.0f, false, true, 4.11f, -21.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 44.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.89f, 1.0f)
                lineToRelative(69.93f, 38.85f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 116.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.89f, -1.0f)
                lineToRelative(-40.0f, -22.21f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 72.0f, 151.2f)
                lineTo(72.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(39.19f)
                arcToRelative(40.09f, 40.09f, 0.0f, false, false, 29.73f, -25.86f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.08f, 5.34f)
                arcTo(56.09f, 56.09f, 0.0f, false, true, 80.0f, 168.0f)
                close()
                moveTo(36.23f, 77.14f)
                arcToRelative(56.33f, 56.33f, 0.0f, false, true, 17.5f, -14.58f)
                lineTo(42.18f, 56.14f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -6.0f, 21.0f)
                close()
            }
        }
        .build()
        return _articleNyTimes!!
    }

private var _articleNyTimes: ImageVector? = null
