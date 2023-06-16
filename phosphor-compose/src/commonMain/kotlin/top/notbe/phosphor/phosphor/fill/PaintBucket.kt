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

public val FillGroup.PaintBucket: ImageVector
    get() {
        if (_paintBucket != null) {
            return _paintBucket!!
        }
        _paintBucket = Builder(name = "PaintBucket", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 204.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -56.0f, 0.0f)
                curveToRelative(0.0f, -23.57f, 22.06f, -41.49f, 23.0f, -42.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.0f, 0.0f)
                curveTo(233.94f, 162.51f, 256.0f, 180.43f, 256.0f, 204.0f)
                close()
                moveTo(132.49f, 124.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -17.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 132.49f, 124.49f)
                close()
                moveTo(229.66f, 117.83f)
                lineTo(122.17f, 10.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, 0.0f)
                lineTo(70.25f, 51.0f)
                lineToRelative(40.43f, 40.42f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -11.31f, 11.32f)
                lineTo(58.94f, 62.26f)
                lineTo(15.0f, 106.17f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, 33.94f)
                lineTo(99.89f, 225.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 33.94f, 0.0f)
                lineToRelative(95.83f, -95.83f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 229.66f, 117.83f)
                close()
                moveTo(45.66f, 26.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 34.34f, 37.66f)
                lineToRelative(24.6f, 24.6f)
                lineTo(70.25f, 51.0f)
                close()
            }
        }
        .build()
        return _paintBucket!!
    }

private var _paintBucket: ImageVector? = null
