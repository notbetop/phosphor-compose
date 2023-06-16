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

public val BoldGroup.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.37f, 187.53f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                lineToRelative(-5.94f, 5.94f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, -84.88f, -84.88f)
                lineToRelative(24.12f, -24.11f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 152.0f, 99.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 136.0f, 117.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -49.37f, 1.47f)
                lineTo(62.53f, 142.55f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 50.92f, 50.92f)
                lineToRelative(5.94f, -5.94f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 136.37f, 187.53f)
                close()
                moveTo(210.45f, 45.53f)
                arcToRelative(60.09f, 60.09f, 0.0f, false, false, -84.88f, 0.0f)
                lineToRelative(-5.94f, 5.94f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f)
                lineToRelative(5.94f, -5.94f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 50.92f, 50.92f)
                lineToRelative(-24.11f, 24.12f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 120.0f, 139.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 104.0f, 157.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, 82.3f, -2.43f)
                lineToRelative(24.12f, -24.11f)
                arcTo(60.09f, 60.09f, 0.0f, false, false, 210.45f, 45.55f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
