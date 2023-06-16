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

public val BoldGroup.GitBranch: ImageVector
    get() {
        if (_gitBranch != null) {
            return _gitBranch!!
        }
        _gitBranch = Builder(name = "GitBranch", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 64.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -48.0f, 33.94f)
                lineTo(180.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(96.0f, 116.0f)
                arcToRelative(35.88f, 35.88f, 0.0f, false, false, -12.0f, 2.06f)
                lineTo(84.0f, 97.94f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -24.0f, 0.0f)
                verticalLineToRelative(60.12f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 24.0f, 0.0f)
                lineTo(84.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, -36.0f)
                lineTo(204.0f, 97.94f)
                arcTo(36.07f, 36.07f, 0.0f, false, false, 228.0f, 64.0f)
                close()
                moveTo(72.0f, 52.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 60.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 72.0f, 52.0f)
                close()
                moveTo(72.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 72.0f, 204.0f)
                close()
                moveTo(192.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 192.0f, 76.0f)
                close()
            }
        }
        .build()
        return _gitBranch!!
    }

private var _gitBranch: ImageVector? = null
