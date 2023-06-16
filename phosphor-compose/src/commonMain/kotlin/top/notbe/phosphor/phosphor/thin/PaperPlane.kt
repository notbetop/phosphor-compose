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

public val ThinGroup.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) {
            return _paperPlane!!
        }
        _paperPlane = Builder(name = "PaperPlane", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.43f, 202.08f)
                lineTo(138.35f, 34.14f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.92f, 0.0f)
                lineToRelative(-95.88f, 168.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 32.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 4.0f, -0.7f)
                lineToRelative(90.48f, -31.05f)
                horizontalLineToRelative(0.05f)
                arcToRelative(4.09f, 4.09f, 0.0f, false, true, 2.74f, 0.0f)
                lineToRelative(90.66f, 31.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 14.49f, -17.2f)
                close()
                moveTo(227.0f, 210.56f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, true, -4.45f, 1.17f)
                lineToRelative(-90.59f, -31.0f)
                verticalLineTo(120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(60.65f)
                lineToRelative(-0.13f, 0.0f)
                lineToRelative(-90.5f, 31.06f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.85f, -5.7f)
                lineToRelative(95.87f, -168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.0f, 0.0f)
                lineToRelative(96.08f, 168.0f)
                arcTo(3.89f, 3.89f, 0.0f, false, true, 227.0f, 210.56f)
                close()
            }
        }
        .build()
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
