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

public val BoldGroup.Globe: ImageVector
    get() {
        if (_globe != null) {
            return _globe!!
        }
        _globe = Builder(name = "Globe", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(107.07f, 172.0f)
                horizontalLineToRelative(41.86f)
                arcTo(115.75f, 115.75f, 0.0f, false, true, 128.0f, 209.85f)
                arcTo(115.75f, 115.75f, 0.0f, false, true, 107.07f, 172.0f)
                close()
                moveTo(101.41f, 148.0f)
                arcToRelative(142.55f, 142.55f, 0.0f, false, true, 0.0f, -40.0f)
                horizontalLineToRelative(53.18f)
                arcToRelative(142.55f, 142.55f, 0.0f, false, true, 0.0f, 40.0f)
                close()
                moveTo(44.0f, 128.0f)
                arcToRelative(83.49f, 83.49f, 0.0f, false, true, 2.43f, -20.0f)
                lineTo(77.22f, 108.0f)
                arcToRelative(164.54f, 164.54f, 0.0f, false, false, 0.0f, 40.0f)
                lineTo(46.43f, 148.0f)
                arcTo(83.49f, 83.49f, 0.0f, false, true, 44.0f, 128.0f)
                close()
                moveTo(148.93f, 84.0f)
                lineTo(107.07f, 84.0f)
                arcTo(115.75f, 115.75f, 0.0f, false, true, 128.0f, 46.15f)
                arcTo(115.75f, 115.75f, 0.0f, false, true, 148.93f, 84.0f)
                close()
                moveTo(178.78f, 108.0f)
                horizontalLineToRelative(30.79f)
                arcToRelative(83.52f, 83.52f, 0.0f, false, true, 0.0f, 40.0f)
                lineTo(178.78f, 148.0f)
                arcToRelative(164.54f, 164.54f, 0.0f, false, false, 0.0f, -40.0f)
                close()
                moveTo(199.52f, 84.0f)
                lineTo(174.0f, 84.0f)
                arcToRelative(148.59f, 148.59f, 0.0f, false, false, -13.95f, -33.63f)
                arcTo(84.5f, 84.5f, 0.0f, false, true, 199.52f, 84.0f)
                close()
                moveTo(96.0f, 50.37f)
                arcTo(148.59f, 148.59f, 0.0f, false, false, 82.0f, 84.0f)
                lineTo(56.48f, 84.0f)
                arcTo(84.5f, 84.5f, 0.0f, false, true, 96.0f, 50.37f)
                close()
                moveTo(56.48f, 172.0f)
                lineTo(82.0f, 172.0f)
                arcToRelative(148.59f, 148.59f, 0.0f, false, false, 14.0f, 33.63f)
                arcTo(84.5f, 84.5f, 0.0f, false, true, 56.48f, 172.0f)
                close()
                moveTo(160.05f, 205.63f)
                arcTo(148.59f, 148.59f, 0.0f, false, false, 174.0f, 172.0f)
                horizontalLineToRelative(25.52f)
                arcTo(84.5f, 84.5f, 0.0f, false, true, 160.05f, 205.63f)
                close()
            }
        }
        .build()
        return _globe!!
    }

private var _globe: ImageVector? = null
