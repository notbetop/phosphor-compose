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

public val FillGroup.Broom: ImageVector
    get() {
        if (_broom != null) {
            return _broom!!
        }
        _broom = Builder(name = "Broom", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.5f, 216.81f)
                curveToRelative(-22.56f, -11.0f, -35.5f, -34.58f, -35.5f, -64.8f)
                verticalLineTo(134.73f)
                arcToRelative(15.94f, 15.94f, 0.0f, false, false, -10.09f, -14.87f)
                lineTo(165.0f, 110.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.48f, -10.34f)
                lineToRelative(21.32f, -53.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -16.1f, -37.0f)
                arcToRelative(28.14f, 28.14f, 0.0f, false, false, -35.82f, 16.0f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, false, 0.0f, 0.12f)
                lineTo(108.9f, 79.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.37f, 4.49f)
                lineTo(73.11f, 73.14f)
                arcTo(15.89f, 15.89f, 0.0f, false, false, 55.74f, 76.8f)
                curveTo(34.68f, 98.45f, 24.0f, 123.75f, 24.0f, 152.0f)
                arcToRelative(111.45f, 111.45f, 0.0f, false, false, 31.18f, 77.53f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 61.0f, 232.0f)
                horizontalLineTo(232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.5f, -15.19f)
                close()
                moveTo(115.11f, 216.0f)
                arcToRelative(87.53f, 87.53f, 0.0f, false, true, -24.34f, -42.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.49f, 4.0f)
                arcToRelative(105.16f, 105.16f, 0.0f, false, false, 18.36f, 38.0f)
                horizontalLineTo(64.44f)
                arcTo(95.54f, 95.54f, 0.0f, false, true, 40.0f, 152.0f)
                arcToRelative(85.9f, 85.9f, 0.0f, false, true, 7.73f, -36.29f)
                lineToRelative(137.8f, 55.12f)
                curveToRelative(3.0f, 18.0f, 10.56f, 33.48f, 21.89f, 45.16f)
                close()
            }
        }
        .build()
        return _broom!!
    }

private var _broom: ImageVector? = null
