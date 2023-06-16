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

public val FillGroup.BookOpen: ImageVector
    get() {
        if (_bookOpen != null) {
            return _bookOpen!!
        }
        _bookOpen = Builder(name = "BookOpen", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 64.0f)
                verticalLineTo(192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(160.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, -24.0f)
                horizontalLineTo(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 32.0f, 48.0f)
                horizontalLineTo(88.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, 32.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(80.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, -32.0f)
                horizontalLineToRelative(56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 240.0f, 64.0f)
                close()
            }
        }
        .build()
        return _bookOpen!!
    }

private var _bookOpen: ImageVector? = null
