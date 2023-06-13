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

public val FillGroup.BellSimpleSlash: ImageVector
    get() {
        if (_bellSimpleSlash != null) {
            return _bellSimpleSlash!!
        }
        _bellSimpleSlash = Builder(name = "BellSimpleSlash", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.94f, 210.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.84f, 10.76f)
                lineTo(182.66f, 200.0f)
                lineTo(48.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -13.8f, -24.06f)
                curveTo(39.75f, 166.38f, 48.0f, 139.34f, 48.0f, 104.0f)
                arcTo(79.49f, 79.49f, 0.0f, false, true, 58.84f, 63.8f)
                lineTo(42.1f, 45.38f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 53.94f, 34.62f)
                close()
                moveTo(160.0f, 216.0f)
                lineTo(96.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 16.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(218.51f, 168.88f)
                curveTo(216.07f, 162.59f, 208.0f, 139.35f, 208.0f, 104.0f)
                arcTo(80.0f, 80.0f, 0.0f, false, false, 88.54f, 34.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.0f, 12.34f)
                lineTo(205.17f, 177.18f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.36f, -8.3f)
                close()
            }
        }
        .build()
        return _bellSimpleSlash!!
    }

private var _bellSimpleSlash: ImageVector? = null
