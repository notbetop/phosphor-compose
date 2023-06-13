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

public val DuotoneGroup.PaintBucket: ImageVector
    get() {
        if (_paintBucket != null) {
            return _paintBucket!!
        }
        _paintBucket = Builder(name = "PaintBucket", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(116.52f, 16.0f)
                lineTo(20.69f, 111.83f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.63f)
                lineToRelative(84.85f, 84.85f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.63f, 0.0f)
                lineTo(224.0f, 123.48f)
                close()
                moveTo(109.86f, 130.14f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 28.28f, 0.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 109.86f, 130.14f)
                close()
                moveTo(248.0f, 204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -40.0f, 0.0f)
                curveToRelative(0.0f, -20.0f, 20.0f, -36.0f, 20.0f, -36.0f)
                reflectiveCurveTo(248.0f, 184.0f, 248.0f, 204.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(233.0f, 161.75f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.0f, 0.0f)
                curveToRelative(-0.94f, 0.76f, -23.0f, 18.68f, -23.0f, 42.25f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 56.0f, 0.0f)
                curveTo(256.0f, 180.43f, 233.94f, 162.51f, 233.0f, 161.75f)
                close()
                moveTo(228.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                curveToRelative(0.0f, -10.18f, 7.0f, -19.53f, 12.0f, -24.93f)
                curveToRelative(5.0f, 5.42f, 12.0f, 14.8f, 12.0f, 24.93f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 216.0f)
                close()
                moveTo(229.66f, 117.83f)
                lineTo(122.17f, 10.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, 0.0f)
                lineTo(70.25f, 51.0f)
                lineTo(45.65f, 26.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 34.34f, 37.66f)
                lineToRelative(24.6f, 24.6f)
                lineTo(15.0f, 106.17f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, 33.94f)
                lineTo(99.89f, 225.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 33.94f, 0.0f)
                lineToRelative(95.83f, -95.83f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 229.66f, 117.83f)
                close()
                moveTo(122.51f, 213.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.31f, 0.0f)
                lineTo(26.34f, 128.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.31f)
                lineTo(70.25f, 73.57f)
                lineToRelative(29.12f, 29.12f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 11.31f, -11.32f)
                lineTo(81.57f, 62.26f)
                lineToRelative(35.0f, -34.95f)
                lineToRelative(96.17f, 96.17f)
                close()
                moveTo(115.51f, 107.52f)
                lineTo(115.51f, 107.52f)
                arcToRelative(13.26f, 13.26f, 0.0f, true, true, -0.05f, 0.06f)
                reflectiveCurveTo(115.51f, 107.53f, 115.51f, 107.52f)
                close()
            }
        }
        .build()
        return _paintBucket!!
    }

private var _paintBucket: ImageVector? = null
