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

public val FillGroup.CellSignalX: ImageVector
    get() {
        if (_cellSignalX != null) {
            return _cellSignalX!!
        }
        _cellSignalX = Builder(name = "CellSignalX", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(147.21f, 173.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.66f)
                lineTo(143.0f, 183.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -4.66f, 27.31f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.64f, 5.66f)
                lineTo(32.0f, 215.97f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -15.06f, -10.59f)
                arcToRelative(16.38f, 16.38f, 0.0f, false, true, 4.07f, -17.0f)
                lineTo(180.68f, 28.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 18.13f, -3.16f)
                arcTo(16.41f, 16.41f, 0.0f, false, true, 208.0f, 40.46f)
                verticalLineToRelative(83.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.46f, 4.0f)
                arcTo(23.92f, 23.92f, 0.0f, false, false, 191.0f, 135.0f)
                lineToRelative(-4.2f, 4.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                lineTo(177.0f, 135.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -33.62f, -0.33f)
                curveToRelative(-9.69f, 9.33f, -9.46f, 25.14f, 0.0f, 34.65f)
                close()
                moveTo(195.31f, 176.0f)
                lineTo(213.66f, 157.65f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.31f)
                lineTo(184.0f, 164.68f)
                lineToRelative(-18.35f, -18.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, 11.31f)
                lineTo(172.68f, 176.0f)
                lineToRelative(-18.35f, 18.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.31f, 11.32f)
                lineTo(184.0f, 187.31f)
                lineToRelative(18.35f, 18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                close()
            }
        }
        .build()
        return _cellSignalX!!
    }

private var _cellSignalX: ImageVector? = null
