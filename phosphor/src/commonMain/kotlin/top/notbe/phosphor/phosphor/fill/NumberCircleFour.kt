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

public val FillGroup.NumberCircleFour: ImageVector
    get() {
        if (_numberCircleFour != null) {
            return _numberCircleFour!!
        }
        _numberCircleFour = Builder(name = "NumberCircleFour", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(160.0f, 152.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(136.0f, 152.0f)
                lineTo(96.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.59f, -10.53f)
                lineToRelative(24.0f, -72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.18f, 5.06f)
                lineTo(107.1f, 136.0f)
                lineTo(136.0f, 136.0f)
                lineTo(136.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
            }
        }
        .build()
        return _numberCircleFour!!
    }

private var _numberCircleFour: ImageVector? = null
