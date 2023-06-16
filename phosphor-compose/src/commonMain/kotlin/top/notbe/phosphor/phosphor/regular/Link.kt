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

public val RegularGroup.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(137.54f, 186.36f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.31f)
                lineToRelative(-9.94f, 10.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 48.38f, 128.4f)
                lineTo(72.5f, 104.28f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 149.31f, 102.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -10.64f, 12.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -54.85f, 1.63f)
                lineTo(59.7f, 139.72f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 56.58f, 56.58f)
                lineToRelative(9.94f, -9.94f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 137.54f, 186.36f)
                close()
                moveTo(207.62f, 48.36f)
                arcToRelative(56.08f, 56.08f, 0.0f, false, false, -79.22f, 0.0f)
                lineToRelative(-9.94f, 9.95f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.31f)
                lineToRelative(9.94f, -9.94f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 56.58f, 56.58f)
                lineTo(172.18f, 140.4f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 117.33f, 142.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 106.69f, 154.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 76.81f, -2.26f)
                lineToRelative(24.12f, -24.12f)
                arcTo(56.08f, 56.08f, 0.0f, false, false, 207.62f, 48.38f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
