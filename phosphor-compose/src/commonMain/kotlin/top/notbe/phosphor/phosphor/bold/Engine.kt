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

public val BoldGroup.Engine: ImageVector
    get() {
        if (_engine != null) {
            return _engine!!
        }
        _engine = Builder(name = "Engine", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(16.0f)
                lineTo(216.0f, 140.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(185.0f, 112.0f)
                lineTo(150.83f, 77.86f)
                arcTo(19.86f, 19.86f, 0.0f, false, false, 136.69f, 72.0f)
                lineTo(124.0f, 72.0f)
                lineTo(124.0f, 56.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(84.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(16.0f)
                lineTo(100.0f, 72.0f)
                lineTo(60.0f, 72.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 40.0f, 92.0f)
                verticalLineToRelative(48.0f)
                lineTo(24.0f, 140.0f)
                lineTo(24.0f, 124.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(24.0f, 164.0f)
                lineTo(40.0f, 164.0f)
                verticalLineToRelative(12.69f)
                arcToRelative(19.86f, 19.86f, 0.0f, false, false, 5.86f, 14.14f)
                lineToRelative(35.31f, 35.31f)
                arcTo(19.86f, 19.86f, 0.0f, false, false, 95.31f, 232.0f)
                horizontalLineToRelative(41.38f)
                arcToRelative(19.86f, 19.86f, 0.0f, false, false, 14.14f, -5.86f)
                lineTo(185.0f, 192.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(256.0f, 124.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 244.0f, 112.0f)
                close()
                moveTo(192.0f, 168.0f)
                horizontalLineToRelative(-8.69f)
                arcToRelative(19.86f, 19.86f, 0.0f, false, false, -14.14f, 5.86f)
                lineTo(135.0f, 208.0f)
                lineTo(97.0f, 208.0f)
                lineTo(64.0f, 175.0f)
                lineTo(64.0f, 96.0f)
                horizontalLineToRelative(71.0f)
                lineToRelative(34.14f, 34.14f)
                arcTo(19.86f, 19.86f, 0.0f, false, false, 183.31f, 136.0f)
                lineTo(192.0f, 136.0f)
                close()
            }
        }
        .build()
        return _engine!!
    }

private var _engine: ImageVector? = null
