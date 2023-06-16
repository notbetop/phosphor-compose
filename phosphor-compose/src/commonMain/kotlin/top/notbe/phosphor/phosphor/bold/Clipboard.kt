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

public val BoldGroup.Clipboard: ImageVector
    get() {
        if (_clipboard != null) {
            return _clipboard!!
        }
        _clipboard = Builder(name = "Clipboard", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 28.0f)
                horizontalLineTo(165.47f)
                arcToRelative(51.88f, 51.88f, 0.0f, false, false, -74.94f, 0.0f)
                horizontalLineTo(56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 36.0f, 48.0f)
                verticalLineTo(216.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 200.0f, 28.0f)
                close()
                moveTo(155.71f, 60.0f)
                horizontalLineTo(100.29f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 55.42f, 0.0f)
                close()
                moveTo(196.0f, 212.0f)
                horizontalLineTo(60.0f)
                verticalLineTo(52.0f)
                horizontalLineTo(77.41f)
                arcTo(52.13f, 52.13f, 0.0f, false, false, 76.0f, 64.0f)
                verticalLineToRelative(8.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 88.0f, 84.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(64.0f)
                arcToRelative(52.13f, 52.13f, 0.0f, false, false, -1.41f, -12.0f)
                horizontalLineTo(196.0f)
                close()
            }
        }
        .build()
        return _clipboard!!
    }

private var _clipboard: ImageVector? = null
