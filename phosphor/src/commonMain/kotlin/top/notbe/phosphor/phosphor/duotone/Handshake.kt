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

public val DuotoneGroup.Handshake: ImageVector
    get() {
        if (_handshake != null) {
            return _handshake!!
        }
        _handshake = Builder(name = "Handshake", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(200.0f, 152.0f)
                lineToRelative(-40.0f, 40.0f)
                lineTo(96.0f, 176.0f)
                lineTo(40.0f, 136.0f)
                lineTo(72.0f, 72.0f)
                lineToRelative(56.0f, -16.0f)
                lineToRelative(56.0f, 16.0f)
                horizontalLineTo(144.0f)
                lineTo(98.34f, 116.29f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.38f, 12.42f)
                curveTo(117.23f, 139.9f, 141.0f, 139.13f, 160.0f, 120.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(119.76f, 217.94f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 112.0f, 224.0f)
                arcToRelative(8.13f, 8.13f, 0.0f, false, true, -2.0f, -0.24f)
                lineToRelative(-32.0f, -8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.5f, -1.11f)
                lineToRelative(-24.0f, -16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.88f, -13.31f)
                lineToRelative(22.84f, 15.23f)
                lineToRelative(30.66f, 7.67f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 119.76f, 217.94f)
                close()
                moveTo(252.45f, 121.48f)
                arcToRelative(15.89f, 15.89f, 0.0f, false, true, -8.0f, 9.25f)
                lineToRelative(-23.68f, 11.84f)
                lineToRelative(-55.08f, 55.09f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.6f, 2.1f)
                lineToRelative(-64.0f, -16.0f)
                arcToRelative(8.06f, 8.06f, 0.0f, false, true, -2.71f, -1.25f)
                lineTo(35.86f, 142.87f)
                lineTo(11.58f, 130.73f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -7.16f, -21.46f)
                lineTo(29.27f, 59.58f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 21.46f, -7.16f)
                lineToRelative(22.06f, 11.0f)
                lineToRelative(53.0f, -15.14f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.4f, 0.0f)
                lineToRelative(53.0f, 15.14f)
                lineToRelative(22.06f, -11.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 21.46f, 7.16f)
                lineToRelative(24.85f, 49.69f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 252.45f, 121.48f)
                close()
                moveTo(206.27f, 134.42f)
                lineTo(179.06f, 80.0f)
                lineTo(147.24f, 80.0f)
                lineTo(104.0f, 122.0f)
                curveToRelative(12.66f, 8.09f, 32.51f, 10.32f, 50.32f, -7.63f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.68f, -0.61f)
                lineToRelative(34.41f, 27.57f)
                close()
                moveTo(18.73f, 116.42f)
                lineTo(36.42f, 125.27f)
                lineTo(61.27f, 75.58f)
                lineTo(43.58f, 66.73f)
                close()
                moveTo(188.0f, 152.66f)
                lineToRelative(-27.71f, -22.19f)
                curveToRelative(-19.54f, 16.0f, -44.35f, 18.11f, -64.91f, 5.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -2.72f, -24.82f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.08f, -0.08f)
                lineTo(137.6f, 67.06f)
                lineTo(128.0f, 64.32f)
                lineTo(77.58f, 78.73f)
                lineTo(50.21f, 133.46f)
                lineToRelative(49.2f, 35.15f)
                lineToRelative(58.14f, 14.53f)
                close()
                moveTo(237.24f, 116.42f)
                lineTo(212.42f, 66.73f)
                lineToRelative(-17.69f, 8.85f)
                lineToRelative(24.85f, 49.69f)
                close()
            }
        }
        .build()
        return _handshake!!
    }

private var _handshake: ImageVector? = null
