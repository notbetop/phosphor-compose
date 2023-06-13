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

public val DuotoneGroup.Hoodie: ImageVector
    get() {
        if (_hoodie != null) {
            return _hoodie!!
        }
        _hoodie = Builder(name = "Hoodie", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(232.0f, 128.0f)
                lineToRelative(-22.39f, 82.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.72f, 5.9f)
                horizontalLineTo(176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(184.0f)
                horizontalLineTo(88.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(54.11f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.72f, -5.9f)
                lineTo(24.0f, 128.0f)
                lineTo(72.0f, 56.0f)
                lineToRelative(56.0f, 32.0f)
                lineToRelative(56.0f, -32.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.66f, 123.56f)
                lineToRelative(-56.3f, -84.44f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 169.05f, 32.0f)
                lineTo(87.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -13.31f, 7.12f)
                lineToRelative(-56.3f, 84.44f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -1.06f, 6.54f)
                lineToRelative(22.39f, 82.11f)
                arcTo(16.05f, 16.05f, 0.0f, false, false, 54.11f, 224.0f)
                lineTo(80.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(96.0f, 192.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(25.89f)
                arcToRelative(16.05f, 16.05f, 0.0f, false, false, 15.44f, -11.79f)
                lineToRelative(22.39f, -82.11f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 238.66f, 123.56f)
                close()
                moveTo(80.0f, 176.0f)
                lineTo(80.0f, 69.79f)
                lineTo(104.0f, 83.5f)
                lineTo(104.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(120.0f, 92.64f)
                lineTo(124.0f, 95.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 132.0f, 95.0f)
                lineToRelative(4.0f, -2.31f)
                lineTo(136.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(152.0f, 83.5f)
                lineToRelative(24.0f, -13.71f)
                lineTo(176.0f, 176.0f)
                close()
                moveTo(169.05f, 48.0f)
                lineToRelative(3.54f, 5.31f)
                lineTo(128.0f, 78.79f)
                lineTo(83.41f, 53.31f)
                lineTo(87.0f, 48.0f)
                close()
                moveTo(80.0f, 208.0f)
                lineTo(54.11f, 208.0f)
                lineTo(32.68f, 129.41f)
                lineTo(64.0f, 82.42f)
                lineTo(64.0f, 176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                close()
                moveTo(201.89f, 208.0f)
                lineTo(176.0f, 208.0f)
                lineTo(176.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(192.0f, 82.42f)
                lineToRelative(31.32f, 47.0f)
                close()
            }
        }
        .build()
        return _hoodie!!
    }

private var _hoodie: ImageVector? = null
