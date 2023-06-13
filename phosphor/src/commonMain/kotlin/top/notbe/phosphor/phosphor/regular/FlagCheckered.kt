package top.notbe.phosphor.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.RegularGroup

public val RegularGroup.FlagCheckered: ImageVector
    get() {
        if (_flagCheckered != null) {
            return _flagCheckered!!
        }
        _flagCheckered = Builder(name = "FlagCheckered", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.32f, 40.75f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 210.76f, 42.0f)
                curveToRelative(-28.0f, 24.22f, -51.72f, 12.48f, -79.21f, -1.13f)
                curveTo(103.07f, 26.76f, 70.78f, 10.79f, 34.76f, 42.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 32.0f, 48.0f)
                lineTo(32.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(48.0f, 171.77f)
                curveToRelative(26.79f, -21.16f, 49.87f, -9.75f, 76.45f, 3.41f)
                curveToRelative(28.49f, 14.09f, 60.77f, 30.06f, 96.79f, -1.13f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.76f, -6.0f)
                lineTo(224.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 219.32f, 40.75f)
                close()
                moveTo(208.0f, 63.6f)
                verticalLineToRelative(44.65f)
                curveToRelative(-14.0f, 11.06f, -27.0f, 13.22f, -40.0f, 10.88f)
                lineTo(168.0f, 71.34f)
                arcTo(60.05f, 60.05f, 0.0f, false, false, 208.0f, 63.6f)
                close()
                moveTo(152.0f, 67.36f)
                verticalLineToRelative(47.0f)
                curveToRelative(-6.66f, -2.67f, -13.43f, -6.0f, -20.45f, -9.49f)
                curveToRelative(-8.82f, -4.36f, -18.0f, -8.9f, -27.55f, -12.17f)
                verticalLineToRelative(-47.0f)
                curveToRelative(6.66f, 2.66f, 13.43f, 6.0f, 20.45f, 9.48f)
                curveTo(133.27f, 59.55f, 142.46f, 64.09f, 152.0f, 67.36f)
                close()
                moveTo(88.0f, 40.91f)
                lineTo(88.0f, 88.69f)
                arcToRelative(60.06f, 60.06f, 0.0f, false, false, -40.0f, 7.75f)
                lineTo(48.0f, 51.78f)
                curveTo(62.0f, 40.72f, 75.0f, 38.57f, 88.0f, 40.91f)
                close()
                moveTo(78.58f, 144.0f)
                arcTo(60.06f, 60.06f, 0.0f, false, false, 48.0f, 152.43f)
                lineTo(48.0f, 115.78f)
                curveToRelative(14.0f, -11.06f, 27.0f, -13.22f, 40.0f, -10.88f)
                verticalLineToRelative(39.8f)
                arcTo(65.61f, 65.61f, 0.0f, false, false, 78.58f, 144.0f)
                close()
                moveTo(104.0f, 148.67f)
                verticalLineToRelative(-39.0f)
                curveToRelative(6.66f, 2.66f, 13.43f, 6.0f, 20.45f, 9.48f)
                curveToRelative(8.82f, 4.37f, 18.0f, 8.9f, 27.55f, 12.17f)
                verticalLineToRelative(39.0f)
                curveToRelative(-6.66f, -2.67f, -13.43f, -6.0f, -20.45f, -9.48f)
                curveTo(122.73f, 156.47f, 113.54f, 151.94f, 104.0f, 148.67f)
                close()
                moveTo(168.0f, 175.12f)
                verticalLineToRelative(-39.8f)
                arcToRelative(65.61f, 65.61f, 0.0f, false, false, 9.42f, 0.72f)
                arcTo(60.11f, 60.11f, 0.0f, false, false, 208.0f, 127.57f)
                verticalLineToRelative(36.68f)
                curveTo(194.0f, 175.31f, 181.0f, 177.46f, 168.0f, 175.12f)
                close()
            }
        }
        .build()
        return _flagCheckered!!
    }

private var _flagCheckered: ImageVector? = null
