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

public val FillGroup.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.5f, 114.38f)
                lineToRelative(-45.1f, 39.36f)
                lineToRelative(13.51f, 58.6f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -23.84f, 17.34f)
                lineToRelative(-51.11f, -31.0f)
                lineToRelative(-51.0f, 31.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -23.84f, -17.34f)
                lineTo(66.61f, 153.8f)
                lineTo(21.5f, 114.38f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 9.11f, -28.06f)
                lineToRelative(59.46f, -5.15f)
                lineToRelative(23.21f, -55.36f)
                arcToRelative(15.95f, 15.95f, 0.0f, false, true, 29.44f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineTo(166.0f, 81.17f)
                lineToRelative(59.44f, 5.15f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 9.11f, 28.06f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
