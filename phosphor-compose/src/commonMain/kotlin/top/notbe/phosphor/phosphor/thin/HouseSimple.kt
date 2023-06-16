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

public val ThinGroup.HouseSimple: ImageVector
    get() {
        if (_houseSimple != null) {
            return _houseSimple!!
        }
        _houseSimple = Builder(name = "HouseSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.13f, 106.72f)
                lineToRelative(-80.0f, -75.54f)
                lineToRelative(-0.05f, -0.05f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.2f, 0.05f)
                lineTo(39.93f, 106.67f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 115.54f)
                verticalLineTo(208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineTo(208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(115.54f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.13f, 106.72f)
                close()
                moveTo(212.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(115.54f)
                arcToRelative(4.09f, 4.09f, 0.0f, false, true, 1.36f, -3.0f)
                lineTo(125.3f, 37.05f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.36f, 0.0f)
                lineToRelative(80.0f, 75.55f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.31f, 3.0f)
                close()
            }
        }
        .build()
        return _houseSimple!!
    }

private var _houseSimple: ImageVector? = null
