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

public val ThinGroup.PatreonLogo: ImageVector
    get() {
        if (_patreonLogo != null) {
            return _patreonLogo!!
        }
        _patreonLogo = Builder(name = "PatreonLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 44.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, false, 60.0f, 60.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 176.0f, 44.0f)
                close()
                moveTo(176.0f, 156.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, true, 52.0f, -52.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, true, 176.0f, 156.0f)
                close()
                moveTo(80.0f, 44.0f)
                lineTo(64.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 52.0f, 56.0f)
                lineTo(52.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(80.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(92.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 80.0f, 44.0f)
                close()
                moveTo(84.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(64.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(60.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(80.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _patreonLogo!!
    }

private var _patreonLogo: ImageVector? = null
