package top.notbe.phosphor.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.FillGroup

public val FillGroup.TagChevron: ImageVector
    get() {
        if (_tagChevron != null) {
            return _tagChevron!!
        }
        _tagChevron = Builder(name = "TagChevron", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.3f, 136.88f)
                lineToRelative(-42.66f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 181.33f, 208.0f)
                horizontalLineTo(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.58f, -12.55f)
                lineTo(64.0f, 128.0f)
                lineTo(17.42f, 60.55f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 24.0f, 48.0f)
                horizontalLineTo(181.33f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 13.31f, 7.12f)
                lineToRelative(42.66f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 237.3f, 136.88f)
                close()
            }
        }
        .build()
        return _tagChevron!!
    }

private var _tagChevron: ImageVector? = null
