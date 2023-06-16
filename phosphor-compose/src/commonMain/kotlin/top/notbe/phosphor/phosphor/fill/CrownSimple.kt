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

public val FillGroup.CrownSimple: ImageVector
    get() {
        if (_crownSimple != null) {
            return _crownSimple!!
        }
        _crownSimple = Builder(name = "CrownSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(247.37f, 89.15f)
                lineToRelative(-37.0f, 113.33f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.71f, 4.39f)
                curveToRelative(-0.23f, -0.14f, -25.8f, -14.87f, -70.68f, -14.87f)
                reflectiveCurveToRelative(-70.45f, 14.73f, -70.7f, 14.88f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.68f, -4.4f)
                lineTo(8.62f, 89.12f)
                arcTo(12.11f, 12.11f, 0.0f, false, true, 25.52f, 74.5f)
                lineToRelative(50.19f, 25.0f)
                lineToRelative(41.92f, -69.66f)
                arcToRelative(12.11f, 12.11f, 0.0f, false, true, 20.74f, 0.0f)
                lineToRelative(41.92f, 69.66f)
                lineToRelative(50.21f, -25.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 16.87f, 14.66f)
                close()
            }
        }
        .build()
        return _crownSimple!!
    }

private var _crownSimple: ImageVector? = null
