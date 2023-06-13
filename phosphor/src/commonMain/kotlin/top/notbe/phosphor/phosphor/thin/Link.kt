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

public val ThinGroup.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(134.71f, 189.19f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.66f)
                lineToRelative(-9.94f, 9.94f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, -73.56f, -73.56f)
                lineToRelative(24.12f, -24.12f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 71.32f, -2.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.32f, 6.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 81.0f, 112.77f)
                lineTo(56.87f, 136.89f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 62.24f, 62.24f)
                lineToRelative(9.94f, -9.94f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 134.71f, 189.19f)
                close()
                moveTo(204.79f, 51.19f)
                arcToRelative(52.07f, 52.07f, 0.0f, false, false, -73.56f, 0.0f)
                lineToRelative(-9.94f, 9.94f)
                arcTo(4.0f, 4.0f, 0.0f, true, false, 127.0f, 66.81f)
                lineToRelative(9.94f, -9.94f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 62.24f, 62.24f)
                lineTo(175.0f, 143.23f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 114.67f, 145.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.32f, 6.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 71.32f, -2.1f)
                lineToRelative(24.12f, -24.12f)
                arcTo(52.07f, 52.07f, 0.0f, false, false, 204.79f, 51.21f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
