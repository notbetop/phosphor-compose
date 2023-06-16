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

public val FillGroup.Scooter: ImageVector
    get() {
        if (_scooter != null) {
            return _scooter!!
        }
        _scooter = Builder(name = "Scooter", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 172.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -49.38f, -26.85f)
                lineToRelative(-7.35f, -22.0f)
                lineToRelative(-45.0f, 57.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 184.0f)
                horizontalLineTo(73.66f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 2.08f, -16.0f)
                horizontalLineToRelative(56.35f)
                lineToRelative(49.1f, -63.13f)
                lineTo(162.23f, 48.0f)
                horizontalLineTo(136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.59f, 5.47f)
                lineTo(209.8f, 140.08f)
                curveToRelative(0.72f, -0.05f, 1.46f, -0.08f, 2.2f, -0.08f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 244.0f, 172.0f)
                close()
            }
        }
        .build()
        return _scooter!!
    }

private var _scooter: ImageVector? = null
