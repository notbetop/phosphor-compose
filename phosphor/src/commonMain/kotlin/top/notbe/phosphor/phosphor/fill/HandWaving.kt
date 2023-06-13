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

public val FillGroup.HandWaving: ImageVector
    get() {
        if (_handWaving != null) {
            return _handWaving!!
        }
        _handWaving = Builder(name = "HandWaving", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.27f, 29.93f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.8f, -5.66f)
                curveToRelative(15.9f, 4.27f, 29.0f, 14.11f, 36.86f, 27.73f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.86f, 8.0f)
                curveToRelative(-5.72f, -9.92f, -15.36f, -17.12f, -27.14f, -20.27f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 184.27f, 29.93f)
                close()
                moveTo(79.58f, 225.72f)
                curveToRelative(-9.38f, -7.4f, -17.22f, -16.84f, -24.65f, -29.72f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.86f, 8.0f)
                curveToRelative(8.49f, 14.7f, 17.57f, 25.59f, 28.6f, 34.28f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.91f, -12.56f)
                close()
                moveTo(196.19f, 58.42f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -27.71f, 16.0f)
                lineToRelative(16.0f, 27.71f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.93f, 10.93f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -11.71f, 43.71f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.86f, 8.0f)
                arcToRelative(48.07f, 48.07f, 0.0f, false, true, 11.0f, -61.0f)
                lineTo(126.63f, 33.92f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -27.72f, 16.0f)
                lineToRelative(32.0f, 55.43f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.85f, 8.0f)
                lineToRelative(-40.0f, -69.29f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -27.72f, 16.0f)
                lineToRelative(44.0f, 76.21f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -13.85f, 8.0f)
                lineToRelative(-28.0f, -48.49f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -27.72f, 16.0f)
                lineToRelative(44.0f, 76.21f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 152.42f, -88.0f)
                close()
            }
        }
        .build()
        return _handWaving!!
    }

private var _handWaving: ImageVector? = null
