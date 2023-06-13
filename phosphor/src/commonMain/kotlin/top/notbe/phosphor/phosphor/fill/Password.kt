package top.notbe.phosphor.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.FillGroup

public val FillGroup.Password: ImageVector
    get() {
        if (_password != null) {
            return _password!!
        }
        _password = Builder(name = "Password", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 48.0f)
                lineTo(40.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 64.0f)
                lineTo(24.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(216.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 48.0f)
                close()
                moveTo(64.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(48.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(137.3f, 128.19f)
                lineTo(124.94f, 132.19f)
                lineTo(132.58f, 142.69f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -13.0f, 9.41f)
                lineTo(112.0f, 141.61f)
                lineToRelative(-7.63f, 10.51f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -13.0f, -9.41f)
                lineToRelative(7.64f, -10.5f)
                lineToRelative(-12.36f, -4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 5.0f, -15.21f)
                lineTo(104.0f, 117.0f)
                lineTo(104.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(13.0f)
                lineToRelative(12.35f, -4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 5.0f, 15.21f)
                close()
                moveTo(209.3f, 128.19f)
                lineTo(196.94f, 132.19f)
                lineTo(204.58f, 142.69f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -13.0f, 9.41f)
                lineTo(184.0f, 141.61f)
                lineToRelative(-7.63f, 10.51f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -13.0f, -9.41f)
                lineToRelative(7.64f, -10.5f)
                lineToRelative(-12.36f, -4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 5.0f, -15.21f)
                lineTo(176.0f, 117.0f)
                lineTo(176.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(13.0f)
                lineToRelative(12.35f, -4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.0f, 15.21f)
                close()
            }
        }
        .build()
        return _password!!
    }

private var _password: ImageVector? = null
