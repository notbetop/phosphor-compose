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

public val DuotoneGroup.FileCss: ImageVector
    get() {
        if (_fileCss != null) {
            return _fileCss!!
        }
        _fileCss = Builder(name = "FileCss", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 88.0f)
                horizontalLineTo(152.0f)
                verticalLineTo(32.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 180.0f)
                curveToRelative(0.0f, 11.0f, 7.18f, 20.0f, 16.0f, 20.0f)
                arcToRelative(14.2f, 14.2f, 0.0f, false, false, 10.22f, -4.66f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 85.77f, 206.4f)
                arcTo(30.0f, 30.0f, 0.0f, false, true, 64.0f, 216.0f)
                curveToRelative(-17.65f, 0.0f, -32.0f, -16.15f, -32.0f, -36.0f)
                reflectiveCurveToRelative(14.35f, -36.0f, 32.0f, -36.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, 21.77f, 9.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.55f, 11.06f)
                arcTo(14.24f, 14.24f, 0.0f, false, false, 64.0f, 160.0f)
                curveTo(55.18f, 160.0f, 48.0f, 169.0f, 48.0f, 180.0f)
                close()
                moveTo(127.6f, 171.31f)
                curveToRelative(-4.0f, -1.16f, -8.14f, -2.35f, -10.45f, -3.84f)
                curveToRelative(-1.26f, -0.81f, -1.23f, -1.0f, -1.12f, -1.9f)
                arcToRelative(4.54f, 4.54f, 0.0f, false, true, 2.0f, -3.67f)
                curveToRelative(4.6f, -3.12f, 15.35f, -1.73f, 19.83f, -0.56f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.07f, -15.48f)
                curveToRelative(-2.12f, -0.55f, -21.0f, -5.22f, -32.83f, 2.76f)
                arcToRelative(20.55f, 20.55f, 0.0f, false, false, -9.0f, 14.95f)
                curveToRelative(-2.0f, 15.88f, 13.64f, 20.41f, 23.0f, 23.11f)
                curveToRelative(12.07f, 3.49f, 13.13f, 4.92f, 12.78f, 7.59f)
                curveToRelative(-0.31f, 2.41f, -1.26f, 3.34f, -2.14f, 3.93f)
                curveToRelative(-4.6f, 3.06f, -15.17f, 1.56f, -19.55f, 0.36f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.3f, 15.41f)
                arcToRelative(61.23f, 61.23f, 0.0f, false, false, 15.18f, 2.0f)
                curveToRelative(5.83f, 0.0f, 12.3f, -1.0f, 17.49f, -4.46f)
                arcToRelative(20.82f, 20.82f, 0.0f, false, false, 9.19f, -15.23f)
                curveTo(154.0f, 179.0f, 137.48f, 174.17f, 127.6f, 171.31f)
                close()
                moveTo(191.6f, 171.31f)
                curveToRelative(-4.0f, -1.16f, -8.14f, -2.35f, -10.45f, -3.84f)
                curveToRelative(-1.25f, -0.81f, -1.23f, -1.0f, -1.12f, -1.9f)
                arcToRelative(4.54f, 4.54f, 0.0f, false, true, 2.0f, -3.67f)
                curveToRelative(4.6f, -3.12f, 15.34f, -1.73f, 19.82f, -0.56f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.07f, -15.48f)
                curveToRelative(-2.11f, -0.55f, -21.0f, -5.22f, -32.83f, 2.76f)
                arcToRelative(20.58f, 20.58f, 0.0f, false, false, -8.95f, 14.95f)
                curveToRelative(-2.0f, 15.88f, 13.65f, 20.41f, 23.0f, 23.11f)
                curveToRelative(12.06f, 3.49f, 13.12f, 4.92f, 12.78f, 7.59f)
                curveToRelative(-0.31f, 2.41f, -1.26f, 3.34f, -2.15f, 3.93f)
                curveToRelative(-4.6f, 3.06f, -15.16f, 1.56f, -19.54f, 0.36f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 173.93f, 214.0f)
                arcToRelative(61.34f, 61.34f, 0.0f, false, false, 15.19f, 2.0f)
                curveToRelative(5.82f, 0.0f, 12.3f, -1.0f, 17.49f, -4.46f)
                arcToRelative(20.81f, 20.81f, 0.0f, false, false, 9.18f, -15.23f)
                curveTo(218.0f, 179.0f, 201.48f, 174.17f, 191.59f, 171.31f)
                close()
                moveTo(40.0f, 112.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 24.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.66f, 2.34f)
                lineToRelative(56.0f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 88.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -16.0f, 0.0f)
                lineTo(200.0f, 96.0f)
                lineTo(152.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(144.0f, 40.0f)
                lineTo(56.0f, 40.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(160.0f, 80.0f)
                horizontalLineToRelative(28.68f)
                lineTo(160.0f, 51.31f)
                close()
            }
        }
        .build()
        return _fileCss!!
    }

private var _fileCss: ImageVector? = null
