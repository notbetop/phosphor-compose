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

public val LightGroup.Keyboard: ImageVector
    get() {
        if (_keyboard != null) {
            return _keyboard!!
        }
        _keyboard = Builder(name = "Keyboard", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.51f, 50.0f)
                horizontalLineToRelative(-191.0f)
                arcTo(14.51f, 14.51f, 0.0f, false, false, 18.0f, 64.49f)
                verticalLineToRelative(127.0f)
                arcTo(14.51f, 14.51f, 0.0f, false, false, 32.49f, 206.0f)
                horizontalLineToRelative(191.0f)
                arcTo(14.51f, 14.51f, 0.0f, false, false, 238.0f, 191.51f)
                verticalLineToRelative(-127.0f)
                arcTo(14.51f, 14.51f, 0.0f, false, false, 223.51f, 50.0f)
                close()
                moveTo(226.0f, 191.51f)
                arcToRelative(2.49f, 2.49f, 0.0f, false, true, -2.49f, 2.49f)
                horizontalLineToRelative(-191.0f)
                arcTo(2.49f, 2.49f, 0.0f, false, true, 30.0f, 191.51f)
                verticalLineToRelative(-127.0f)
                arcTo(2.49f, 2.49f, 0.0f, false, true, 32.49f, 62.0f)
                horizontalLineToRelative(191.0f)
                arcTo(2.49f, 2.49f, 0.0f, false, true, 226.0f, 64.49f)
                close()
                moveTo(206.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(56.0f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(200.0f, 122.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 206.0f, 128.0f)
                close()
                moveTo(206.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(56.0f, 102.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(200.0f, 90.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 206.0f, 96.0f)
                close()
                moveTo(70.0f, 160.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(56.0f, 166.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 70.0f, 160.0f)
                close()
                moveTo(166.0f, 160.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(96.0f, 166.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(64.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 166.0f, 160.0f)
                close()
                moveTo(206.0f, 160.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 206.0f, 160.0f)
                close()
            }
        }
        .build()
        return _keyboard!!
    }

private var _keyboard: ImageVector? = null
