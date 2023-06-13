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

public val BoldGroup.CameraPlus: ImageVector
    get() {
        if (_cameraPlus != null) {
            return _cameraPlus!!
        }
        _cameraPlus = Builder(name = "CameraPlus", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 52.0f)
                lineTo(182.42f, 52.0f)
                lineTo(170.0f, 33.34f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 160.0f, 28.0f)
                lineTo(96.0f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.0f, 5.34f)
                lineTo(73.57f, 52.0f)
                lineTo(48.0f, 52.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 20.0f, 80.0f)
                lineTo(20.0f, 192.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, 28.0f)
                lineTo(208.0f, 220.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, -28.0f)
                lineTo(236.0f, 80.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 208.0f, 52.0f)
                close()
                moveTo(212.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(48.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(44.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(80.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.0f, -5.34f)
                lineTo(102.42f, 52.0f)
                horizontalLineToRelative(51.15f)
                lineTo(166.0f, 70.66f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 176.0f, 76.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(172.0f, 136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(140.0f, 148.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(116.0f, 148.0f)
                lineTo(96.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(20.0f)
                lineTo(116.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(20.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 172.0f, 136.0f)
                close()
            }
        }
        .build()
        return _cameraPlus!!
    }

private var _cameraPlus: ImageVector? = null
