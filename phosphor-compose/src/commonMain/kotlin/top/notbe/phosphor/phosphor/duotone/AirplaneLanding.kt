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

public val DuotoneGroup.AirplaneLanding: ImageVector
    get() {
        if (_airplaneLanding != null) {
            return _airplaneLanding!!
        }
        _airplaneLanding = Builder(name = "AirplaneLanding", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 148.32f)
                verticalLineTo(184.0f)
                lineTo(47.37f, 134.54f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 24.0f, 103.73f)
                verticalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.53f, -7.59f)
                lineTo(40.0f, 42.24f)
                lineTo(52.0f, 75.46f)
                lineTo(96.0f, 88.0f)
                verticalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.53f, -7.59f)
                lineTo(112.0f, 42.24f)
                lineToRelative(24.0f, 57.2f)
                lineToRelative(64.56f, 18.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 224.0f, 148.32f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(96.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(240.0f, 208.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 248.0f, 216.0f)
                close()
                moveTo(221.84f, 191.7f)
                lineTo(45.21f, 142.24f)
                arcTo(40.12f, 40.12f, 0.0f, false, true, 16.0f, 103.72f)
                lineTo(16.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 37.06f, 32.82f)
                lineToRelative(5.47f, 1.82f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.0f, 4.87f)
                lineTo(58.13f, 68.88f)
                lineTo(88.0f, 77.39f)
                lineTo(88.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 21.06f, -15.18f)
                lineToRelative(5.47f, 1.82f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.85f, 4.5f)
                lineToRelative(22.5f, 53.63f)
                lineToRelative(60.84f, 17.0f)
                arcTo(40.13f, 40.13f, 0.0f, false, true, 232.0f, 148.32f)
                lineTo(232.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.16f, 7.7f)
                close()
                moveTo(216.0f, 148.32f)
                arcToRelative(24.09f, 24.09f, 0.0f, false, false, -17.58f, -23.13f)
                lineToRelative(-64.57f, -18.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.23f, -4.61f)
                lineTo(106.0f, 48.67f)
                lineTo(104.0f, 48.0f)
                lineTo(104.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.19f, 7.7f)
                lineToRelative(-44.0f, -12.54f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.33f, -5.0f)
                lineTo(33.79f, 48.59f)
                lineTo(32.0f, 48.0f)
                verticalLineToRelative(55.72f)
                arcToRelative(24.09f, 24.09f, 0.0f, false, false, 17.53f, 23.12f)
                lineTo(216.0f, 173.45f)
                close()
            }
        }
        .build()
        return _airplaneLanding!!
    }

private var _airplaneLanding: ImageVector? = null
