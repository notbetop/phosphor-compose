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

public val FillGroup.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) {
            return _paperPlane!!
        }
        _paperPlane = Builder(name = "PaperPlane", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.2f, 218.3f)
                arcToRelative(15.87f, 15.87f, 0.0f, false, true, -17.54f, 4.76f)
                lineTo(138.71f, 195.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.71f, -3.79f)
                verticalLineTo(120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.53f, -8.0f)
                arcToRelative(8.19f, 8.19f, 0.0f, false, false, -7.47f, 8.26f)
                verticalLineToRelative(71.57f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.7f, 3.79f)
                lineToRelative(-80.0f, 27.44f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -19.25f, -22.92f)
                lineTo(114.0f, 32.13f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 27.89f, 0.0f)
                lineTo(237.9f, 200.09f)
                arcTo(15.89f, 15.89f, 0.0f, false, true, 236.2f, 218.3f)
                close()
            }
        }
        .build()
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
