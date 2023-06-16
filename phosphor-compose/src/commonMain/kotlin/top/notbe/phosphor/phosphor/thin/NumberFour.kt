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

public val ThinGroup.NumberFour: ImageVector
    get() {
        if (_numberFour != null) {
            return _numberFour!!
        }
        _numberFour = Builder(name = "NumberFour", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(156.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                verticalLineTo(156.0f)
                horizontalLineTo(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.77f, -5.35f)
                lineToRelative(40.0f, -112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 7.54f, 2.69f)
                lineTo(77.68f, 148.0f)
                horizontalLineTo(148.0f)
                verticalLineTo(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(52.0f)
                horizontalLineToRelative(20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 180.0f, 152.0f)
                close()
            }
        }
        .build()
        return _numberFour!!
    }

private var _numberFour: ImageVector? = null
