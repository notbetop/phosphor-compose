package top.notbe.phosphor.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.RegularGroup

public val RegularGroup.Cactus: ImageVector
    get() {
        if (_cactus != null) {
            return _cactus!!
        }
        _cactus = Builder(name = "Cactus", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 208.0f)
                horizontalLineTo(168.0f)
                verticalLineTo(184.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(68.07f, 68.07f, 0.0f, false, false, 68.0f, -68.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -56.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(56.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -80.0f, 0.0f)
                verticalLineTo(88.0f)
                horizontalLineTo(84.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 72.0f, 76.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -56.0f, 0.0f)
                arcToRelative(68.07f, 68.07f, 0.0f, false, false, 68.0f, 68.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(64.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(96.0f, 128.0f)
                horizontalLineTo(84.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, true, 32.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, 28.0f)
                horizontalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineTo(56.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 48.0f, 0.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, -28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, true, -52.0f, 52.0f)
                horizontalLineTo(160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(32.0f)
                horizontalLineTo(104.0f)
                verticalLineTo(136.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 96.0f, 128.0f)
                close()
            }
        }
        .build()
        return _cactus!!
    }

private var _cactus: ImageVector? = null
