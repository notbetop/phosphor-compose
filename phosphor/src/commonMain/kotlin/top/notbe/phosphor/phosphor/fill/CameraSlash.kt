package top.notbe.phosphor.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.FillGroup

public val FillGroup.CameraSlash: ImageVector
    get() {
        if (_cameraSlash != null) {
            return _cameraSlash!!
        }
        _cameraSlash = Builder(name = "CameraSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.92f, 34.62f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f)
                lineTo(51.73f, 56.0f)
                horizontalLineTo(48.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 24.0f, 80.0f)
                verticalLineTo(192.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineTo(197.19f)
                lineToRelative(4.89f, 5.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f)
                close()
                moveTo(128.0f, 168.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -27.88f, -58.77f)
                lineTo(148.0f, 161.92f)
                arcTo(35.72f, 35.72f, 0.0f, false, true, 128.0f, 168.0f)
                close()
                moveTo(232.0f, 80.0f)
                verticalLineTo(186.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.92f, 5.38f)
                lineToRelative(-130.0f, -143.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.74f, -9.81f)
                lineToRelative(2.0f, -3.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 96.0f, 32.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.66f, 3.56f)
                lineTo(180.28f, 56.0f)
                horizontalLineTo(208.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 232.0f, 80.0f)
                close()
            }
        }
        .build()
        return _cameraSlash!!
    }

private var _cameraSlash: ImageVector? = null
