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

public val FillGroup.Truck: ImageVector
    get() {
        if (_truck != null) {
            return _truck!!
        }
        _truck = Builder(name = "Truck", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(247.43f, 117.0f)
                lineToRelative(-14.0f, -35.0f)
                arcTo(15.93f, 15.93f, 0.0f, false, false, 218.58f, 72.0f)
                lineTo(184.0f, 72.0f)
                lineTo(184.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(24.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 8.0f, 72.0f)
                lineTo(8.0f, 184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(41.0f, 200.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 62.0f, 0.0f)
                horizontalLineToRelative(50.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 62.0f, 0.0f)
                horizontalLineToRelative(17.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(248.0f, 120.0f)
                arcTo(8.13f, 8.13f, 0.0f, false, false, 247.43f, 117.0f)
                close()
                moveTo(72.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 72.0f, 208.0f)
                close()
                moveTo(24.0f, 136.0f)
                lineTo(24.0f, 72.0f)
                lineTo(168.0f, 72.0f)
                verticalLineToRelative(64.0f)
                close()
                moveTo(184.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 184.0f, 208.0f)
                close()
                moveTo(184.0f, 112.0f)
                lineTo(184.0f, 88.0f)
                horizontalLineToRelative(34.58f)
                lineToRelative(9.6f, 24.0f)
                close()
            }
        }
        .build()
        return _truck!!
    }

private var _truck: ImageVector? = null
