package top.notbe.phosphor.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.DuotoneGroup

public val DuotoneGroup.RssSimple: ImageVector
    get() {
        if (_rssSimple != null) {
            return _rssSimple!!
        }
        _rssSimple = Builder(name = "RssSimple", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 200.0f)
                horizontalLineTo(56.0f)
                verticalLineTo(48.0f)
                arcTo(152.0f, 152.0f, 0.0f, false, true, 208.0f, 200.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                curveToRelative(0.0f, -79.4f, -64.6f, -144.0f, -144.0f, -144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                curveTo(144.22f, 40.0f, 216.0f, 111.78f, 216.0f, 200.0f)
                close()
                moveTo(56.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                arcToRelative(72.08f, 72.08f, 0.0f, false, true, 72.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, false, 56.0f, 112.0f)
                close()
                moveTo(60.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 60.0f, 184.0f)
                close()
            }
        }
        .build()
        return _rssSimple!!
    }

private var _rssSimple: ImageVector? = null
