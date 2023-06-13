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

public val FillGroup.FaceMask: ImageVector
    get() {
        if (_faceMask != null) {
            return _faceMask!!
        }
        _faceMask = Builder(name = "FaceMask", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 72.0f)
                horizontalLineToRelative(-0.85f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -9.68f, -10.0f)
                lineTo(133.47f, 33.0f)
                arcToRelative(16.06f, 16.06f, 0.0f, false, false, -10.94f, 0.0f)
                lineToRelative(-80.0f, 29.09f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -9.68f, 10.0f)
                lineTo(32.0f, 72.09f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 0.0f, 104.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                horizontalLineToRelative(5.13f)
                curveToRelative(6.54f, 14.44f, 19.26f, 27.12f, 37.7f, 37.36f)
                curveToRelative(21.0f, 11.68f, 43.52f, 17.0f, 49.92f, 18.3f)
                arcToRelative(15.7f, 15.7f, 0.0f, false, false, 6.5f, 0.0f)
                curveToRelative(6.4f, -1.34f, 28.9f, -6.62f, 49.92f, -18.3f)
                curveToRelative(18.44f, -10.24f, 31.16f, -22.92f, 37.7f, -37.36f)
                lineTo(224.0f, 160.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                lineTo(256.0f, 104.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 224.0f, 72.0f)
                close()
                moveTo(32.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(16.0f, 104.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 32.0f, 88.0f)
                verticalLineToRelative(48.15f)
                arcToRelative(59.94f, 59.94f, 0.0f, false, false, 0.53f, 7.85f)
                close()
                moveTo(168.0f, 144.0f)
                lineTo(88.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(168.0f, 112.0f)
                lineTo(88.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(240.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineToRelative(-0.53f)
                arcToRelative(59.94f, 59.94f, 0.0f, false, false, 0.53f, -7.85f)
                lineTo(224.0f, 88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                close()
            }
        }
        .build()
        return _faceMask!!
    }

private var _faceMask: ImageVector? = null
