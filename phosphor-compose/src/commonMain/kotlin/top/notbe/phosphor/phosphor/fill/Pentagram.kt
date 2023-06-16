package top.notbe.phosphor.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.FillGroup

public val FillGroup.Pentagram: ImageVector
    get() {
        if (_pentagram != null) {
            return _pentagram!!
        }
        _pentagram = Builder(name = "Pentagram", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(58.48f, 134.73f)
                lineTo(22.66f, 109.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 32.0f, 80.0f)
                lineTo(76.24f, 80.0f)
                close()
                moveTo(53.15f, 203.0f)
                arcTo(15.75f, 15.75f, 0.0f, false, false, 59.0f, 220.88f)
                arcToRelative(15.74f, 15.74f, 0.0f, false, false, 18.77f, 0.0f)
                lineTo(114.3f, 194.6f)
                lineTo(66.94f, 160.52f)
                close()
                moveTo(143.23f, 19.26f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, false, -30.45f, -0.05f)
                lineTo(98.25f, 64.0f)
                horizontalLineToRelative(59.5f)
                close()
                moveTo(162.94f, 80.0f)
                lineTo(93.06f, 80.0f)
                lineTo(72.12f, 144.54f)
                lineTo(128.0f, 184.75f)
                lineToRelative(55.88f, -40.21f)
                close()
                moveTo(239.18f, 91.06f)
                arcTo(15.75f, 15.75f, 0.0f, false, false, 224.0f, 80.0f)
                lineTo(179.76f, 80.0f)
                lineToRelative(17.76f, 54.74f)
                lineToRelative(35.85f, -25.8f)
                arcTo(15.74f, 15.74f, 0.0f, false, false, 239.18f, 91.05f)
                close()
                moveTo(189.06f, 160.53f)
                lineTo(141.7f, 194.6f)
                lineToRelative(36.53f, 26.28f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 202.85f, 203.0f)
                close()
            }
        }
        .build()
        return _pentagram!!
    }

private var _pentagram: ImageVector? = null
