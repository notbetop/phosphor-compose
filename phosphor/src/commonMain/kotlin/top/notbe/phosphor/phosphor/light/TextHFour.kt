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

public val LightGroup.TextHFour: ImageVector
    get() {
        if (_textHFour != null) {
            return _textHFour!!
        }
        _textHFour = Builder(name = "TextHFour", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(254.0f, 176.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineTo(238.0f)
                verticalLineToRelative(26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                verticalLineTo(182.0f)
                horizontalLineTo(184.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.69f, -7.9f)
                lineToRelative(24.0f, -72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.38f, 3.8f)
                lineTo(192.32f, 170.0f)
                horizontalLineTo(226.0f)
                verticalLineTo(144.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(26.0f)
                horizontalLineToRelative(10.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 254.0f, 176.0f)
                close()
                moveTo(144.0f, 50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(54.0f)
                horizontalLineTo(46.0f)
                verticalLineTo(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineTo(176.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(122.0f)
                horizontalLineToRelative(92.0f)
                verticalLineToRelative(54.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 144.0f, 50.0f)
                close()
            }
        }
        .build()
        return _textHFour!!
    }

private var _textHFour: ImageVector? = null
