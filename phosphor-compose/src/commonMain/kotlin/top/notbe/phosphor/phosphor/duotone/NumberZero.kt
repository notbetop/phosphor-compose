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

public val DuotoneGroup.NumberZero: ImageVector
    get() {
        if (_numberZero != null) {
            return _numberZero!!
        }
        _numberZero = Builder(name = "NumberZero", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 40.0f)
                verticalLineTo(216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 24.0f)
                horizontalLineTo(200.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 216.0f, 40.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(183.25f, 63.2f)
                curveTo(170.25f, 42.79f, 151.15f, 32.0f, 128.0f, 32.0f)
                reflectiveCurveTo(85.75f, 42.79f, 72.75f, 63.2f)
                curveTo(62.0f, 80.18f, 56.0f, 103.19f, 56.0f, 128.0f)
                reflectiveCurveToRelative(6.0f, 47.82f, 16.75f, 64.8f)
                curveToRelative(13.0f, 20.41f, 32.1f, 31.2f, 55.25f, 31.2f)
                reflectiveCurveToRelative(42.25f, -10.79f, 55.25f, -31.2f)
                curveToRelative(10.8f, -17.0f, 16.75f, -40.0f, 16.75f, -64.8f)
                reflectiveCurveTo(194.05f, 80.18f, 183.25f, 63.2f)
                close()
                moveTo(128.0f, 208.0f)
                curveToRelative(-38.68f, 0.0f, -56.0f, -40.18f, -56.0f, -80.0f)
                reflectiveCurveToRelative(17.32f, -80.0f, 56.0f, -80.0f)
                reflectiveCurveToRelative(56.0f, 40.18f, 56.0f, 80.0f)
                reflectiveCurveTo(166.68f, 208.0f, 128.0f, 208.0f)
                close()
            }
        }
        .build()
        return _numberZero!!
    }

private var _numberZero: ImageVector? = null
