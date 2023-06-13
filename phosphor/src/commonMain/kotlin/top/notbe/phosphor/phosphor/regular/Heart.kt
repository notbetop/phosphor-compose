package top.notbe.phosphor.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.RegularGroup

public val RegularGroup.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(178.0f, 32.0f)
                curveToRelative(-20.65f, 0.0f, -38.73f, 8.88f, -50.0f, 23.89f)
                curveTo(116.73f, 40.88f, 98.65f, 32.0f, 78.0f, 32.0f)
                arcTo(62.07f, 62.07f, 0.0f, false, false, 16.0f, 94.0f)
                curveToRelative(0.0f, 70.0f, 103.79f, 126.66f, 108.21f, 129.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.58f, 0.0f)
                curveTo(136.21f, 220.66f, 240.0f, 164.0f, 240.0f, 94.0f)
                arcTo(62.07f, 62.07f, 0.0f, false, false, 178.0f, 32.0f)
                close()
                moveTo(128.0f, 206.8f)
                curveTo(109.74f, 196.16f, 32.0f, 147.69f, 32.0f, 94.0f)
                arcTo(46.06f, 46.06f, 0.0f, false, true, 78.0f, 48.0f)
                curveToRelative(19.45f, 0.0f, 35.78f, 10.36f, 42.6f, 27.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.8f, 0.0f)
                curveToRelative(6.82f, -16.67f, 23.15f, -27.0f, 42.6f, -27.0f)
                arcToRelative(46.06f, 46.06f, 0.0f, false, true, 46.0f, 46.0f)
                curveTo(224.0f, 147.61f, 146.24f, 196.15f, 128.0f, 206.8f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
