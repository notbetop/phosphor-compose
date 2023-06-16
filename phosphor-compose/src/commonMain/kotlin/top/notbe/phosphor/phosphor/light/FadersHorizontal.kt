package top.notbe.phosphor.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.LightGroup

public val LightGroup.FadersHorizontal: ImageVector
    get() {
        if (_fadersHorizontal != null) {
            return _fadersHorizontal!!
        }
        _fadersHorizontal = Builder(name = "FadersHorizontal", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(34.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                lineTo(72.0f, 74.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(40.0f, 86.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 34.0f, 80.0f)
                close()
                moveTo(216.0f, 170.0f)
                lineTo(174.0f, 170.0f)
                lineTo(174.0f, 152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(174.0f, 182.0f)
                horizontalLineToRelative(42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(136.0f, 170.0f)
                lineTo(40.0f, 170.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(104.0f, 110.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(110.0f, 86.0f)
                lineTo(216.0f, 86.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(110.0f, 74.0f)
                lineTo(110.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(48.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 104.0f, 110.0f)
                close()
            }
        }
        .build()
        return _fadersHorizontal!!
    }

private var _fadersHorizontal: ImageVector? = null
