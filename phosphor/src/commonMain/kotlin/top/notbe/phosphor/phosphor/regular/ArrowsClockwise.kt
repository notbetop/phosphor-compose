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

public val RegularGroup.ArrowsClockwise: ImageVector
    get() {
        if (_arrowsClockwise != null) {
            return _arrowsClockwise!!
        }
        _arrowsClockwise = Builder(name = "ArrowsClockwise", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(197.67f, 186.37f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.29f)
                curveTo(196.58f, 198.73f, 170.82f, 224.0f, 128.0f, 224.0f)
                curveToRelative(-37.39f, 0.0f, -64.53f, -22.4f, -80.0f, -39.85f)
                verticalLineTo(208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(55.44f)
                curveTo(67.76f, 183.35f, 93.0f, 208.0f, 128.0f, 208.0f)
                curveToRelative(36.0f, 0.0f, 58.14f, -21.46f, 58.36f, -21.68f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 197.67f, 186.37f)
                close()
                moveTo(216.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineTo(71.85f)
                curveTo(192.53f, 54.4f, 165.39f, 32.0f, 128.0f, 32.0f)
                curveTo(85.18f, 32.0f, 59.42f, 57.27f, 58.34f, 58.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.3f, 11.34f)
                curveTo(69.86f, 69.46f, 92.0f, 48.0f, 128.0f, 48.0f)
                curveToRelative(35.0f, 0.0f, 60.24f, 24.65f, 72.56f, 40.0f)
                horizontalLineTo(168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineTo(48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 40.0f)
                close()
            }
        }
        .build()
        return _arrowsClockwise!!
    }

private var _arrowsClockwise: ImageVector? = null
