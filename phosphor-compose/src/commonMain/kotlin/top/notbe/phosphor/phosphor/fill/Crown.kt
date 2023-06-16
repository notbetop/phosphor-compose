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

public val FillGroup.Crown: ImageVector
    get() {
        if (_crown != null) {
            return _crown!!
        }
        _crown = Builder(name = "Crown", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.84f, 76.19f)
                arcToRelative(12.08f, 12.08f, 0.0f, false, false, -13.34f, -1.7f)
                lineToRelative(-50.21f, 25.0f)
                lineTo(138.37f, 29.86f)
                arcToRelative(12.11f, 12.11f, 0.0f, false, false, -20.74f, 0.0f)
                lineTo(75.71f, 99.52f)
                lineToRelative(-50.19f, -25.0f)
                arcTo(12.11f, 12.11f, 0.0f, false, false, 8.62f, 89.12f)
                lineToRelative(37.0f, 113.36f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.68f, 4.4f)
                curveTo(57.55f, 206.73f, 83.12f, 192.0f, 128.0f, 192.0f)
                reflectiveCurveToRelative(70.45f, 14.73f, 70.68f, 14.87f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.71f, -4.39f)
                lineToRelative(37.0f, -113.33f)
                arcTo(12.06f, 12.06f, 0.0f, false, false, 243.84f, 76.19f)
                close()
                moveTo(175.84f, 156.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.87f, 6.61f)
                arcToRelative(8.36f, 8.36f, 0.0f, false, true, -1.4f, -0.12f)
                arcToRelative(228.2f, 228.2f, 0.0f, false, false, -77.22f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.78f, -15.76f)
                arcToRelative(244.42f, 244.42f, 0.0f, false, true, 82.78f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 175.88f, 156.8f)
                close()
            }
        }
        .build()
        return _crown!!
    }

private var _crown: ImageVector? = null
