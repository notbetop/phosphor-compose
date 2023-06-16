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

public val BoldGroup.Headphones: ImageVector
    get() {
        if (_headphones != null) {
            return _headphones!!
        }
        _headphones = Builder(name = "Headphones", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.73f, 59.85f)
                arcTo(108.07f, 108.07f, 0.0f, false, false, 20.0f, 136.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, 28.0f)
                lineTo(64.0f, 220.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, -28.0f)
                lineTo(92.0f, 152.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -28.0f, -28.0f)
                lineTo(44.84f, 124.0f)
                arcTo(84.05f, 84.05f, 0.0f, false, true, 128.0f, 52.0f)
                horizontalLineToRelative(0.64f)
                arcToRelative(83.7f, 83.7f, 0.0f, false, true, 82.52f, 72.0f)
                lineTo(192.0f, 124.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -28.0f, 28.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, 28.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, -28.0f)
                lineTo(236.0f, 136.0f)
                arcTo(107.34f, 107.34f, 0.0f, false, false, 204.73f, 59.85f)
                close()
                moveTo(64.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(48.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(44.0f, 148.0f)
                close()
                moveTo(212.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(192.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(188.0f, 152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(20.0f)
                close()
            }
        }
        .build()
        return _headphones!!
    }

private var _headphones: ImageVector? = null
