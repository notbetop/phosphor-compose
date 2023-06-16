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

public val FillGroup.PhosphorLogo: ImageVector
    get() {
        if (_phosphorLogo != null) {
            return _phosphorLogo!!
        }
        _phosphorLogo = Builder(name = "PhosphorLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 24.0f)
                lineTo(64.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(56.0f, 160.0f)
                arcToRelative(80.09f, 80.09f, 0.0f, false, false, 80.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(144.0f, 168.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, 0.0f, -144.0f)
                close()
                moveTo(128.0f, 223.5f)
                arcTo(64.14f, 64.14f, 0.0f, false, true, 72.51f, 168.0f)
                lineTo(128.0f, 168.0f)
                close()
                moveTo(128.0f, 129.5f)
                lineTo(77.68f, 40.0f)
                lineTo(128.0f, 40.0f)
                close()
                moveTo(144.0f, 152.0f)
                lineTo(144.0f, 40.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, 0.0f, 112.0f)
                close()
            }
        }
        .build()
        return _phosphorLogo!!
    }

private var _phosphorLogo: ImageVector? = null
