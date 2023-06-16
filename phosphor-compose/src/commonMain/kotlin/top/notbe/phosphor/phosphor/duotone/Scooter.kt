package top.notbe.phosphor.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.DuotoneGroup

public val DuotoneGroup.Scooter: ImageVector
    get() {
        if (_scooter != null) {
            return _scooter!!
        }
        _scooter = Builder(name = "Scooter", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(72.0f, 172.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 72.0f, 172.0f)
                close()
                moveTo(212.0f, 144.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 212.0f, 144.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 136.0f)
                curveToRelative(-1.18f, 0.0f, -2.35f, 0.06f, -3.51f, 0.17f)
                lineToRelative(-10.75f, -32.25f)
                verticalLineToRelative(0.0f)
                lineTo(175.59f, 37.47f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 168.0f, 32.0f)
                lineTo(136.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(26.23f)
                lineToRelative(19.0f, 56.87f)
                lineTo(132.09f, 168.0f)
                lineTo(79.77f, 168.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -1.83f, 16.0f)
                lineTo(136.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.31f, -3.09f)
                lineToRelative(45.0f, -57.8f)
                lineToRelative(6.0f, 18.13f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 212.0f, 136.0f)
                close()
                moveTo(44.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 44.0f, 192.0f)
                close()
                moveTo(212.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 212.0f, 192.0f)
                close()
            }
        }
        .build()
        return _scooter!!
    }

private var _scooter: ImageVector? = null
