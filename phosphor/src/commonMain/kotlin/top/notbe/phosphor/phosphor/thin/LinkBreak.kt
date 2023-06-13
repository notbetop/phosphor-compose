package top.notbe.phosphor.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.ThinGroup

public val ThinGroup.LinkBreak: ImageVector
    get() {
        if (_linkBreak != null) {
            return _linkBreak!!
        }
        _linkBreak = Builder(name = "LinkBreak", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(193.46f, 62.54f)
                arcToRelative(36.06f, 36.06f, 0.0f, false, false, -50.92f, 0.0f)
                lineTo(130.89f, 74.76f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.78f, -5.52f)
                lineTo(136.82f, 57.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, 62.29f, 62.15f)
                lineToRelative(-12.35f, 11.78f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.52f, -5.78f)
                lineToRelative(12.28f, -11.72f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 193.46f, 62.54f)
                close()
                moveTo(125.11f, 181.24f)
                lineTo(113.46f, 193.46f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -51.0f, -50.85f)
                lineToRelative(12.28f, -11.72f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.52f, -5.78f)
                lineTo(56.89f, 136.89f)
                arcTo(44.0f, 44.0f, 0.0f, true, false, 119.18f, 199.0f)
                lineToRelative(11.71f, -12.28f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.78f, -5.52f)
                close()
                moveTo(208.0f, 156.0f)
                lineTo(184.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(48.0f, 100.0f)
                lineTo(72.0f, 100.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(48.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                close()
                moveTo(160.0f, 180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(164.0f, 184.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 160.0f, 180.0f)
                close()
                moveTo(96.0f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(100.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(92.0f, 72.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 96.0f, 76.0f)
                close()
            }
        }
        .build()
        return _linkBreak!!
    }

private var _linkBreak: ImageVector? = null
