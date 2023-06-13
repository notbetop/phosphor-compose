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

public val FillGroup.ArticleMedium: ImageVector
    get() {
        if (_articleMedium != null) {
            return _articleMedium!!
        }
        _articleMedium = Builder(name = "ArticleMedium", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(24.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(8.0f)
                lineTo(32.0f, 72.0f)
                lineTo(24.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(40.0f, 56.0f)
                verticalLineToRelative(0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.78f, 3.74f)
                lineTo(80.0f, 112.91f)
                lineToRelative(33.22f, -53.15f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 56.0f)
                verticalLineToRelative(0.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(112.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(112.0f, 91.89f)
                lineTo(86.78f, 132.24f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.56f, 0.0f)
                lineTo(48.0f, 91.89f)
                lineTo(48.0f, 136.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 56.0f, 144.0f)
                close()
                moveTo(240.0f, 120.0f)
                lineTo(168.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(248.0f, 128.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 240.0f, 120.0f)
                close()
                moveTo(240.0f, 168.0f)
                lineTo(72.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(240.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(248.0f, 176.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 240.0f, 168.0f)
                close()
                moveTo(240.0f, 72.0f)
                lineTo(168.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(160.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(248.0f, 80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 240.0f, 72.0f)
                close()
            }
        }
        .build()
        return _articleMedium!!
    }

private var _articleMedium: ImageVector? = null
