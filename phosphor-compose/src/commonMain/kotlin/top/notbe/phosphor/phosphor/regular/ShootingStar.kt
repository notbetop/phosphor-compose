package top.notbe.phosphor.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.RegularGroup

public val RegularGroup.ShootingStar: ImageVector
    get() {
        if (_shootingStar != null) {
            return _shootingStar!!
        }
        _shootingStar = Builder(name = "ShootingStar", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.37f, 70.1f)
                arcTo(13.16f, 13.16f, 0.0f, false, false, 227.9f, 61.0f)
                lineToRelative(-37.22f, -3.15f)
                lineTo(176.16f, 24.0f)
                arcToRelative(13.24f, 13.24f, 0.0f, false, false, -24.31f, 0.0f)
                lineTo(137.33f, 57.86f)
                lineTo(100.1f, 61.0f)
                arcToRelative(13.13f, 13.13f, 0.0f, false, false, -7.49f, 23.06f)
                lineToRelative(28.16f, 24.0f)
                lineToRelative(-8.43f, 35.73f)
                arcToRelative(13.1f, 13.1f, 0.0f, false, false, 5.0f, 13.58f)
                arcToRelative(13.25f, 13.25f, 0.0f, false, false, 14.63f, 0.7f)
                lineToRelative(32.0f, -19.0f)
                lineToRelative(32.0f, 19.0f)
                arcToRelative(13.25f, 13.25f, 0.0f, false, false, 14.63f, -0.7f)
                arcToRelative(13.09f, 13.09f, 0.0f, false, false, 5.0f, -13.58f)
                lineToRelative(-8.43f, -35.73f)
                lineToRelative(28.15f, -24.0f)
                arcTo(13.07f, 13.07f, 0.0f, false, false, 239.37f, 70.1f)
                close()
                moveTo(195.51f, 97.1f)
                arcToRelative(13.06f, 13.06f, 0.0f, false, false, -4.26f, 13.0f)
                lineToRelative(7.31f, 31.0f)
                lineToRelative(-27.78f, -16.51f)
                arcToRelative(13.24f, 13.24f, 0.0f, false, false, -13.56f, 0.0f)
                lineTo(129.44f, 141.0f)
                lineToRelative(7.31f, -31.0f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, false, -4.25f, -13.0f)
                lineTo(108.24f, 76.38f)
                lineToRelative(32.09f, -2.72f)
                arcToRelative(13.16f, 13.16f, 0.0f, false, false, 11.0f, -7.94f)
                lineTo(164.0f, 36.24f)
                lineToRelative(12.64f, 29.48f)
                arcToRelative(13.18f, 13.18f, 0.0f, false, false, 11.0f, 7.94f)
                lineToRelative(32.09f, 2.72f)
                close()
                moveTo(85.66f, 125.66f)
                lineToRelative(-56.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineToRelative(56.0f, -56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                close()
                moveTo(101.66f, 181.66f)
                lineTo(45.66f, 237.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineToRelative(56.0f, -56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                close()
                moveTo(173.66f, 170.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f)
                lineToRelative(-56.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineToRelative(56.0f, -56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 173.66f, 170.34f)
                close()
            }
        }
        .build()
        return _shootingStar!!
    }

private var _shootingStar: ImageVector? = null
