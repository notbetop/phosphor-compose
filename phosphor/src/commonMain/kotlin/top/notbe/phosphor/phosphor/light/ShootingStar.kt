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

public val LightGroup.ShootingStar: ImageVector
    get() {
        if (_shootingStar != null) {
            return _shootingStar!!
        }
        _shootingStar = Builder(name = "ShootingStar", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.47f, 70.71f)
                arcTo(11.18f, 11.18f, 0.0f, false, false, 227.74f, 63.0f)
                lineToRelative(-38.43f, -3.25f)
                lineToRelative(-15.0f, -35.0f)
                arcToRelative(11.24f, 11.24f, 0.0f, false, false, -20.63f, 0.0f)
                lineToRelative(-15.0f, 35.0f)
                lineTo(100.27f, 63.0f)
                arcToRelative(11.12f, 11.12f, 0.0f, false, false, -6.36f, 19.54f)
                lineTo(123.0f, 107.38f)
                lineToRelative(-8.72f, 36.92f)
                arcToRelative(11.09f, 11.09f, 0.0f, false, false, 4.26f, 11.5f)
                arcToRelative(11.23f, 11.23f, 0.0f, false, false, 12.42f, 0.6f)
                lineToRelative(33.0f, -19.64f)
                lineToRelative(33.05f, 19.64f)
                arcToRelative(11.22f, 11.22f, 0.0f, false, false, 12.42f, -0.6f)
                arcToRelative(11.07f, 11.07f, 0.0f, false, false, 4.25f, -11.5f)
                lineTo(205.0f, 107.38f)
                lineToRelative(29.08f, -24.83f)
                arcTo(11.08f, 11.08f, 0.0f, false, false, 237.47f, 70.71f)
                close()
                moveTo(196.81f, 98.61f)
                arcToRelative(11.05f, 11.05f, 0.0f, false, false, -3.61f, 11.0f)
                lineToRelative(8.39f, 35.55f)
                lineToRelative(-31.83f, -18.92f)
                arcToRelative(11.23f, 11.23f, 0.0f, false, false, -11.52f, 0.0f)
                lineToRelative(-31.82f, 18.92f)
                lineToRelative(8.38f, -35.56f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, -3.6f, -11.0f)
                lineTo(103.31f, 74.79f)
                lineToRelative(36.85f, -3.12f)
                arcToRelative(11.2f, 11.2f, 0.0f, false, false, 9.37f, -6.74f)
                lineTo(164.0f, 31.17f)
                lineToRelative(14.48f, 33.76f)
                arcToRelative(11.19f, 11.19f, 0.0f, false, false, 9.36f, 6.74f)
                lineToRelative(36.86f, 3.12f)
                close()
                moveTo(84.24f, 124.24f)
                lineToRelative(-56.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineToRelative(56.0f, -56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f)
                close()
                moveTo(100.24f, 171.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.48f)
                lineToRelative(-56.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineToRelative(56.0f, -56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 100.24f, 171.76f)
                close()
                moveTo(172.24f, 171.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.48f)
                lineToRelative(-56.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineToRelative(56.0f, -56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 172.25f, 171.76f)
                close()
            }
        }
        .build()
        return _shootingStar!!
    }

private var _shootingStar: ImageVector? = null
