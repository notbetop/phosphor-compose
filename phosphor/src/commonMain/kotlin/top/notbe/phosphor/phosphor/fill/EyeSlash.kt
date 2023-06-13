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

public val FillGroup.EyeSlash: ImageVector
    get() {
        if (_eyeSlash != null) {
            return _eyeSlash!!
        }
        _eyeSlash = Builder(name = "EyeSlash", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.92f, 34.62f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f)
                lineTo(61.32f, 66.55f)
                curveTo(25.0f, 88.84f, 9.38f, 123.2f, 8.69f, 124.76f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 6.5f)
                curveToRelative(0.35f, 0.79f, 8.82f, 19.57f, 27.65f, 38.4f)
                curveTo(61.43f, 194.74f, 93.12f, 208.0f, 128.0f, 208.0f)
                arcToRelative(127.11f, 127.11f, 0.0f, false, false, 52.07f, -10.83f)
                lineToRelative(22.0f, 24.21f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f)
                close()
                moveTo(142.92f, 156.31f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -41.67f, -45.85f)
                close()
                moveTo(247.31f, 131.26f)
                curveToRelative(-0.42f, 0.94f, -10.55f, 23.37f, -33.36f, 43.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.26f, -0.57f)
                lineTo(101.4f, 63.07f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 106.0f, 49.79f)
                arcTo(134.0f, 134.0f, 0.0f, false, true, 128.0f, 48.0f)
                curveToRelative(34.88f, 0.0f, 66.57f, 13.26f, 91.66f, 38.35f)
                curveToRelative(18.83f, 18.83f, 27.3f, 37.62f, 27.65f, 38.41f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 247.31f, 131.26f)
                close()
            }
        }
        .build()
        return _eyeSlash!!
    }

private var _eyeSlash: ImageVector? = null
