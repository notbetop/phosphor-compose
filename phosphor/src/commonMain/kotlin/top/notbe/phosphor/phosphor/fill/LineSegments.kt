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

public val FillGroup.LineSegments: ImageVector
    get() {
        if (_lineSegments != null) {
            return _lineSegments!!
        }
        _lineSegments = Builder(name = "LineSegments", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.64f, 78.62f)
                arcTo(31.9f, 31.9f, 0.0f, false, true, 216.0f, 88.0f)
                arcToRelative(32.33f, 32.33f, 0.0f, false, true, -7.64f, -0.92f)
                lineToRelative(-26.63f, 49.46f)
                curveToRelative(0.3f, 0.28f, 0.6f, 0.56f, 0.89f, 0.85f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -50.2f, 6.38f)
                lineToRelative(-20.18f, -20.18f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 96.0f, 128.0f)
                arcToRelative(32.4f, 32.4f, 0.0f, false, true, -7.65f, -0.91f)
                lineTo(61.72f, 176.53f)
                curveToRelative(0.3f, 0.28f, 0.61f, 0.56f, 0.9f, 0.85f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -45.26f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 30.27f, -8.44f)
                lineToRelative(26.63f, -49.46f)
                curveToRelative(-0.3f, -0.28f, -0.6f, -0.56f, -0.89f, -0.85f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 0.0f, -45.26f)
                horizontalLineToRelative(0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 50.2f, 38.89f)
                lineToRelative(20.18f, 20.18f)
                arcToRelative(32.19f, 32.19f, 0.0f, false, true, 23.9f, -3.5f)
                lineToRelative(26.63f, -49.46f)
                curveToRelative(-0.3f, -0.28f, -0.61f, -0.56f, -0.9f, -0.85f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 0.0f, -45.26f)
                horizontalLineToRelative(0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 45.26f, 45.26f)
                close()
            }
        }
        .build()
        return _lineSegments!!
    }

private var _lineSegments: ImageVector? = null
