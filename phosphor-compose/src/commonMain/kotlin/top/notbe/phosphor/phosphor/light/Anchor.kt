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

public val LightGroup.Anchor: ImageVector
    get() {
        if (_anchor != null) {
            return _anchor!!
        }
        _anchor = Builder(name = "Anchor", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 138.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, -42.0f, 42.0f)
                arcToRelative(45.86f, 45.86f, 0.0f, false, false, -34.0f, 15.08f)
                verticalLineTo(126.0f)
                horizontalLineToRelative(34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                horizontalLineTo(134.0f)
                verticalLineTo(85.4f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, -12.0f, 0.0f)
                verticalLineTo(114.0f)
                horizontalLineTo(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(34.0f)
                verticalLineToRelative(75.08f)
                arcTo(45.86f, 45.86f, 0.0f, false, false, 88.0f, 186.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, -42.0f, -42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                arcToRelative(54.06f, 54.06f, 0.0f, false, false, 54.0f, 54.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 34.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 34.0f, -34.0f)
                arcToRelative(54.06f, 54.06f, 0.0f, false, false, 54.0f, -54.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 216.0f, 138.0f)
                close()
                moveTo(110.0f, 56.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, 18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 110.0f, 56.0f)
                close()
            }
        }
        .build()
        return _anchor!!
    }

private var _anchor: ImageVector? = null
