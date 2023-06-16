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

public val ThinGroup.Rss: ImageVector
    get() {
        if (_rss != null) {
            return _rss!!
        }
        _rss = Builder(name = "Rss", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.08f, 159.92f)
                arcTo(67.52f, 67.52f, 0.0f, false, true, 116.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, -60.0f, -60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                arcTo(67.52f, 67.52f, 0.0f, false, true, 96.08f, 159.92f)
                close()
                moveTo(48.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                arcTo(108.0f, 108.0f, 0.0f, false, true, 156.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                arcTo(116.0f, 116.0f, 0.0f, false, false, 48.0f, 92.0f)
                close()
                moveTo(164.0f, 92.0f)
                arcTo(162.92f, 162.92f, 0.0f, false, false, 48.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                arcTo(155.0f, 155.0f, 0.0f, false, true, 158.31f, 97.69f)
                arcTo(155.0f, 155.0f, 0.0f, false, true, 204.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                arcTo(162.92f, 162.92f, 0.0f, false, false, 164.0f, 92.0f)
                close()
                moveTo(52.0f, 196.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 52.0f, 196.0f)
                close()
            }
        }
        .build()
        return _rss!!
    }

private var _rss: ImageVector? = null
