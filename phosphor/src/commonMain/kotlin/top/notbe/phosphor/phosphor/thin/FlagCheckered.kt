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

public val ThinGroup.FlagCheckered: ImageVector
    get() {
        if (_flagCheckered != null) {
            return _flagCheckered!!
        }
        _flagCheckered = Builder(name = "FlagCheckered", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(217.66f, 44.44f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.28f, 0.61f)
                curveToRelative(-30.0f, 26.0f, -56.0f, 13.08f, -83.61f, -0.56f)
                curveToRelative(-28.7f, -14.2f, -58.38f, -28.88f, -92.39f, 0.56f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.38f, 3.0f)
                lineTo(36.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(44.0f, 169.87f)
                curveToRelative(29.41f, -24.39f, 55.08f, -11.69f, 82.23f, 1.74f)
                curveToRelative(28.7f, 14.19f, 58.38f, 28.88f, 92.39f, -0.56f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.38f, -3.0f)
                verticalLineToRelative(-120.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 217.66f, 44.44f)
                close()
                moveTo(212.0f, 56.32f)
                lineTo(212.0f, 110.2f)
                curveToRelative(-16.91f, 14.0f, -32.58f, 15.78f, -48.0f, 12.2f)
                lineTo(164.0f, 66.67f)
                curveTo(179.24f, 69.9f, 195.09f, 68.37f, 212.0f, 56.32f)
                close()
                moveTo(156.0f, 64.55f)
                verticalLineToRelative(55.54f)
                curveToRelative(-8.7f, -3.0f, -17.39f, -7.25f, -26.23f, -11.63f)
                curveToRelative(-9.76f, -4.83f, -19.64f, -9.71f, -29.77f, -12.9f)
                lineTo(100.0f, 40.0f)
                curveToRelative(8.7f, 3.0f, 17.39f, 7.25f, 26.23f, 11.62f)
                curveTo(136.0f, 56.49f, 145.87f, 61.37f, 156.0f, 64.55f)
                close()
                moveTo(92.0f, 37.73f)
                lineTo(92.0f, 93.44f)
                curveToRelative(-15.24f, -3.23f, -31.09f, -1.69f, -48.0f, 10.37f)
                lineTo(44.0f, 49.93f)
                curveTo(60.91f, 35.9f, 76.58f, 34.15f, 92.0f, 37.73f)
                close()
                moveTo(44.0f, 159.78f)
                lineTo(44.0f, 113.9f)
                curveToRelative(16.91f, -14.0f, 32.58f, -15.79f, 48.0f, -12.21f)
                verticalLineToRelative(47.73f)
                arcTo(64.48f, 64.48f, 0.0f, false, false, 78.64f, 148.0f)
                curveTo(67.52f, 148.0f, 56.0f, 151.2f, 44.0f, 159.78f)
                close()
                moveTo(100.0f, 151.55f)
                lineTo(100.0f, 104.0f)
                curveToRelative(8.71f, 3.0f, 17.39f, 7.26f, 26.23f, 11.63f)
                curveToRelative(9.76f, 4.83f, 19.64f, 9.7f, 29.77f, 12.89f)
                verticalLineToRelative(47.54f)
                curveToRelative(-8.71f, -3.0f, -17.39f, -7.25f, -26.23f, -11.62f)
                curveTo(120.0f, 159.61f, 110.13f, 154.73f, 100.0f, 151.55f)
                close()
                moveTo(164.0f, 178.37f)
                lineTo(164.0f, 130.65f)
                arcToRelative(64.48f, 64.48f, 0.0f, false, false, 13.36f, 1.47f)
                curveToRelative(11.12f, 0.0f, 22.61f, -3.27f, 34.64f, -11.85f)
                verticalLineToRelative(45.9f)
                curveTo(195.09f, 180.19f, 179.42f, 182.0f, 164.0f, 178.37f)
                close()
            }
        }
        .build()
        return _flagCheckered!!
    }

private var _flagCheckered: ImageVector? = null
