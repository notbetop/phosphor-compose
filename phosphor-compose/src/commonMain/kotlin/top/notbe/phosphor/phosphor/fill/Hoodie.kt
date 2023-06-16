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

public val FillGroup.Hoodie: ImageVector
    get() {
        if (_hoodie != null) {
            return _hoodie!!
        }
        _hoodie = Builder(name = "Hoodie", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.66f, 123.56f)
                lineToRelative(-56.3f, -84.44f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 169.05f, 32.0f)
                lineTo(87.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -13.31f, 7.12f)
                lineToRelative(-56.3f, 84.44f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -1.06f, 6.54f)
                lineToRelative(22.39f, 82.11f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 54.11f, 224.0f)
                lineTo(80.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(96.0f, 192.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(25.89f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.44f, -11.79f)
                lineToRelative(22.39f, -82.11f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 238.66f, 123.56f)
                close()
                moveTo(80.0f, 208.0f)
                lineTo(54.11f, 208.0f)
                lineTo(32.68f, 129.41f)
                lineTo(64.0f, 82.42f)
                lineTo(64.0f, 176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                close()
                moveTo(120.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(104.0f, 94.86f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(152.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(136.0f, 94.86f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(128.0f, 78.79f)
                lineTo(83.41f, 53.31f)
                lineTo(87.0f, 48.0f)
                horizontalLineToRelative(82.1f)
                lineToRelative(3.54f, 5.31f)
                close()
                moveTo(201.89f, 208.0f)
                lineTo(176.0f, 208.0f)
                lineTo(176.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(192.0f, 82.42f)
                lineToRelative(31.32f, 47.0f)
                close()
            }
        }
        .build()
        return _hoodie!!
    }

private var _hoodie: ImageVector? = null
