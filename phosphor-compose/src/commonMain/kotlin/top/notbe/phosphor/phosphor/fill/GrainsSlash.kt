package top.notbe.phosphor.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.FillGroup

public val FillGroup.GrainsSlash: ImageVector
    get() {
        if (_grainsSlash != null) {
            return _grainsSlash!!
        }
        _grainsSlash = Builder(name = "GrainsSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.92f, 34.62f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f)
                lineToRelative(9.73f, 10.71f)
                quadTo(49.91f, 56.0f, 48.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 149.21f, 63.22f)
                lineToRelative(12.87f, 14.16f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f)
                close()
                moveTo(128.0f, 163.37f)
                arcToRelative(88.16f, 88.16f, 0.0f, false, false, -72.0f, -51.0f)
                verticalLineTo(72.44f)
                arcToRelative(71.31f, 71.31f, 0.0f, false, true, 13.18f, 2.75f)
                lineTo(136.29f, 149.0f)
                arcTo(88.17f, 88.17f, 0.0f, false, false, 128.0f, 163.37f)
                close()
                moveTo(216.0f, 64.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(88.13f, 88.13f, 0.0f, false, true, -3.15f, 23.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.85f, 5.66f)
                arcToRelative(7.88f, 7.88f, 0.0f, false, true, -1.86f, 0.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.92f, -2.62f)
                lineTo(165.9f, 134.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.3f, -12.51f)
                arcToRelative(86.64f, 86.64f, 0.0f, false, true, 31.8f, -9.14f)
                verticalLineTo(72.45f)
                arcToRelative(72.33f, 72.33f, 0.0f, false, false, -50.35f, 29.36f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -13.0f, -9.39f)
                arcToRelative(88.15f, 88.15f, 0.0f, false, true, 25.16f, -23.3f)
                curveTo(152.62f, 49.8f, 135.45f, 37.74f, 128.0f, 33.2f)
                arcToRelative(99.79f, 99.79f, 0.0f, false, false, -23.4f, 19.94f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 92.39f, 42.81f)
                arcToRelative(112.32f, 112.32f, 0.0f, false, true, 32.0f, -26.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.16f, 0.0f)
                curveToRelative(1.32f, 0.66f, 30.27f, 15.43f, 44.59f, 45.15f)
                arcTo(87.91f, 87.91f, 0.0f, false, true, 208.0f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 64.0f)
                close()
            }
        }
        .build()
        return _grainsSlash!!
    }

private var _grainsSlash: ImageVector? = null
