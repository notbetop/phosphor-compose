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

public val FillGroup.PhoneCall: ImageVector
    get() {
        if (_phoneCall != null) {
            return _phoneCall!!
        }
        _phoneCall = Builder(name = "PhoneCall", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.27f, 37.93f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.8f, -5.66f)
                arcToRelative(86.22f, 86.22f, 0.0f, false, true, 61.66f, 61.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.66f, 9.8f)
                arcTo(8.23f, 8.23f, 0.0f, false, true, 216.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.73f, -5.93f)
                arcToRelative(70.35f, 70.35f, 0.0f, false, false, -50.33f, -50.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 152.27f, 37.93f)
                close()
                moveTo(149.94f, 79.73f)
                curveToRelative(13.79f, 3.68f, 22.65f, 12.55f, 26.33f, 26.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 184.0f, 112.0f)
                arcToRelative(8.23f, 8.23f, 0.0f, false, false, 2.07f, -0.27f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.66f, -9.8f)
                curveToRelative(-5.12f, -19.16f, -18.5f, -32.54f, -37.66f, -37.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -4.13f, 15.46f)
                close()
                moveTo(222.37f, 158.46f)
                lineTo(175.26f, 137.35f)
                lineTo(175.13f, 137.29f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -15.17f, 1.4f)
                arcToRelative(8.12f, 8.12f, 0.0f, false, false, -0.75f, 0.56f)
                lineTo(134.87f, 160.0f)
                curveToRelative(-15.42f, -7.49f, -31.34f, -23.29f, -38.83f, -38.51f)
                lineToRelative(20.78f, -24.71f)
                curveToRelative(0.2f, -0.25f, 0.39f, -0.5f, 0.57f, -0.77f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 1.32f, -15.06f)
                lineToRelative(0.0f, -0.12f)
                lineTo(97.54f, 33.64f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.62f, -9.52f)
                arcTo(56.26f, 56.26f, 0.0f, false, false, 32.0f, 80.0f)
                curveToRelative(0.0f, 79.4f, 64.6f, 144.0f, 144.0f, 144.0f)
                arcToRelative(56.26f, 56.26f, 0.0f, false, false, 55.88f, -48.92f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 222.37f, 158.46f)
                close()
            }
        }
        .build()
        return _phoneCall!!
    }

private var _phoneCall: ImageVector? = null
