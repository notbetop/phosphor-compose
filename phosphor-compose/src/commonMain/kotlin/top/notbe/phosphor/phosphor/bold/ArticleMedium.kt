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

public val BoldGroup.ArticleMedium: ImageVector
    get() {
        if (_articleMedium != null) {
            return _articleMedium!!
        }
        _articleMedium = Builder(name = "ArticleMedium", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(60.0f, 132.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(24.0f, 144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(4.0f)
                lineTo(28.0f, 64.0f)
                lineTo(24.0f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(40.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 10.18f, 5.63f)
                lineTo(80.0f, 93.36f)
                lineToRelative(29.82f, -47.72f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 120.0f, 40.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(56.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(112.0f, 144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -4.0f, -23.3f)
                lineTo(108.0f, 93.84f)
                lineTo(90.18f, 122.36f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -20.36f, 0.0f)
                lineTo(52.0f, 93.84f)
                lineTo(52.0f, 120.7f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 60.0f, 132.0f)
                close()
                moveTo(176.0f, 104.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(176.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
                moveTo(240.0f, 120.0f)
                lineTo(176.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(240.0f, 160.0f)
                lineTo(72.0f, 160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(240.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(240.0f, 200.0f)
                lineTo(72.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(240.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
            }
        }
        .build()
        return _articleMedium!!
    }

private var _articleMedium: ImageVector? = null
