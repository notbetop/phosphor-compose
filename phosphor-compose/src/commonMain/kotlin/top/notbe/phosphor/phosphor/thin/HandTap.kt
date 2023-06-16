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

public val ThinGroup.HandTap: ImageVector
    get() {
        if (_handTap != null) {
            return _handTap!!
        }
        _handTap = Builder(name = "HandTap", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.0f, 76.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, 112.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -96.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
                moveTo(188.0f, 124.0f)
                arcToRelative(23.88f, 23.88f, 0.0f, false, false, -16.07f, 6.19f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 132.0f, 114.13f)
                lineTo(132.0f, 76.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -48.0f, 0.0f)
                verticalLineToRelative(94.0f)
                lineTo(72.74f, 151.94f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 31.22f, 176.0f)
                lineToRelative(29.32f, 50.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.9f, -4.0f)
                lineTo(38.13f, 172.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 27.72f, -16.0f)
                lineToRelative(0.07f, 0.12f)
                lineToRelative(18.68f, 30.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 92.0f, 184.0f)
                lineTo(92.0f, 76.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(132.0f, 132.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                verticalLineToRelative(36.0f)
                curveToRelative(0.0f, 22.66f, -7.51f, 38.06f, -7.58f, 38.21f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.79f, 5.37f)
                arcTo(4.05f, 4.05f, 0.0f, false, false, 200.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.58f, -2.21f)
                curveToRelative(0.34f, -0.69f, 8.42f, -17.13f, 8.42f, -41.79f)
                lineTo(212.0f, 148.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 188.0f, 124.0f)
                close()
            }
        }
        .build()
        return _handTap!!
    }

private var _handTap: ImageVector? = null
