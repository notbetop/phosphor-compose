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

public val FillGroup.BellSlash: ImageVector
    get() {
        if (_bellSlash != null) {
            return _bellSlash!!
        }
        _bellSlash = Builder(name = "BellSlash", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.94f, 34.62f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 42.1f, 45.38f)
                lineTo(58.84f, 63.8f)
                arcTo(79.49f, 79.49f, 0.0f, false, false, 48.0f, 104.0f)
                curveToRelative(0.0f, 35.34f, -8.27f, 62.38f, -13.82f, 71.94f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 200.0f)
                lineTo(88.82f, 200.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 78.39f, 0.0f)
                horizontalLineToRelative(15.45f)
                lineToRelative(19.44f, 21.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -22.63f, -16.0f)
                horizontalLineToRelative(45.25f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 128.0f, 216.0f)
                close()
                moveTo(215.29f, 178.59f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.14f, -1.41f)
                lineTo(86.58f, 46.74f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.0f, -12.34f)
                arcTo(80.0f, 80.0f, 0.0f, false, true, 208.0f, 104.0f)
                curveToRelative(0.0f, 35.35f, 8.0f, 58.59f, 10.51f, 64.88f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 215.31f, 178.59f)
                close()
            }
        }
        .build()
        return _bellSlash!!
    }

private var _bellSlash: ImageVector? = null
