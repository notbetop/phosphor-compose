package top.notbe.phosphor.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.BoldGroup

public val BoldGroup.PatreonLogo: ImageVector
    get() {
        if (_patreonLogo != null) {
            return _patreonLogo!!
        }
        _patreonLogo = Builder(name = "PatreonLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(170.0f, 36.0f)
                arcToRelative(73.68f, 73.68f, 0.0f, false, false, -50.0f, 19.53f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 100.0f, 36.0f)
                lineTo(64.0f, 36.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 44.0f, 56.0f)
                lineTo(44.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(120.0f, 164.5f)
                arcTo(74.0f, 74.0f, 0.0f, true, false, 170.0f, 36.0f)
                close()
                moveTo(96.0f, 204.0f)
                lineTo(68.0f, 204.0f)
                lineTo(68.0f, 60.0f)
                lineTo(96.0f, 60.0f)
                close()
                moveTo(170.0f, 160.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, true, true, 50.0f, -50.0f)
                arcTo(50.06f, 50.06f, 0.0f, false, true, 170.0f, 160.0f)
                close()
            }
        }
        .build()
        return _patreonLogo!!
    }

private var _patreonLogo: ImageVector? = null
