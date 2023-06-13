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

public val ThinGroup.Scooter: ImageVector
    get() {
        if (_scooter != null) {
            return _scooter!!
        }
        _scooter = Builder(name = "Scooter", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 140.0f)
                arcToRelative(31.29f, 31.29f, 0.0f, false, false, -6.24f, 0.62f)
                lineToRelative(-11.82f, -35.46f)
                horizontalLineToRelative(0.0f)
                lineTo(171.79f, 38.74f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 168.0f, 36.0f)
                lineTo(136.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(29.12f)
                lineToRelative(20.54f, 61.63f)
                lineTo(134.0f, 172.0f)
                lineTo(76.0f, 172.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -1.0f, 8.0f)
                horizontalLineToRelative(61.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.16f, -1.54f)
                lineToRelative(49.54f, -63.7f)
                lineToRelative(9.47f, 28.39f)
                arcTo(32.0f, 32.0f, 0.0f, true, false, 212.0f, 140.0f)
                close()
                moveTo(44.0f, 196.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 44.0f, 196.0f)
                close()
                moveTo(212.0f, 196.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 212.0f, 196.0f)
                close()
            }
        }
        .build()
        return _scooter!!
    }

private var _scooter: ImageVector? = null
