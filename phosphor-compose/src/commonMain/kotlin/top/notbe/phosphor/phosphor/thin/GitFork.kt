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

public val ThinGroup.GitFork: ImageVector
    get() {
        if (_gitFork != null) {
            return _gitFork!!
        }
        _gitFork = Builder(name = "GitFork", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 64.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -32.0f, 27.71f)
                verticalLineTo(104.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                horizontalLineTo(88.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                verticalLineTo(91.71f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -8.0f, 0.0f)
                verticalLineTo(104.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, 28.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(32.29f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 8.0f, 0.0f)
                verticalLineTo(132.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, -28.0f)
                verticalLineTo(91.71f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 220.0f, 64.0f)
                close()
                moveTo(44.0f, 64.0f)
                arcTo(20.0f, 20.0f, 0.0f, true, true, 64.0f, 84.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 44.0f, 64.0f)
                close()
                moveTo(148.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 148.0f, 192.0f)
                close()
                moveTo(192.0f, 84.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 192.0f, 84.0f)
                close()
            }
        }
        .build()
        return _gitFork!!
    }

private var _gitFork: ImageVector? = null
