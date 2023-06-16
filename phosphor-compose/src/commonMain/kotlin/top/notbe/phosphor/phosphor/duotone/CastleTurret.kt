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

public val DuotoneGroup.CastleTurret: ImageVector
    get() {
        if (_castleTurret != null) {
            return _castleTurret!!
        }
        _castleTurret = Builder(name = "CastleTurret", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 40.0f)
                verticalLineTo(88.0f)
                lineToRelative(-16.0f, 16.0f)
                verticalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(152.0f)
                verticalLineTo(152.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -48.0f, 0.0f)
                verticalLineToRelative(72.0f)
                horizontalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(104.0f)
                lineTo(48.0f, 88.0f)
                verticalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 40.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 24.0f)
                horizontalLineTo(184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineTo(56.0f)
                horizontalLineTo(152.0f)
                verticalLineTo(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(120.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineTo(56.0f)
                horizontalLineTo(88.0f)
                verticalLineTo(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 72.0f, 24.0f)
                horizontalLineTo(56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f)
                verticalLineTo(84.69f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 44.69f, 96.0f)
                lineTo(56.0f, 107.31f)
                verticalLineTo(216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(107.31f)
                lineTo(211.31f, 96.0f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 216.0f, 84.69f)
                verticalLineTo(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 200.0f, 24.0f)
                close()
                moveTo(144.0f, 216.0f)
                horizontalLineTo(112.0f)
                verticalLineTo(152.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                close()
                moveTo(200.0f, 84.69f)
                lineTo(188.69f, 96.0f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 184.0f, 107.31f)
                verticalLineTo(216.0f)
                horizontalLineTo(160.0f)
                verticalLineTo(152.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -64.0f, 0.0f)
                verticalLineToRelative(64.0f)
                horizontalLineTo(72.0f)
                verticalLineTo(107.31f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 67.31f, 96.0f)
                lineTo(56.0f, 84.69f)
                verticalLineTo(40.0f)
                horizontalLineTo(72.0f)
                verticalLineTo(56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 88.0f, 72.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(40.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(40.0f)
                horizontalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return _castleTurret!!
    }

private var _castleTurret: ImageVector? = null
