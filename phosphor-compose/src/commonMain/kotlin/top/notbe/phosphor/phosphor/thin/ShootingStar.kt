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

public val ThinGroup.ShootingStar: ImageVector
    get() {
        if (_shootingStar != null) {
            return _shootingStar!!
        }
        _shootingStar = Builder(name = "ShootingStar", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.55f, 71.32f)
                arcToRelative(9.18f, 9.18f, 0.0f, false, false, -8.0f, -6.33f)
                lineTo(188.68f, 61.7f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, -1.0f, -0.71f)
                lineTo(172.47f, 25.56f)
                arcToRelative(9.24f, 9.24f, 0.0f, false, false, -16.95f, 0.0f)
                lineTo(140.33f, 61.0f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, -1.0f, 0.71f)
                lineTo(100.43f, 65.0f)
                arcToRelative(9.18f, 9.18f, 0.0f, false, false, -8.0f, 6.33f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 95.21f, 81.0f)
                lineToRelative(29.49f, 25.19f)
                arcToRelative(1.09f, 1.09f, 0.0f, false, true, 0.36f, 1.09f)
                lineToRelative(-8.84f, 37.46f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 3.49f, 9.43f)
                arcToRelative(9.23f, 9.23f, 0.0f, false, false, 10.22f, 0.49f)
                lineToRelative(33.42f, -19.86f)
                arcToRelative(1.29f, 1.29f, 0.0f, false, true, 1.29f, 0.0f)
                lineToRelative(33.42f, 19.86f)
                arcToRelative(9.22f, 9.22f, 0.0f, false, false, 10.21f, -0.49f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 3.49f, -9.43f)
                lineToRelative(-8.84f, -37.46f)
                arcToRelative(1.11f, 1.11f, 0.0f, false, true, 0.37f, -1.09f)
                lineTo(232.78f, 81.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 235.55f, 71.32f)
                close()
                moveTo(227.55f, 74.94f)
                lineTo(198.1f, 100.13f)
                arcToRelative(9.06f, 9.06f, 0.0f, false, false, -3.0f, 9.0f)
                lineTo(204.0f, 146.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.44f, 1.14f)
                arcToRelative(1.21f, 1.21f, 0.0f, false, true, -1.4f, 0.07f)
                lineToRelative(-33.41f, -19.87f)
                arcToRelative(9.27f, 9.27f, 0.0f, false, false, -9.47f, 0.0f)
                lineToRelative(-33.42f, 19.87f)
                arcToRelative(1.19f, 1.19f, 0.0f, false, true, -1.39f, -0.07f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.44f, -1.14f)
                lineToRelative(8.84f, -37.46f)
                arcToRelative(9.08f, 9.08f, 0.0f, false, false, -3.0f, -9.0f)
                lineTo(100.4f, 74.94f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.34f, -1.17f)
                arcToRelative(1.12f, 1.12f, 0.0f, false, true, 1.0f, -0.81f)
                lineTo(140.0f, 69.67f)
                arcToRelative(9.16f, 9.16f, 0.0f, false, false, 7.69f, -5.52f)
                lineToRelative(15.19f, -35.44f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 2.25f, 0.0f)
                lineToRelative(15.19f, 35.43f)
                arcTo(9.14f, 9.14f, 0.0f, false, false, 188.0f, 69.67f)
                lineTo(226.88f, 73.0f)
                arcToRelative(1.14f, 1.14f, 0.0f, false, true, 1.05f, 0.81f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 227.59f, 74.94f)
                close()
                moveTo(82.83f, 122.83f)
                lineToRelative(-56.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineToRelative(56.0f, -56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 5.66f)
                close()
                moveTo(98.83f, 173.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.66f)
                lineToRelative(-56.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineToRelative(56.0f, -56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 98.82f, 173.17f)
                close()
                moveTo(170.83f, 173.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.66f)
                lineToRelative(-56.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.65f, -5.66f)
                lineToRelative(56.0f, -56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 170.82f, 173.17f)
                close()
            }
        }
        .build()
        return _shootingStar!!
    }

private var _shootingStar: ImageVector? = null
