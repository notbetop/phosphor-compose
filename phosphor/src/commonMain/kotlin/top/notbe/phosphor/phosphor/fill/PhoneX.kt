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

public val FillGroup.PhoneX: ImageVector
    get() {
        if (_phoneX != null) {
            return _phoneX!!
        }
        _phoneX = Builder(name = "PhoneX", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(154.34f, 90.34f)
                lineTo(172.69f, 72.0f)
                lineTo(154.34f, 53.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineTo(184.0f, 60.69f)
                lineToRelative(18.34f, -18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                lineTo(195.32f, 72.0f)
                lineToRelative(18.34f, 18.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                lineTo(184.0f, 83.31f)
                lineToRelative(-18.34f, 18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                close()
                moveTo(222.34f, 158.46f)
                lineTo(175.23f, 137.35f)
                lineTo(175.1f, 137.29f)
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
        return _phoneX!!
    }

private var _phoneX: ImageVector? = null
