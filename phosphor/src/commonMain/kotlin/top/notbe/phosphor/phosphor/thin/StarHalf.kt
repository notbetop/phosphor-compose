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

public val ThinGroup.StarHalf: ImageVector
    get() {
        if (_starHalf != null) {
            return _starHalf!!
        }
        _starHalf = Builder(name = "StarHalf", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.86f, 111.36f)
                lineToRelative(-5.24f, 4.57f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.26f, -6.0f)
                lineToRelative(5.24f, -4.57f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.18f, -4.32f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.44f, -2.75f)
                lineToRelative(-8.69f, -0.75f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.69f, -8.0f)
                lineToRelative(8.69f, 0.75f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 6.83f, 21.07f)
                close()
                moveTo(177.68f, 156.48f)
                lineTo(180.55f, 168.89f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 7.79f, -1.8f)
                lineToRelative(-2.86f, -12.41f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.28f, -4.0f)
                lineToRelative(7.86f, -6.86f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.26f, -6.0f)
                lineToRelative(-7.86f, 6.86f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 177.68f, 156.48f)
                close()
                moveTo(175.68f, 94.05f)
                lineTo(164.92f, 93.12f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.0f, -7.31f)
                lineTo(132.0f, 31.27f)
                lineTo(132.0f, 187.34f)
                arcToRelative(11.74f, 11.74f, 0.0f, false, true, 2.19f, 1.0f)
                lineToRelative(11.88f, 7.21f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -4.15f, 6.84f)
                lineTo(130.0f, 195.2f)
                arcToRelative(3.89f, 3.89f, 0.0f, false, false, -4.08f, 0.0f)
                lineToRelative(-51.1f, 31.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.86f, -13.0f)
                lineToRelative(13.52f, -58.54f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.28f, -4.0f)
                lineToRelative(-45.1f, -39.35f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 31.0f, 90.29f)
                lineToRelative(59.45f, -5.14f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.32f, -2.44f)
                lineTo(117.0f, 27.36f)
                arcToRelative(11.95f, 11.95f, 0.0f, false, true, 22.06f, 0.0f)
                lineToRelative(23.23f, 55.35f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.32f, 2.44f)
                lineToRelative(10.76f, 0.93f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -0.69f, 8.0f)
                close()
                moveTo(121.84f, 188.36f)
                arcToRelative(11.74f, 11.74f, 0.0f, false, true, 2.19f, -1.0f)
                lineTo(124.03f, 31.27f)
                lineTo(101.12f, 85.81f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.0f, 7.31f)
                lineTo(31.66f, 98.26f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 28.22f, 101.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.18f, 4.32f)
                lineToRelative(45.1f, 39.35f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 3.82f, 11.8f)
                lineTo(64.8f, 215.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.56f, 4.2f)
                arcToRelative(3.86f, 3.86f, 0.0f, false, false, 4.35f, 0.17f)
                close()
                moveTo(195.76f, 199.09f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -7.79f, 1.8f)
                lineTo(191.2f, 215.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.56f, 4.2f)
                arcToRelative(3.86f, 3.86f, 0.0f, false, true, -4.35f, 0.17f)
                lineToRelative(-11.23f, -6.82f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.15f, 6.84f)
                lineToRelative(11.23f, 6.82f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.86f, -13.0f)
                close()
            }
        }
        .build()
        return _starHalf!!
    }

private var _starHalf: ImageVector? = null
