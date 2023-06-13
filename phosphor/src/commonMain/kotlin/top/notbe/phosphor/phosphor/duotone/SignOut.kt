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

public val DuotoneGroup.SignOut: ImageVector
    get() {
        if (_signOut != null) {
            return _signOut!!
        }
        _signOut = Builder(name = "SignOut", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 128.0f)
                lineToRelative(-40.0f, 40.0f)
                verticalLineTo(88.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(48.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(32.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 32.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(48.0f, 48.0f)
                lineTo(48.0f, 208.0f)
                horizontalLineToRelative(56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 112.0f, 216.0f)
                close()
                moveTo(221.66f, 133.66f)
                lineTo(181.66f, 173.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 168.0f)
                lineTo(168.0f, 136.0f)
                lineTo(104.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(64.0f)
                lineTo(168.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.66f, -5.66f)
                lineToRelative(40.0f, 40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 221.66f, 133.66f)
                close()
                moveTo(204.66f, 128.0f)
                lineTo(184.0f, 107.31f)
                verticalLineToRelative(41.38f)
                close()
            }
        }
        .build()
        return _signOut!!
    }

private var _signOut: ImageVector? = null
