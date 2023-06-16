package top.notbe.phosphor.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.DuotoneGroup

public val DuotoneGroup.GitPullRequest: ImageVector
    get() {
        if (_gitPullRequest != null) {
            return _gitPullRequest!!
        }
        _gitPullRequest = Builder(name = "GitPullRequest", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(96.0f, 64.0f)
                arcTo(24.0f, 24.0f, 0.0f, true, true, 72.0f, 40.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 96.0f, 64.0f)
                close()
                moveTo(200.0f, 168.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 200.0f, 168.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(104.0f, 64.0f)
                arcTo(32.0f, 32.0f, 0.0f, true, false, 64.0f, 95.0f)
                verticalLineToRelative(66.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 16.0f, 0.0f)
                lineTo(80.0f, 95.0f)
                arcTo(32.06f, 32.06f, 0.0f, false, false, 104.0f, 64.0f)
                close()
                moveTo(56.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, true, true, 72.0f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 64.0f)
                close()
                moveTo(88.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 88.0f, 192.0f)
                close()
                moveTo(208.0f, 161.0f)
                lineTo(208.0f, 123.88f)
                arcToRelative(55.67f, 55.67f, 0.0f, false, false, -16.4f, -39.6f)
                lineTo(163.31f, 56.0f)
                lineTo(192.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(144.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(136.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(152.0f, 67.31f)
                lineTo(180.28f, 95.6f)
                arcTo(39.71f, 39.71f, 0.0f, false, true, 192.0f, 123.88f)
                lineTo(192.0f, 161.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 16.0f, 0.0f)
                close()
                moveTo(200.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 200.0f, 208.0f)
                close()
            }
        }
        .build()
        return _gitPullRequest!!
    }

private var _gitPullRequest: ImageVector? = null
