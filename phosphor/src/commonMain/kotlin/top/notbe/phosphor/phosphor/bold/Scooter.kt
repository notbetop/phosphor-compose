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

public val BoldGroup.Scooter: ImageVector
    get() {
        if (_scooter != null) {
            return _scooter!!
        }
        _scooter = Builder(name = "Scooter", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 132.0f)
                lineToRelative(-0.68f, 0.0f)
                lineTo(197.94f, 91.89f)
                verticalLineToRelative(0.0f)
                lineTo(179.38f, 36.21f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 168.0f, 28.0f)
                lineTo(136.0f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(23.35f)
                lineToRelative(13.77f, 41.3f)
                lineToRelative(-55.0f, 70.7f)
                lineTo(83.2f, 164.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -2.55f, 24.0f)
                lineTo(124.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.47f, -4.63f)
                lineToRelative(48.77f, -62.7f)
                lineToRelative(6.32f, 19.0f)
                arcTo(40.0f, 40.0f, 0.0f, true, false, 212.0f, 132.0f)
                close()
                moveTo(44.0f, 188.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 44.0f, 188.0f)
                close()
                moveTo(212.0f, 188.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 212.0f, 188.0f)
                close()
            }
        }
        .build()
        return _scooter!!
    }

private var _scooter: ImageVector? = null
