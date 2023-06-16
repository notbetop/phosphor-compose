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

public val ThinGroup.TextHFour: ImageVector
    get() {
        if (_textHFour != null) {
            return _textHFour!!
        }
        _textHFour = Builder(name = "TextHFour", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.0f, 176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(236.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                verticalLineTo(180.0f)
                horizontalLineTo(184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.79f, -5.26f)
                lineToRelative(24.0f, -72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 7.58f, 2.52f)
                lineTo(189.55f, 172.0f)
                horizontalLineTo(228.0f)
                verticalLineTo(144.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(28.0f)
                horizontalLineToRelative(12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 252.0f, 176.0f)
                close()
                moveTo(144.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(56.0f)
                horizontalLineTo(44.0f)
                verticalLineTo(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineTo(176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(120.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 144.0f, 52.0f)
                close()
            }
        }
        .build()
        return _textHFour!!
    }

private var _textHFour: ImageVector? = null
