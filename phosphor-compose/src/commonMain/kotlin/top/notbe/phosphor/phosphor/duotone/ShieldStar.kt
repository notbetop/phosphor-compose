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

public val DuotoneGroup.ShieldStar: ImageVector
    get() {
        if (_shieldStar != null) {
            return _shieldStar!!
        }
        _shieldStar = Builder(name = "ShieldStar", defaultWidth = 256.0.dp, defaultHeight =
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
                moveTo(80.57f, 117.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 91.0f, 112.57f)
                lineToRelative(29.0f, 11.61f)
                lineTo(120.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(28.18f)
                lineToRelative(29.0f, -11.61f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 171.0f, 127.43f)
                lineToRelative(-30.31f, 12.12f)
                lineTo(158.4f, 163.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -12.8f, 9.6f)
                lineTo(128.0f, 149.33f)
                lineTo(110.4f, 172.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -12.8f, -9.6f)
                lineToRelative(17.74f, -23.65f)
                lineTo(85.0f, 127.43f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 80.57f, 117.0f)
                close()
                moveTo(224.0f, 56.0f)
                verticalLineToRelative(58.77f)
                curveToRelative(0.0f, 89.62f, -75.82f, 119.34f, -91.0f, 124.39f)
                arcToRelative(15.44f, 15.44f, 0.0f, false, true, -10.0f, 0.0f)
                curveToRelative(-15.2f, -5.0f, -91.0f, -34.76f, -91.0f, -124.38f)
                lineTo(32.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 40.0f)
                lineTo(208.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 56.0f)
                close()
                moveTo(208.0f, 56.0f)
                lineTo(48.0f, 56.0f)
                verticalLineToRelative(58.79f)
                curveToRelative(0.0f, 78.5f, 66.47f, 104.68f, 80.0f, 109.18f)
                curveToRelative(13.66f, -4.56f, 80.0f, -30.76f, 80.0f, -109.18f)
                close()
            }
        }
        .build()
        return _shieldStar!!
    }

private var _shieldStar: ImageVector? = null
