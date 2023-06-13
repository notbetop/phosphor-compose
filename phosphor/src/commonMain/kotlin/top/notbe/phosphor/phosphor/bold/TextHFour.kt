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

public val BoldGroup.TextHFour: ImageVector
    get() {
        if (_textHFour != null) {
            return _textHFour!!
        }
        _textHFour = Builder(name = "TextHFour", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineTo(188.0f)
                horizontalLineTo(184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.38f, -15.79f)
                lineToRelative(24.0f, -72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 22.76f, 7.58f)
                lineTo(200.65f, 164.0f)
                horizontalLineTo(220.0f)
                verticalLineTo(144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(20.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 256.0f, 176.0f)
                close()
                moveTo(144.0f, 44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(48.0f)
                horizontalLineTo(52.0f)
                verticalLineTo(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineTo(176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(128.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 144.0f, 44.0f)
                close()
            }
        }
        .build()
        return _textHFour!!
    }

private var _textHFour: ImageVector? = null
