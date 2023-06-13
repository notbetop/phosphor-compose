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

public val FillGroup.CubeFocus: ImageVector
    get() {
        if (_cubeFocus != null) {
            return _cubeFocus!!
        }
        _cubeFocus = Builder(name = "CubeFocus", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(178.59f, 90.22f)
                lineTo(128.0f, 119.43f)
                lineTo(77.41f, 90.22f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -6.93f)
                lineToRelative(44.35f, -25.61f)
                arcToRelative(12.48f, 12.48f, 0.0f, false, true, 12.48f, 0.0f)
                lineToRelative(44.35f, 25.61f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 178.59f, 90.22f)
                close()
                moveTo(64.0f, 107.88f)
                verticalLineToRelative(49.55f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, false, 6.42f, 11.24f)
                lineTo(114.0f, 193.84f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.0f, -3.46f)
                lineTo(120.0f, 133.29f)
                lineTo(70.0f, 104.42f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 64.0f, 107.88f)
                close()
                moveTo(192.0f, 157.43f)
                lineTo(192.0f, 107.88f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.0f, -3.46f)
                lineToRelative(-50.0f, 28.87f)
                verticalLineToRelative(57.09f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.0f, 3.46f)
                lineToRelative(43.57f, -25.17f)
                arcTo(13.0f, 13.0f, 0.0f, false, false, 192.0f, 157.43f)
                close()
                moveTo(224.0f, 40.0f)
                lineTo(184.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                lineTo(216.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(232.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 40.0f)
                close()
                moveTo(72.0f, 200.0f)
                lineTo(40.0f, 200.0f)
                lineTo(40.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(72.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(224.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(32.0f)
                lineTo(184.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(232.0f, 168.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 160.0f)
                close()
                moveTo(32.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(40.0f, 56.0f)
                lineTo(72.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(32.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(24.0f, 88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 32.0f, 96.0f)
                close()
            }
        }
        .build()
        return _cubeFocus!!
    }

private var _cubeFocus: ImageVector? = null
