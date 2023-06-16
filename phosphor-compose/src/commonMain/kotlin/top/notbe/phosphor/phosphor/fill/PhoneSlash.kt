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

public val FillGroup.PhoneSlash: ImageVector
    get() {
        if (_phoneSlash != null) {
            return _phoneSlash!!
        }
        _phoneSlash = Builder(name = "PhoneSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.91f, 210.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.84f, 10.76f)
                lineToRelative(-90.51f, -99.57f)
                arcToRelative(75.89f, 75.89f, 0.0f, false, false, -8.56f, 2.4f)
                lineToRelative(-5.9f, 29.51f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -9.75f, 11.72f)
                lineToRelative(-0.29f, 0.11f)
                lineToRelative(-49.0f, 17.37f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -18.38f, -5.07f)
                curveToRelative(-17.23f, -22.21f, -15.3f, -51.68f, 4.69f, -71.67f)
                arcTo(141.26f, 141.26f, 0.0f, false, true, 69.68f, 75.74f)
                lineTo(42.09f, 45.38f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 53.93f, 34.62f)
                close()
                moveTo(231.59f, 106.18f)
                curveToRelative(-28.86f, -28.87f, -69.5f, -44.16f, -111.49f, -42.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.5f, 13.37f)
                lineToRelative(90.81f, 99.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.24f, 2.16f)
                lineToRelative(9.25f, 3.28f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 18.38f, -5.07f)
                curveTo(253.51f, 155.64f, 251.58f, 126.17f, 231.59f, 106.18f)
                close()
            }
        }
        .build()
        return _phoneSlash!!
    }

private var _phoneSlash: ImageVector? = null
