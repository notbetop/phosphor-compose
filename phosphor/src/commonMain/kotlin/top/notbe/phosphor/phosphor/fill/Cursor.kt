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

public val FillGroup.Cursor: ImageVector
    get() {
        if (_cursor != null) {
            return _cursor!!
        }
        _cursor = Builder(name = "Cursor", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.31f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 22.63f)
                lineToRelative(-4.68f, 4.68f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.63f, 0.0f)
                lineToRelative(-55.25f, -55.24f)
                lineToRelative(-21.88f, 50.34f)
                arcTo(15.84f, 15.84f, 0.0f, false, true, 100.26f, 224.0f)
                lineToRelative(-0.78f, 0.0f)
                arcToRelative(15.82f, 15.82f, 0.0f, false, true, -14.41f, -11.0f)
                lineTo(32.8f, 52.92f)
                arcTo(15.95f, 15.95f, 0.0f, false, true, 52.92f, 32.8f)
                lineTo(213.0f, 85.07f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 1.41f, 29.8f)
                lineToRelative(-50.34f, 21.88f)
                close()
            }
        }
        .build()
        return _cursor!!
    }

private var _cursor: ImageVector? = null
