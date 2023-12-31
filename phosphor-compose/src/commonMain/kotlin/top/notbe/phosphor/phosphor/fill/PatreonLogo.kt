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

public val FillGroup.PatreonLogo: ImageVector
    get() {
        if (_patreonLogo != null) {
            return _patreonLogo!!
        }
        _patreonLogo = Builder(name = "PatreonLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 104.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, -64.0f, -64.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, true, 240.0f, 104.0f)
                close()
                moveTo(80.0f, 40.0f)
                horizontalLineTo(64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 56.0f)
                verticalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 80.0f, 40.0f)
                close()
            }
        }
        .build()
        return _patreonLogo!!
    }

private var _patreonLogo: ImageVector? = null
