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

public val ThinGroup.GlobeStand: ImageVector
    get() {
        if (_globeStand != null) {
            return _globeStand!!
        }
        _globeStand = Builder(name = "GlobeStand", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 172.0f)
                arcTo(76.0f, 76.0f, 0.0f, true, false, 52.0f, 96.0f)
                arcTo(76.08f, 76.08f, 0.0f, false, false, 128.0f, 172.0f)
                close()
                moveTo(128.0f, 28.0f)
                arcTo(68.0f, 68.0f, 0.0f, true, true, 60.0f, 96.0f)
                arcTo(68.07f, 68.07f, 0.0f, false, true, 128.0f, 28.0f)
                close()
                moveTo(202.89f, 168.28f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.12f, 5.65f)
                arcToRelative(107.31f, 107.31f, 0.0f, false, true, -70.77f, 30.0f)
                lineTo(132.0f, 228.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(96.0f, 236.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(28.0f)
                lineTo(124.0f, 203.92f)
                arcTo(108.0f, 108.0f, 0.0f, false, true, 50.06f, 21.23f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.77f, 5.54f)
                arcToRelative(100.0f, 100.0f, 0.0f, false, false, 141.4f, 141.39f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 202.89f, 168.28f)
                close()
            }
        }
        .build()
        return _globeStand!!
    }

private var _globeStand: ImageVector? = null
