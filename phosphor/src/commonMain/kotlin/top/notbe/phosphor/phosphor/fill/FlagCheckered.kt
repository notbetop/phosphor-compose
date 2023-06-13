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

public val FillGroup.FlagCheckered: ImageVector
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
                horizontalLineToRelative(0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 32.0f, 48.0f)
                lineTo(32.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(48.0f, 171.77f)
                curveToRelative(26.79f, -21.16f, 49.87f, -9.75f, 76.45f, 3.41f)
                curveToRelative(16.4f, 8.11f, 34.06f, 16.85f, 53.0f, 16.85f)
                curveToRelative(13.93f, 0.0f, 28.54f, -4.75f, 43.82f, -18.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.76f, -6.0f)
                lineTo(224.03f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 219.32f, 40.75f)
                close()
                moveTo(48.0f, 152.44f)
                lineTo(48.0f, 105.88f)
                curveTo(64.85f, 94.6f, 80.64f, 94.29f, 96.0f, 98.54f)
                verticalLineToRelative(47.74f)
                curveTo(80.87f, 142.47f, 64.87f, 142.71f, 48.0f, 152.44f)
                close()
                moveTo(208.0f, 164.25f)
                curveToRelative(-16.87f, 13.32f, -32.27f, 13.72f, -48.0f, 8.91f)
                lineTo(160.0f, 125.49f)
                curveToRelative(-21.62f, -6.0f, -42.38f, -21.0f, -64.0f, -26.95f)
                horizontalLineToRelative(0.0f)
                lineTo(96.0f, 42.87f)
                curveToRelative(9.25f, 2.83f, 18.61f, 7.45f, 28.45f, 12.32f)
                curveToRelative(11.26f, 5.57f, 23.11f, 11.43f, 35.55f, 14.56f)
                verticalLineToRelative(55.74f)
                curveToRelative(15.35f, 4.25f, 31.14f, 3.94f, 48.0f, -7.35f)
                close()
            }
        }
        .build()
        return _flagCheckered!!
    }

private var _flagCheckered: ImageVector? = null
