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

public val ThinGroup.ChartDonut: ImageVector
    get() {
        if (_chartDonut != null) {
            return _chartDonut!!
        }
        _chartDonut = Builder(name = "ChartDonut", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(137.0f, 28.05f)
                arcToRelative(11.94f, 11.94f, 0.0f, false, false, -9.12f, 3.08f)
                arcTo(12.09f, 12.09f, 0.0f, false, false, 124.0f, 40.0f)
                verticalLineTo(80.67f)
                arcToRelative(11.88f, 11.88f, 0.0f, false, false, 9.9f, 11.81f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, -41.85f, 37.4f)
                curveToRelative(-0.47f, -9.14f, 1.47f, -16.8f, 5.75f, -22.79f)
                horizontalLineToRelative(0.0f)
                arcToRelative(11.89f, 11.89f, 0.0f, false, false, -1.3f, -15.35f)
                lineTo(68.87f, 63.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.74f, 0.83f)
                arcTo(99.6f, 99.6f, 0.0f, false, false, 57.79f, 199.2f)
                arcTo(99.24f, 99.24f, 0.0f, false, false, 128.0f, 228.0f)
                horizontalLineToRelative(1.43f)
                arcTo(100.29f, 100.29f, 0.0f, false, false, 228.0f, 129.42f)
                curveTo(228.72f, 77.21f, 188.76f, 32.68f, 137.0f, 28.05f)
                close()
                moveTo(57.28f, 69.46f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 60.2f, 68.0f)
                horizontalLineToRelative(0.19f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, true, 2.79f, 1.14f)
                lineTo(90.81f, 97.36f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, true, 0.48f, 5.08f)
                arcTo(40.47f, 40.47f, 0.0f, false, false, 84.08f, 124.0f)
                horizontalLineToRelative(-48.0f)
                arcTo(90.36f, 90.36f, 0.0f, false, true, 57.28f, 69.46f)
                close()
                moveTo(36.09f, 132.0f)
                horizontalLineTo(84.18f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 124.0f, 171.81f)
                verticalLineTo(219.9f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 36.09f, 132.0f)
                close()
                moveTo(193.0f, 193.0f)
                arcToRelative(91.43f, 91.43f, 0.0f, false, true, -61.0f, 26.92f)
                verticalLineTo(171.82f)
                arcToRelative(43.51f, 43.51f, 0.0f, false, false, 26.0f, -11.63f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -22.79f, -75.6f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 132.0f, 80.67f)
                verticalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.31f, -3.0f)
                arcToRelative(3.89f, 3.89f, 0.0f, false, true, 3.0f, -1.0f)
                curveToRelative(47.59f, 4.26f, 84.34f, 45.24f, 83.67f, 93.29f)
                arcTo(91.42f, 91.42f, 0.0f, false, true, 193.0f, 193.0f)
                close()
            }
        }
        .build()
        return _chartDonut!!
    }

private var _chartDonut: ImageVector? = null
