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

public val DuotoneGroup.ArrowsInSimple: ImageVector
    get() {
        if (_arrowsInSimple != null) {
            return _arrowsInSimple!!
        }
        _arrowsInSimple = Builder(name = "ArrowsInSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(192.0f, 112.0f)
                lineTo(144.0f, 112.0f)
                lineTo(144.0f, 64.0f)
                close()
                moveTo(112.0f, 192.0f)
                lineTo(112.0f, 144.0f)
                lineTo(64.0f, 144.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.66f, 42.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f)
                lineTo(168.0f, 76.69f)
                lineTo(149.66f, 58.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 136.0f, 64.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.66f, -13.66f)
                lineTo(179.31f, 88.0f)
                lineToRelative(34.35f, -34.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 213.66f, 42.34f)
                close()
                moveTo(152.0f, 104.0f)
                lineTo(152.0f, 83.31f)
                lineTo(172.69f, 104.0f)
                close()
                moveTo(112.0f, 136.0f)
                lineTo(64.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 13.66f)
                lineTo(76.69f, 168.0f)
                lineTo(42.34f, 202.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineTo(88.0f, 179.31f)
                lineToRelative(18.34f, 18.35f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 120.0f, 192.0f)
                lineTo(120.0f, 144.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 112.0f, 136.0f)
                close()
                moveTo(104.0f, 172.69f)
                lineTo(83.31f, 152.0f)
                lineTo(104.0f, 152.0f)
                close()
            }
        }
        .build()
        return _arrowsInSimple!!
    }

private var _arrowsInSimple: ImageVector? = null
