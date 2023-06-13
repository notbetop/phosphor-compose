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

public val ThinGroup.TextHThree: ImageVector
    get() {
        if (_textHThree != null) {
            return _textHThree!!
        }
        _textHThree = Builder(name = "TextHThree", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 180.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -54.86f, 22.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.72f, -5.6f)
                arcTo(24.0f, 24.0f, 0.0f, true, false, 212.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.28f, -6.29f)
                lineTo(232.32f, 116.0f)
                horizontalLineTo(192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.28f, 6.29f)
                lineTo(219.12f, 148.8f)
                arcTo(32.06f, 32.06f, 0.0f, false, true, 244.0f, 180.0f)
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
        return _textHThree!!
    }

private var _textHThree: ImageVector? = null
