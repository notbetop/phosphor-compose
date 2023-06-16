package top.notbe.phosphor.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.ThinGroup

public val ThinGroup.NumberCircleFour: ImageVector
    get() {
        if (_numberCircleFour != null) {
            return _numberCircleFour!!
        }
        _numberCircleFour = Builder(name = "NumberCircleFour", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 92.0f, -92.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(164.0f, 144.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(148.0f, 148.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(140.0f, 148.0f)
                lineTo(96.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.79f, -5.26f)
                lineToRelative(24.0f, -72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 7.58f, 2.52f)
                lineTo(101.55f, 140.0f)
                lineTo(140.0f, 140.0f)
                lineTo(140.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(28.0f)
                horizontalLineToRelative(12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 164.0f, 144.0f)
                close()
            }
        }
        .build()
        return _numberCircleFour!!
    }

private var _numberCircleFour: ImageVector? = null
