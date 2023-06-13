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

public val BoldGroup.FramerLogo: ImageVector
    get() {
        if (_framerLogo != null) {
            return _framerLogo!!
        }
        _framerLogo = Builder(name = "FramerLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 96.0f)
                lineTo(212.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(56.0f, 20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.0f, 21.0f)
                lineTo(96.44f, 84.0f)
                lineTo(56.0f, 84.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 3.52f, 8.49f)
                lineToRelative(72.0f, 72.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 140.0f, 232.0f)
                lineTo(140.0f, 172.0f)
                horizontalLineToRelative(60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.0f, -21.0f)
                lineToRelative(-48.41f, -43.0f)
                lineTo(200.0f, 108.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 212.0f, 96.0f)
                close()
                moveTo(168.44f, 148.0f)
                lineTo(128.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(43.0f)
                lineTo(68.0f, 155.0f)
                lineTo(68.0f, 108.0f)
                horizontalLineToRelative(55.44f)
                close()
                moveTo(188.0f, 84.0f)
                lineTo(132.56f, 84.0f)
                lineToRelative(-45.0f, -40.0f)
                lineTo(188.0f, 44.0f)
                close()
            }
        }
        .build()
        return _framerLogo!!
    }

private var _framerLogo: ImageVector? = null
