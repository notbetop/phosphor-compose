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

public val BoldGroup.HandWaving: ImageVector
    get() {
        if (_handWaving != null) {
            return _handWaving!!
        }
        _handWaving = Builder(name = "HandWaving", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(81.61f, 247.27f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.8f, 2.41f)
                arcTo(131.23f, 131.23f, 0.0f, false, true, 29.67f, 210.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 20.79f, -12.0f)
                arcToRelative(107.45f, 107.45f, 0.0f, false, false, 28.73f, 32.48f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 81.61f, 247.27f)
                close()
                moveTo(223.66f, 98.0f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 64.31f, 190.0f)
                lineToRelative(-38.0f, -65.82f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 45.46f, 77.33f)
                lineTo(45.0f, 76.46f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 81.0f, 29.55f)
                arcTo(31.7f, 31.7f, 0.0f, false, true, 90.62f, 34.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 143.0f, 38.31f)
                lineTo(155.52f, 60.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 50.14f, 6.84f)
                close()
                moveTo(202.88f, 110.0f)
                lineTo(184.88f, 78.82f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.87f, 8.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(10.0f, 17.31f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -4.39f, 16.39f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -10.25f, 38.25f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -20.79f, 12.0f)
                arcTo(52.09f, 52.09f, 0.0f, false, true, 154.93f, 107.0f)
                lineTo(122.24f, 50.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.86f, 8.0f)
                lineToRelative(26.0f, 45.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -20.79f, 12.0f)
                lineToRelative(-34.0f, -58.89f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.92f, -2.93f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.93f, 10.93f)
                lineToRelative(38.0f, 65.81f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -20.79f, 12.0f)
                lineToRelative(-22.0f, -38.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -13.85f, 8.0f)
                lineTo(85.1f, 178.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, 117.78f, -68.0f)
                close()
                moveTo(240.3f, 46.81f)
                arcToRelative(71.5f, 71.5f, 0.0f, false, false, -43.72f, -33.55f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -6.21f, 23.19f)
                arcToRelative(47.65f, 47.65f, 0.0f, false, true, 29.15f, 22.36f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 20.78f, -12.0f)
                close()
            }
        }
        .build()
        return _handWaving!!
    }

private var _handWaving: ImageVector? = null
