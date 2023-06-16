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

public val ThinGroup.Swatches: ImageVector
    get() {
        if (_swatches != null) {
            return _swatches!!
        }
        _swatches = Builder(name = "Swatches", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.27f, 152.07f)
                lineTo(208.19f, 99.85f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -15.34f, -7.13f)
                lineToRelative(-74.3f, 26.92f)
                lineToRelative(13.27f, -75.83f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -9.68f, -13.9f)
                lineTo(67.47f, 20.19f)
                arcToRelative(11.75f, 11.75f, 0.0f, false, false, -8.89f, 2.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -4.94f, 7.77f)
                lineToRelative(-25.0f, 143.13f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 60.8f, 219.39f)
                arcTo(42.68f, 42.68f, 0.0f, false, false, 68.0f, 220.0f)
                lineTo(216.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 156.19f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 227.27f, 152.07f)
                close()
                moveTo(195.57f, 100.24f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.1f, 2.36f)
                lineToRelative(19.09f, 52.21f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -0.13f, 3.0f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, true, -2.24f, 2.0f)
                lineTo(100.78f, 202.11f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 6.0f, -15.17f)
                lineTo(117.0f, 128.73f)
                close()
                moveTo(85.75f, 206.29f)
                arcToRelative(31.25f, 31.25f, 0.0f, false, true, -23.55f, 5.22f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -25.71f, -37.08f)
                lineToRelative(25.0f, -143.13f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.64f, -2.59f)
                arcTo(3.85f, 3.85f, 0.0f, false, true, 65.38f, 28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.69f, 0.06f)
                lineToRelative(54.67f, 9.73f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.2f, 4.64f)
                lineToRelative(-25.0f, 143.13f)
                horizontalLineToRelative(0.0f)
                arcTo(31.79f, 31.79f, 0.0f, false, true, 85.75f, 206.29f)
                close()
                moveTo(220.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(97.0f, 212.0f)
                lineToRelative(123.0f, -44.59f)
                close()
                moveTo(76.0f, 180.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 76.0f, 180.0f)
                close()
            }
        }
        .build()
        return _swatches!!
    }

private var _swatches: ImageVector? = null
