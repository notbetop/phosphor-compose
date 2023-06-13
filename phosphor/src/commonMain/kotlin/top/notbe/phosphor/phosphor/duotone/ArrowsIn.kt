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

public val DuotoneGroup.ArrowsIn: ImageVector
    get() {
        if (_arrowsIn != null) {
            return _arrowsIn!!
        }
        _arrowsIn = Builder(name = "ArrowsIn", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(192.0f, 104.0f)
                lineTo(152.0f, 104.0f)
                lineTo(152.0f, 64.0f)
                close()
                moveTo(104.0f, 192.0f)
                lineTo(104.0f, 152.0f)
                lineTo(64.0f, 152.0f)
                close()
                moveTo(152.0f, 192.0f)
                lineTo(192.0f, 152.0f)
                lineTo(152.0f, 152.0f)
                close()
                moveTo(104.0f, 104.0f)
                lineTo(104.0f, 64.0f)
                lineTo(64.0f, 104.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 112.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.66f, -13.66f)
                lineTo(183.31f, 84.0f)
                lineToRelative(30.35f, -30.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f)
                lineTo(172.0f, 72.69f)
                lineTo(157.66f, 58.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 144.0f, 64.0f)
                verticalLineToRelative(40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 112.0f)
                close()
                moveTo(160.0f, 83.31f)
                lineTo(172.69f, 96.0f)
                lineTo(160.0f, 96.0f)
                close()
                moveTo(104.0f, 144.0f)
                lineTo(64.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 13.66f)
                lineTo(72.69f, 172.0f)
                lineTo(42.34f, 202.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineTo(84.0f, 183.31f)
                lineToRelative(14.34f, 14.35f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 112.0f, 192.0f)
                lineTo(112.0f, 152.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 144.0f)
                close()
                moveTo(96.0f, 172.69f)
                lineTo(83.31f, 160.0f)
                lineTo(96.0f, 160.0f)
                close()
                moveTo(183.31f, 172.0f)
                lineTo(197.66f, 157.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 192.0f, 144.0f)
                lineTo(152.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.66f, 5.66f)
                lineTo(172.0f, 183.31f)
                lineToRelative(30.34f, 30.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                close()
                moveTo(160.0f, 172.69f)
                lineTo(160.0f, 160.0f)
                horizontalLineToRelative(12.69f)
                close()
                moveTo(107.06f, 56.61f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.72f, 1.73f)
                lineTo(84.0f, 72.69f)
                lineTo(53.66f, 42.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 42.34f, 53.66f)
                lineTo(72.69f, 84.0f)
                lineTo(58.34f, 98.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 64.0f, 112.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(112.0f, 64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 107.06f, 56.61f)
                close()
                moveTo(96.0f, 96.0f)
                lineTo(83.31f, 96.0f)
                lineTo(96.0f, 83.31f)
                close()
            }
        }
        .build()
        return _arrowsIn!!
    }

private var _arrowsIn: ImageVector? = null
