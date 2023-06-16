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

public val BoldGroup.SneakerMove: ImageVector
    get() {
        if (_sneakerMove != null) {
            return _sneakerMove!!
        }
        _sneakerMove = Builder(name = "SneakerMove", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 148.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f)
                lineTo(188.0f, 95.71f)
                arcToRelative(20.14f, 20.14f, 0.0f, false, false, -18.42f, -19.93f)
                curveTo(147.45f, 74.0f, 133.07f, 60.0f, 132.06f, 39.3f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -5.83f, -13.17f)
                lineTo(118.0f, 17.9f)
                arcToRelative(19.91f, 19.91f, 0.0f, false, false, -27.94f, -0.34f)
                lineToRelative(-0.22f, 0.22f)
                lineToRelative(-64.0f, 64.11f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 28.28f)
                lineToRelative(0.13f, 0.13f)
                lineTo(133.25f, 214.22f)
                arcTo(19.86f, 19.86f, 0.0f, false, false, 147.31f, 220.0f)
                lineTo(236.0f, 220.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineToRelative(-8.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 212.0f, 148.0f)
                close()
                moveTo(232.0f, 196.0f)
                lineTo(148.94f, 196.0f)
                lineTo(45.7f, 96.0f)
                lineTo(103.87f, 37.7f)
                lineTo(108.18f, 42.0f)
                curveToRelative(2.18f, 30.66f, 24.27f, 53.22f, 55.82f, 57.3f)
                lineTo(164.0f, 108.0f)
                lineTo(148.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 0.0f, 24.0f)
                horizontalLineToRelative(16.68f)
                arcToRelative(47.8f, 47.8f, 0.0f, false, false, 3.7f, 12.0f)
                lineTo(156.0f, 144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 0.0f, 24.0f)
                horizontalLineToRelative(36.84f)
                arcTo(47.69f, 47.69f, 0.0f, false, false, 212.0f, 172.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f)
                close()
                moveTo(52.0f, 184.0f)
                lineTo(28.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(52.0f, 160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                close()
                moveTo(104.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(44.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 0.0f, -24.0f)
                lineTo(92.0f, 196.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 104.0f, 208.0f)
                close()
            }
        }
        .build()
        return _sneakerMove!!
    }

private var _sneakerMove: ImageVector? = null
