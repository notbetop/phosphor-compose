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

public val FillGroup.ShirtFolded: ImageVector
    get() {
        if (_shirtFolded != null) {
            return _shirtFolded!!
        }
        _shirtFolded = Builder(name = "ShirtFolded", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.0f, 48.0f)
                lineTo(179.35f, 48.0f)
                lineTo(165.66f, 34.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 32.0f)
                lineTo(96.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 2.34f)
                lineTo(76.65f, 48.0f)
                lineTo(55.0f, 48.0f)
                arcTo(15.0f, 15.0f, 0.0f, false, false, 40.0f, 63.0f)
                lineTo(40.0f, 217.0f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, false, 15.0f, 15.0f)
                horizontalLineToRelative(61.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(120.0f, 112.27f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, true, 7.47f, -8.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.53f, 8.0f)
                lineTo(136.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(61.0f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, false, 15.0f, -15.0f)
                lineTo(216.0f, 63.0f)
                arcTo(15.0f, 15.0f, 0.0f, false, false, 201.0f, 48.0f)
                close()
                moveTo(86.54f, 115.08f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 80.0f, 112.0f)
                lineTo(80.0f, 67.31f)
                lineTo(95.24f, 52.07f)
                lineToRelative(23.47f, 35.21f)
                close()
                moveTo(128.0f, 88.0f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(0.0f)
                close()
                moveTo(176.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.3f, 3.63f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, true, -4.21f, -0.51f)
                lineToRelative(-32.2f, -27.82f)
                lineToRelative(23.47f, -35.21f)
                lineTo(176.0f, 67.31f)
                close()
            }
        }
        .build()
        return _shirtFolded!!
    }

private var _shirtFolded: ImageVector? = null
