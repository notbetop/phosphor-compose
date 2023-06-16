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

public val ThinGroup.Sparkle: ImageVector
    get() {
        if (_sparkle != null) {
            return _sparkle!!
        }
        _sparkle = Builder(name = "Sparkle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.2f, 132.81f)
                lineToRelative(-51.66f, -19.0f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, true, -2.32f, -2.32f)
                lineToRelative(-19.0f, -51.66f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, -22.38f, 0.0f)
                lineToRelative(-19.0f, 51.66f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, true, -2.32f, 2.32f)
                lineToRelative(-51.66f, 19.0f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, 0.0f, 22.38f)
                lineToRelative(51.66f, 19.0f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, true, 2.32f, 2.32f)
                lineToRelative(19.0f, 51.66f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, 22.38f, 0.0f)
                lineToRelative(19.0f, -51.66f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, true, 2.32f, -2.32f)
                lineToRelative(51.66f, -19.0f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, 0.0f, -22.38f)
                close()
                moveTo(193.43f, 147.68f)
                lineTo(141.78f, 166.68f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, -7.07f, 7.07f)
                lineToRelative(-19.0f, 51.65f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, true, -7.36f, 0.0f)
                lineToRelative(-19.0f, -51.65f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, -7.07f, -7.07f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-51.65f, -19.0f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, true, 0.0f, -7.36f)
                lineToRelative(51.65f, -19.0f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, 7.07f, -7.07f)
                lineToRelative(19.0f, -51.65f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, true, 7.36f, 0.0f)
                lineToRelative(19.0f, 51.65f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, 7.07f, 7.07f)
                lineToRelative(51.65f, 19.0f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, true, 0.0f, 7.36f)
                close()
                moveTo(148.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(20.0f)
                lineTo(172.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(180.0f, 36.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(180.0f, 44.0f)
                lineTo(180.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(172.0f, 44.0f)
                lineTo(152.0f, 44.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 148.0f, 40.0f)
                close()
                moveTo(244.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(228.0f, 92.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(220.0f, 92.0f)
                lineTo(208.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(12.0f)
                lineTo(220.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(228.0f, 84.0f)
                horizontalLineToRelative(12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 244.0f, 88.0f)
                close()
            }
        }
        .build()
        return _sparkle!!
    }

private var _sparkle: ImageVector? = null
