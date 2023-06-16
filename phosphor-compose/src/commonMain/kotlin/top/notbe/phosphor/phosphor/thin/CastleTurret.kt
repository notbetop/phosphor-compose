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

public val ThinGroup.CastleTurret: ImageVector
    get() {
        if (_castleTurret != null) {
            return _castleTurret!!
        }
        _castleTurret = Builder(name = "CastleTurret", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 28.0f)
                horizontalLineTo(184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineTo(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineTo(120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineTo(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 72.0f, 28.0f)
                horizontalLineTo(56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 40.0f)
                verticalLineTo(84.69f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, 3.51f, 8.48f)
                lineToRelative(11.32f, 11.32f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 60.0f, 107.31f)
                verticalLineTo(216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineTo(184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(107.31f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.17f, -2.82f)
                lineToRelative(11.32f, -11.32f)
                arcTo(11.93f, 11.93f, 0.0f, false, false, 212.0f, 84.69f)
                verticalLineTo(40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 200.0f, 28.0f)
                close()
                moveTo(148.0f, 220.0f)
                horizontalLineTo(108.0f)
                verticalLineTo(152.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f)
                close()
                moveTo(204.0f, 84.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.17f, 2.82f)
                lineTo(191.51f, 98.83f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, -3.51f, 8.48f)
                verticalLineTo(216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(156.0f)
                verticalLineTo(152.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -56.0f, 0.0f)
                verticalLineToRelative(68.0f)
                horizontalLineTo(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(107.31f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, -3.51f, -8.48f)
                lineTo(53.17f, 87.51f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 52.0f, 84.69f)
                verticalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineTo(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineTo(56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 88.0f, 68.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineTo(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _castleTurret!!
    }

private var _castleTurret: ImageVector? = null
