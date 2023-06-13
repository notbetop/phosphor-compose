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

public val BoldGroup.BellRinging: ImageVector
    get() {
        if (_bellRinging != null) {
            return _bellRinging!!
        }
        _bellRinging = Builder(name = "BellRinging", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(35.7f, 76.0f)
                arcToRelative(11.86f, 11.86f, 0.0f, false, true, -5.51f, -1.35f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -5.13f, -16.17f)
                arcTo(115.25f, 115.25f, 0.0f, false, true, 65.6f, 13.86f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 78.4f, 34.15f)
                arcToRelative(90.1f, 90.1f, 0.0f, false, false, -32.0f, 35.38f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 35.7f, 76.0f)
                close()
                moveTo(230.94f, 58.48f)
                arcTo(115.25f, 115.25f, 0.0f, false, false, 190.4f, 13.86f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.8f, 20.29f)
                arcToRelative(90.1f, 90.1f, 0.0f, false, true, 32.0f, 35.38f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 220.3f, 76.0f)
                arcToRelative(11.86f, 11.86f, 0.0f, false, false, 5.51f, -1.35f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 230.94f, 58.48f)
                close()
                moveTo(219.88f, 167.88f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 204.0f, 200.0f)
                lineTo(171.26f, 200.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, -86.52f, 0.0f)
                lineTo(52.0f, 200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -15.91f, -32.12f)
                curveToRelative(7.17f, -9.33f, 15.73f, -26.62f, 15.88f, -55.94f)
                arcTo(76.0f, 76.0f, 0.0f, false, true, 204.0f, 112.0f)
                curveTo(204.15f, 141.26f, 212.71f, 158.55f, 219.88f, 167.88f)
                close()
                moveTo(146.32f, 200.0f)
                lineTo(109.68f, 200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 36.64f, 0.0f)
                close()
                moveTo(196.32f, 176.0f)
                curveToRelative(-8.16f, -13.0f, -16.19f, -33.57f, -16.34f, -63.94f)
                arcTo(52.0f, 52.0f, 0.0f, true, false, 76.0f, 112.0f)
                curveToRelative(-0.15f, 30.42f, -8.18f, 51.0f, -16.34f, 64.0f)
                close()
            }
        }
        .build()
        return _bellRinging!!
    }

private var _bellRinging: ImageVector? = null
