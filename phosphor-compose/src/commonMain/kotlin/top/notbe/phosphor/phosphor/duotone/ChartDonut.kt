package top.notbe.phosphor.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.DuotoneGroup

public val DuotoneGroup.ChartDonut: ImageVector
    get() {
        if (_chartDonut != null) {
            return _chartDonut!!
        }
        _chartDonut = Builder(name = "ChartDonut", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 129.37f)
                curveToRelative(-0.72f, 51.7f, -42.92f, 93.9f, -94.62f, 94.62f)
                horizontalLineTo(128.0f)
                verticalLineTo(168.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 6.55f, -79.47f)
                arcTo(7.92f, 7.92f, 0.0f, false, true, 128.0f, 80.67f)
                verticalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.67f, -8.0f)
                curveTo(186.07f, 36.46f, 224.7f, 78.65f, 224.0f, 129.37f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(137.39f, 24.06f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 120.0f, 40.0f)
                lineTo(120.0f, 80.67f)
                arcToRelative(15.86f, 15.86f, 0.0f, false, false, 13.25f, 15.76f)
                arcTo(32.0f, 32.0f, 0.0f, true, true, 96.0f, 129.68f)
                curveToRelative(-0.41f, -8.22f, 1.27f, -15.0f, 5.0f, -20.26f)
                horizontalLineToRelative(0.0f)
                arcToRelative(15.86f, 15.86f, 0.0f, false, false, -1.69f, -20.47f)
                lineTo(71.69f, 60.68f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -23.63f, 1.1f)
                arcTo(103.6f, 103.6f, 0.0f, false, false, 55.0f, 202.05f)
                arcTo(103.24f, 103.24f, 0.0f, false, false, 128.0f, 232.0f)
                horizontalLineToRelative(1.49f)
                arcTo(104.3f, 104.3f, 0.0f, false, false, 232.0f, 129.48f)
                curveTo(232.75f, 75.18f, 191.19f, 28.88f, 137.39f, 24.06f)
                close()
                moveTo(60.32f, 71.94f)
                lineToRelative(27.61f, 28.19f)
                lineToRelative(0.0f, 0.06f)
                arcTo(43.29f, 43.29f, 0.0f, false, false, 80.44f, 120.0f)
                lineTo(40.36f, 120.0f)
                arcTo(87.13f, 87.13f, 0.0f, false, true, 60.32f, 71.94f)
                close()
                moveTo(40.37f, 136.0f)
                horizontalLineToRelative(40.3f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 120.0f, 175.34f)
                verticalLineToRelative(40.3f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 40.37f, 136.0f)
                close()
                moveTo(190.14f, 190.14f)
                arcTo(87.45f, 87.45f, 0.0f, false, true, 136.0f, 215.61f)
                lineTo(136.0f, 175.34f)
                arcToRelative(47.59f, 47.59f, 0.0f, false, false, 24.73f, -12.23f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 136.0f, 80.66f)
                lineTo(136.0f, 40.0f)
                curveToRelative(45.52f, 4.08f, 80.67f, 43.28f, 80.0f, 89.25f)
                arcTo(87.45f, 87.45f, 0.0f, false, true, 190.14f, 190.14f)
                close()
            }
        }
        .build()
        return _chartDonut!!
    }

private var _chartDonut: ImageVector? = null
