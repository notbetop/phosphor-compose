package top.notbe.phosphor.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.BoldGroup

public val BoldGroup.StarHalf: ImageVector
    get() {
        if (_starHalf != null) {
            return _starHalf!!
        }
        _starHalf = Builder(name = "StarHalf", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.13f, 117.4f)
                lineTo(231.89f, 122.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.28f, -16.52f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 217.0f, 81.58f)
                lineToRelative(8.7f, 0.75f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 11.39f, 35.07f)
                close()
                moveTo(176.25f, 138.67f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -6.35f, 19.63f)
                lineToRelative(2.86f, 12.41f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 23.39f, -5.4f)
                lineToRelative(-2.34f, -10.11f)
                lineToRelative(6.08f, -5.31f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -15.78f, -18.08f)
                close()
                moveTo(154.25f, 205.25f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.49f, 4.0f)
                lineTo(128.0f, 203.34f)
                lineTo(79.0f, 233.1f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -29.8f, -21.66f)
                lineToRelative(13.0f, -56.24f)
                lineTo(18.87f, 117.4f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 30.26f, 82.33f)
                lineToRelative(57.0f, -4.93f)
                lineToRelative(22.3f, -53.14f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 36.82f, 0.0f)
                lineToRelative(22.3f, 53.14f)
                lineToRelative(8.33f, 0.72f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 175.0f, 102.0f)
                lineToRelative(-10.77f, -0.93f)
                arcToRelative(19.92f, 19.92f, 0.0f, false, true, -16.69f, -12.19f)
                lineTo(140.0f, 71.0f)
                lineTo(140.0f, 182.55f)
                lineToRelative(10.23f, 6.21f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 154.26f, 205.25f)
                close()
                moveTo(116.0f, 182.55f)
                lineTo(116.0f, 71.0f)
                lineToRelative(-7.51f, 17.89f)
                arcTo(19.92f, 19.92f, 0.0f, false, true, 91.8f, 101.1f)
                lineToRelative(-50.14f, 4.34f)
                lineToRelative(38.09f, 33.23f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 86.1f, 158.3f)
                lineTo(74.71f, 207.62f)
                close()
                moveTo(205.39f, 205.31f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -23.7f, 2.57f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.92f, 20.83f)
                lineTo(177.0f, 233.1f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 29.8f, -21.66f)
                close()
            }
        }
        .build()
        return _starHalf!!
    }

private var _starHalf: ImageVector? = null
