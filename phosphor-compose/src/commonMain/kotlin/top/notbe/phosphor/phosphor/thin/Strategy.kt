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

public val ThinGroup.Strategy: ImageVector
    get() {
        if (_strategy != null) {
            return _strategy!!
        }
        _strategy = Builder(name = "Strategy", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(68.0f, 156.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 68.0f, 156.0f)
                close()
                moveTo(68.0f, 212.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 68.0f, 212.0f)
                close()
                moveTo(37.17f, 109.17f)
                lineTo(54.34f, 92.0f)
                lineTo(37.17f, 74.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                lineTo(60.0f, 86.34f)
                lineTo(77.17f, 69.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 5.66f)
                lineTo(65.66f, 92.0f)
                lineToRelative(17.17f, 17.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f)
                lineTo(60.0f, 97.66f)
                lineTo(42.83f, 114.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                close()
                moveTo(218.83f, 205.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f)
                lineTo(196.0f, 193.66f)
                lineToRelative(-17.17f, 17.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineTo(190.34f, 188.0f)
                lineToRelative(-17.17f, -17.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                lineTo(196.0f, 182.34f)
                lineToRelative(17.17f, -17.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 5.66f)
                lineTo(201.66f, 188.0f)
                close()
                moveTo(172.62f, 111.76f)
                curveToRelative(-5.82f, 21.0f, -23.77f, 39.15f, -43.65f, 44.12f)
                arcToRelative(4.09f, 4.09f, 0.0f, false, true, -1.0f, 0.12f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.0f, -7.88f)
                curveToRelative(16.94f, -4.24f, 32.87f, -20.42f, 37.88f, -38.49f)
                curveToRelative(3.47f, -12.53f, 3.55f, -31.51f, -15.74f, -50.8f)
                lineTo(140.0f, 49.66f)
                lineTo(140.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(132.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(145.66f, 44.0f)
                lineToRelative(9.17f, 9.17f)
                curveTo(172.0f, 70.35f, 178.33f, 91.16f, 172.62f, 111.76f)
                close()
            }
        }
        .build()
        return _strategy!!
    }

private var _strategy: ImageVector? = null
