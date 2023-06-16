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

public val FillGroup.Export: ImageVector
    get() {
        if (_export != null) {
            return _export!!
        }
        _export = Builder(name = "Export", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 96.0f)
                lineTo(120.0f, 96.0f)
                lineTo(120.0f, 43.31f)
                lineTo(93.66f, 69.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 82.34f, 58.34f)
                lineToRelative(40.0f, -40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f)
                lineToRelative(40.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                lineTo(136.0f, 43.31f)
                close()
                moveTo(200.0f, 96.0f)
                lineTo(136.0f, 96.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 96.0f)
                lineTo(56.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(200.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 112.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 200.0f, 96.0f)
                close()
            }
        }
        .build()
        return _export!!
    }

private var _export: ImageVector? = null
