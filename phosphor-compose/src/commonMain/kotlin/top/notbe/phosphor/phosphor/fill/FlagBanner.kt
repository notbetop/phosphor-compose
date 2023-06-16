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

public val FillGroup.FlagBanner: ImageVector
    get() {
        if (_flagBanner != null) {
            return _flagBanner!!
        }
        _flagBanner = Builder(name = "FlagBanner", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.22f, 59.44f)
                lineToRelative(-80.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -14.44f, -6.88f)
                lineTo(165.62f, 160.0f)
                horizontalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.88f, -13.43f)
                lineToRelative(42.56f, -46.1f)
                lineTo(26.59f, 61.9f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 32.0f, 48.0f)
                horizontalLineTo(224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.22f, 11.44f)
                close()
            }
        }
        .build()
        return _flagBanner!!
    }

private var _flagBanner: ImageVector? = null
