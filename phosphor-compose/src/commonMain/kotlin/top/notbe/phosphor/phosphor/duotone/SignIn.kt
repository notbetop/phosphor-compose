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

public val DuotoneGroup.SignIn: ImageVector
    get() {
        if (_signIn != null) {
            return _signIn!!
        }
        _signIn = Builder(name = "SignIn", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(136.0f, 128.0f)
                lineTo(96.0f, 168.0f)
                verticalLineTo(88.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(141.66f, 122.34f)
                lineToRelative(-40.0f, -40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 88.0f, 88.0f)
                verticalLineToRelative(32.0f)
                horizontalLineTo(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineTo(88.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.66f, 5.66f)
                lineToRelative(40.0f, -40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 141.66f, 122.34f)
                close()
                moveTo(104.0f, 148.69f)
                verticalLineTo(107.31f)
                lineTo(124.69f, 128.0f)
                close()
                moveTo(208.0f, 48.0f)
                verticalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(56.0f)
                verticalLineTo(48.0f)
                horizontalLineTo(136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 208.0f, 48.0f)
                close()
            }
        }
        .build()
        return _signIn!!
    }

private var _signIn: ImageVector? = null
