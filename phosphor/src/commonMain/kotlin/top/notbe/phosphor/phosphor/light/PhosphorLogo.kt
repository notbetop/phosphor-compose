package top.notbe.phosphor.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.LightGroup

public val LightGroup.PhosphorLogo: ImageVector
    get() {
        if (_phosphorLogo != null) {
            return _phosphorLogo!!
        }
        _phosphorLogo = Builder(name = "PhosphorLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 26.0f)
                lineTo(64.0f, 26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(58.0f, 160.0f)
                arcToRelative(78.09f, 78.09f, 0.0f, false, false, 78.0f, 78.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(142.0f, 166.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(70.0f, 70.0f, 0.0f, false, false, 0.0f, -140.0f)
                close()
                moveTo(70.0f, 54.91f)
                lineTo(125.74f, 154.0f)
                lineTo(70.0f, 154.0f)
                close()
                moveTo(130.0f, 137.1f)
                lineTo(74.26f, 38.0f)
                lineTo(130.0f, 38.0f)
                close()
                moveTo(70.28f, 166.0f)
                lineTo(130.0f, 166.0f)
                verticalLineToRelative(59.73f)
                arcTo(66.1f, 66.1f, 0.0f, false, true, 70.28f, 166.0f)
                close()
                moveTo(144.0f, 154.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(142.0f, 38.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, true, 0.0f, 116.0f)
                close()
            }
        }
        .build()
        return _phosphorLogo!!
    }

private var _phosphorLogo: ImageVector? = null
