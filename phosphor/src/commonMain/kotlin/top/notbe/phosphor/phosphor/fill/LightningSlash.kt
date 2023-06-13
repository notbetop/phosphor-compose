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

public val FillGroup.LightningSlash: ImageVector
    get() {
        if (_lightningSlash != null) {
            return _lightningSlash!!
        }
        _lightningSlash = Builder(name = "LightningSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.92f, 210.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.84f, 10.76f)
                lineToRelative(-38.37f, -42.2f)
                lineToRelative(-61.86f, 66.28f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.69f, -7.0f)
                lineToRelative(14.66f, -73.33f)
                lineTo(45.19f, 143.49f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.0f, -13.0f)
                lineToRelative(39.18f, -42.0f)
                lineTo(42.08f, 45.38f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 53.92f, 34.62f)
                close()
                moveTo(179.78f, 149.28f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.86f, 2.62f)
                horizontalLineToRelative(0.06f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.85f, -2.55f)
                lineToRelative(22.3f, -23.89f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.0f, -12.95f)
                lineTo(153.18f, 90.9f)
                lineToRelative(14.66f, -73.33f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.69f, -7.0f)
                lineTo(108.27f, 59.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.07f, 10.84f)
                close()
            }
        }
        .build()
        return _lightningSlash!!
    }

private var _lightningSlash: ImageVector? = null
