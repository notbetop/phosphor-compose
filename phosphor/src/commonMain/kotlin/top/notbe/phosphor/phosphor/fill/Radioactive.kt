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

public val FillGroup.Radioactive: ImageVector
    get() {
        if (_radioactive != null) {
            return _radioactive!!
        }
        _radioactive = Builder(name = "Radioactive", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 116.0f, 128.0f)
                close()
                moveTo(97.66f, 133.65f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 100.0f, 128.0f)
                arcToRelative(28.11f, 28.11f, 0.0f, false, true, 13.83f, -24.15f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 116.7f, 93.0f)
                lineTo(90.75f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -23.1f, -5.07f)
                arcToRelative(103.83f, 103.83f, 0.0f, false, false, -43.58f, 75.49f)
                arcToRelative(16.21f, 16.21f, 0.0f, false, false, 4.17f, 12.37f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 136.0f)
                lineTo(92.0f, 136.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 97.66f, 133.65f)
                close()
                moveTo(152.93f, 155.18f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 142.0f, 152.26f)
                arcToRelative(28.05f, 28.05f, 0.0f, false, true, -28.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.93f, 2.93f)
                lineTo(77.25f, 199.91f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 7.12f, 22.52f)
                arcToRelative(104.24f, 104.24f, 0.0f, false, false, 87.26f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 7.12f, -22.52f)
                close()
                moveTo(231.93f, 118.42f)
                arcToRelative(103.83f, 103.83f, 0.0f, false, false, -43.58f, -75.49f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 165.25f, 48.0f)
                lineTo(139.3f, 93.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.87f, 10.9f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 156.0f, 126.54f)
                curveToRelative(0.0f, 0.48f, 0.0f, 1.0f, 0.0f, 1.44f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineToRelative(52.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 11.76f, -5.21f)
                arcTo(16.21f, 16.21f, 0.0f, false, false, 231.93f, 118.42f)
                close()
            }
        }
        .build()
        return _radioactive!!
    }

private var _radioactive: ImageVector? = null
