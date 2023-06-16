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

public val BoldGroup.ShootingStar: ImageVector
    get() {
        if (_shootingStar != null) {
            return _shootingStar!!
        }
        _shootingStar = Builder(name = "ShootingStar", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.18f, 68.87f)
                arcTo(17.16f, 17.16f, 0.0f, false, false, 228.24f, 57.0f)
                lineToRelative(-34.83f, -3.0f)
                lineTo(179.83f, 22.41f)
                arcToRelative(17.24f, 17.24f, 0.0f, false, false, -31.66f, 0.0f)
                lineTo(134.6f, 54.07f)
                lineTo(99.76f, 57.0f)
                arcTo(17.13f, 17.13f, 0.0f, false, false, 90.0f, 87.11f)
                lineToRelative(26.3f, 22.46f)
                lineToRelative(-7.87f, 33.36f)
                arcTo(17.2f, 17.2f, 0.0f, false, false, 134.0f, 161.56f)
                lineToRelative(30.0f, -17.82f)
                lineToRelative(30.0f, 17.82f)
                arcToRelative(17.19f, 17.19f, 0.0f, false, false, 25.58f, -18.63f)
                lineToRelative(-7.87f, -33.36f)
                lineTo(238.0f, 87.11f)
                arcTo(17.07f, 17.07f, 0.0f, false, false, 243.18f, 68.87f)
                close()
                moveTo(192.91f, 94.0f)
                arcTo(17.05f, 17.05f, 0.0f, false, false, 187.36f, 111.0f)
                lineToRelative(5.14f, 21.79f)
                lineToRelative(-19.68f, -11.69f)
                arcToRelative(17.22f, 17.22f, 0.0f, false, false, -17.64f, 0.0f)
                lineTo(135.5f, 132.76f)
                lineTo(140.64f, 111.0f)
                arcTo(17.0f, 17.0f, 0.0f, false, false, 135.09f, 94.0f)
                lineToRelative(-17.0f, -14.49f)
                lineToRelative(22.54f, -1.9f)
                arcTo(17.17f, 17.17f, 0.0f, false, false, 155.0f, 67.3f)
                lineToRelative(9.0f, -20.91f)
                lineToRelative(9.0f, 20.9f)
                arcToRelative(17.18f, 17.18f, 0.0f, false, false, 14.38f, 10.36f)
                lineToRelative(22.54f, 1.9f)
                close()
                moveTo(32.49f, 184.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineToRelative(52.0f, -52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.0f, 17.0f)
                close()
                moveTo(100.49f, 188.49f)
                lineTo(48.49f, 240.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineToRelative(52.0f, -52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                close()
                moveTo(172.49f, 171.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                lineToRelative(-52.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineToRelative(52.0f, -52.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 172.49f, 171.51f)
                close()
            }
        }
        .build()
        return _shootingStar!!
    }

private var _shootingStar: ImageVector? = null
