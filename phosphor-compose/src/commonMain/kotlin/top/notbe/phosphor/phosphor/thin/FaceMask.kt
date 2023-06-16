package top.notbe.phosphor.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.ThinGroup

public val ThinGroup.FaceMask: ImageVector
    get() {
        if (_faceMask != null) {
            return _faceMask!!
        }
        _faceMask = Builder(name = "FaceMask", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(88.0f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(80.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 172.0f, 104.0f)
                close()
                moveTo(168.0f, 132.0f)
                lineTo(88.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(252.0f, 104.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, 28.0f)
                horizontalLineToRelative(-7.8f)
                curveToRelative(-5.84f, 14.64f, -18.33f, 27.51f, -37.0f, 37.86f)
                curveToRelative(-20.53f, 11.41f, -42.54f, 16.57f, -48.8f, 17.89f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, true, -4.86f, 0.0f)
                curveToRelative(-6.26f, -1.32f, -28.27f, -6.48f, -48.8f, -17.89f)
                curveToRelative(-18.64f, -10.35f, -31.13f, -23.22f, -37.0f, -37.86f)
                lineTo(32.0f, 156.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 4.0f, 128.0f)
                lineTo(4.0f, 104.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 32.0f, 76.0f)
                horizontalLineToRelative(4.06f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 43.9f, 65.81f)
                lineToRelative(80.0f, -29.09f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 8.2f, 0.0f)
                lineToRelative(80.0f, 29.09f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 219.94f, 76.0f)
                lineTo(224.0f, 76.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 252.0f, 104.0f)
                close()
                moveTo(37.32f, 148.0f)
                arcTo(53.6f, 53.6f, 0.0f, false, true, 36.0f, 136.15f)
                lineTo(36.0f, 84.0f)
                lineTo(32.0f, 84.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                close()
                moveTo(209.48f, 151.27f)
                arcToRelative(4.07f, 4.07f, 0.0f, false, true, 0.34f, -1.0f)
                arcTo(46.0f, 46.0f, 0.0f, false, false, 212.0f, 136.15f)
                lineTo(212.0f, 77.09f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.63f, -3.76f)
                lineToRelative(-80.0f, -29.09f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.74f, 0.0f)
                lineToRelative(-80.0f, 29.09f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 44.0f, 77.09f)
                verticalLineToRelative(59.06f)
                arcToRelative(45.85f, 45.85f, 0.0f, false, false, 2.18f, 14.11f)
                arcToRelative(4.29f, 4.29f, 0.0f, false, true, 0.34f, 1.0f)
                curveToRelative(4.74f, 13.68f, 16.16f, 25.61f, 34.14f, 35.6f)
                curveToRelative(19.55f, 10.86f, 40.57f, 15.79f, 46.55f, 17.0f)
                arcToRelative(3.82f, 3.82f, 0.0f, false, false, 1.58f, 0.0f)
                curveToRelative(6.0f, -1.26f, 27.0f, -6.19f, 46.55f, -17.0f)
                curveTo(193.33f, 176.88f, 204.75f, 165.0f, 209.48f, 151.27f)
                close()
                moveTo(244.0f, 104.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(52.15f)
                arcTo(53.6f, 53.6f, 0.0f, false, true, 218.68f, 148.0f)
                lineTo(224.0f, 148.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                close()
            }
        }
        .build()
        return _faceMask!!
    }

private var _faceMask: ImageVector? = null
