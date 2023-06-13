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

public val FillGroup.GoodreadsLogo: ImageVector
    get() {
        if (_goodreadsLogo != null) {
            return _goodreadsLogo!!
        }
        _goodreadsLogo = Builder(name = "GoodreadsLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 104.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -64.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 64.0f, 0.0f)
                close()
                moveTo(232.0f, 128.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, true, 128.0f, 24.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, true, 232.0f, 128.0f)
                close()
                moveTo(176.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(4.26f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 80.0f, 104.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 80.0f, 35.74f)
                lineTo(160.0f, 160.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -57.6f, 19.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -12.8f, 9.6f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 176.0f, 160.0f)
                close()
            }
        }
        .build()
        return _goodreadsLogo!!
    }

private var _goodreadsLogo: ImageVector? = null
