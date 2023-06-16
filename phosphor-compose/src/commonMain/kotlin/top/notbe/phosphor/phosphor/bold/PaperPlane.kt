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

public val BoldGroup.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) {
            return _paperPlane!!
        }
        _paperPlane = Builder(name = "PaperPlane", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.42f, 198.2f)
                lineToRelative(-0.06f, -0.09f)
                lineTo(145.3f, 30.17f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -34.82f, 0.0f)
                lineTo(14.58f, 198.2f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 24.1f, 28.64f)
                lineToRelative(89.2f, -30.61f)
                lineToRelative(89.45f, 30.61f)
                arcToRelative(20.22f, 20.22f, 0.0f, false, false, 6.72f, 1.16f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 17.37f, -29.8f)
                close()
                moveTo(140.0f, 175.0f)
                verticalLineTo(120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(54.93f)
                lineTo(40.76f, 200.75f)
                lineTo(127.89f, 48.06f)
                lineToRelative(87.34f, 152.7f)
                close()
            }
        }
        .build()
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
