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

public val BoldGroup.CubeFocus: ImageVector
    get() {
        if (_cubeFocus != null) {
            return _cubeFocus!!
        }
        _cubeFocus = Builder(name = "CubeFocus", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.0f, 157.43f)
                lineTo(196.0f, 98.57f)
                arcToRelative(17.0f, 17.0f, 0.0f, false, false, -8.42f, -14.71f)
                lineTo(136.24f, 54.21f)
                arcToRelative(16.55f, 16.55f, 0.0f, false, false, -16.48f, 0.0f)
                lineTo(68.43f, 83.86f)
                arcTo(17.0f, 17.0f, 0.0f, false, false, 60.0f, 98.57f)
                verticalLineToRelative(58.86f)
                arcToRelative(17.0f, 17.0f, 0.0f, false, false, 8.42f, 14.71f)
                lineToRelative(51.34f, 29.65f)
                arcToRelative(16.53f, 16.53f, 0.0f, false, false, 16.48f, 0.0f)
                lineToRelative(51.33f, -29.65f)
                arcTo(17.0f, 17.0f, 0.0f, false, false, 196.0f, 157.43f)
                close()
                moveTo(128.0f, 77.17f)
                lineTo(160.59f, 96.0f)
                lineTo(128.0f, 114.81f)
                lineTo(95.41f, 96.0f)
                close()
                moveTo(84.0f, 117.17f)
                lineTo(116.0f, 135.65f)
                verticalLineToRelative(36.3f)
                lineTo(84.0f, 153.42f)
                close()
                moveTo(140.0f, 171.95f)
                lineTo(140.0f, 135.6f)
                lineToRelative(32.0f, -18.48f)
                verticalLineToRelative(36.3f)
                close()
                moveTo(236.0f, 48.0f)
                lineTo(236.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(212.0f, 60.0f)
                lineTo(184.0f, 60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 236.0f, 48.0f)
                close()
                moveTo(84.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(32.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(20.0f, 168.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(28.0f)
                lineTo(72.0f, 196.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 84.0f, 208.0f)
                close()
                moveTo(236.0f, 168.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(184.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(28.0f)
                lineTo(212.0f, 168.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(20.0f, 88.0f)
                lineTo(20.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 32.0f, 36.0f)
                lineTo(72.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(44.0f, 60.0f)
                lineTo(44.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _cubeFocus!!
    }

private var _cubeFocus: ImageVector? = null
