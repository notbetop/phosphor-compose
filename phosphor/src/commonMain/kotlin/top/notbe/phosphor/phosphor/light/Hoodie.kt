package top.notbe.phosphor.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.LightGroup

public val LightGroup.Hoodie: ImageVector
    get() {
        if (_hoodie != null) {
            return _hoodie!!
        }
        _hoodie = Builder(name = "Hoodie", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.0f, 124.67f)
                lineTo(180.7f, 40.23f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 169.05f, 34.0f)
                lineTo(87.0f, 34.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 75.3f, 40.23f)
                lineTo(19.0f, 124.67f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.8f, 4.91f)
                lineToRelative(22.39f, 82.1f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 54.11f, 222.0f)
                lineTo(80.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(94.0f, 190.0f)
                horizontalLineToRelative(68.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(25.89f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 13.51f, -10.32f)
                lineToRelative(22.39f, -82.1f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 237.0f, 124.67f)
                close()
                moveTo(80.0f, 178.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(78.0f, 66.34f)
                lineToRelative(28.0f, 16.0f)
                lineTo(106.0f, 136.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(118.0f, 89.2f)
                lineToRelative(7.0f, 4.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 0.0f)
                lineToRelative(7.0f, -4.0f)
                lineTo(138.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(150.0f, 82.34f)
                lineToRelative(28.0f, -16.0f)
                lineTo(178.0f, 176.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                close()
                moveTo(87.0f, 46.0f)
                horizontalLineToRelative(82.1f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.67f, 0.89f)
                lineTo(175.44f, 54.0f)
                lineTo(128.0f, 81.09f)
                lineTo(80.56f, 54.0f)
                lineToRelative(4.72f, -7.09f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 87.0f, 46.0f)
                close()
                moveTo(82.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(54.11f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.93f, -1.47f)
                lineTo(30.51f, 129.06f)
                lineTo(66.0f, 75.82f)
                lineTo(66.0f, 176.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(203.82f, 208.53f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.93f, 1.47f)
                lineTo(176.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(174.0f, 190.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(190.0f, 75.82f)
                lineToRelative(35.49f, 53.24f)
                close()
            }
        }
        .build()
        return _hoodie!!
    }

private var _hoodie: ImageVector? = null
