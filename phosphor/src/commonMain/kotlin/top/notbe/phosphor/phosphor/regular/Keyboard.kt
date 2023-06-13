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

public val RegularGroup.Keyboard: ImageVector
    get() {
        if (_keyboard != null) {
            return _keyboard!!
        }
        _keyboard = Builder(name = "Keyboard", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.51f, 48.0f)
                horizontalLineToRelative(-191.0f)
                arcTo(16.51f, 16.51f, 0.0f, false, false, 16.0f, 64.49f)
                verticalLineToRelative(127.0f)
                arcTo(16.51f, 16.51f, 0.0f, false, false, 32.49f, 208.0f)
                horizontalLineToRelative(191.0f)
                arcTo(16.51f, 16.51f, 0.0f, false, false, 240.0f, 191.51f)
                verticalLineToRelative(-127.0f)
                arcTo(16.51f, 16.51f, 0.0f, false, false, 223.51f, 48.0f)
                close()
                moveTo(224.0f, 191.51f)
                arcToRelative(0.49f, 0.49f, 0.0f, false, true, -0.49f, 0.49f)
                horizontalLineToRelative(-191.0f)
                arcToRelative(0.49f, 0.49f, 0.0f, false, true, -0.49f, -0.49f)
                verticalLineToRelative(-127.0f)
                arcToRelative(0.49f, 0.49f, 0.0f, false, true, 0.49f, -0.49f)
                horizontalLineToRelative(191.0f)
                arcToRelative(0.49f, 0.49f, 0.0f, false, true, 0.49f, 0.49f)
                close()
                moveTo(208.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(56.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(200.0f, 120.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 128.0f)
                close()
                moveTo(208.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(56.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(200.0f, 88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 96.0f)
                close()
                moveTo(72.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(56.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 72.0f, 160.0f)
                close()
                moveTo(168.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(96.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 160.0f)
                close()
                moveTo(208.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 160.0f)
                close()
            }
        }
        .build()
        return _keyboard!!
    }

private var _keyboard: ImageVector? = null
