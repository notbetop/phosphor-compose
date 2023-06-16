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

public val DuotoneGroup.ShieldCheck: ImageVector
    get() {
        if (_shieldCheck != null) {
            return _shieldCheck!!
        }
        _shieldCheck = Builder(name = "ShieldCheck", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 56.0f)
                verticalLineToRelative(58.77f)
                curveToRelative(0.0f, 84.18f, -71.31f, 112.07f, -85.54f, 116.8f)
                arcToRelative(7.54f, 7.54f, 0.0f, false, true, -4.92f, 0.0f)
                curveTo(111.31f, 226.86f, 40.0f, 199.0f, 40.0f, 114.79f)
                verticalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(208.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 56.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 40.0f)
                lineTo(48.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 56.0f)
                verticalLineToRelative(58.78f)
                curveToRelative(0.0f, 89.61f, 75.82f, 119.34f, 91.0f, 124.39f)
                arcToRelative(15.53f, 15.53f, 0.0f, false, false, 10.0f, 0.0f)
                curveToRelative(15.2f, -5.05f, 91.0f, -34.78f, 91.0f, -124.39f)
                lineTo(224.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 40.0f)
                close()
                moveTo(208.0f, 114.79f)
                curveToRelative(0.0f, 78.42f, -66.35f, 104.62f, -80.0f, 109.18f)
                curveToRelative(-13.53f, -4.51f, -80.0f, -30.69f, -80.0f, -109.18f)
                lineTo(48.0f, 56.0f)
                lineTo(208.0f, 56.0f)
                close()
                moveTo(82.34f, 141.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineTo(112.0f, 148.68f)
                lineToRelative(50.34f, -50.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                lineToRelative(-56.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                close()
            }
        }
        .build()
        return _shieldCheck!!
    }

private var _shieldCheck: ImageVector? = null
