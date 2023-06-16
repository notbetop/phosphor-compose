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

public val BoldGroup.Lightning: ImageVector
    get() {
        if (_lightning != null) {
            return _lightning!!
        }
        _lightning = Builder(name = "Lightning", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.68f, 117.26f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.47f, -8.5f)
                lineTo(157.77f, 88.35f)
                lineToRelative(14.0f, -70.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 151.23f, 7.81f)
                lineToRelative(-112.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 4.56f, 19.43f)
                lineToRelative(54.44f, 20.41f)
                lineToRelative(-14.0f, 70.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 20.54f, 10.54f)
                lineToRelative(112.0f, -120.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 219.68f, 117.26f)
                close()
                moveTo(116.05f, 200.93f)
                lineToRelative(7.72f, -38.58f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.56f, -13.59f)
                lineTo(69.0f, 131.07f)
                lineToRelative(70.93f, -76.0f)
                lineToRelative(-7.72f, 38.58f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.56f, 13.59f)
                lineTo(187.0f, 124.93f)
                close()
            }
        }
        .build()
        return _lightning!!
    }

private var _lightning: ImageVector? = null
