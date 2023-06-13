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

public val FillGroup.HouseSimple: ImageVector
    get() {
        if (_houseSimple != null) {
            return _houseSimple!!
        }
        _houseSimple = Builder(name = "HouseSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 115.55f)
                verticalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(115.55f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 5.17f, -11.78f)
                lineToRelative(80.0f, -75.48f)
                lineToRelative(0.11f, -0.11f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 21.53f, 0.0f)
                arcToRelative(1.14f, 1.14f, 0.0f, false, false, 0.11f, 0.11f)
                lineToRelative(80.0f, 75.48f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 115.55f)
                close()
            }
        }
        .build()
        return _houseSimple!!
    }

private var _houseSimple: ImageVector? = null
