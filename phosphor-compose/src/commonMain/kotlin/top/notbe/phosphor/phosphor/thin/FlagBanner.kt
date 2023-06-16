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

public val ThinGroup.FlagBanner: ImageVector
    get() {
        if (_flagBanner != null) {
            return _flagBanner!!
        }
        _flagBanner = Builder(name = "FlagBanner", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.38f, 53.86f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 224.0f, 52.0f)
                horizontalLineTo(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.7f, 7.0f)
                lineToRelative(45.0f, 41.29f)
                lineTo(29.06f, 149.29f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 32.0f, 156.0f)
                horizontalLineTo(172.0f)
                lineToRelative(-31.56f, 66.28f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.89f, 5.33f)
                arcTo(3.92f, 3.92f, 0.0f, false, false, 144.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.61f, -2.28f)
                lineToRelative(80.0f, -168.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 227.38f, 53.86f)
                close()
                moveTo(175.76f, 148.0f)
                horizontalLineTo(41.14f)
                lineToRelative(41.8f, -45.29f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.24f, -5.66f)
                lineTo(42.28f, 60.0f)
                horizontalLineTo(217.67f)
                close()
            }
        }
        .build()
        return _flagBanner!!
    }

private var _flagBanner: ImageVector? = null
