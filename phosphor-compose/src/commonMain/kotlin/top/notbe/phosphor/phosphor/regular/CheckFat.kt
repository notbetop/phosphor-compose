package top.notbe.phosphor.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.RegularGroup

public val RegularGroup.CheckFat: ImageVector
    get() {
        if (_checkFat != null) {
            return _checkFat!!
        }
        _checkFat = Builder(name = "CheckFat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.28f, 68.24f)
                lineToRelative(-24.0f, -23.56f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.58f, 0.0f)
                lineTo(104.0f, 136.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-0.11f, -0.11f)
                lineTo(67.25f, 100.62f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.57f, 0.06f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.61f)
                lineToRelative(71.62f, 72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.63f, 0.0f)
                lineTo(243.33f, 90.91f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 243.28f, 68.24f)
                close()
                moveTo(103.62f, 208.0f)
                lineTo(32.0f, 136.0f)
                lineToRelative(24.0f, -24.0f)
                lineToRelative(0.11f, 0.11f)
                lineToRelative(36.64f, 35.27f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.52f, 0.0f)
                lineTo(208.06f, 56.0f)
                lineTo(232.0f, 79.6f)
                close()
            }
        }
        .build()
        return _checkFat!!
    }

private var _checkFat: ImageVector? = null
