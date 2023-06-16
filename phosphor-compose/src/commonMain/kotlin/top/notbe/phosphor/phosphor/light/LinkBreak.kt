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

public val LightGroup.LinkBreak: ImageVector
    get() {
        if (_linkBreak != null) {
            return _linkBreak!!
        }
        _linkBreak = Builder(name = "LinkBreak", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 64.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, -48.0f, -0.05f)
                lineTo(132.34f, 76.14f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.68f, -8.28f)
                lineToRelative(11.71f, -12.28f)
                lineToRelative(0.1f, -0.11f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, true, 65.06f, 65.06f)
                lineToRelative(-0.11f, 0.1f)
                lineToRelative(-12.28f, 11.71f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.28f, -8.68f)
                lineTo(192.09f, 112.0f)
                arcTo(34.0f, 34.0f, 0.0f, false, false, 192.0f, 64.0f)
                close()
                moveTo(123.62f, 179.9f)
                lineTo(112.0f, 192.09f)
                arcTo(34.0f, 34.0f, 0.0f, false, true, 63.91f, 144.0f)
                lineToRelative(12.23f, -11.67f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.28f, -8.68f)
                lineTo(55.58f, 135.37f)
                lineToRelative(-0.11f, 0.1f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, 65.06f, 65.06f)
                lineToRelative(0.1f, -0.11f)
                lineToRelative(11.71f, -12.28f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.68f, -8.28f)
                close()
                moveTo(208.0f, 154.0f)
                lineTo(184.0f, 154.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(48.0f, 102.0f)
                lineTo(72.0f, 102.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(48.0f, 90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                close()
                moveTo(160.0f, 178.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(166.0f, 184.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 160.0f, 178.0f)
                close()
                moveTo(96.0f, 78.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(102.0f, 48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(90.0f, 72.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 96.0f, 78.0f)
                close()
            }
        }
        .build()
        return _linkBreak!!
    }

private var _linkBreak: ImageVector? = null
