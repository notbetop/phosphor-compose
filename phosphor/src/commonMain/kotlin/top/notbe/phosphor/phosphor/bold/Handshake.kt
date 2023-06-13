package top.notbe.phosphor.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.BoldGroup

public val BoldGroup.Handshake: ImageVector
    get() {
        if (_handshake != null) {
            return _handshake!!
        }
        _handshake = Builder(name = "Handshake", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(123.64f, 218.91f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 112.0f, 228.0f)
                arcToRelative(12.28f, 12.28f, 0.0f, false, true, -2.92f, -0.36f)
                lineToRelative(-32.0f, -8.0f)
                arcTo(11.79f, 11.79f, 0.0f, false, true, 73.34f, 218.0f)
                lineToRelative(-24.0f, -16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 13.32f, -20.0f)
                lineToRelative(22.27f, 14.85f)
                lineToRelative(30.0f, 7.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 123.64f, 218.91f)
                close()
                moveTo(255.0f, 122.75f)
                arcToRelative(19.88f, 19.88f, 0.0f, false, true, -10.0f, 11.56f)
                lineToRelative(-22.87f, 11.44f)
                lineToRelative(-53.58f, 54.73f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.4f, 3.16f)
                lineToRelative(-64.0f, -16.0f)
                arcToRelative(12.16f, 12.16f, 0.0f, false, true, -4.17f, -1.95f)
                lineTo(35.0f, 146.28f)
                lineToRelative(-23.94f, -12.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -9.0f, -26.83f)
                lineTo(27.0f, 57.79f)
                horizontalLineToRelative(0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 26.83f, -8.94f)
                lineTo(74.42f, 59.16f)
                lineToRelative(50.21f, -14.68f)
                arcToRelative(12.07f, 12.07f, 0.0f, false, true, 6.74f, 0.0f)
                lineToRelative(50.21f, 14.68f)
                lineToRelative(20.63f, -10.32f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 229.0f, 57.79f)
                lineToRelative(24.85f, 49.69f)
                arcTo(19.86f, 19.86f, 0.0f, false, true, 255.0f, 122.75f)
                close()
                moveTo(200.3f, 134.0f)
                lineToRelative(-25.0f, -50.0f)
                lineTo(148.86f, 84.0f)
                lineToRelative(-38.2f, 37.05f)
                curveToRelative(15.76f, 7.26f, 31.16f, 0.19f, 40.82f, -9.55f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 16.0f, -0.91f)
                lineToRelative(31.26f, 25.0f)
                close()
                moveTo(25.37f, 114.63f)
                lineTo(35.9f, 119.9f)
                lineTo(57.17f, 77.37f)
                lineTo(46.63f, 72.1f)
                close()
                moveTo(182.0f, 153.0f)
                lineTo(160.3f, 135.57f)
                curveToRelative(-20.49f, 15.29f, -45.85f, 16.79f, -67.0f, 3.25f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -3.4f, -31.0f)
                lineToRelative(0.12f, -0.12f)
                lineTo(129.82f, 69.0f)
                lineTo(128.0f, 68.5f)
                lineTo(81.66f, 82.05f)
                lineTo(56.54f, 132.29f)
                lineToRelative(44.65f, 32.64f)
                lineToRelative(55.13f, 13.78f)
                close()
                moveTo(230.59f, 114.64f)
                lineTo(209.37f, 72.1f)
                lineToRelative(-10.54f, 5.27f)
                lineTo(220.1f, 119.9f)
                close()
            }
        }
        .build()
        return _handshake!!
    }

private var _handshake: ImageVector? = null
