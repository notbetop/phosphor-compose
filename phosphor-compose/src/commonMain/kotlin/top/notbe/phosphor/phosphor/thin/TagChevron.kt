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

public val ThinGroup.TagChevron: ImageVector
    get() {
        if (_tagChevron != null) {
            return _tagChevron!!
        }
        _tagChevron = Builder(name = "TagChevron", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.0f, 121.34f)
                lineToRelative(-42.67f, -64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.0f, -5.34f)
                lineTo(24.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.29f, 6.27f)
                lineToRelative(46.61f, 67.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 4.39f)
                lineTo(20.71f, 197.73f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 24.0f, 204.0f)
                lineTo(181.33f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.0f, -5.34f)
                lineToRelative(42.67f, -64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 234.0f, 121.34f)
                close()
                moveTo(227.34f, 130.22f)
                lineTo(184.68f, 194.22f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.33f, 1.78f)
                lineTo(31.62f, 196.0f)
                lineTo(74.0f, 134.66f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -13.37f)
                lineTo(31.62f, 60.0f)
                lineTo(181.33f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.33f, 1.78f)
                lineToRelative(42.66f, 64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 227.32f, 130.22f)
                close()
            }
        }
        .build()
        return _tagChevron!!
    }

private var _tagChevron: ImageVector? = null
