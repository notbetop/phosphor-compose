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

public val BoldGroup.GlobeStand: ImageVector
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
                moveTo(128.0f, 44.0f)
                arcTo(52.0f, 52.0f, 0.0f, true, true, 76.0f, 96.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, true, 128.0f, 44.0f)
                close()
                moveTo(140.0f, 211.38f)
                lineTo(140.0f, 220.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(96.0f, 244.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-8.62f)
                arcTo(116.0f, 116.0f, 0.0f, false, true, 12.0f, 97.12f)
                arcTo(115.3f, 115.3f, 0.0f, false, true, 44.29f, 15.69f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 61.6f, 32.31f)
                arcTo(92.0f, 92.0f, 0.0f, false, false, 191.69f, 162.39f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 16.62f, 17.31f)
                arcTo(115.12f, 115.12f, 0.0f, false, true, 140.0f, 211.38f)
                close()
            }
        }
        .build()
        return _globeStand!!
    }

private var _globeStand: ImageVector? = null
