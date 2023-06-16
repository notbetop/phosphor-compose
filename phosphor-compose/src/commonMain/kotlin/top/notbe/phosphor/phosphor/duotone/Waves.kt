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

public val DuotoneGroup.Waves: ImageVector
    get() {
        if (_waves != null) {
            return _waves!!
        }
        _waves = Builder(name = "Waves", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 72.0f)
                verticalLineTo(184.0f)
                reflectiveCurveToRelative(-16.0f, 16.0f, -48.0f, 16.0f)
                reflectiveCurveToRelative(-48.0f, -32.0f, -80.0f, -32.0f)
                reflectiveCurveToRelative(-48.0f, 16.0f, -48.0f, 16.0f)
                verticalLineTo(72.0f)
                reflectiveCurveTo(56.0f, 56.0f, 88.0f, 56.0f)
                reflectiveCurveToRelative(48.0f, 32.0f, 80.0f, 32.0f)
                reflectiveCurveTo(216.0f, 72.0f, 216.0f, 72.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(34.33f, 77.68f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.34f)
                curveTo(35.1f, 65.59f, 53.1f, 48.0f, 88.0f, 48.0f)
                curveToRelative(18.42f, 0.0f, 32.24f, 9.21f, 44.44f, 17.34f)
                curveTo(143.74f, 72.88f, 154.42f, 80.0f, 168.0f, 80.0f)
                arcToRelative(72.21f, 72.21f, 0.0f, false, false, 31.75f, -6.83f)
                arcToRelative(44.87f, 44.87f, 0.0f, false, false, 10.63f, -6.87f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.27f, 11.36f)
                curveTo(220.9f, 78.41f, 202.9f, 96.0f, 168.0f, 96.0f)
                curveToRelative(-18.42f, 0.0f, -32.24f, -9.21f, -44.44f, -17.34f)
                curveTo(112.26f, 71.12f, 101.58f, 64.0f, 88.0f, 64.0f)
                arcToRelative(72.21f, 72.21f, 0.0f, false, false, -31.75f, 6.83f)
                arcTo(44.87f, 44.87f, 0.0f, false, false, 45.62f, 77.7f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 34.33f, 77.68f)
                close()
                moveTo(210.38f, 122.3f)
                arcToRelative(44.87f, 44.87f, 0.0f, false, true, -10.63f, 6.87f)
                arcTo(72.21f, 72.21f, 0.0f, false, true, 168.0f, 136.0f)
                curveToRelative(-13.58f, 0.0f, -24.26f, -7.12f, -35.56f, -14.66f)
                curveTo(120.24f, 113.21f, 106.42f, 104.0f, 88.0f, 104.0f)
                curveToRelative(-34.9f, 0.0f, -52.9f, 17.59f, -53.65f, 18.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 45.62f, 133.7f)
                arcToRelative(44.87f, 44.87f, 0.0f, false, true, 10.63f, -6.87f)
                arcTo(72.21f, 72.21f, 0.0f, false, true, 88.0f, 120.0f)
                curveToRelative(13.58f, 0.0f, 24.26f, 7.12f, 35.56f, 14.66f)
                curveToRelative(12.2f, 8.13f, 26.0f, 17.34f, 44.44f, 17.34f)
                curveToRelative(34.9f, 0.0f, 52.9f, -17.59f, 53.65f, -18.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.27f, -11.36f)
                close()
                moveTo(210.38f, 178.3f)
                arcToRelative(44.87f, 44.87f, 0.0f, false, true, -10.63f, 6.87f)
                arcTo(72.21f, 72.21f, 0.0f, false, true, 168.0f, 192.0f)
                curveToRelative(-13.58f, 0.0f, -24.26f, -7.12f, -35.56f, -14.66f)
                curveTo(120.24f, 169.21f, 106.42f, 160.0f, 88.0f, 160.0f)
                curveToRelative(-34.9f, 0.0f, -52.9f, 17.59f, -53.65f, 18.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 45.62f, 189.7f)
                arcToRelative(44.87f, 44.87f, 0.0f, false, true, 10.63f, -6.87f)
                arcTo(72.21f, 72.21f, 0.0f, false, true, 88.0f, 176.0f)
                curveToRelative(13.58f, 0.0f, 24.26f, 7.12f, 35.56f, 14.66f)
                curveToRelative(12.2f, 8.13f, 26.0f, 17.34f, 44.44f, 17.34f)
                curveToRelative(34.9f, 0.0f, 52.9f, -17.59f, 53.65f, -18.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.27f, -11.36f)
                close()
            }
        }
        .build()
        return _waves!!
    }

private var _waves: ImageVector? = null
