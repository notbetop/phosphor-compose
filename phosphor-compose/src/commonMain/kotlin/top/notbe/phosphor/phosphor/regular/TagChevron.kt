package top.notbe.phosphor.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.RegularGroup

public val RegularGroup.TagChevron: ImageVector
    get() {
        if (_tagChevron != null) {
            return _tagChevron!!
        }
        _tagChevron = Builder(name = "TagChevron", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.3f, 119.12f)
                lineToRelative(-42.66f, -64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 181.33f, 48.0f)
                lineTo(24.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.58f, 12.55f)
                lineTo(64.0f, 128.0f)
                lineTo(17.42f, 195.45f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 24.0f, 208.0f)
                lineTo(181.33f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 13.31f, -7.12f)
                lineToRelative(42.66f, -64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 237.3f, 119.12f)
                close()
                moveTo(181.3f, 192.0f)
                lineTo(39.25f, 192.0f)
                lineToRelative(38.0f, -55.0f)
                lineToRelative(0.08f, -0.1f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -17.76f)
                lineToRelative(-0.08f, -0.1f)
                lineToRelative(-38.0f, -55.0f)
                lineTo(181.33f, 64.04f)
                lineTo(224.0f, 128.0f)
                close()
            }
        }
        .build()
        return _tagChevron!!
    }

private var _tagChevron: ImageVector? = null
