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

public val ThinGroup.ProhibitInset: ImageVector
    get() {
        if (_prohibitInset != null) {
            return _prohibitInset!!
        }
        _prohibitInset = Builder(name = "ProhibitInset", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(162.83f, 157.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f)
                lineToRelative(-64.0f, -64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                close()
                moveTo(228.0f, 128.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, true, 128.0f, 28.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, true, 228.0f, 128.0f)
                close()
                moveTo(220.0f, 128.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, false, -92.0f, 92.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, false, 220.0f, 128.0f)
                close()
            }
        }
        .build()
        return _prohibitInset!!
    }

private var _prohibitInset: ImageVector? = null
