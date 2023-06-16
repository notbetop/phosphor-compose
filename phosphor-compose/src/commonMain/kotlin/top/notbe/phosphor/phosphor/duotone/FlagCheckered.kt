package top.notbe.phosphor.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.DuotoneGroup

public val DuotoneGroup.FlagCheckered: ImageVector
    get() {
        if (_flagCheckered != null) {
            return _flagCheckered!!
        }
        _flagCheckered = Builder(name = "FlagCheckered", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 48.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(-19.89f, 17.23f, -38.23f, 18.39f, -56.0f, 13.48f)
                verticalLineToRelative(-64.0f)
                curveTo(177.76f, 66.39f, 196.11f, 65.23f, 216.0f, 48.0f)
                close()
                moveTo(96.0f, 98.52f)
                verticalLineToRelative(-64.0f)
                curveTo(78.24f, 29.61f, 59.89f, 30.77f, 40.0f, 48.0f)
                verticalLineToRelative(64.0f)
                curveTo(59.89f, 94.78f, 78.23f, 93.61f, 96.0f, 98.52f)
                verticalLineToRelative(56.0f)
                curveToRelative(21.62f, 6.0f, 42.38f, 21.0f, 64.0f, 27.0f)
                verticalLineToRelative(-56.0f)
                curveToRelative(-21.62f, -6.0f, -42.38f, -21.0f, -64.0f, -27.0f)
                close()
            }
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
                moveTo(88.0f, 144.7f)
                arcToRelative(65.5f, 65.5f, 0.0f, false, false, -9.42f, -0.71f)
                arcTo(60.06f, 60.06f, 0.0f, false, false, 48.0f, 152.43f)
                lineTo(48.0f, 115.78f)
                curveToRelative(14.0f, -11.06f, 27.0f, -13.22f, 40.0f, -10.88f)
                close()
                moveTo(88.0f, 88.7f)
                arcToRelative(60.06f, 60.06f, 0.0f, false, false, -40.0f, 7.75f)
                lineTo(48.0f, 51.78f)
                curveTo(62.0f, 40.72f, 75.0f, 38.57f, 88.0f, 40.91f)
                close()
                moveTo(152.0f, 170.33f)
                curveToRelative(-6.66f, -2.67f, -13.43f, -6.0f, -20.45f, -9.48f)
                curveToRelative(-8.82f, -4.37f, -18.0f, -8.9f, -27.55f, -12.17f)
                verticalLineToRelative(-39.0f)
                curveToRelative(6.66f, 2.66f, 13.43f, 6.0f, 20.45f, 9.48f)
                curveToRelative(8.82f, 4.37f, 18.0f, 8.9f, 27.55f, 12.17f)
                close()
                moveTo(152.0f, 114.33f)
                curveToRelative(-6.66f, -2.67f, -13.43f, -6.0f, -20.45f, -9.49f)
                curveToRelative(-8.82f, -4.36f, -18.0f, -8.9f, -27.55f, -12.17f)
                verticalLineToRelative(-47.0f)
                curveToRelative(6.66f, 2.66f, 13.43f, 6.0f, 20.45f, 9.48f)
                curveToRelative(8.82f, 4.36f, 18.0f, 8.9f, 27.55f, 12.17f)
                close()
                moveTo(208.0f, 164.25f)
                curveToRelative(-14.0f, 11.06f, -27.0f, 13.21f, -40.0f, 10.87f)
                verticalLineToRelative(-39.8f)
                arcToRelative(65.5f, 65.5f, 0.0f, false, false, 9.42f, 0.72f)
                arcTo(60.11f, 60.11f, 0.0f, false, false, 208.0f, 127.57f)
                close()
                moveTo(208.0f, 108.25f)
                curveToRelative(-14.0f, 11.06f, -27.0f, 13.22f, -40.0f, 10.88f)
                lineTo(168.0f, 71.34f)
                arcToRelative(60.05f, 60.05f, 0.0f, false, false, 40.0f, -7.74f)
                close()
            }
        }
        .build()
        return _flagCheckered!!
    }

private var _flagCheckered: ImageVector? = null
