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

public val DuotoneGroup.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) {
            return _paperPlane!!
        }
        _paperPlane = Builder(name = "PaperPlane", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(221.28f, 215.51f)
                lineToRelative(-90.71f, -31.0f)
                arcToRelative(7.89f, 7.89f, 0.0f, false, false, -5.38f, 0.0f)
                lineToRelative(-90.47f, 31.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.67f, -11.44f)
                lineToRelative(95.85f, -168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.0f, 0.0f)
                lineToRelative(96.09f, 168.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 221.28f, 215.51f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.9f, 200.09f)
                lineTo(141.85f, 32.18f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -27.89f, 0.0f)
                lineToRelative(-95.89f, 168.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 19.25f, 22.92f)
                lineToRelative(90.47f, -31.0f)
                lineToRelative(0.1f, 0.0f)
                lineToRelative(0.09f, 0.0f)
                lineToRelative(90.68f, 31.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 19.24f, -23.0f)
                close()
                moveTo(223.9f, 207.93f)
                lineTo(136.0f, 177.86f)
                lineTo(136.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(57.78f)
                lineTo(32.12f, 207.94f)
                lineTo(32.0f, 208.0f)
                lineTo(127.86f, 40.0f)
                lineTo(224.0f, 208.0f)
                close()
            }
        }
        .build()
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
