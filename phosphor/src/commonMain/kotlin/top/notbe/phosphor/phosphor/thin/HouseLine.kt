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

public val ThinGroup.HouseLine: ImageVector
    get() {
        if (_houseLine != null) {
            return _houseLine!!
        }
        _houseLine = Builder(name = "HouseLine", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 212.0f)
                horizontalLineTo(220.0f)
                verticalLineTo(115.54f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.87f, -8.82f)
                lineTo(136.07f, 31.13f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.2f, 0.05f)
                lineTo(39.93f, 106.67f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 115.54f)
                verticalLineTo(212.0f)
                horizontalLineTo(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineTo(240.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(44.0f, 115.54f)
                arcToRelative(4.09f, 4.09f, 0.0f, false, true, 1.36f, -3.0f)
                lineTo(125.3f, 37.05f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.33f, 0.0f)
                lineToRelative(80.06f, 75.58f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.31f, 3.0f)
                verticalLineTo(212.0f)
                horizontalLineTo(156.0f)
                verticalLineTo(160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineTo(112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(52.0f)
                horizontalLineTo(44.0f)
                close()
                moveTo(148.0f, 212.0f)
                horizontalLineTo(108.0f)
                verticalLineTo(160.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _houseLine!!
    }

private var _houseLine: ImageVector? = null
