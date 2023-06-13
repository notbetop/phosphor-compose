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

public val ThinGroup.SneakerMove: ImageVector
    get() {
        if (_sneakerMove != null) {
            return _sneakerMove!!
        }
        _sneakerMove = Builder(name = "SneakerMove", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 156.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, -36.0f)
                lineTo(180.0f, 95.69f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.95f, -11.94f)
                curveToRelative(-26.11f, -2.11f, -43.77f, -19.41f, -45.0f, -44.07f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.49f, -7.91f)
                lineToRelative(-8.23f, -8.23f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, -16.76f, -0.2f)
                lineToRelative(-0.07f, 0.07f)
                lineToRelative(-64.0f, 64.12f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                lineToRelative(107.27f, 104.0f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, 8.48f, 3.51f)
                lineTo(240.0f, 212.04f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineToRelative(-8.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 216.0f, 156.0f)
                close()
                moveTo(244.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(147.31f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.87f, -1.21f)
                lineTo(37.17f, 98.84f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.65f)
                lineToRelative(64.0f, -64.09f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.55f, 0.1f)
                lineToRelative(8.23f, 8.22f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.16f, 2.65f)
                curveToRelative(1.42f, 28.93f, 22.0f, 49.2f, 52.33f, 51.65f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.59f, 4.0f)
                lineTo(172.03f, 116.0f)
                lineTo(152.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(20.19f)
                arcToRelative(43.84f, 43.84f, 0.0f, false, false, 9.89f, 24.0f)
                lineTo(160.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(30.75f)
                arcTo(43.75f, 43.75f, 0.0f, false, false, 216.0f, 164.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, 28.0f)
                close()
                moveTo(64.0f, 180.0f)
                lineTo(32.0f, 180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, -8.0f)
                lineTo(64.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, 8.0f)
                close()
                moveTo(100.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(48.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(96.0f, 204.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 100.0f, 208.0f)
                close()
            }
        }
        .build()
        return _sneakerMove!!
    }

private var _sneakerMove: ImageVector? = null
