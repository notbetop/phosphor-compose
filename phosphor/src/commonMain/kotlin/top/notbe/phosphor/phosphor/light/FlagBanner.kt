package top.notbe.phosphor.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.LightGroup

public val LightGroup.FlagBanner: ImageVector
    get() {
        if (_flagBanner != null) {
            return _flagBanner!!
        }
        _flagBanner = Builder(name = "FlagBanner", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.07f, 52.8f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 50.0f)
                horizontalLineTo(32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 28.0f, 60.42f)
                lineToRelative(43.56f, 39.93f)
                lineTo(27.59f, 147.93f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 32.0f, 158.0f)
                horizontalLineTo(168.78f)
                lineToRelative(-30.2f, 63.42f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.84f, 5.16f)
                lineToRelative(80.0f, -168.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 229.07f, 52.8f)
                close()
                moveTo(174.5f, 146.0f)
                horizontalLineTo(45.7f)
                lineToRelative(38.71f, -41.93f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.36f, -8.49f)
                lineTo(47.43f, 62.0f)
                horizontalLineTo(214.5f)
                close()
            }
        }
        .build()
        return _flagBanner!!
    }

private var _flagBanner: ImageVector? = null
