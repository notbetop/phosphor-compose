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

public val DuotoneGroup.FaceMask: ImageVector
    get() {
        if (_faceMask != null) {
            return _faceMask!!
        }
        _faceMask = Builder(name = "FaceMask", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 77.09f)
                verticalLineToRelative(59.06f)
                curveToRelative(0.0f, 51.51f, -74.44f, 69.18f, -86.39f, 71.68f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, true, -3.22f, 0.0f)
                curveToRelative(-12.0f, -2.5f, -86.39f, -20.17f, -86.39f, -71.68f)
                verticalLineTo(77.09f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.27f, -7.52f)
                lineToRelative(80.0f, -29.09f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.46f, 0.0f)
                lineToRelative(80.0f, 29.09f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 77.09f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(88.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 176.0f, 104.0f)
                close()
                moveTo(168.0f, 128.0f)
                lineTo(88.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(256.0f, 104.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f)
                horizontalLineToRelative(-5.13f)
                curveToRelative(-6.54f, 14.44f, -19.26f, 27.12f, -37.7f, 37.36f)
                curveToRelative(-21.0f, 11.68f, -43.52f, 17.0f, -49.92f, 18.3f)
                arcToRelative(15.7f, 15.7f, 0.0f, false, true, -6.5f, 0.0f)
                curveToRelative(-6.4f, -1.34f, -28.9f, -6.62f, -49.92f, -18.3f)
                curveTo(56.39f, 187.12f, 43.67f, 174.44f, 37.13f, 160.0f)
                lineTo(32.0f, 160.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 0.0f, 128.0f)
                lineTo(0.0f, 104.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 32.0f, 72.0f)
                horizontalLineToRelative(0.85f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 9.68f, -10.0f)
                lineToRelative(80.0f, -29.09f)
                arcToRelative(16.06f, 16.06f, 0.0f, false, true, 10.94f, 0.0f)
                lineToRelative(80.0f, 29.09f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 9.68f, 10.0f)
                lineTo(224.0f, 72.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 256.0f, 104.0f)
                close()
                moveTo(32.53f, 144.0f)
                arcToRelative(59.94f, 59.94f, 0.0f, false, true, -0.53f, -7.85f)
                lineTo(32.0f, 88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                close()
                moveTo(208.0f, 136.15f)
                lineTo(208.0f, 77.09f)
                lineTo(128.0f, 48.0f)
                lineTo(48.0f, 77.09f)
                verticalLineToRelative(59.06f)
                curveToRelative(0.0f, 45.76f, 71.84f, 62.13f, 80.0f, 63.85f)
                curveTo(136.16f, 198.28f, 208.0f, 181.91f, 208.0f, 136.15f)
                close()
                moveTo(240.0f, 104.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                verticalLineToRelative(48.15f)
                arcToRelative(59.94f, 59.94f, 0.0f, false, true, -0.53f, 7.85f)
                lineTo(224.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _faceMask!!
    }

private var _faceMask: ImageVector? = null
