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

public val ThinGroup.FramerLogo: ImageVector
    get() {
        if (_framerLogo != null) {
            return _framerLogo!!
        }
        _framerLogo = Builder(name = "FramerLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.0f, 96.0f)
                lineTo(204.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(56.0f, 28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.66f, 7.0f)
                lineToRelative(64.14f, 57.0f)
                lineTo(56.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.17f, 2.83f)
                lineToRelative(72.0f, 72.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 132.0f, 232.0f)
                lineTo(132.0f, 164.0f)
                horizontalLineToRelative(68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.66f, -7.0f)
                lineToRelative(-64.14f, -57.0f)
                lineTo(200.0f, 100.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 204.0f, 96.0f)
                close()
                moveTo(189.48f, 156.0f)
                lineTo(128.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(62.34f)
                lineToRelative(-64.0f, -64.0f)
                lineTo(60.0f, 100.0f)
                horizontalLineToRelative(66.48f)
                close()
                moveTo(196.0f, 92.0f)
                lineTo(129.52f, 92.0f)
                lineToRelative(-63.0f, -56.0f)
                lineTo(196.0f, 36.0f)
                close()
            }
        }
        .build()
        return _framerLogo!!
    }

private var _framerLogo: ImageVector? = null
