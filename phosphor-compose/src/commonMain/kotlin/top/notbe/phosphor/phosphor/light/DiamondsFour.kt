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

public val LightGroup.DiamondsFour: ImageVector
    get() {
        if (_diamondsFour != null) {
            return _diamondsFour!!
        }
        _diamondsFour = Builder(name = "DiamondsFour", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(117.59f, 105.69f)
                horizontalLineToRelative(0.0f)
                arcToRelative(14.75f, 14.75f, 0.0f, false, false, 20.82f, 0.0f)
                lineToRelative(31.28f, -31.28f)
                arcToRelative(14.75f, 14.75f, 0.0f, false, false, 0.0f, -20.83f)
                lineTo(138.41f, 22.3f)
                arcToRelative(14.74f, 14.74f, 0.0f, false, false, -20.82f, 0.0f)
                lineTo(86.31f, 53.58f)
                arcToRelative(14.75f, 14.75f, 0.0f, false, false, 0.0f, 20.83f)
                close()
                moveTo(94.8f, 62.07f)
                lineToRelative(31.27f, -31.28f)
                arcToRelative(2.74f, 2.74f, 0.0f, false, true, 3.86f, 0.0f)
                lineTo(161.2f, 62.07f)
                arcToRelative(2.71f, 2.71f, 0.0f, false, true, 0.0f, 3.85f)
                lineTo(129.93f, 97.2f)
                arcToRelative(2.74f, 2.74f, 0.0f, false, true, -3.86f, 0.0f)
                lineTo(94.8f, 65.92f)
                arcTo(2.71f, 2.71f, 0.0f, false, true, 94.8f, 62.07f)
                close()
                moveTo(233.69f, 117.59f)
                lineTo(202.41f, 86.31f)
                arcToRelative(14.74f, 14.74f, 0.0f, false, false, -20.82f, 0.0f)
                lineToRelative(-31.28f, 31.28f)
                arcToRelative(14.74f, 14.74f, 0.0f, false, false, 0.0f, 20.82f)
                lineToRelative(31.28f, 31.28f)
                horizontalLineToRelative(0.0f)
                arcToRelative(14.74f, 14.74f, 0.0f, false, false, 20.83f, 0.0f)
                lineToRelative(31.27f, -31.28f)
                arcTo(14.72f, 14.72f, 0.0f, false, false, 233.69f, 117.59f)
                close()
                moveTo(225.21f, 129.93f)
                lineTo(193.93f, 161.2f)
                arcToRelative(2.71f, 2.71f, 0.0f, false, true, -3.85f, 0.0f)
                lineTo(158.8f, 129.93f)
                arcToRelative(2.74f, 2.74f, 0.0f, false, true, 0.0f, -3.86f)
                lineTo(190.08f, 94.8f)
                arcToRelative(2.72f, 2.72f, 0.0f, false, true, 3.85f, 0.0f)
                lineToRelative(31.28f, 31.28f)
                arcTo(2.74f, 2.74f, 0.0f, false, true, 225.21f, 129.93f)
                close()
                moveTo(105.69f, 117.59f)
                lineTo(74.41f, 86.31f)
                arcToRelative(14.75f, 14.75f, 0.0f, false, false, -20.83f, 0.0f)
                lineTo(22.31f, 117.59f)
                arcToRelative(14.72f, 14.72f, 0.0f, false, false, 0.0f, 20.82f)
                lineToRelative(31.27f, 31.28f)
                horizontalLineToRelative(0.0f)
                arcToRelative(14.73f, 14.73f, 0.0f, false, false, 20.82f, 0.0f)
                lineToRelative(31.28f, -31.28f)
                arcTo(14.74f, 14.74f, 0.0f, false, false, 105.69f, 117.59f)
                close()
                moveTo(97.2f, 129.93f)
                lineTo(65.92f, 161.2f)
                arcToRelative(2.71f, 2.71f, 0.0f, false, true, -3.85f, 0.0f)
                lineTo(30.79f, 129.93f)
                arcToRelative(2.74f, 2.74f, 0.0f, false, true, 0.0f, -3.86f)
                lineTo(62.07f, 94.8f)
                arcToRelative(2.72f, 2.72f, 0.0f, false, true, 3.85f, 0.0f)
                lineTo(97.2f, 126.07f)
                arcTo(2.74f, 2.74f, 0.0f, false, true, 97.2f, 129.93f)
                close()
                moveTo(138.41f, 150.31f)
                arcToRelative(14.74f, 14.74f, 0.0f, false, false, -20.82f, 0.0f)
                lineTo(86.31f, 181.59f)
                arcToRelative(14.74f, 14.74f, 0.0f, false, false, 0.0f, 20.82f)
                lineToRelative(31.28f, 31.28f)
                horizontalLineToRelative(0.0f)
                arcToRelative(14.74f, 14.74f, 0.0f, false, false, 20.82f, 0.0f)
                lineToRelative(31.28f, -31.28f)
                arcToRelative(14.74f, 14.74f, 0.0f, false, false, 0.0f, -20.82f)
                close()
                moveTo(161.2f, 193.93f)
                lineTo(129.93f, 225.21f)
                arcToRelative(2.74f, 2.74f, 0.0f, false, true, -3.86f, 0.0f)
                lineTo(94.8f, 193.93f)
                arcToRelative(2.71f, 2.71f, 0.0f, false, true, 0.0f, -3.85f)
                lineToRelative(31.27f, -31.28f)
                arcToRelative(2.74f, 2.74f, 0.0f, false, true, 3.86f, 0.0f)
                lineToRelative(31.27f, 31.28f)
                arcTo(2.71f, 2.71f, 0.0f, false, true, 161.2f, 193.93f)
                close()
            }
        }
        .build()
        return _diamondsFour!!
    }

private var _diamondsFour: ImageVector? = null
