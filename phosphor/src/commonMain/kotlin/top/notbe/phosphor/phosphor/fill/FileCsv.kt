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

public val FillGroup.FileCsv: ImageVector
    get() {
        if (_fileCsv != null) {
            return _fileCsv!!
        }
        _fileCsv = Builder(name = "FileCsv", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.65f, 82.34f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 24.0f)
                lineTo(56.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(208.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(216.0f, 88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 213.65f, 82.34f)
                close()
                moveTo(152.0f, 88.0f)
                lineTo(152.0f, 44.0f)
                lineToRelative(44.0f, 44.0f)
                close()
                moveTo(48.0f, 180.0f)
                curveToRelative(0.0f, 11.0f, 7.18f, 20.0f, 16.0f, 20.0f)
                arcToRelative(14.24f, 14.24f, 0.0f, false, false, 10.22f, -4.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 85.78f, 206.4f)
                arcTo(30.06f, 30.06f, 0.0f, false, true, 64.0f, 216.0f)
                curveToRelative(-17.64f, 0.0f, -32.0f, -16.15f, -32.0f, -36.0f)
                reflectiveCurveToRelative(14.36f, -36.0f, 32.0f, -36.0f)
                arcToRelative(30.06f, 30.06f, 0.0f, false, true, 21.78f, 9.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.56f, 11.06f)
                arcTo(14.17f, 14.17f, 0.0f, false, false, 64.0f, 160.0f)
                curveTo(55.18f, 160.0f, 48.0f, 169.0f, 48.0f, 180.0f)
                close()
                moveTo(151.81f, 196.31f)
                arcToRelative(20.82f, 20.82f, 0.0f, false, true, -9.19f, 15.23f)
                curveTo(137.43f, 215.0f, 131.0f, 216.0f, 125.13f, 216.0f)
                arcToRelative(61.34f, 61.34f, 0.0f, false, true, -15.19f, -2.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.31f, -15.41f)
                curveToRelative(4.38f, 1.2f, 14.95f, 2.7f, 19.55f, -0.36f)
                curveToRelative(0.88f, -0.59f, 1.83f, -1.52f, 2.14f, -3.93f)
                curveToRelative(0.34f, -2.67f, -0.72f, -4.1f, -12.78f, -7.59f)
                curveToRelative(-9.35f, -2.7f, -25.0f, -7.23f, -23.0f, -23.11f)
                arcToRelative(20.58f, 20.58f, 0.0f, false, true, 9.0f, -14.95f)
                curveToRelative(11.85f, -8.0f, 30.72f, -3.31f, 32.84f, -2.76f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.07f, 15.48f)
                curveToRelative(-4.49f, -1.17f, -15.23f, -2.56f, -19.83f, 0.56f)
                arcToRelative(4.57f, 4.57f, 0.0f, false, false, -2.0f, 3.67f)
                curveToRelative(-0.11f, 0.9f, -0.13f, 1.09f, 1.12f, 1.9f)
                curveToRelative(2.31f, 1.49f, 6.45f, 2.68f, 10.45f, 3.84f)
                curveTo(137.49f, 174.17f, 154.0f, 179.0f, 151.81f, 196.31f)
                close()
                moveTo(215.53f, 154.69f)
                lineTo(195.53f, 210.69f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.07f, 0.0f)
                lineToRelative(-20.0f, -56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.07f, -5.38f)
                lineTo(188.0f, 184.21f)
                lineToRelative(12.46f, -34.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.07f, 5.38f)
                close()
            }
        }
        .build()
        return _fileCsv!!
    }

private var _fileCsv: ImageVector? = null
