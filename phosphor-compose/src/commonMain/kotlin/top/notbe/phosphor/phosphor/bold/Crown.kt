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

public val BoldGroup.Crown: ImageVector
    get() {
        if (_crown != null) {
            return _crown!!
        }
        _crown = Builder(name = "Crown", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.46f, 73.17f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -17.74f, -2.26f)
                lineToRelative(-46.9f, 23.38f)
                lineToRelative(-40.0f, -66.49f)
                arcToRelative(16.11f, 16.11f, 0.0f, false, false, -27.6f, 0.0f)
                lineToRelative(-40.0f, 66.49f)
                lineTo(27.31f, 70.92f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 4.82f, 90.35f)
                lineToRelative(37.0f, 113.35f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.51f, 6.61f)
                curveTo(59.57f, 210.17f, 84.39f, 196.0f, 128.0f, 196.0f)
                reflectiveCurveToRelative(68.43f, 14.19f, 68.62f, 14.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.57f, -6.58f)
                lineToRelative(37.0f, -113.29f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 246.46f, 73.17f)
                close()
                moveTo(195.53f, 183.52f)
                curveTo(182.18f, 178.4f, 159.2f, 172.0f, 128.0f, 172.0f)
                reflectiveCurveToRelative(-54.18f, 6.42f, -67.53f, 11.54f)
                lineToRelative(-27.0f, -82.71f)
                lineTo(70.0f, 119.0f)
                arcToRelative(16.18f, 16.18f, 0.0f, false, false, 21.0f, -6.11f)
                lineToRelative(37.0f, -61.49f)
                lineToRelative(37.0f, 61.5f)
                arcToRelative(16.18f, 16.18f, 0.0f, false, false, 21.0f, 6.1f)
                lineToRelative(36.52f, -18.2f)
                close()
                moveTo(175.86f, 152.52f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 164.0f, 162.69f)
                arcToRelative(12.91f, 12.91f, 0.0f, false, true, -1.85f, -0.14f)
                arcToRelative(229.32f, 229.32f, 0.0f, false, false, -68.34f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -3.66f, -23.72f)
                arcToRelative(253.38f, 253.38f, 0.0f, false, true, 75.66f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 175.86f, 152.52f)
                close()
            }
        }
        .build()
        return _crown!!
    }

private var _crown: ImageVector? = null
