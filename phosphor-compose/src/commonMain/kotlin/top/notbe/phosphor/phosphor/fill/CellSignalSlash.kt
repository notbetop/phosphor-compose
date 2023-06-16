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

public val FillGroup.CellSignalSlash: ImageVector
    get() {
        if (_cellSignalSlash != null) {
            return _cellSignalSlash!!
        }
        _cellSignalSlash = Builder(name = "CellSignalSlash", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.38f, 221.92f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.3f, -0.54f)
                lineTo(197.19f, 216.0f)
                horizontalLineTo(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -11.32f, -27.32f)
                lineToRelative(79.45f, -79.44f)
                lineTo(42.07f, 45.38f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 53.91f, 34.61f)
                lineToRelative(160.0f, 176.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 213.38f, 221.92f)
                close()
                moveTo(194.08f, 165.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 159.63f)
                verticalLineTo(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 180.69f, 28.7f)
                lineTo(128.18f, 81.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.26f, 11.0f)
                close()
            }
        }
        .build()
        return _cellSignalSlash!!
    }

private var _cellSignalSlash: ImageVector? = null
