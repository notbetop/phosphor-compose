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

public val BoldGroup.GlobeSimple: ImageVector
    get() {
        if (_globeSimple != null) {
            return _globeSimple!!
        }
        _globeSimple = Builder(name = "GlobeSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(211.13f, 116.0f)
                lineTo(179.56f, 116.0f)
                arcToRelative(155.5f, 155.5f, 0.0f, false, false, -19.51f, -65.63f)
                arcTo(84.23f, 84.23f, 0.0f, false, true, 211.13f, 116.0f)
                close()
                moveTo(100.51f, 140.0f)
                horizontalLineToRelative(55.0f)
                curveToRelative(-2.25f, 26.69f, -12.0f, 51.46f, -27.49f, 69.85f)
                curveTo(112.46f, 191.46f, 102.76f, 166.69f, 100.51f, 140.0f)
                close()
                moveTo(100.51f, 116.0f)
                curveToRelative(2.25f, -26.69f, 11.95f, -51.46f, 27.49f, -69.85f)
                curveToRelative(15.54f, 18.39f, 25.24f, 43.16f, 27.49f, 69.85f)
                close()
                moveTo(96.0f, 50.37f)
                arcTo(155.5f, 155.5f, 0.0f, false, false, 76.44f, 116.0f)
                lineTo(44.87f, 116.0f)
                arcTo(84.23f, 84.23f, 0.0f, false, true, 96.0f, 50.37f)
                close()
                moveTo(44.87f, 140.0f)
                lineTo(76.44f, 140.0f)
                arcTo(155.5f, 155.5f, 0.0f, false, false, 96.0f, 205.63f)
                arcTo(84.23f, 84.23f, 0.0f, false, true, 44.87f, 140.0f)
                close()
                moveTo(160.05f, 205.63f)
                arcTo(155.5f, 155.5f, 0.0f, false, false, 179.56f, 140.0f)
                horizontalLineToRelative(31.57f)
                arcTo(84.23f, 84.23f, 0.0f, false, true, 160.05f, 205.63f)
                close()
            }
        }
        .build()
        return _globeSimple!!
    }

private var _globeSimple: ImageVector? = null
