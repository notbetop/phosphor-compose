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

public val BoldGroup.VinylRecord: ImageVector
    get() {
        if (_vinylRecord != null) {
            return _vinylRecord!!
        }
        _vinylRecord = Builder(name = "VinylRecord", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 84.0f, -84.0f)
                arcTo(84.09f, 84.09f, 0.0f, false, true, 128.0f, 212.0f)
                close()
                moveTo(128.0f, 88.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -40.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, true, 64.0f, -64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                close()
                moveTo(192.0f, 128.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, true, -64.0f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, -40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(128.0f, 148.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 148.0f)
                close()
            }
        }
        .build()
        return _vinylRecord!!
    }

private var _vinylRecord: ImageVector? = null
