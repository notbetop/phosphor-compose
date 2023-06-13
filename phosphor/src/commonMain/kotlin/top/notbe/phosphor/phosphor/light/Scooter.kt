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

public val LightGroup.Scooter: ImageVector
    get() {
        if (_scooter != null) {
            return _scooter!!
        }
        _scooter = Builder(name = "Scooter", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 138.0f)
                arcToRelative(34.32f, 34.32f, 0.0f, false, false, -4.89f, 0.36f)
                lineToRelative(-11.27f, -33.82f)
                verticalLineToRelative(0.0f)
                lineTo(173.69f, 38.1f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 168.0f, 34.0f)
                lineTo(136.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(27.68f)
                lineToRelative(19.75f, 59.25f)
                lineTo(133.07f, 170.0f)
                lineTo(77.94f, 170.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, -1.44f, 12.0f)
                lineTo(136.0f, 182.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.74f, -2.32f)
                lineTo(188.0f, 118.93f)
                lineToRelative(7.74f, 23.23f)
                arcTo(34.0f, 34.0f, 0.0f, true, false, 212.0f, 138.0f)
                close()
                moveTo(44.0f, 194.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, 22.0f, -22.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 44.0f, 194.0f)
                close()
                moveTo(212.0f, 194.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, 22.0f, -22.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 212.0f, 194.0f)
                close()
            }
        }
        .build()
        return _scooter!!
    }

private var _scooter: ImageVector? = null
