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

public val BoldGroup.AirplaneLanding: ImageVector
    get() {
        if (_airplaneLanding != null) {
            return _airplaneLanding!!
        }
        _airplaneLanding = Builder(name = "AirplaneLanding", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(96.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(240.0f, 204.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 252.0f, 216.0f)
                close()
                moveTo(220.76f, 191.55f)
                lineTo(44.14f, 142.09f)
                arcTo(44.13f, 44.13f, 0.0f, false, true, 12.0f, 99.72f)
                lineTo(12.0f, 48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 38.32f, 29.0f)
                lineToRelative(5.48f, 1.83f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 7.49f, 7.3f)
                lineTo(61.2f, 65.59f)
                lineTo(84.0f, 72.09f)
                lineTo(84.0f, 48.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 26.32f, -19.0f)
                lineToRelative(5.48f, 1.83f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 7.27f, 6.74f)
                lineToRelative(21.75f, 51.85f)
                lineToRelative(59.0f, 16.49f)
                arcTo(44.12f, 44.12f, 0.0f, false, true, 236.0f, 148.32f)
                lineTo(236.0f, 180.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -15.24f, 11.55f)
                close()
                moveTo(212.0f, 148.32f)
                arcToRelative(20.05f, 20.05f, 0.0f, false, false, -14.65f, -19.27f)
                lineTo(132.77f, 111.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.84f, -6.91f)
                lineTo(108.0f, 63.71f)
                lineTo(108.0f, 88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 92.71f, 99.53f)
                lineTo(48.71f, 87.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.0f, -7.46f)
                lineTo(36.0f, 66.48f)
                lineTo(36.0f, 99.72f)
                arcTo(20.07f, 20.07f, 0.0f, false, false, 50.61f, 119.0f)
                lineTo(212.0f, 164.18f)
                close()
            }
        }
        .build()
        return _airplaneLanding!!
    }

private var _airplaneLanding: ImageVector? = null
