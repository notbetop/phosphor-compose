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

public val LightGroup.Keyhole: ImageVector
    get() {
        if (_keyhole != null) {
            return _keyhole!!
        }
        _keyhole = Builder(name = "Keyhole", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(166.0f, 112.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, -63.93f, 27.78f)
                lineTo(90.71f, 168.3f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 100.0f, 182.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 9.29f, -13.7f)
                lineToRelative(-11.36f, -28.52f)
                arcTo(38.14f, 38.14f, 0.0f, false, false, 166.0f, 112.0f)
                close()
                moveTo(143.22f, 133.08f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.06f, 7.08f)
                lineTo(153.05f, 170.0f)
                lineTo(103.0f, 170.0f)
                lineToRelative(11.89f, -29.84f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.06f, -7.08f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, 30.44f, 0.0f)
                close()
            }
        }
        .build()
        return _keyhole!!
    }

private var _keyhole: ImageVector? = null
