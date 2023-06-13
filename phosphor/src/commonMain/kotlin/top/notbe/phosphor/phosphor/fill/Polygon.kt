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

public val FillGroup.Polygon: ImageVector
    get() {
        if (_polygon != null) {
            return _polygon!!
        }
        _polygon = Builder(name = "Polygon", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.64f, 49.36f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -45.26f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, false, -5.16f, 6.76f)
                lineTo(152.0f, 48.42f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 97.37f, 25.36f)
                horizontalLineToRelative(0.0f)
                arcToRelative(32.06f, 32.06f, 0.0f, false, false, -5.76f, 37.41f)
                lineTo(57.67f, 93.32f)
                arcToRelative(32.05f, 32.05f, 0.0f, false, false, -40.31f, 4.05f)
                horizontalLineToRelative(0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 42.89f, 47.41f)
                lineToRelative(70.0f, 51.36f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 47.57f, -14.69f)
                lineToRelative(27.39f, -77.59f)
                quadToRelative(1.38f, 0.12f, 2.76f, 0.12f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 22.63f, -54.62f)
                close()
                moveTo(162.77f, 176.15f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -23.0f, 7.08f)
                lineToRelative(-70.0f, -51.36f)
                arcToRelative(32.17f, 32.17f, 0.0f, false, false, -1.34f, -26.65f)
                lineToRelative(33.95f, -30.55f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 45.47f, -10.81f)
                lineTo(176.0f, 71.56f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 14.12f, 27.0f)
                close()
            }
        }
        .build()
        return _polygon!!
    }

private var _polygon: ImageVector? = null
