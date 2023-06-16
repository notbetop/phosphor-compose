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

public val RegularGroup.Globe: ImageVector
    get() {
        if (_globe != null) {
            return _globe!!
        }
        _globe = Builder(name = "Globe", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(101.63f, 168.0f)
                horizontalLineToRelative(52.74f)
                curveTo(149.0f, 186.34f, 140.0f, 202.87f, 128.0f, 215.89f)
                curveTo(116.0f, 202.87f, 107.0f, 186.34f, 101.63f, 168.0f)
                close()
                moveTo(98.0f, 152.0f)
                arcToRelative(145.72f, 145.72f, 0.0f, false, true, 0.0f, -48.0f)
                horizontalLineToRelative(60.0f)
                arcToRelative(145.72f, 145.72f, 0.0f, false, true, 0.0f, 48.0f)
                close()
                moveTo(40.0f, 128.0f)
                arcToRelative(87.61f, 87.61f, 0.0f, false, true, 3.33f, -24.0f)
                lineTo(81.79f, 104.0f)
                arcToRelative(161.79f, 161.79f, 0.0f, false, false, 0.0f, 48.0f)
                lineTo(43.33f, 152.0f)
                arcTo(87.61f, 87.61f, 0.0f, false, true, 40.0f, 128.0f)
                close()
                moveTo(154.37f, 88.0f)
                lineTo(101.63f, 88.0f)
                curveTo(107.0f, 69.66f, 116.0f, 53.13f, 128.0f, 40.11f)
                curveTo(140.0f, 53.13f, 149.0f, 69.66f, 154.37f, 88.0f)
                close()
                moveTo(174.21f, 104.0f)
                horizontalLineToRelative(38.46f)
                arcToRelative(88.15f, 88.15f, 0.0f, false, true, 0.0f, 48.0f)
                lineTo(174.21f, 152.0f)
                arcToRelative(161.79f, 161.79f, 0.0f, false, false, 0.0f, -48.0f)
                close()
                moveTo(206.37f, 88.0f)
                lineTo(170.94f, 88.0f)
                arcToRelative(142.39f, 142.39f, 0.0f, false, false, -20.26f, -45.0f)
                arcTo(88.37f, 88.37f, 0.0f, false, true, 206.37f, 88.0f)
                close()
                moveTo(105.32f, 43.0f)
                arcTo(142.39f, 142.39f, 0.0f, false, false, 85.06f, 88.0f)
                lineTo(49.63f, 88.0f)
                arcTo(88.37f, 88.37f, 0.0f, false, true, 105.32f, 43.0f)
                close()
                moveTo(49.63f, 168.0f)
                lineTo(85.06f, 168.0f)
                arcToRelative(142.39f, 142.39f, 0.0f, false, false, 20.26f, 45.0f)
                arcTo(88.37f, 88.37f, 0.0f, false, true, 49.63f, 168.0f)
                close()
                moveTo(150.68f, 213.0f)
                arcToRelative(142.39f, 142.39f, 0.0f, false, false, 20.26f, -45.0f)
                horizontalLineToRelative(35.43f)
                arcTo(88.37f, 88.37f, 0.0f, false, true, 150.68f, 213.0f)
                close()
            }
        }
        .build()
        return _globe!!
    }

private var _globe: ImageVector? = null
