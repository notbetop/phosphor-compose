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

public val FillGroup.Spiral: ImageVector
    get() {
        if (_spiral != null) {
            return _spiral!!
        }
        _spiral = Builder(name = "Spiral", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 132.0f)
                arcToRelative(103.63f, 103.63f, 0.0f, false, true, -27.36f, 70.23f)
                curveToRelative(-3.26f, 3.55f, -8.92f, -0.59f, -6.43f, -4.71f)
                arcTo(95.41f, 95.41f, 0.0f, false, false, 212.0f, 148.0f)
                arcToRelative(80.1f, 80.1f, 0.0f, false, false, -80.0f, -80.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, -64.0f, 64.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, false, 48.0f, 48.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                arcToRelative(7.38f, 7.38f, 0.0f, false, false, 0.0f, -0.82f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 132.67f, 132.0f)
                arcTo(8.23f, 8.23f, 0.0f, false, false, 124.0f, 139.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.6f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, -32.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, true, 48.0f, -48.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, true, 64.0f, 64.0f)
                arcToRelative(80.1f, 80.1f, 0.0f, false, true, -80.0f, 80.0f)
                curveToRelative(-74.16f, 0.0f, -92.77f, -68.55f, -92.0f, -98.81f)
                curveTo(25.5f, 73.73f, 70.94f, 28.84f, 126.41f, 28.0f)
                arcTo(104.12f, 104.12f, 0.0f, false, true, 232.0f, 132.0f)
                close()
            }
        }
        .build()
        return _spiral!!
    }

private var _spiral: ImageVector? = null
