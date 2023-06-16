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

public val DuotoneGroup.Engine: ImageVector
    get() {
        if (_engine != null) {
            return _engine!!
        }
        _engine = Builder(name = "Engine", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 120.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(195.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.65f, 2.34f)
                lineToRelative(-35.32f, 35.32f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.65f, 2.34f)
                horizontalLineTo(83.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.65f, -2.34f)
                lineTo(42.34f, 178.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 40.0f, 172.69f)
                verticalLineTo(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(148.69f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.65f, 2.34f)
                lineToRelative(35.32f, 35.32f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.65f, 2.34f)
                horizontalLineTo(208.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 120.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(24.0f)
                lineTo(224.0f, 136.0f)
                lineTo(224.0f, 120.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(195.31f, 104.0f)
                lineTo(160.0f, 68.69f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 148.69f, 64.0f)
                lineTo(128.0f, 64.0f)
                lineTo(128.0f, 48.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(88.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(24.0f)
                lineTo(112.0f, 64.0f)
                lineTo(48.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 80.0f)
                verticalLineToRelative(56.0f)
                lineTo(16.0f, 136.0f)
                lineTo(16.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(16.0f, 152.0f)
                lineTo(32.0f, 152.0f)
                verticalLineToRelative(20.69f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 36.69f, 184.0f)
                lineTo(72.0f, 219.31f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 83.31f, 224.0f)
                horizontalLineToRelative(65.38f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 160.0f, 219.31f)
                lineTo(195.31f, 184.0f)
                lineTo(208.0f, 184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 152.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(256.0f, 112.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 248.0f, 104.0f)
                close()
                moveTo(208.0f, 168.0f)
                lineTo(195.31f, 168.0f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 184.0f, 172.69f)
                lineTo(148.69f, 208.0f)
                lineTo(83.31f, 208.0f)
                lineTo(48.0f, 172.69f)
                lineTo(48.0f, 80.0f)
                lineTo(148.69f, 80.0f)
                lineTo(184.0f, 115.31f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 195.31f, 120.0f)
                lineTo(208.0f, 120.0f)
                close()
            }
        }
        .build()
        return _engine!!
    }

private var _engine: ImageVector? = null
