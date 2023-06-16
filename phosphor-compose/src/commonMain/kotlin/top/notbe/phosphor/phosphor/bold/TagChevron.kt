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

public val BoldGroup.TagChevron: ImageVector
    get() {
        if (_tagChevron != null) {
            return _tagChevron!!
        }
        _tagChevron = Builder(name = "TagChevron", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.63f, 116.91f)
                lineTo(198.0f, 52.91f)
                arcTo(19.93f, 19.93f, 0.0f, false, false, 181.32f, 44.0f)
                horizontalLineTo(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -9.88f, 18.82f)
                lineToRelative(45.0f, 65.18f)
                lineToRelative(-45.0f, 65.18f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 24.0f, 212.0f)
                horizontalLineTo(181.32f)
                arcTo(19.93f, 19.93f, 0.0f, false, false, 198.0f, 203.09f)
                lineToRelative(42.67f, -64.0f)
                arcTo(19.94f, 19.94f, 0.0f, false, false, 240.63f, 116.91f)
                close()
                moveTo(179.18f, 188.0f)
                horizontalLineTo(46.87f)
                lineToRelative(33.65f, -48.74f)
                arcToRelative(1.63f, 1.63f, 0.0f, false, false, 0.11f, -0.17f)
                arcToRelative(19.91f, 19.91f, 0.0f, false, false, 0.0f, -22.18f)
                arcToRelative(1.63f, 1.63f, 0.0f, false, false, -0.11f, -0.17f)
                lineTo(46.87f, 68.0f)
                horizontalLineTo(179.18f)
                lineToRelative(40.0f, 60.0f)
                close()
            }
        }
        .build()
        return _tagChevron!!
    }

private var _tagChevron: ImageVector? = null
