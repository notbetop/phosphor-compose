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

public val BoldGroup.ArrowBendDoubleUpRight: ImageVector
    get() {
        if (_arrowBendDoubleUpRight != null) {
            return _arrowBendDoubleUpRight!!
        }
        _arrowBendDoubleUpRight = Builder(name = "ArrowBendDoubleUpRight", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.49f, 112.49f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineTo(207.0f, 104.0f)
                lineTo(167.51f, 64.48f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineToRelative(48.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 232.49f, 112.49f)
                close()
                moveTo(176.49f, 95.49f)
                lineTo(128.49f, 47.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -17.0f, 17.0f)
                lineTo(139.0f, 92.0f)
                lineTo(128.0f, 92.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 20.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                arcToRelative(84.09f, 84.09f, 0.0f, false, true, 84.0f, -84.0f)
                horizontalLineToRelative(11.0f)
                lineToRelative(-27.52f, 27.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f)
                lineToRelative(48.0f, -48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 176.49f, 95.51f)
                close()
            }
        }
        .build()
        return _arrowBendDoubleUpRight!!
    }

private var _arrowBendDoubleUpRight: ImageVector? = null
