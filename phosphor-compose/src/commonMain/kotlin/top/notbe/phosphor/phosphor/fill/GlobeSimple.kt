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

public val FillGroup.GlobeSimple: ImageVector
    get() {
        if (_globeSimple != null) {
            return _globeSimple!!
        }
        _globeSimple = Builder(name = "GlobeSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(215.63f, 120.0f)
                lineTo(175.8f, 120.0f)
                curveToRelative(-1.41f, -28.46f, -10.27f, -55.47f, -25.12f, -77.0f)
                arcTo(88.2f, 88.2f, 0.0f, false, true, 215.63f, 120.0f)
                close()
                moveTo(96.23f, 136.0f)
                horizontalLineToRelative(63.54f)
                curveToRelative(-1.68f, 30.87f, -13.0f, 59.62f, -31.77f, 79.89f)
                curveTo(109.27f, 195.62f, 97.91f, 166.87f, 96.23f, 136.0f)
                close()
                moveTo(96.23f, 120.0f)
                curveToRelative(1.68f, -30.87f, 13.0f, -59.62f, 31.77f, -79.89f)
                curveToRelative(18.73f, 20.27f, 30.09f, 49.0f, 31.77f, 79.89f)
                close()
                moveTo(150.68f, 213.0f)
                curveToRelative(14.85f, -21.56f, 23.71f, -48.57f, 25.12f, -77.0f)
                horizontalLineToRelative(39.83f)
                arcTo(88.2f, 88.2f, 0.0f, false, true, 150.68f, 213.0f)
                close()
            }
        }
        .build()
        return _globeSimple!!
    }

private var _globeSimple: ImageVector? = null
