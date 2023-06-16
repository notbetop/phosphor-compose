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

public val DuotoneGroup.Boat: ImageVector
    get() {
        if (_boat != null) {
            return _boat!!
        }
        _boat = Builder(name = "Boat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 125.82f)
                verticalLineTo(160.1f)
                curveToRelative(-14.57f, 51.07f, -82.23f, 68.91f, -94.19f, 71.69f)
                arcToRelative(7.91f, 7.91f, 0.0f, false, true, -3.62f, 0.0f)
                curveTo(114.23f, 229.0f, 46.57f, 211.17f, 32.0f, 160.1f)
                verticalLineTo(125.82f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.47f, -7.6f)
                lineTo(128.0f, 88.0f)
                lineToRelative(90.53f, 30.22f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 125.82f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.06f, 110.63f)
                lineTo(208.0f, 106.27f)
                verticalLineTo(56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(136.0f)
                verticalLineTo(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineTo(40.0f)
                horizontalLineTo(64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 56.0f)
                verticalLineToRelative(50.27f)
                lineToRelative(-13.06f, 4.36f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 125.82f)
                verticalLineTo(160.1f)
                arcToRelative(7.73f, 7.73f, 0.0f, false, false, 0.31f, 2.19f)
                curveToRelative(15.72f, 55.09f, 86.12f, 74.06f, 100.07f, 77.3f)
                arcToRelative(16.19f, 16.19f, 0.0f, false, false, 7.24f, 0.0f)
                curveToRelative(13.95f, -3.24f, 84.35f, -22.21f, 100.07f, -77.3f)
                arcToRelative(7.73f, 7.73f, 0.0f, false, false, 0.31f, -2.19f)
                verticalLineTo(125.82f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 221.06f, 110.63f)
                close()
                moveTo(64.0f, 56.0f)
                horizontalLineTo(192.0f)
                verticalLineToRelative(44.93f)
                lineTo(130.53f, 80.41f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.06f, 0.0f)
                lineTo(64.0f, 100.93f)
                close()
                moveTo(216.0f, 158.94f)
                curveToRelative(-5.78f, 19.0f, -20.55f, 35.17f, -43.95f, 48.12f)
                arcTo(181.7f, 181.7f, 0.0f, false, true, 128.0f, 224.0f)
                arcToRelative(181.7f, 181.7f, 0.0f, false, true, -44.0f, -16.94f)
                curveTo(60.56f, 194.11f, 45.78f, 177.93f, 40.0f, 158.94f)
                verticalLineTo(125.81f)
                lineToRelative(80.0f, -26.7f)
                verticalLineTo(168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(99.11f)
                lineToRelative(80.0f, 26.71f)
                close()
            }
        }
        .build()
        return _boat!!
    }

private var _boat: ImageVector? = null
