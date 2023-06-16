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

public val FillGroup.Keyhole: ImageVector
    get() {
        if (_keyhole != null) {
            return _keyhole!!
        }
        _keyhole = Builder(name = "Keyhole", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 88.0f, -88.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 128.0f, 216.0f)
                close()
                moveTo(150.58f, 136.0f)
                lineTo(163.14f, 167.55f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 152.0f, 184.0f)
                lineTo(104.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.14f, -16.44f)
                lineTo(105.42f, 136.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 45.16f, 0.0f)
                close()
            }
        }
        .build()
        return _keyhole!!
    }

private var _keyhole: ImageVector? = null
