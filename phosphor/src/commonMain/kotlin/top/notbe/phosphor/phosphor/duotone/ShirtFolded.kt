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

public val DuotoneGroup.ShirtFolded: ImageVector
    get() {
        if (_shirtFolded != null) {
            return _shirtFolded!!
        }
        _shirtFolded = Builder(name = "ShirtFolded", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 64.0f)
                verticalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(80.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.12f, 6.15f)
                lineTo(128.0f, 88.0f)
                lineToRelative(34.88f, 30.13f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 176.0f, 112.0f)
                verticalLineTo(56.0f)
                horizontalLineToRelative(24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 64.0f)
                close()
                moveTo(96.0f, 40.0f)
                lineToRelative(32.0f, 48.0f)
                lineToRelative(32.0f, -48.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 48.0f)
                lineTo(179.31f, 48.0f)
                lineTo(165.66f, 34.34f)
                arcTo(8.08f, 8.08f, 0.0f, false, false, 160.0f, 32.0f)
                lineTo(96.0f, 32.0f)
                lineToRelative(-0.49f, 0.0f)
                lineToRelative(-0.23f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.89f, 2.29f)
                lineTo(76.69f, 48.0f)
                lineTo(56.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 64.0f)
                lineTo(40.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(200.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 200.0f, 48.0f)
                close()
                moveTo(168.0f, 59.31f)
                lineTo(168.0f, 112.0f)
                lineTo(138.57f, 86.56f)
                lineToRelative(22.67f, -34.0f)
                close()
                moveTo(128.0f, 73.58f)
                lineTo(111.0f, 48.0f)
                horizontalLineToRelative(34.1f)
                close()
                moveTo(94.76f, 52.58f)
                lineTo(117.43f, 86.58f)
                lineTo(88.0f, 112.0f)
                lineTo(88.0f, 59.31f)
                close()
                moveTo(56.0f, 64.0f)
                lineTo(72.0f, 64.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(15.85f, 15.85f, 0.0f, false, false, 9.21f, 14.49f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 88.0f, 128.0f)
                arcToRelative(15.89f, 15.89f, 0.0f, false, false, 10.2f, -3.73f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, false, 0.11f, -0.1f)
                lineTo(120.0f, 105.48f)
                lineTo(120.0f, 216.0f)
                lineTo(56.0f, 216.0f)
                close()
                moveTo(200.0f, 216.0f)
                lineTo(136.0f, 216.0f)
                lineTo(136.0f, 105.48f)
                lineToRelative(21.65f, 18.7f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, false, 0.11f, 0.1f)
                arcTo(15.89f, 15.89f, 0.0f, false, false, 168.0f, 128.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 6.83f, -1.54f)
                arcTo(15.85f, 15.85f, 0.0f, false, false, 184.0f, 112.0f)
                lineTo(184.0f, 64.0f)
                horizontalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return _shirtFolded!!
    }

private var _shirtFolded: ImageVector? = null
