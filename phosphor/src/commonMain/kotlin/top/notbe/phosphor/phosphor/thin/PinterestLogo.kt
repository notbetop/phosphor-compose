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

public val ThinGroup.PinterestLogo: ImageVector
    get() {
        if (_pinterestLogo != null) {
            return _pinterestLogo!!
        }
        _pinterestLogo = Builder(name = "PinterestLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 112.0f)
                curveToRelative(0.0f, 21.53f, -7.5f, 41.18f, -21.12f, 55.34f)
                curveTo(178.26f, 180.47f, 161.17f, 188.0f, 144.0f, 188.0f)
                curveToRelative(-21.35f, 0.0f, -33.52f, -8.76f, -39.76f, -15.57f)
                lineTo(91.89f, 224.92f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 88.0f, 228.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -0.92f, -0.11f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.0f, -4.81f)
                lineToRelative(32.0f, -136.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.78f, 1.84f)
                lineToRelative(-17.28f, 73.45f)
                curveTo(109.0f, 166.42f, 119.0f, 180.0f, 144.0f, 180.0f)
                curveToRelative(29.49f, 0.0f, 60.0f, -25.44f, 60.0f, -68.0f)
                arcTo(76.0f, 76.0f, 0.0f, true, false, 62.17f, 150.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.93f, 4.0f)
                arcTo(84.0f, 84.0f, 0.0f, true, true, 212.0f, 112.0f)
                close()
            }
        }
        .build()
        return _pinterestLogo!!
    }

private var _pinterestLogo: ImageVector? = null
