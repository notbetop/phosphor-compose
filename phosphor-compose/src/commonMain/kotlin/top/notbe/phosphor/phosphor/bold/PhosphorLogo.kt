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

public val BoldGroup.PhosphorLogo: ImageVector
    get() {
        if (_phosphorLogo != null) {
            return _phosphorLogo!!
        }
        _phosphorLogo = Builder(name = "PhosphorLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 96.0f)
                arcToRelative(76.08f, 76.08f, 0.0f, false, false, -76.0f, -76.0f)
                lineTo(64.0f, 20.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 52.0f, 32.0f)
                lineTo(52.0f, 160.0f)
                arcToRelative(84.09f, 84.09f, 0.0f, false, false, 84.0f, 84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(148.0f, 171.89f)
                arcTo(76.09f, 76.09f, 0.0f, false, false, 220.0f, 96.0f)
                close()
                moveTo(76.0f, 77.81f)
                lineTo(115.48f, 148.0f)
                lineTo(76.0f, 148.0f)
                close()
                moveTo(124.0f, 114.19f)
                lineTo(84.52f, 44.0f)
                lineTo(124.0f, 44.0f)
                close()
                moveTo(77.22f, 172.0f)
                lineTo(124.0f, 172.0f)
                verticalLineToRelative(46.79f)
                arcTo(60.18f, 60.18f, 0.0f, false, true, 77.22f, 172.0f)
                close()
                moveTo(148.0f, 147.83f)
                lineTo(148.0f, 44.17f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 0.0f, 103.66f)
                close()
            }
        }
        .build()
        return _phosphorLogo!!
    }

private var _phosphorLogo: ImageVector? = null
