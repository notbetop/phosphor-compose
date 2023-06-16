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

public val LightGroup.CastleTurret: ImageVector
    get() {
        if (_castleTurret != null) {
            return _castleTurret!!
        }
        _castleTurret = Builder(name = "CastleTurret", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 26.0f)
                horizontalLineTo(184.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 14.0f)
                verticalLineTo(56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(152.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(40.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                horizontalLineTo(120.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 14.0f)
                verticalLineTo(56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(88.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(40.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 72.0f, 26.0f)
                horizontalLineTo(56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 42.0f, 40.0f)
                verticalLineTo(84.69f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 4.1f, 9.89f)
                lineTo(57.42f, 105.9f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.58f, 1.41f)
                verticalLineTo(216.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineTo(184.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                verticalLineTo(107.31f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.58f, -1.41f)
                lineTo(209.9f, 94.58f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 4.1f, -9.89f)
                verticalLineTo(40.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 200.0f, 26.0f)
                close()
                moveTo(146.0f, 218.0f)
                horizontalLineTo(110.0f)
                verticalLineTo(152.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 36.0f, 0.0f)
                close()
                moveTo(202.0f, 84.69f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.58f, 1.41f)
                lineTo(190.1f, 97.42f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, -4.1f, 9.89f)
                verticalLineTo(216.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(158.0f)
                verticalLineTo(152.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -60.0f, 0.0f)
                verticalLineToRelative(66.0f)
                horizontalLineTo(72.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(107.31f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, -4.1f, -9.89f)
                lineTo(54.58f, 86.1f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 54.0f, 84.69f)
                verticalLineTo(40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineTo(72.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineTo(56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 88.0f, 70.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                verticalLineTo(40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineTo(56.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                verticalLineTo(40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _castleTurret!!
    }

private var _castleTurret: ImageVector? = null
