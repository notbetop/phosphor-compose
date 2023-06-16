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

public val BoldGroup.Taxi: ImageVector
    get() {
        if (_taxi != null) {
            return _taxi!!
        }
        _taxi = Builder(name = "Taxi", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 112.0f)
                horizontalLineToRelative(-9.45f)
                lineTo(204.46f, 65.18f)
                arcTo(19.93f, 19.93f, 0.0f, false, false, 187.63f, 56.0f)
                lineTo(168.12f, 56.0f)
                lineToRelative(-11.0f, -27.43f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 138.58f, 16.0f)
                lineTo(117.42f, 16.0f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 98.85f, 28.57f)
                lineTo(87.88f, 56.0f)
                lineTo(68.37f, 56.0f)
                arcToRelative(19.91f, 19.91f, 0.0f, false, false, -16.83f, 9.19f)
                lineTo(21.45f, 112.0f)
                lineTo(12.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(60.0f, 224.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(80.0f, 184.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(240.0f, 136.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(120.12f, 40.0f)
                horizontalLineToRelative(15.76f)
                lineToRelative(6.4f, 16.0f)
                lineTo(113.72f, 56.0f)
                close()
                moveTo(70.55f, 80.0f)
                horizontalLineToRelative(114.9f)
                lineTo(206.0f, 112.0f)
                lineTo(50.0f, 112.0f)
                close()
                moveTo(56.0f, 200.0f)
                lineTo(40.0f, 200.0f)
                lineTo(40.0f, 184.0f)
                lineTo(56.0f, 184.0f)
                close()
                moveTo(200.0f, 200.0f)
                lineTo(200.0f, 184.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(16.0f)
                close()
                moveTo(216.0f, 160.0f)
                lineTo(40.0f, 160.0f)
                lineTo(40.0f, 136.0f)
                lineTo(216.0f, 136.0f)
                close()
            }
        }
        .build()
        return _taxi!!
    }

private var _taxi: ImageVector? = null
