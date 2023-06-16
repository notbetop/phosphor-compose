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

public val ThinGroup.Bird: ImageVector
    get() {
        if (_bird != null) {
            return _bird!!
        }
        _bird = Builder(name = "Bird", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 68.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 172.0f, 68.0f)
                close()
                moveTo(116.93f, 133.44f)
                lineTo(76.93f, 181.44f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.51f, 5.63f)
                arcTo(3.94f, 3.94f, 0.0f, false, false, 80.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.07f, -1.44f)
                lineToRelative(40.0f, -48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.14f, -5.12f)
                close()
                moveTo(236.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.78f, 3.33f)
                lineTo(212.0f, 98.14f)
                lineTo(212.0f, 120.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, true, 112.0f, 220.0f)
                lineTo(8.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.12f, -6.5f)
                lineTo(100.0f, 94.6f)
                lineTo(100.0f, 76.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 209.79f, 60.39f)
                lineToRelative(24.43f, 16.28f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 236.0f, 80.0f)
                close()
                moveTo(224.79f, 80.0f)
                lineTo(204.11f, 66.22f)
                arcToRelative(4.08f, 4.08f, 0.0f, false, true, -1.65f, -2.33f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 108.0f, 76.0f)
                lineTo(108.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.88f, 2.5f)
                lineTo(16.32f, 212.0f)
                lineTo(112.0f, 212.0f)
                arcToRelative(92.1f, 92.1f, 0.0f, false, false, 92.0f, -92.0f)
                lineTo(204.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.78f, -3.33f)
                close()
            }
        }
        .build()
        return _bird!!
    }

private var _bird: ImageVector? = null
