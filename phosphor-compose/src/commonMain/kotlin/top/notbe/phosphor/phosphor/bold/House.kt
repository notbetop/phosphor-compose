package top.notbe.phosphor.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.BoldGroup

public val BoldGroup.House: ImageVector
    get() {
        if (_house != null) {
            return _house!!
        }
        _house = Builder(name = "House", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.56f, 100.85f)
                lineTo(141.61f, 25.38f)
                lineToRelative(-0.16f, -0.15f)
                arcToRelative(19.93f, 19.93f, 0.0f, false, false, -26.91f, 0.0f)
                lineToRelative(-0.17f, 0.15f)
                lineTo(34.44f, 100.85f)
                arcTo(20.07f, 20.07f, 0.0f, false, false, 28.0f, 115.55f)
                verticalLineTo(208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(96.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(164.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(115.55f)
                arcTo(20.07f, 20.07f, 0.0f, false, false, 221.56f, 100.85f)
                close()
                moveTo(204.0f, 204.0f)
                horizontalLineTo(164.0f)
                verticalLineTo(160.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                horizontalLineTo(112.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(44.0f)
                horizontalLineTo(52.0f)
                verticalLineTo(117.28f)
                lineToRelative(76.0f, -71.75f)
                lineToRelative(76.0f, 71.75f)
                close()
            }
        }
        .build()
        return _house!!
    }

private var _house: ImageVector? = null
