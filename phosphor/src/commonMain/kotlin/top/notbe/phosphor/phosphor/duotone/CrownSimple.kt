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

public val DuotoneGroup.CrownSimple: ImageVector
    get() {
        if (_crownSimple != null) {
            return _crownSimple!!
        }
        _crownSimple = Builder(name = "CrownSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(239.78f, 86.62f)
                lineTo(202.78f, 200.0f)
                reflectiveCurveTo(176.0f, 184.0f, 128.0f, 184.0f)
                reflectiveCurveToRelative(-74.78f, 16.0f, -74.78f, 16.0f)
                lineToRelative(-37.0f, -113.37f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 5.72f, -5.0f)
                lineToRelative(53.41f, 26.62f)
                arcToRelative(4.11f, 4.11f, 0.0f, false, false, 5.36f, -1.56f)
                lineTo(124.48f, 34.0f)
                arcToRelative(4.11f, 4.11f, 0.0f, false, true, 7.0f, 0.0f)
                lineToRelative(43.77f, 72.74f)
                arcToRelative(4.12f, 4.12f, 0.0f, false, false, 5.35f, 1.56f)
                lineToRelative(53.43f, -26.64f)
                arcTo(4.1f, 4.1f, 0.0f, false, true, 239.78f, 86.62f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.84f, 76.19f)
                arcToRelative(12.08f, 12.08f, 0.0f, false, false, -13.34f, -1.7f)
                lineToRelative(-50.21f, 25.0f)
                lineTo(138.37f, 29.86f)
                arcToRelative(12.11f, 12.11f, 0.0f, false, false, -20.74f, 0.0f)
                lineTo(75.71f, 99.52f)
                lineToRelative(-50.19f, -25.0f)
                arcTo(12.11f, 12.11f, 0.0f, false, false, 8.62f, 89.12f)
                lineToRelative(37.0f, 113.36f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.68f, 4.4f)
                curveTo(57.55f, 206.73f, 83.12f, 192.0f, 128.0f, 192.0f)
                reflectiveCurveToRelative(70.45f, 14.73f, 70.68f, 14.87f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.71f, -4.39f)
                lineToRelative(37.0f, -113.33f)
                arcTo(12.06f, 12.06f, 0.0f, false, false, 243.84f, 76.19f)
                close()
                moveTo(198.0f, 188.83f)
                curveTo(186.0f, 183.74f, 162.08f, 176.0f, 128.0f, 176.0f)
                reflectiveCurveToRelative(-58.0f, 7.74f, -70.0f, 12.83f)
                lineTo(26.71f, 93.0f)
                lineToRelative(45.07f, 22.47f)
                arcToRelative(12.17f, 12.17f, 0.0f, false, false, 15.78f, -4.59f)
                lineTo(128.0f, 43.66f)
                lineToRelative(40.44f, 67.2f)
                arcToRelative(12.17f, 12.17f, 0.0f, false, false, 15.77f, 4.59f)
                lineTo(229.29f, 93.0f)
                close()
            }
        }
        .build()
        return _crownSimple!!
    }

private var _crownSimple: ImageVector? = null
