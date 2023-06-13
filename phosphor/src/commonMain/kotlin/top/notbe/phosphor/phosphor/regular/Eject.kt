package top.notbe.phosphor.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.RegularGroup

public val RegularGroup.Eject: ImageVector
    get() {
        if (_eject != null) {
            return _eject!!
        }
        _eject = Builder(name = "Eject", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 160.0f)
                lineTo(48.0f, 160.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 176.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 160.0f)
                close()
                moveTo(208.0f, 200.0f)
                lineTo(48.0f, 200.0f)
                lineTo(48.0f, 176.0f)
                lineTo(208.0f, 176.0f)
                close()
                moveTo(48.24f, 144.0f)
                lineTo(207.76f, 144.0f)
                arcToRelative(16.18f, 16.18f, 0.0f, false, false, 14.93f, -9.76f)
                arcToRelative(15.59f, 15.59f, 0.0f, false, false, -3.1f, -17.12f)
                lineTo(145.86f, 39.61f)
                arcToRelative(24.76f, 24.76f, 0.0f, false, false, -35.72f, 0.0f)
                lineTo(36.41f, 117.12f)
                horizontalLineToRelative(0.0f)
                arcToRelative(15.59f, 15.59f, 0.0f, false, false, -3.1f, 17.12f)
                arcTo(16.18f, 16.18f, 0.0f, false, false, 48.24f, 144.0f)
                close()
                moveTo(121.73f, 50.64f)
                arcToRelative(8.77f, 8.77f, 0.0f, false, true, 12.54f, 0.0f)
                lineTo(207.85f, 128.0f)
                lineTo(48.14f, 128.0f)
                close()
            }
        }
        .build()
        return _eject!!
    }

private var _eject: ImageVector? = null
