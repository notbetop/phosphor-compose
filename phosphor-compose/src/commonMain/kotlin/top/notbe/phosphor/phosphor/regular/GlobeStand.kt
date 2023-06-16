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

public val RegularGroup.GlobeStand: ImageVector
    get() {
        if (_globeStand != null) {
            return _globeStand!!
        }
        _globeStand = Builder(name = "GlobeStand", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 176.0f)
                arcTo(80.0f, 80.0f, 0.0f, true, false, 48.0f, 96.0f)
                arcTo(80.09f, 80.09f, 0.0f, false, false, 128.0f, 176.0f)
                close()
                moveTo(128.0f, 32.0f)
                arcTo(64.0f, 64.0f, 0.0f, true, true, 64.0f, 96.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, true, 128.0f, 32.0f)
                close()
                moveTo(205.77f, 165.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.23f, 11.32f)
                arcTo(111.24f, 111.24f, 0.0f, false, true, 136.0f, 207.72f)
                lineTo(136.0f, 224.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(96.0f, 240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(24.0f)
                lineTo(120.0f, 207.71f)
                arcTo(112.0f, 112.0f, 0.0f, false, true, 47.18f, 18.46f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 58.72f, 29.54f)
                arcTo(96.0f, 96.0f, 0.0f, false, false, 194.46f, 165.28f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 205.77f, 165.5f)
                close()
            }
        }
        .build()
        return _globeStand!!
    }

private var _globeStand: ImageVector? = null
