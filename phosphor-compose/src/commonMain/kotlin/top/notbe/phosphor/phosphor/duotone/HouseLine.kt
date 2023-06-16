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

public val DuotoneGroup.HouseLine: ImageVector
    get() {
        if (_houseLine != null) {
            return _houseLine!!
        }
        _houseLine = Builder(name = "HouseLine", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 115.54f)
                verticalLineTo(216.0f)
                horizontalLineTo(152.0f)
                verticalLineTo(160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                horizontalLineTo(112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(56.0f)
                horizontalLineTo(40.0f)
                verticalLineTo(115.54f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.62f, -5.92f)
                lineToRelative(80.0f, -75.54f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.77f, 0.0f)
                lineToRelative(80.0f, 75.54f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 115.54f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 208.0f)
                horizontalLineTo(224.0f)
                verticalLineTo(115.55f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -5.17f, -11.78f)
                lineToRelative(-80.0f, -75.48f)
                arcToRelative(1.14f, 1.14f, 0.0f, false, true, -0.11f, -0.11f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -21.53f, 0.0f)
                lineToRelative(-0.11f, 0.11f)
                lineTo(37.17f, 103.77f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 115.55f)
                verticalLineTo(208.0f)
                horizontalLineTo(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineTo(240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(48.0f, 115.55f)
                lineToRelative(0.11f, -0.1f)
                lineTo(128.0f, 40.0f)
                lineToRelative(79.9f, 75.43f)
                lineToRelative(0.11f, 0.1f)
                verticalLineTo(208.0f)
                horizontalLineTo(160.0f)
                verticalLineTo(160.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(48.0f)
                horizontalLineTo(48.0f)
                close()
                moveTo(144.0f, 208.0f)
                horizontalLineTo(112.0f)
                verticalLineTo(160.0f)
                horizontalLineToRelative(32.0f)
                close()
            }
        }
        .build()
        return _houseLine!!
    }

private var _houseLine: ImageVector? = null
