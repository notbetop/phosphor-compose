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

public val DuotoneGroup.ArticleMedium: ImageVector
    get() {
        if (_articleMedium != null) {
            return _articleMedium!!
        }
        _articleMedium = Builder(name = "ArticleMedium", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(240.0f, 104.0f)
                verticalLineToRelative(96.0f)
                horizontalLineTo(72.0f)
                verticalLineTo(168.0f)
                horizontalLineToRelative(96.0f)
                verticalLineTo(104.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(24.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(8.0f)
                lineTo(32.0f, 64.0f)
                lineTo(24.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(40.0f, 48.0f)
                verticalLineToRelative(0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.78f, 3.74f)
                lineTo(80.0f, 104.91f)
                lineToRelative(33.22f, -53.15f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 48.0f)
                verticalLineToRelative(0.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(112.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(112.0f, 83.89f)
                lineTo(86.78f, 124.24f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.56f, 0.0f)
                lineTo(48.0f, 83.89f)
                lineTo(48.0f, 128.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 56.0f, 136.0f)
                close()
                moveTo(168.0f, 112.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(168.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(240.0f, 128.0f)
                lineTo(168.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(240.0f, 160.0f)
                lineTo(72.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(240.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(240.0f, 192.0f)
                lineTo(72.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(240.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _articleMedium!!
    }

private var _articleMedium: ImageVector? = null
