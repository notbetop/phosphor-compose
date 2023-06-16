package top.notbe.phosphor.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.ThinGroup

public val ThinGroup.WindowsLogo: ImageVector
    get() {
        if (_windowsLogo != null) {
            return _windowsLogo!!
        }
        _windowsLogo = Builder(name = "WindowsLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 140.0f)
                lineTo(136.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(57.45f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.28f, 3.94f)
                lineToRelative(80.0f, 14.55f)
                arcToRelative(4.37f, 4.37f, 0.0f, false, false, 0.72f, 0.06f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.56f, -0.93f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 220.0f, 216.0f)
                lineTo(220.0f, 144.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 216.0f, 140.0f)
                close()
                moveTo(212.0f, 211.21f)
                lineTo(140.0f, 198.12f)
                lineTo(140.0f, 148.0f)
                horizontalLineToRelative(72.0f)
                close()
                moveTo(104.0f, 140.0f)
                lineTo(40.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.28f, 3.94f)
                lineToRelative(64.0f, 11.63f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, false, 0.72f, 0.07f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(108.0f, 144.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 104.0f, 140.0f)
                close()
                moveTo(100.0f, 190.84f)
                lineTo(44.0f, 180.66f)
                lineTo(44.0f, 148.0f)
                horizontalLineToRelative(56.0f)
                close()
                moveTo(218.56f, 36.93f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.28f, -0.87f)
                lineToRelative(-80.0f, 14.55f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 132.0f, 54.55f)
                lineTo(132.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(220.0f, 40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 218.56f, 36.93f)
                close()
                moveTo(212.0f, 108.0f)
                lineTo(140.0f, 108.0f)
                lineTo(140.0f, 57.88f)
                lineToRelative(72.0f, -13.09f)
                close()
                moveTo(103.28f, 56.43f)
                lineToRelative(-64.0f, 11.63f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 36.0f, 72.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(108.0f, 60.36f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.72f, -3.93f)
                close()
                moveTo(100.0f, 108.0f)
                lineTo(44.0f, 108.0f)
                lineTo(44.0f, 75.34f)
                lineToRelative(56.0f, -10.18f)
                close()
            }
        }
        .build()
        return _windowsLogo!!
    }

private var _windowsLogo: ImageVector? = null
