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

public val DuotoneGroup.PaperPlaneRight: ImageVector
    get() {
        if (_paperPlaneRight != null) {
            return _paperPlaneRight!!
        }
        _paperPlaneRight = Builder(name = "PaperPlaneRight", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(219.91f, 134.86f)
                lineTo(51.93f, 231.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.44f, -9.67f)
                lineToRelative(31.0f, -90.71f)
                arcToRelative(7.89f, 7.89f, 0.0f, false, false, 0.0f, -5.38f)
                lineToRelative(-31.0f, -90.47f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.44f, -9.67f)
                lineToRelative(168.0f, 95.85f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 219.91f, 134.86f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.87f, 114.0f)
                lineToRelative(-168.0f, -95.89f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.93f, 37.32f)
                lineToRelative(31.0f, 90.47f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, false, 0.0f, 0.1f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, 0.0f, 0.1f)
                lineToRelative(-31.0f, 90.67f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 240.0f)
                arcToRelative(16.14f, 16.14f, 0.0f, false, false, 7.92f, -2.1f)
                lineToRelative(167.91f, -96.05f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.05f, -27.89f)
                close()
                moveTo(48.0f, 224.0f)
                lineToRelative(0.0f, -0.09f)
                lineTo(78.14f, 136.0f)
                horizontalLineTo(136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(78.22f)
                lineTo(48.06f, 32.12f)
                lineTo(48.0f, 32.0f)
                lineToRelative(168.0f, 95.83f)
                close()
            }
        }
        .build()
        return _paperPlaneRight!!
    }

private var _paperPlaneRight: ImageVector? = null
