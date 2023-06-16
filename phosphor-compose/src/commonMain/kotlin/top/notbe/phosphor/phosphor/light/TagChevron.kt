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

public val LightGroup.TagChevron: ImageVector
    get() {
        if (_tagChevron != null) {
            return _tagChevron!!
        }
        _tagChevron = Builder(name = "TagChevron", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.64f, 120.23f)
                lineTo(193.0f, 56.23f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 181.33f, 50.0f)
                lineTo(24.0f, 50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.94f, 9.41f)
                lineToRelative(46.6f, 67.48f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 2.14f)
                lineTo(19.06f, 196.59f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 24.0f, 206.0f)
                lineTo(181.33f, 206.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 193.0f, 199.77f)
                lineToRelative(42.67f, -64.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 235.64f, 120.23f)
                close()
                moveTo(225.64f, 129.11f)
                lineTo(182.97f, 193.11f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.66f, 0.89f)
                lineTo(35.43f, 194.0f)
                lineToRelative(40.21f, -58.23f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, -15.62f)
                lineTo(35.43f, 62.0f)
                horizontalLineToRelative(145.9f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.66f, 0.89f)
                lineToRelative(42.67f, 64.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 225.66f, 129.11f)
                close()
            }
        }
        .build()
        return _tagChevron!!
    }

private var _tagChevron: ImageVector? = null
