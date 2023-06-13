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

public val LightGroup.SneakerMove: ImageVector
    get() {
        if (_sneakerMove != null) {
            return _sneakerMove!!
        }
        _sneakerMove = Builder(name = "SneakerMove", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 154.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, -34.0f, -34.0f)
                lineTo(182.0f, 95.7f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -12.79f, -13.94f)
                curveToRelative(-25.05f, -2.0f, -42.0f, -18.58f, -43.14f, -42.18f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 122.0f, 30.36f)
                lineToRelative(-8.23f, -8.23f)
                arcToRelative(13.92f, 13.92f, 0.0f, false, false, -19.55f, -0.24f)
                arcToRelative(1.14f, 1.14f, 0.0f, false, true, -0.11f, 0.11f)
                lineToRelative(-64.0f, 64.12f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 30.17f, 106.0f)
                lineTo(137.41f, 209.9f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, 9.9f, 4.1f)
                lineTo(240.0f, 214.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                verticalLineToRelative(-8.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 216.0f, 154.0f)
                close()
                moveTo(242.0f, 200.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(147.31f, 202.0f)
                arcToRelative(2.08f, 2.08f, 0.0f, false, true, -1.48f, -0.65f)
                lineTo(38.59f, 97.43f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 38.0f, 96.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.59f, -1.42f)
                lineToRelative(63.93f, -64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.76f, 0.07f)
                lineToRelative(8.22f, 8.22f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.58f, 1.33f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.73f, 14.9f, 6.41f, 27.86f, 16.43f, 37.48f)
                curveToRelative(9.68f, 9.3f, 22.73f, 14.85f, 37.74f, 16.06f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.75f, 2.0f)
                lineTo(170.0f, 114.0f)
                lineTo(152.0f, 114.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.0f, 12.0f)
                horizontalLineToRelative(18.4f)
                arcToRelative(45.78f, 45.78f, 0.0f, false, false, 7.68f, 20.0f)
                lineTo(160.0f, 146.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(30.11f)
                arcTo(45.78f, 45.78f, 0.0f, false, false, 216.0f, 166.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 26.0f, 26.0f)
                close()
                moveTo(64.0f, 182.0f)
                lineTo(32.0f, 182.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(64.0f, 170.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                close()
                moveTo(102.0f, 208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(48.0f, 214.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(96.0f, 202.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 102.0f, 208.0f)
                close()
            }
        }
        .build()
        return _sneakerMove!!
    }

private var _sneakerMove: ImageVector? = null
