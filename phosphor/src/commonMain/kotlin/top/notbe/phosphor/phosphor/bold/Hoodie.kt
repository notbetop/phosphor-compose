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

public val BoldGroup.Hoodie: ImageVector
    get() {
        if (_hoodie != null) {
            return _hoodie!!
        }
        _hoodie = Builder(name = "Hoodie", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.0f, 121.34f)
                lineTo(189.69f, 36.91f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 173.05f, 28.0f)
                lineTo(83.0f, 28.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -16.64f, 8.91f)
                lineTo(10.0f, 121.34f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -1.73f, 9.28f)
                lineToRelative(18.39f, 82.11f)
                curveToRelative(0.0f, 0.18f, 0.09f, 0.36f, 0.14f, 0.53f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 46.11f, 228.0f)
                lineTo(76.0f, 228.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(29.89f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 19.29f, -14.74f)
                curveToRelative(0.0f, -0.17f, 0.1f, -0.35f, 0.14f, -0.53f)
                lineToRelative(18.39f, -82.11f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 246.0f, 121.34f)
                close()
                moveTo(128.0f, 74.4f)
                lineTo(86.0f, 52.0f)
                horizontalLineToRelative(84.0f)
                close()
                moveTo(80.0f, 176.0f)
                lineTo(80.0f, 76.0f)
                lineToRelative(16.0f, 8.53f)
                lineTo(96.0f, 136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(120.0f, 97.33f)
                lineToRelative(2.35f, 1.26f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.3f, 0.0f)
                lineTo(136.0f, 97.33f)
                lineTo(136.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(160.0f, 84.53f)
                lineTo(176.0f, 76.0f)
                lineTo(176.0f, 176.0f)
                close()
                moveTo(49.32f, 204.0f)
                lineTo(32.83f, 130.39f)
                lineTo(56.0f, 95.63f)
                lineTo(56.0f, 180.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 16.0f, 19.6f)
                lineTo(72.0f, 204.0f)
                close()
                moveTo(206.68f, 204.0f)
                lineTo(184.0f, 204.0f)
                verticalLineToRelative(-4.4f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 200.0f, 180.0f)
                lineTo(200.0f, 95.63f)
                lineToRelative(23.17f, 34.76f)
                close()
            }
        }
        .build()
        return _hoodie!!
    }

private var _hoodie: ImageVector? = null
