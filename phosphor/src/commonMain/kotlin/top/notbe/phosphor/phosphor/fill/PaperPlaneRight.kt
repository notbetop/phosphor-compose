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

public val FillGroup.PaperPlaneRight: ImageVector
    get() {
        if (_paperPlaneRight != null) {
            return _paperPlaneRight!!
        }
        _paperPlaneRight = Builder(name = "PaperPlaneRight", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 127.89f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -8.18f, 14.0f)
                lineTo(55.91f, 237.9f)
                arcTo(16.14f, 16.14f, 0.0f, false, true, 48.0f, 240.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -15.05f, -21.34f)
                lineTo(60.3f, 138.71f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 64.09f, 136.0f)
                horizontalLineTo(136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.53f)
                arcToRelative(8.19f, 8.19f, 0.0f, false, false, -8.26f, -7.47f)
                horizontalLineTo(64.16f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.79f, -2.7f)
                lineToRelative(-27.44f, -80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 55.85f, 18.07f)
                lineToRelative(168.0f, 95.89f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 127.89f)
                close()
            }
        }
        .build()
        return _paperPlaneRight!!
    }

private var _paperPlaneRight: ImageVector? = null
