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

public val BoldGroup.GitPullRequest: ImageVector
    get() {
        if (_gitPullRequest != null) {
            return _gitPullRequest!!
        }
        _gitPullRequest = Builder(name = "GitPullRequest", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 158.06f)
                verticalLineTo(123.88f)
                arcToRelative(59.61f, 59.61f, 0.0f, false, false, -17.57f, -42.42f)
                lineTo(173.0f, 60.0f)
                horizontalLineToRelative(19.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineTo(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(77.0f)
                lineToRelative(21.46f, 21.46f)
                arcTo(35.76f, 35.76f, 0.0f, false, true, 188.0f, 123.88f)
                verticalLineToRelative(34.18f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 24.0f, 0.0f)
                close()
                moveTo(200.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 200.0f, 204.0f)
                close()
                moveTo(108.0f, 64.0f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 60.0f, 97.94f)
                verticalLineToRelative(60.12f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 24.0f, 0.0f)
                verticalLineTo(97.94f)
                arcTo(36.07f, 36.07f, 0.0f, false, false, 108.0f, 64.0f)
                close()
                moveTo(72.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 72.0f, 204.0f)
                close()
                moveTo(72.0f, 76.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 84.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 72.0f, 76.0f)
                close()
            }
        }
        .build()
        return _gitPullRequest!!
    }

private var _gitPullRequest: ImageVector? = null
