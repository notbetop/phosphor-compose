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

public val FillGroup.FramerLogo: ImageVector
    get() {
        if (_framerLogo != null) {
            return _framerLogo!!
        }
        _framerLogo = Builder(name = "FramerLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 104.0f)
                horizontalLineTo(149.0f)
                lineToRelative(56.27f, 50.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 168.0f)
                horizontalLineTo(136.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.66f, 5.66f)
                lineToRelative(-72.0f, -72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 48.0f, 160.0f)
                verticalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(51.0f)
                lineTo(50.69f, 38.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 56.0f, 24.0f)
                horizontalLineTo(200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineTo(96.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 104.0f)
                close()
            }
        }
        .build()
        return _framerLogo!!
    }

private var _framerLogo: ImageVector? = null
