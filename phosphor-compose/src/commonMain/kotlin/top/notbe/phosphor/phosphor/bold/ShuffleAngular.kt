package top.notbe.phosphor.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.BoldGroup

public val BoldGroup.ShuffleAngular: ImageVector
    get() {
        if (_shuffleAngular != null) {
            return _shuffleAngular!!
        }
        _shuffleAngular = Builder(name = "ShuffleAngular", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.49f, 175.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineTo(203.0f, 196.0f)
                lineTo(172.12f, 196.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -16.28f, -8.38f)
                lineTo(81.82f, 84.0f)
                lineTo(32.0f, 84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(83.88f, 60.0f)
                arcToRelative(20.05f, 20.05f, 0.0f, false, true, 16.28f, 8.37f)
                lineToRelative(74.0f, 103.63f)
                lineTo(203.0f, 172.0f)
                lineToRelative(-3.52f, -3.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                close()
                moveTo(110.4f, 152.64f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.74f, 2.79f)
                lineTo(81.82f, 172.0f)
                lineTo(32.0f, 172.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(83.88f, 196.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 16.28f, -8.38f)
                lineToRelative(13.0f, -18.24f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 110.4f, 152.64f)
                close()
                moveTo(145.6f, 103.36f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.74f, -2.79f)
                lineTo(174.18f, 84.0f)
                lineTo(203.0f, 84.0f)
                lineToRelative(-3.52f, 3.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                lineTo(203.0f, 60.0f)
                lineTo(172.12f, 60.0f)
                arcToRelative(20.05f, 20.05f, 0.0f, false, false, -16.28f, 8.37f)
                lineToRelative(-13.0f, 18.25f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 145.6f, 103.36f)
                close()
            }
        }
        .build()
        return _shuffleAngular!!
    }

private var _shuffleAngular: ImageVector? = null
