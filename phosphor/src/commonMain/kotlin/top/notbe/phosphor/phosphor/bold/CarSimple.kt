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

public val BoldGroup.CarSimple: ImageVector
    get() {
        if (_carSimple != null) {
            return _carSimple!!
        }
        _carSimple = Builder(name = "CarSimple", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 108.0f)
                horizontalLineToRelative(-8.2f)
                lineTo(205.08f, 47.88f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 186.8f, 36.0f)
                horizontalLineTo(69.2f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 50.92f, 47.88f)
                lineTo(24.2f, 108.0f)
                horizontalLineTo(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(76.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(64.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(196.0f)
                horizontalLineToRelative(88.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(132.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(71.8f, 60.0f)
                horizontalLineTo(184.2f)
                lineToRelative(21.33f, 48.0f)
                horizontalLineTo(50.47f)
                close()
                moveTo(212.0f, 204.0f)
                horizontalLineTo(196.0f)
                verticalLineTo(184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineTo(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(20.0f)
                horizontalLineTo(44.0f)
                verticalLineTo(132.0f)
                horizontalLineTo(212.0f)
                close()
            }
        }
        .build()
        return _carSimple!!
    }

private var _carSimple: ImageVector? = null
