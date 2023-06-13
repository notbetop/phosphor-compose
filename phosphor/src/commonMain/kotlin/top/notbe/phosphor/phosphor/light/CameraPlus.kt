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

public val LightGroup.CameraPlus: ImageVector
    get() {
        if (_cameraPlus != null) {
            return _cameraPlus!!
        }
        _cameraPlus = Builder(name = "CameraPlus", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 58.0f)
                lineTo(179.21f, 58.0f)
                lineTo(165.0f, 36.67f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 160.0f, 34.0f)
                lineTo(96.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.0f, 2.67f)
                lineTo(76.78f, 58.0f)
                lineTo(48.0f, 58.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 26.0f, 80.0f)
                lineTo(26.0f, 192.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, 22.0f)
                lineTo(208.0f, 214.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, -22.0f)
                lineTo(230.0f, 80.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 208.0f, 58.0f)
                close()
                moveTo(218.0f, 192.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, 10.0f)
                lineTo(48.0f, 202.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, -10.0f)
                lineTo(38.0f, 80.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 48.0f, 70.0f)
                lineTo(80.0f, 70.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.0f, -2.67f)
                lineTo(99.21f, 46.0f)
                horizontalLineToRelative(57.57f)
                lineTo(171.0f, 67.33f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 176.0f, 70.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, 10.0f)
                close()
                moveTo(166.0f, 136.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(134.0f, 142.0f)
                verticalLineToRelative(26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(122.0f, 142.0f)
                lineTo(96.0f, 142.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(26.0f)
                lineTo(122.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(26.0f)
                horizontalLineToRelative(26.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 166.0f, 136.0f)
                close()
            }
        }
        .build()
        return _cameraPlus!!
    }

private var _cameraPlus: ImageVector? = null
