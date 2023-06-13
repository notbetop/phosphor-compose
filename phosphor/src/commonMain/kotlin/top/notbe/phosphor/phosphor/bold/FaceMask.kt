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

public val BoldGroup.FaceMask: ImageVector
    get() {
        if (_faceMask != null) {
            return _faceMask!!
        }
        _faceMask = Builder(name = "FaceMask", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 88.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(88.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                close()
                moveTo(168.0f, 128.0f)
                lineTo(88.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(256.0f, 104.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(36.05f, 36.05f, 0.0f, false, true, -36.0f, 36.0f)
                horizontalLineToRelative(-6.1f)
                curveToRelative(-6.46f, 13.92f, -18.0f, 26.18f, -34.19f, 36.24f)
                curveToRelative(-19.14f, 11.86f, -39.34f, 17.4f, -47.13f, 19.23f)
                arcToRelative(20.05f, 20.05f, 0.0f, false, true, -9.16f, 0.0f)
                curveToRelative(-12.0f, -2.83f, -63.7f, -17.0f, -81.42f, -55.47f)
                lineTo(36.0f, 164.0f)
                arcTo(36.05f, 36.05f, 0.0f, false, true, 0.0f, 128.0f)
                lineTo(0.0f, 104.0f)
                arcToRelative(36.05f, 36.05f, 0.0f, false, true, 36.0f, -36.0f)
                horizontalLineToRelative(2.08f)
                arcToRelative(19.92f, 19.92f, 0.0f, false, true, 10.49f, -9.67f)
                lineToRelative(72.0f, -28.82f)
                arcToRelative(19.89f, 19.89f, 0.0f, false, true, 14.86f, 0.0f)
                lineToRelative(72.0f, 28.82f)
                arcToRelative(19.92f, 19.92f, 0.0f, false, true, 10.49f, 9.67f)
                lineTo(220.0f, 68.0f)
                arcTo(36.05f, 36.05f, 0.0f, false, true, 256.0f, 104.0f)
                close()
                moveTo(36.11f, 140.0f)
                curveToRelative(-0.06f, -1.27f, -0.11f, -2.55f, -0.11f, -3.85f)
                lineTo(36.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                close()
                moveTo(196.0f, 79.55f)
                lineTo(128.0f, 52.33f)
                lineTo(60.0f, 79.55f)
                verticalLineToRelative(56.59f)
                curveToRelative(0.0f, 17.09f, 9.73f, 31.78f, 28.92f, 43.68f)
                curveToRelative(15.73f, 9.75f, 32.92f, 14.54f, 39.08f, 16.05f)
                curveToRelative(6.16f, -1.51f, 23.35f, -6.3f, 39.08f, -16.05f)
                curveToRelative(19.19f, -11.9f, 28.92f, -26.59f, 28.92f, -43.68f)
                close()
                moveTo(232.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                verticalLineToRelative(44.19f)
                curveToRelative(0.0f, 1.29f, 0.0f, 2.57f, -0.12f, 3.85f)
                lineTo(220.0f, 140.04f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                close()
            }
        }
        .build()
        return _faceMask!!
    }

private var _faceMask: ImageVector? = null
