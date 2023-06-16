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

public val DuotoneGroup.FlagBanner: ImageVector
    get() {
        if (_flagBanner != null) {
            return _flagBanner!!
        }
        _flagBanner = Builder(name = "FlagBanner", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 56.0f)
                lineToRelative(-45.71f, 96.0f)
                horizontalLineTo(32.0f)
                lineToRelative(48.0f, -52.0f)
                lineTo(32.0f, 56.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.76f, 51.73f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 48.0f)
                horizontalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.41f, 13.9f)
                lineToRelative(42.09f, 38.57f)
                lineToRelative(-42.56f, 46.1f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 32.0f, 160.0f)
                horizontalLineTo(165.62f)
                lineToRelative(-28.84f, 60.56f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 14.44f, 6.88f)
                lineToRelative(80.0f, -168.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 230.76f, 51.73f)
                close()
                moveTo(173.23f, 144.0f)
                horizontalLineToRelative(-123.0f)
                lineToRelative(35.61f, -38.57f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.47f, -11.33f)
                lineTo(52.57f, 64.0f)
                horizontalLineTo(211.33f)
                close()
            }
        }
        .build()
        return _flagBanner!!
    }

private var _flagBanner: ImageVector? = null
