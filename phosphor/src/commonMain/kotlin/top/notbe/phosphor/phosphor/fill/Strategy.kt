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

public val FillGroup.Strategy: ImageVector
    get() {
        if (_strategy != null) {
            return _strategy!!
        }
        _strategy = Builder(name = "Strategy", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(104.0f, 188.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, -36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 104.0f, 188.0f)
                close()
                moveTo(34.34f, 117.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 0.0f)
                lineTo(60.0f, 103.31f)
                lineToRelative(14.34f, 14.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                lineTo(71.31f, 92.0f)
                lineTo(85.66f, 77.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 74.34f, 66.34f)
                lineTo(60.0f, 80.69f)
                lineTo(45.66f, 66.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 34.34f, 77.66f)
                lineTo(48.69f, 92.0f)
                lineTo(34.34f, 106.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 34.34f, 117.66f)
                close()
                moveTo(207.34f, 188.0f)
                lineTo(221.69f, 173.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f)
                lineTo(196.0f, 176.69f)
                lineToRelative(-14.34f, -14.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 11.32f)
                lineTo(184.69f, 188.0f)
                lineToRelative(-14.35f, 14.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineTo(196.0f, 199.31f)
                lineToRelative(14.34f, 14.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                close()
                moveTo(157.66f, 50.34f)
                lineTo(155.31f, 48.0f)
                lineTo(176.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(136.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(128.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(144.0f, 59.31f)
                lineToRelative(2.34f, 2.35f)
                curveToRelative(17.93f, 17.93f, 17.9f, 35.4f, 14.71f, 46.9f)
                curveToRelative(-4.64f, 16.77f, -19.36f, 31.77f, -35.0f, 35.68f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 160.0f)
                arcToRelative(8.13f, 8.13f, 0.0f, false, false, 2.0f, -0.24f)
                curveToRelative(21.21f, -5.3f, 40.35f, -24.6f, 46.53f, -46.93f)
                curveTo(182.58f, 90.78f, 175.9f, 68.59f, 157.66f, 50.34f)
                close()
            }
        }
        .build()
        return _strategy!!
    }

private var _strategy: ImageVector? = null
