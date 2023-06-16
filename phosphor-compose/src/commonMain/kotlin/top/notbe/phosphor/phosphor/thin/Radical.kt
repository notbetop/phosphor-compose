package top.notbe.phosphor.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.ThinGroup

public val ThinGroup.Radical: ImageVector
    get() {
        if (_radical != null) {
            return _radical!!
        }
        _radical = Builder(name = "Radical", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 72.0f)
                verticalLineTo(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                verticalLineTo(76.0f)
                horizontalLineTo(122.77f)
                lineToRelative(-47.0f, 125.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.49f, 0.0f)
                lineToRelative(-48.0f, -128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.49f, -2.81f)
                lineTo(72.0f, 188.61f)
                lineToRelative(44.26f, -118.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 120.0f, 68.0f)
                horizontalLineTo(232.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 236.0f, 72.0f)
                close()
            }
        }
        .build()
        return _radical!!
    }

private var _radical: ImageVector? = null
