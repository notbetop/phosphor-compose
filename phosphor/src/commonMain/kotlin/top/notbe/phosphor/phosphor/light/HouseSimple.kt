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

public val LightGroup.HouseSimple: ImageVector
    get() {
        if (_houseSimple != null) {
            return _houseSimple!!
        }
        _houseSimple = Builder(name = "HouseSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(217.47f, 105.23f)
                lineToRelative(-80.0f, -75.49f)
                lineToRelative(-0.09f, -0.08f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, -18.83f, 0.0f)
                lineToRelative(-0.09f, 0.08f)
                lineToRelative(-80.0f, 75.5f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 115.55f)
                verticalLineTo(208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineTo(208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                verticalLineTo(115.55f)
                arcTo(14.06f, 14.06f, 0.0f, false, false, 217.47f, 105.23f)
                close()
                moveTo(210.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(115.55f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.65f, -1.48f)
                lineToRelative(0.09f, -0.08f)
                lineToRelative(79.94f, -75.48f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.63f, 0.0f)
                lineTo(209.26f, 114.0f)
                lineToRelative(0.08f, 0.08f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.66f, 1.48f)
                close()
            }
        }
        .build()
        return _houseSimple!!
    }

private var _houseSimple: ImageVector? = null
