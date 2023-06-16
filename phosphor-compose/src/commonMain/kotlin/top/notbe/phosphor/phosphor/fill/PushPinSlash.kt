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

public val FillGroup.PushPinSlash: ImageVector
    get() {
        if (_pushPinSlash != null) {
            return _pushPinSlash!!
        }
        _pushPinSlash = Builder(name = "PushPinSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.93f, 210.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.84f, 10.76f)
                lineToRelative(-21.84f, -24.0f)
                arcToRelative(89.75f, 89.75f, 0.0f, false, true, -11.58f, 20.27f)
                arcTo(15.93f, 15.93f, 0.0f, false, true, 157.0f, 224.0f)
                curveToRelative(-0.38f, 0.0f, -0.75f, 0.0f, -1.13f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -11.32f, -4.69f)
                lineTo(96.29f, 171.0f)
                lineTo(53.66f, 213.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineTo(85.0f, 159.71f)
                lineToRelative(-48.3f, -48.3f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 38.0f, 87.63f)
                arcTo(69.82f, 69.82f, 0.0f, false, true, 67.37f, 73.2f)
                lineTo(42.08f, 45.38f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 53.92f, 34.62f)
                lineTo(182.3f, 175.83f)
                lineToRelative(0.0f, 0.0f)
                close()
                moveTo(235.32f, 81.37f)
                lineTo(174.63f, 20.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.63f, 0.0f)
                lineTo(110.77f, 62.06f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.25f, 11.0f)
                lineToRelative(68.57f, 75.43f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.74f, 2.62f)
                horizontalLineTo(185.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.66f, -2.35f)
                lineTo(235.32f, 104.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 235.32f, 81.37f)
                close()
            }
        }
        .build()
        return _pushPinSlash!!
    }

private var _pushPinSlash: ImageVector? = null
