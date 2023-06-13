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

public val LightGroup.NumberFour: ImageVector
    get() {
        if (_numberFour != null) {
            return _numberFour!!
        }
        _numberFour = Builder(name = "NumberFour", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(182.0f, 152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineTo(158.0f)
                verticalLineToRelative(50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                verticalLineTo(158.0f)
                horizontalLineTo(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.65f, -8.0f)
                lineToRelative(40.0f, -112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.3f, 4.0f)
                lineTo(80.51f, 146.0f)
                horizontalLineTo(146.0f)
                verticalLineTo(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(50.0f)
                horizontalLineToRelative(18.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 182.0f, 152.0f)
                close()
            }
        }
        .build()
        return _numberFour!!
    }

private var _numberFour: ImageVector? = null
