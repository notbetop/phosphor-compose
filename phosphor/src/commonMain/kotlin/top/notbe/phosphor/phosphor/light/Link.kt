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

public val LightGroup.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.13f, 187.77f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.49f)
                lineToRelative(-9.95f, 9.94f)
                arcTo(54.0f, 54.0f, 0.0f, false, true, 49.8f, 129.82f)
                lineTo(73.91f, 105.7f)
                arcTo(54.0f, 54.0f, 0.0f, false, true, 148.0f, 103.51f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.0f, 9.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, false, -57.6f, 1.71f)
                lineTo(58.28f, 138.3f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, false, 59.42f, 59.42f)
                lineToRelative(9.94f, -9.95f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 136.13f, 187.77f)
                close()
                moveTo(206.2f, 49.77f)
                arcToRelative(54.06f, 54.06f, 0.0f, false, false, -76.38f, 0.0f)
                lineToRelative(-9.95f, 9.94f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.49f, 8.49f)
                lineToRelative(9.94f, -10.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 59.42f, 59.42f)
                lineTo(173.6f, 141.81f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, -57.6f, 1.71f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.0f, 9.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, 74.07f, -2.19f)
                lineToRelative(24.11f, -24.12f)
                arcTo(54.0f, 54.0f, 0.0f, false, false, 206.2f, 49.8f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
