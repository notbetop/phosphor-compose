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

public val FillGroup.Rug: ImageVector
    get() {
        if (_rug != null) {
            return _rug!!
        }
        _rug = Builder(name = "Rug", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(192.0f, 40.0f)
                lineTo(160.0f, 40.0f)
                lineTo(160.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(144.0f, 40.0f)
                lineTo(112.0f, 40.0f)
                lineTo(112.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(96.0f, 40.0f)
                lineTo(64.0f, 40.0f)
                lineTo(64.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(48.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(64.0f, 216.0f)
                lineTo(96.0f, 216.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(112.0f, 216.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(160.0f, 216.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(208.0f, 24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 16.0f)
                close()
                moveTo(64.0f, 56.0f)
                lineTo(192.0f, 56.0f)
                lineTo(192.0f, 200.0f)
                lineTo(64.0f, 200.0f)
                close()
                moveTo(121.14f, 172.12f)
                lineTo(97.14f, 132.12f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -8.24f)
                lineToRelative(24.0f, -40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.72f, 0.0f)
                lineToRelative(24.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 8.24f)
                lineToRelative(-24.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.72f, 0.0f)
                close()
            }
        }
        .build()
        return _rug!!
    }

private var _rug: ImageVector? = null
