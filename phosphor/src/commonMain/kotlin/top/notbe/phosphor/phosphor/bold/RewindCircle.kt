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

public val BoldGroup.RewindCircle: ImageVector
    get() {
        if (_rewindCircle != null) {
            return _rewindCircle!!
        }
        _rewindCircle = Builder(name = "RewindCircle", defaultWidth = 256.0.dp, defaultHeight =
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
                moveTo(180.0f, 100.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -19.37f, 9.47f)
                lineToRelative(-36.0f, -28.0f)
                curveToRelative(-0.22f, -0.17f, -0.42f, -0.36f, -0.63f, -0.55f)
                lineTo(124.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -19.37f, 9.47f)
                lineToRelative(-36.0f, -28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -18.94f)
                lineToRelative(36.0f, -28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 124.0f, 100.0f)
                verticalLineToRelative(19.08f)
                curveToRelative(0.21f, -0.19f, 0.41f, -0.38f, 0.63f, -0.55f)
                lineToRelative(36.0f, -28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 180.0f, 100.0f)
                close()
            }
        }
        .build()
        return _rewindCircle!!
    }

private var _rewindCircle: ImageVector? = null
