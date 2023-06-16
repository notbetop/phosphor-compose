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

public val FillGroup.LineSegment: ImageVector
    get() {
        if (_lineSegment != null) {
            return _lineSegment!!
        }
        _lineSegment = Builder(name = "LineSegment", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.64f, 86.62f)
                arcToRelative(32.07f, 32.07f, 0.0f, false, true, -38.89f, 4.94f)
                lineTo(91.56f, 175.75f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -50.2f, -6.37f)
                horizontalLineToRelative(0.0f)
                arcToRelative(32.06f, 32.06f, 0.0f, false, true, 38.89f, -4.94f)
                lineToRelative(84.19f, -84.19f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 50.2f, 6.37f)
                close()
            }
        }
        .build()
        return _lineSegment!!
    }

private var _lineSegment: ImageVector? = null
