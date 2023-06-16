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

public val DuotoneGroup.PenNib: ImageVector
    get() {
        if (_penNib != null) {
            return _penNib!!
        }
        _penNib = Builder(name = "PenNib", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(120.0f, 56.0f)
                lineTo(60.32f, 78.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.08f, 6.17f)
                lineTo(32.0f, 224.0f)
                lineToRelative(139.45f, -23.24f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.17f, -5.08f)
                lineTo(200.0f, 136.0f)
                close()
                moveTo(116.0f, 160.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 116.0f, 160.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 100.68f)
                arcToRelative(15.86f, 15.86f, 0.0f, false, false, -4.69f, -11.31f)
                lineTo(166.63f, 20.68f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.63f, 0.0f)
                lineTo(115.57f, 49.11f)
                lineToRelative(-58.0f, 21.77f)
                arcTo(16.06f, 16.06f, 0.0f, false, false, 47.35f, 83.23f)
                lineTo(24.11f, 222.68f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 32.0f, 232.0f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, 1.32f, -0.11f)
                lineToRelative(139.44f, -23.24f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 12.35f, -10.17f)
                lineToRelative(21.77f, -58.0f)
                lineTo(235.31f, 112.0f)
                arcTo(15.87f, 15.87f, 0.0f, false, false, 240.0f, 100.68f)
                close()
                moveTo(170.13f, 192.87f)
                lineTo(55.32f, 212.0f)
                lineToRelative(47.37f, -47.37f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -11.32f, -11.32f)
                lineTo(44.0f, 200.7f)
                lineTo(63.13f, 85.86f)
                lineTo(118.0f, 65.29f)
                lineTo(190.7f, 138.0f)
                close()
                moveTo(104.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 104.0f, 140.0f)
                close()
                moveTo(200.0f, 124.68f)
                lineTo(131.31f, 56.0f)
                lineToRelative(24.0f, -24.0f)
                lineTo(224.0f, 100.68f)
                close()
            }
        }
        .build()
        return _penNib!!
    }

private var _penNib: ImageVector? = null
