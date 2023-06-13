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

public val BoldGroup.Boat: ImageVector
    get() {
        if (_boat != null) {
            return _boat!!
        }
        _boat = Builder(name = "Boat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.33f, 106.84f)
                lineTo(212.0f, 103.39f)
                lineTo(212.0f, 56.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(140.0f, 36.0f)
                lineTo(140.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                lineTo(116.0f, 36.0f)
                lineTo(64.0f, 36.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 44.0f, 56.0f)
                verticalLineToRelative(47.39f)
                lineToRelative(-10.33f, 3.45f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -13.67f, 19.0f)
                lineTo(20.0f, 160.1f)
                arcToRelative(12.21f, 12.21f, 0.0f, false, false, 0.46f, 3.29f)
                curveToRelative(16.34f, 57.25f, 88.68f, 76.76f, 103.0f, 80.09f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 9.06f, 0.0f)
                curveToRelative(14.33f, -3.33f, 86.67f, -22.84f, 103.0f, -80.09f)
                arcToRelative(12.21f, 12.21f, 0.0f, false, false, 0.46f, -3.29f)
                lineTo(235.98f, 125.82f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 222.33f, 106.84f)
                close()
                moveTo(68.0f, 60.0f)
                lineTo(188.0f, 60.0f)
                lineTo(188.0f, 95.38f)
                lineTo(131.8f, 76.62f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.6f, 0.0f)
                lineTo(68.0f, 95.38f)
                close()
                moveTo(212.0f, 158.34f)
                curveToRelative(-13.46f, 42.62f, -73.44f, 59.0f, -84.0f, 61.55f)
                curveToRelative(-10.55f, -2.57f, -70.54f, -18.92f, -84.0f, -61.55f)
                lineTo(44.0f, 128.69f)
                lineToRelative(72.0f, -24.0f)
                lineTo(116.0f, 168.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(140.0f, 104.66f)
                lineToRelative(72.0f, 24.0f)
                close()
            }
        }
        .build()
        return _boat!!
    }

private var _boat: ImageVector? = null
