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

public val ThinGroup.HandPointing: ImageVector
    get() {
        if (_handPointing != null) {
            return _handPointing!!
        }
        _handPointing = Builder(name = "HandPointing", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 92.0f)
                arcToRelative(23.88f, 23.88f, 0.0f, false, false, -16.07f, 6.19f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 132.0f, 82.13f)
                lineTo(132.0f, 44.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -48.0f, 0.0f)
                verticalLineToRelative(94.0f)
                lineTo(72.75f, 119.94f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 31.2f, 144.0f)
                lineToRelative(4.68f, 8.25f)
                curveTo(53.21f, 182.8f, 64.66f, 203.0f, 77.66f, 216.33f)
                curveTo(91.28f, 230.3f, 105.86f, 236.0f, 128.0f, 236.0f)
                arcToRelative(84.09f, 84.09f, 0.0f, false, false, 84.0f, -84.0f)
                lineTo(212.0f, 116.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 188.0f, 92.0f)
                close()
                moveTo(204.0f, 152.0f)
                arcToRelative(76.09f, 76.09f, 0.0f, false, true, -76.0f, 76.0f)
                curveToRelative(-40.0f, 0.0f, -51.35f, -20.08f, -85.16f, -79.71f)
                lineTo(38.15f, 140.0f)
                verticalLineToRelative(0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 27.71f, -16.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.07f, 0.12f)
                lineToRelative(18.68f, 30.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 92.0f, 152.0f)
                lineTo(92.0f, 44.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(132.0f, 100.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                close()
            }
        }
        .build()
        return _handPointing!!
    }

private var _handPointing: ImageVector? = null
