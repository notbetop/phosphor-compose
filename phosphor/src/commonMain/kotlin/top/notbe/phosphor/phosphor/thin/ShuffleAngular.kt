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

public val ThinGroup.ShuffleAngular: ImageVector
    get() {
        if (_shuffleAngular != null) {
            return _shuffleAngular!!
        }
        _shuffleAngular = Builder(name = "ShuffleAngular", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.83f, 181.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.66f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineTo(222.34f, 188.0f)
                lineTo(172.12f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.77f, -5.0f)
                lineTo(87.14f, 77.67f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 83.88f, 76.0f)
                lineTo(32.0f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(83.88f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 9.77f, 5.0f)
                lineToRelative(75.21f, 105.31f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.26f, 1.67f)
                horizontalLineToRelative(50.22f)
                lineToRelative(-17.17f, -17.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                close()
                moveTo(145.34f, 103.73f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.58f, -0.93f)
                lineToRelative(17.94f, -25.13f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 172.12f, 76.0f)
                horizontalLineToRelative(50.22f)
                lineTo(205.17f, 93.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.66f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -5.66f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f)
                lineTo(222.34f, 68.0f)
                lineTo(172.12f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -9.77f, 5.0f)
                lineTo(144.41f, 98.15f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 145.34f, 103.73f)
                close()
                moveTo(110.66f, 152.27f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.58f, 0.93f)
                lineTo(87.14f, 178.33f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 83.88f, 180.0f)
                lineTo(32.0f, 180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(83.88f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.77f, -5.0f)
                lineToRelative(17.94f, -25.13f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 110.66f, 152.27f)
                close()
            }
        }
        .build()
        return _shuffleAngular!!
    }

private var _shuffleAngular: ImageVector? = null
