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

public val DuotoneGroup.PhoneIncoming: ImageVector
    get() {
        if (_phoneIncoming != null) {
            return _phoneIncoming!!
        }
        _phoneIncoming = Builder(name = "PhoneIncoming", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(223.94f, 174.08f)
                arcTo(48.33f, 48.33f, 0.0f, false, true, 176.0f, 216.0f)
                arcTo(136.0f, 136.0f, 0.0f, false, true, 40.0f, 80.0f)
                arcTo(48.33f, 48.33f, 0.0f, false, true, 81.92f, 32.06f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.3f, 4.8f)
                lineToRelative(21.13f, 47.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.66f, 7.53f)
                lineTo(89.32f, 117.0f)
                arcToRelative(7.93f, 7.93f, 0.0f, false, false, -0.54f, 7.81f)
                curveToRelative(8.27f, 16.93f, 25.77f, 34.22f, 42.75f, 42.41f)
                arcToRelative(7.92f, 7.92f, 0.0f, false, false, 7.83f, -0.59f)
                lineToRelative(25.0f, -21.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.59f, -0.69f)
                lineToRelative(47.16f, 21.13f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 223.94f, 174.08f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 96.0f)
                lineTo(152.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(168.0f, 76.69f)
                lineToRelative(34.34f, -34.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                lineTo(179.32f, 88.0f)
                lineTo(200.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(160.0f, 104.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 152.0f, 96.0f)
                close()
                moveTo(231.88f, 175.08f)
                arcTo(56.26f, 56.26f, 0.0f, false, true, 176.0f, 224.0f)
                curveTo(96.6f, 224.0f, 32.0f, 159.4f, 32.0f, 80.0f)
                arcTo(56.24f, 56.24f, 0.0f, false, true, 80.92f, 24.13f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.62f, 9.51f)
                lineToRelative(21.12f, 47.15f)
                lineToRelative(0.0f, 0.12f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 117.39f, 96.0f)
                curveToRelative(-0.18f, 0.27f, -0.37f, 0.52f, -0.57f, 0.77f)
                lineTo(96.0f, 121.45f)
                curveToRelative(7.49f, 15.22f, 23.41f, 31.0f, 38.83f, 38.51f)
                lineToRelative(24.34f, -20.71f)
                arcToRelative(8.12f, 8.12f, 0.0f, false, true, 0.75f, -0.56f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 15.17f, -1.4f)
                lineToRelative(0.13f, 0.06f)
                lineToRelative(47.11f, 21.11f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 231.88f, 175.08f)
                close()
                moveTo(216.0f, 173.08f)
                reflectiveCurveToRelative(-0.07f, 0.0f, -0.11f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-47.0f, -21.05f)
                lineToRelative(-24.35f, 20.71f)
                arcToRelative(6.84f, 6.84f, 0.0f, false, true, -0.74f, 0.56f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -15.75f, 1.14f)
                curveToRelative(-18.73f, -9.05f, -37.4f, -27.58f, -46.46f, -46.11f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 1.0f, -15.7f)
                arcToRelative(6.13f, 6.13f, 0.0f, false, true, 0.57f, -0.77f)
                lineTo(104.0f, 87.15f)
                lineToRelative(-21.0f, -47.0f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, true, 0.0f, -0.12f)
                arcTo(40.2f, 40.2f, 0.0f, false, false, 48.0f, 80.0f)
                arcTo(128.14f, 128.14f, 0.0f, false, false, 176.0f, 208.0f)
                arcTo(40.21f, 40.21f, 0.0f, false, false, 216.0f, 173.07f)
                close()
            }
        }
        .build()
        return _phoneIncoming!!
    }

private var _phoneIncoming: ImageVector? = null
