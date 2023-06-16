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

public val DuotoneGroup.ChatsCircle: ImageVector
    get() {
        if (_chatsCircle != null) {
            return _chatsCircle!!
        }
        _chatsCircle = Builder(name = "ChatsCircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(231.76f, 216.34f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -7.42f, 7.42f)
                lineToRelative(-29.87f, -8.53f)
                arcTo(72.05f, 72.05f, 0.0f, false, true, 92.06f, 175.89f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.3f, 0.07f, 2.61f, 0.11f, 3.93f, 0.11f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, 67.93f, -95.88f)
                horizontalLineToRelative(0.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, 59.29f, 106.36f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.79f, 187.33f)
                arcTo(80.0f, 80.0f, 0.0f, false, false, 169.57f, 72.59f)
                arcTo(80.0f, 80.0f, 0.0f, true, false, 24.21f, 139.33f)
                lineToRelative(-7.66f, 26.82f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 17.3f, 17.3f)
                lineToRelative(26.82f, -7.66f)
                arcToRelative(80.15f, 80.15f, 0.0f, false, false, 25.75f, 7.63f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 108.91f, 40.37f)
                lineToRelative(26.82f, 7.66f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 17.3f, -17.3f)
                close()
                moveTo(61.53f, 159.23f)
                arcToRelative(8.22f, 8.22f, 0.0f, false, false, -2.2f, 0.3f)
                lineToRelative(-26.41f, 7.55f)
                lineToRelative(7.55f, -26.41f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.68f, -6.0f)
                arcToRelative(63.95f, 63.95f, 0.0f, true, true, 25.57f, 25.57f)
                arcTo(7.94f, 7.94f, 0.0f, false, false, 61.53f, 159.23f)
                close()
                moveTo(215.53f, 188.67f)
                lineTo(223.08f, 215.08f)
                lineTo(196.67f, 207.53f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.0f, 0.68f)
                arcToRelative(64.06f, 64.06f, 0.0f, false, true, -86.32f, -24.64f)
                arcTo(79.93f, 79.93f, 0.0f, false, false, 174.7f, 89.71f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 41.51f, 92.93f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 215.53f, 188.67f)
                close()
            }
        }
        .build()
        return _chatsCircle!!
    }

private var _chatsCircle: ImageVector? = null
