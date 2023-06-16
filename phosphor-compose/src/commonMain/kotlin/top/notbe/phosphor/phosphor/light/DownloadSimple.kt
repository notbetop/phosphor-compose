package top.notbe.phosphor.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.LightGroup

public val LightGroup.DownloadSimple: ImageVector
    get() {
        if (_downloadSimple != null) {
            return _downloadSimple!!
        }
        _downloadSimple = Builder(name = "DownloadSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 152.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(48.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                lineTo(34.0f, 152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(208.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(210.0f, 152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(123.76f, 156.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, 0.0f)
                lineToRelative(40.0f, -40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, -8.48f)
                lineTo(134.0f, 137.51f)
                lineTo(134.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(97.51f)
                lineTo(92.24f, 107.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f)
                close()
            }
        }
        .build()
        return _downloadSimple!!
    }

private var _downloadSimple: ImageVector? = null
