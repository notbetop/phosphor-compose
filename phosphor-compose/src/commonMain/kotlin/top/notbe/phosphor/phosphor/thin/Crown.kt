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

public val ThinGroup.Crown: ImageVector
    get() {
        if (_crown != null) {
            return _crown!!
        }
        _crown = Builder(name = "Crown", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.21f, 79.21f)
                arcToRelative(8.07f, 8.07f, 0.0f, false, false, -8.92f, -1.14f)
                lineToRelative(-53.43f, 26.64f)
                arcToRelative(0.11f, 0.11f, 0.0f, false, true, -0.14f, 0.0f)
                lineTo(135.0f, 31.93f)
                arcToRelative(8.11f, 8.11f, 0.0f, false, false, -13.9f, 0.0f)
                lineTo(77.28f, 104.66f)
                arcToRelative(0.11f, 0.11f, 0.0f, false, true, -0.15f, 0.0f)
                lineTo(23.73f, 78.08f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.31f, 9.8f)
                lineToRelative(37.0f, 113.36f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.85f, 2.2f)
                curveTo(55.52f, 203.28f, 81.83f, 188.0f, 128.0f, 188.0f)
                reflectiveCurveToRelative(72.47f, 15.28f, 72.73f, 15.43f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.85f, -2.19f)
                lineToRelative(37.0f, -113.36f)
                arcTo(8.06f, 8.06f, 0.0f, false, false, 241.21f, 79.21f)
                close()
                moveTo(200.43f, 194.29f)
                arcToRelative(125.3f, 125.3f, 0.0f, false, false, -15.84f, -6.11f)
                curveTo(172.74f, 184.45f, 153.3f, 180.0f, 128.0f, 180.0f)
                reflectiveCurveToRelative(-44.74f, 4.45f, -56.6f, 8.18f)
                arcToRelative(126.55f, 126.55f, 0.0f, false, false, -15.84f, 6.11f)
                lineTo(20.0f, 85.32f)
                arcToRelative(0.14f, 0.14f, 0.0f, false, true, 0.13f, -0.08f)
                horizontalLineToRelative(0.0f)
                lineToRelative(53.4f, 26.62f)
                arcToRelative(8.14f, 8.14f, 0.0f, false, false, 10.57f, -3.07f)
                lineToRelative(43.78f, -72.74f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, true, 0.18f, 0.0f)
                lineToRelative(43.78f, 72.74f)
                arcToRelative(8.15f, 8.15f, 0.0f, false, false, 10.56f, 3.08f)
                lineTo(235.9f, 85.21f)
                arcToRelative(0.13f, 0.13f, 0.0f, false, true, 0.08f, 0.16f)
                close()
                moveTo(171.94f, 156.11f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.93f, 3.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.7f, -0.06f)
                arcToRelative(232.31f, 232.31f, 0.0f, false, false, -78.62f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.39f, -7.88f)
                arcToRelative(240.42f, 240.42f, 0.0f, false, true, 81.4f, 0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 171.94f, 156.11f)
                close()
            }
        }
        .build()
        return _crown!!
    }

private var _crown: ImageVector? = null
