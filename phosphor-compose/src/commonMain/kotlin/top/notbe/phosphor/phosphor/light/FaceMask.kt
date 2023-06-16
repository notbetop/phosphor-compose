package top.notbe.phosphor.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.LightGroup

public val LightGroup.FaceMask: ImageVector
    get() {
        if (_faceMask != null) {
            return _faceMask!!
        }
        _faceMask = Builder(name = "FaceMask", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(88.0f, 110.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(80.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 174.0f, 104.0f)
                close()
                moveTo(168.0f, 130.0f)
                lineTo(88.0f, 130.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(254.0f, 104.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, -30.0f, 30.0f)
                horizontalLineToRelative(-6.45f)
                curveToRelative(-6.2f, 14.54f, -18.81f, 27.31f, -37.35f, 37.61f)
                curveToRelative(-20.78f, 11.54f, -43.0f, 16.77f, -49.36f, 18.09f)
                arcToRelative(13.59f, 13.59f, 0.0f, false, true, -5.68f, 0.0f)
                curveToRelative(-6.33f, -1.32f, -28.58f, -6.55f, -49.36f, -18.09f)
                curveTo(57.26f, 185.31f, 44.65f, 172.54f, 38.45f, 158.0f)
                lineTo(32.0f, 158.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, true, 2.0f, 128.0f)
                lineTo(2.0f, 104.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, true, 32.0f, 74.0f)
                horizontalLineToRelative(2.35f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 8.87f, -10.07f)
                lineToRelative(80.0f, -29.09f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 9.56f, 0.0f)
                lineToRelative(80.0f, 29.09f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 221.65f, 74.0f)
                lineTo(224.0f, 74.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, true, 254.0f, 104.0f)
                close()
                moveTo(34.87f, 146.0f)
                arcToRelative(56.38f, 56.38f, 0.0f, false, true, -0.87f, -9.85f)
                lineTo(34.0f, 86.0f)
                lineTo(32.0f, 86.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, -18.0f, 18.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, 18.0f, 18.0f)
                close()
                moveTo(210.0f, 136.15f)
                lineTo(210.0f, 77.09f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.32f, -1.88f)
                lineToRelative(-80.0f, -29.09f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.36f, 0.0f)
                lineToRelative(-80.0f, 29.09f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 46.0f, 77.09f)
                verticalLineToRelative(59.06f)
                arcToRelative(43.14f, 43.14f, 0.0f, false, false, 2.32f, 14.06f)
                horizontalLineToRelative(0.0f)
                curveToRelative(12.52f, 36.65f, 71.83f, 50.17f, 79.3f, 51.74f)
                arcToRelative(1.94f, 1.94f, 0.0f, false, false, 0.76f, 0.0f)
                curveTo(136.73f, 200.21f, 210.0f, 183.49f, 210.0f, 136.15f)
                close()
                moveTo(242.0f, 104.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, -18.0f, -18.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(50.15f)
                arcToRelative(56.38f, 56.38f, 0.0f, false, true, -0.87f, 9.85f)
                lineTo(224.0f, 146.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, 18.0f, -18.0f)
                close()
            }
        }
        .build()
        return _faceMask!!
    }

private var _faceMask: ImageVector? = null
