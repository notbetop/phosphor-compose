package top.notbe.phosphor.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.DuotoneGroup

public val DuotoneGroup.DotsThreeOutline: ImageVector
    get() {
        if (_dotsThreeOutline != null) {
            return _dotsThreeOutline!!
        }
        _dotsThreeOutline = Builder(name = "DotsThreeOutline", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(152.0f, 128.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 152.0f, 128.0f)
                close()
                moveTo(48.0f, 104.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 48.0f, 104.0f)
                close()
                moveTo(208.0f, 104.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 208.0f, 104.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 96.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 128.0f, 96.0f)
                close()
                moveTo(128.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 144.0f)
                close()
                moveTo(48.0f, 96.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 48.0f, 96.0f)
                close()
                moveTo(48.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 144.0f)
                close()
                moveTo(208.0f, 96.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 208.0f, 96.0f)
                close()
                moveTo(208.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 208.0f, 144.0f)
                close()
            }
        }
        .build()
        return _dotsThreeOutline!!
    }

private var _dotsThreeOutline: ImageVector? = null