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

public val LightGroup.Translate: ImageVector
    get() {
        if (_translate != null) {
            return _translate!!
        }
        _translate = Builder(name = "Translate", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.37f, 213.32f)
                lineToRelative(-56.0f, -112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.74f, 0.0f)
                lineToRelative(-22.3f, 44.6f)
                arcTo(90.0f, 90.0f, 0.0f, false, true, 97.0f, 127.19f)
                arcTo(101.73f, 101.73f, 0.0f, false, false, 125.82f, 62.0f)
                horizontalLineTo(152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                horizontalLineTo(94.0f)
                verticalLineTo(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineTo(50.0f)
                horizontalLineTo(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(89.79f)
                arcTo(89.71f, 89.71f, 0.0f, false, true, 88.0f, 119.23f)
                arcTo(89.81f, 89.81f, 0.0f, false, true, 67.11f, 86.0f)
                arcTo(6.0f, 6.0f, 0.0f, true, false, 55.8f, 90.0f)
                arcTo(101.66f, 101.66f, 0.0f, false, false, 79.0f, 127.2f)
                arcTo(89.56f, 89.56f, 0.0f, false, true, 24.0f, 146.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(101.55f, 101.55f, 0.0f, false, false, 64.0f, -22.63f)
                arcToRelative(102.11f, 102.11f, 0.0f, false, false, 54.53f, 22.17f)
                lineToRelative(-27.89f, 55.78f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.74f, 5.36f)
                lineTo(139.71f, 190.0f)
                horizontalLineToRelative(72.58f)
                lineToRelative(14.34f, 28.68f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 232.0f, 222.0f)
                arcToRelative(5.87f, 5.87f, 0.0f, false, false, 2.68f, -0.64f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 237.37f, 213.32f)
                close()
                moveTo(145.71f, 178.0f)
                lineTo(176.0f, 117.42f)
                lineTo(206.29f, 178.0f)
                close()
            }
        }
        .build()
        return _translate!!
    }

private var _translate: ImageVector? = null
