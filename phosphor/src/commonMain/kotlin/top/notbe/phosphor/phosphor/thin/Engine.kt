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

public val ThinGroup.Engine: ImageVector
    get() {
        if (_engine != null) {
            return _engine!!
        }
        _engine = Builder(name = "Engine", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(28.0f)
                lineTo(220.0f, 140.0f)
                lineTo(220.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(195.31f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.82f, -1.17f)
                lineTo(157.17f, 71.51f)
                arcTo(11.93f, 11.93f, 0.0f, false, false, 148.69f, 68.0f)
                lineTo(124.0f, 68.0f)
                lineTo(124.0f, 44.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(88.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(28.0f)
                lineTo(116.0f, 68.0f)
                lineTo(48.0f, 68.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 80.0f)
                verticalLineToRelative(60.0f)
                lineTo(12.0f, 140.0f)
                lineTo(12.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(12.0f, 148.0f)
                lineTo(36.0f, 148.0f)
                verticalLineToRelative(24.69f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, 3.51f, 8.48f)
                lineToRelative(35.32f, 35.32f)
                arcTo(11.93f, 11.93f, 0.0f, false, false, 83.31f, 220.0f)
                horizontalLineToRelative(65.38f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, 8.48f, -3.51f)
                lineToRelative(35.32f, -35.32f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.82f, -1.17f)
                lineTo(208.0f, 180.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(220.0f, 148.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(252.0f, 112.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 248.0f, 108.0f)
                close()
                moveTo(212.0f, 168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(195.31f, 172.0f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, -8.48f, 3.51f)
                lineToRelative(-35.32f, 35.32f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.82f, 1.17f)
                lineTo(83.31f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.82f, -1.17f)
                lineTo(45.17f, 175.51f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 44.0f, 172.69f)
                lineTo(44.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(148.69f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.82f, 1.17f)
                lineToRelative(35.32f, 35.32f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, 8.48f, 3.51f)
                lineTo(208.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _engine!!
    }

private var _engine: ImageVector? = null
