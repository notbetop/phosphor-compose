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

public val FillGroup.Armchair: ImageVector
    get() {
        if (_armchair != null) {
            return _armchair!!
        }
        _armchair = Builder(name = "Armchair", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(40.0f, 84.11f)
                verticalLineTo(72.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 80.0f, 32.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 40.0f, 40.0f)
                verticalLineTo(84.11f)
                arcTo(3.92f, 3.92f, 0.0f, false, true, 212.0f, 88.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(44.07f, 44.07f, 0.0f, false, false, -43.26f, 36.0f)
                horizontalLineTo(87.26f)
                arcTo(44.07f, 44.07f, 0.0f, false, false, 44.0f, 88.0f)
                horizontalLineToRelative(0.0f)
                arcTo(3.92f, 3.92f, 0.0f, false, true, 40.0f, 84.11f)
                close()
                moveTo(212.0f, 104.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -28.0f, 28.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(140.0f)
                horizontalLineTo(88.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(132.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -32.0f, 27.71f)
                verticalLineTo(200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(159.71f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 212.0f, 104.0f)
                close()
            }
        }
        .build()
        return _armchair!!
    }

private var _armchair: ImageVector? = null
