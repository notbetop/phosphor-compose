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

public val BoldGroup.CastleTurret: ImageVector
    get() {
        if (_castleTurret != null) {
            return _castleTurret!!
        }
        _castleTurret = Builder(name = "CastleTurret", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 20.0f)
                horizontalLineTo(56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 36.0f, 40.0f)
                verticalLineTo(84.69f)
                arcToRelative(19.86f, 19.86f, 0.0f, false, false, 5.86f, 14.14f)
                lineTo(52.0f, 109.0f)
                verticalLineTo(216.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(184.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(109.0f)
                lineToRelative(10.14f, -10.14f)
                arcTo(19.86f, 19.86f, 0.0f, false, false, 220.0f, 84.69f)
                verticalLineTo(40.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 200.0f, 20.0f)
                close()
                moveTo(140.0f, 212.0f)
                horizontalLineTo(116.0f)
                verticalLineTo(152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(196.0f, 83.0f)
                lineTo(185.86f, 93.17f)
                arcTo(19.86f, 19.86f, 0.0f, false, false, 180.0f, 107.31f)
                verticalLineTo(212.0f)
                horizontalLineTo(164.0f)
                verticalLineTo(152.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -72.0f, 0.0f)
                verticalLineToRelative(60.0f)
                horizontalLineTo(76.0f)
                verticalLineTo(107.31f)
                arcToRelative(19.86f, 19.86f, 0.0f, false, false, -5.86f, -14.14f)
                lineTo(60.0f, 83.0f)
                verticalLineTo(44.0f)
                horizontalLineTo(88.0f)
                verticalLineTo(68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(44.0f)
                horizontalLineToRelative(32.0f)
                verticalLineTo(68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(44.0f)
                horizontalLineToRelative(28.0f)
                close()
            }
        }
        .build()
        return _castleTurret!!
    }

private var _castleTurret: ImageVector? = null
