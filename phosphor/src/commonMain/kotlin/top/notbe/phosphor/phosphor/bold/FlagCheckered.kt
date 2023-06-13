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

public val BoldGroup.FlagCheckered: ImageVector
    get() {
        if (_flagCheckered != null) {
            return _flagCheckered!!
        }
        _flagCheckered = Builder(name = "FlagCheckered", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.0f, 37.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.85f, 1.84f)
                curveToRelative(-24.71f, 21.41f, -44.53f, 13.31f, -74.82f, -1.68f)
                curveTo(105.19f, 23.27f, 70.17f, 5.94f, 32.14f, 38.88f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 48.0f)
                lineTo(28.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(52.0f, 173.71f)
                curveToRelative(22.84f, -17.13f, 42.1f, -9.11f, 70.68f, 5.0f)
                curveToRelative(16.23f, 8.0f, 34.74f, 17.2f, 54.8f, 17.2f)
                curveToRelative(14.72f, 0.0f, 30.28f, -4.94f, 46.38f, -18.88f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 228.0f, 168.0f)
                lineTo(228.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 221.0f, 37.0f)
                close()
                moveTo(177.48f, 75.91f)
                arcTo(63.0f, 63.0f, 0.0f, false, false, 204.0f, 70.08f)
                verticalLineToRelative(36.16f)
                curveToRelative(-11.0f, 8.25f, -21.2f, 10.66f, -32.0f, 9.36f)
                lineTo(172.0f, 75.66f)
                curveTo(173.81f, 75.81f, 175.64f, 75.91f, 177.48f, 75.91f)
                close()
                moveTo(148.0f, 70.08f)
                verticalLineToRelative(38.09f)
                curveToRelative(-4.64f, -2.0f, -9.5f, -4.4f, -14.68f, -7.0f)
                arcTo(255.21f, 255.21f, 0.0f, false, false, 108.0f, 89.83f)
                lineTo(108.0f, 51.75f)
                curveToRelative(4.64f, 2.0f, 9.5f, 4.4f, 14.68f, 7.0f)
                arcTo(252.91f, 252.91f, 0.0f, false, false, 148.0f, 70.08f)
                close()
                moveTo(84.0f, 44.32f)
                lineTo(84.0f, 84.24f)
                arcToRelative(63.33f, 63.33f, 0.0f, false, false, -32.0f, 5.61f)
                lineTo(52.0f, 53.68f)
                curveTo(63.0f, 45.42f, 73.2f, 43.0f, 84.0f, 44.32f)
                close()
                moveTo(78.52f, 140.0f)
                arcTo(63.0f, 63.0f, 0.0f, false, false, 52.0f, 145.86f)
                lineTo(52.0f, 117.71f)
                curveToRelative(11.0f, -8.26f, 21.2f, -10.67f, 32.0f, -9.37f)
                verticalLineToRelative(31.94f)
                curveTo(82.19f, 140.13f, 80.36f, 140.0f, 78.52f, 140.0f)
                close()
                moveTo(108.0f, 145.86f)
                lineTo(108.0f, 115.77f)
                curveToRelative(4.64f, 2.0f, 9.5f, 4.4f, 14.68f, 7.0f)
                arcTo(252.91f, 252.91f, 0.0f, false, false, 148.0f, 134.1f)
                verticalLineToRelative(30.09f)
                curveToRelative(-4.64f, -2.05f, -9.5f, -4.4f, -14.68f, -7.0f)
                arcTo(250.66f, 250.66f, 0.0f, false, false, 108.0f, 145.86f)
                close()
                moveTo(172.0f, 171.62f)
                lineTo(172.0f, 139.68f)
                curveToRelative(1.81f, 0.14f, 3.64f, 0.24f, 5.48f, 0.24f)
                arcTo(62.85f, 62.85f, 0.0f, false, false, 204.0f, 134.07f)
                verticalLineToRelative(28.19f)
                curveTo(193.0f, 170.52f, 182.8f, 172.92f, 172.0f, 171.62f)
                close()
            }
        }
        .build()
        return _flagCheckered!!
    }

private var _flagCheckered: ImageVector? = null
