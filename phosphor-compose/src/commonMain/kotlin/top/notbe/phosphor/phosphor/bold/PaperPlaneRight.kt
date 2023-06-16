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

public val BoldGroup.PaperPlaneRight: ImageVector
    get() {
        if (_paperPlaneRight != null) {
            return _paperPlaneRight!!
        }
        _paperPlaneRight = Builder(name = "PaperPlaneRight", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.86f, 110.48f)
                lineTo(57.8f, 14.58f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 29.16f, 38.67f)
                lineToRelative(30.61f, 89.21f)
                lineTo(29.16f, 217.33f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 48.0f, 244.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 9.81f, -2.58f)
                lineToRelative(0.09f, -0.06f)
                lineToRelative(168.0f, -96.07f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, -34.81f)
                close()
                moveTo(55.24f, 215.23f)
                lineTo(81.0f, 140.0f)
                horizontalLineToRelative(55.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(81.07f)
                lineTo(55.25f, 40.76f)
                lineToRelative(152.69f, 87.13f)
                close()
            }
        }
        .build()
        return _paperPlaneRight!!
    }

private var _paperPlaneRight: ImageVector? = null
