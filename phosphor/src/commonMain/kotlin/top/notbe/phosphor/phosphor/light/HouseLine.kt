package top.notbe.phosphor.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.LightGroup

public val LightGroup.HouseLine: ImageVector
    get() {
        if (_houseLine != null) {
            return _houseLine!!
        }
        _houseLine = Builder(name = "HouseLine", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 210.0f)
                horizontalLineTo(222.0f)
                verticalLineTo(115.55f)
                arcToRelative(14.06f, 14.06f, 0.0f, false, false, -4.53f, -10.32f)
                lineToRelative(-80.0f, -75.49f)
                lineToRelative(-0.09f, -0.08f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, -18.83f, 0.0f)
                lineToRelative(-0.09f, 0.08f)
                lineToRelative(-80.0f, 75.5f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 115.55f)
                verticalLineTo(210.0f)
                horizontalLineTo(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineTo(240.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(46.0f, 115.55f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.65f, -1.48f)
                lineToRelative(0.09f, -0.08f)
                lineToRelative(79.94f, -75.48f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.63f, 0.0f)
                lineTo(209.26f, 114.0f)
                lineToRelative(0.08f, 0.08f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.66f, 1.48f)
                verticalLineTo(210.0f)
                horizontalLineTo(158.0f)
                verticalLineTo(160.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                horizontalLineTo(112.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 14.0f)
                verticalLineToRelative(50.0f)
                horizontalLineTo(46.0f)
                close()
                moveTo(146.0f, 210.0f)
                horizontalLineTo(110.0f)
                verticalLineTo(160.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _houseLine!!
    }

private var _houseLine: ImageVector? = null
