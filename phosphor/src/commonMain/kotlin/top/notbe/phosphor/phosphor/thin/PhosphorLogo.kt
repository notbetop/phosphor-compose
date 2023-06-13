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

public val ThinGroup.PhosphorLogo: ImageVector
    get() {
        if (_phosphorLogo != null) {
            return _phosphorLogo!!
        }
        _phosphorLogo = Builder(name = "PhosphorLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 28.0f)
                lineTo(64.0f, 28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(60.0f, 160.0f)
                arcToRelative(76.08f, 76.08f, 0.0f, false, false, 76.0f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(140.0f, 164.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, 0.0f, -136.0f)
                close()
                moveTo(68.0f, 47.27f)
                lineTo(129.16f, 156.0f)
                lineTo(68.0f, 156.0f)
                close()
                moveTo(132.0f, 144.73f)
                lineTo(70.84f, 36.0f)
                lineTo(132.0f, 36.0f)
                close()
                moveTo(68.13f, 164.0f)
                lineTo(132.0f, 164.0f)
                verticalLineToRelative(63.88f)
                arcTo(68.1f, 68.1f, 0.0f, false, true, 68.13f, 164.0f)
                close()
                moveTo(144.0f, 156.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(140.0f, 36.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, 0.0f, 120.0f)
                close()
            }
        }
        .build()
        return _phosphorLogo!!
    }

private var _phosphorLogo: ImageVector? = null
