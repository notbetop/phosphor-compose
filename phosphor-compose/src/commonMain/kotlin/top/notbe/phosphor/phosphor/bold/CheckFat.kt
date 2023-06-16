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

public val BoldGroup.CheckFat: ImageVector
    get() {
        if (_checkFat != null) {
            return _checkFat!!
        }
        _checkFat = Builder(name = "CheckFat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.15f, 65.46f)
                lineToRelative(-0.07f, -0.07f)
                lineTo(222.15f, 41.85f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.22f, -0.06f)
                lineToRelative(-90.0f, 88.62f)
                lineTo(70.0f, 97.76f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.19f, 0.1f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 28.26f)
                lineToRelative(71.62f, 72.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.29f, 0.0f)
                lineTo(246.15f, 93.74f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 246.15f, 65.46f)
                close()
                moveTo(103.61f, 202.33f)
                lineTo(37.64f, 136.0f)
                lineTo(56.05f, 117.6f)
                lineTo(90.0f, 150.24f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.12f, 0.0f)
                lineTo(208.0f, 61.61f)
                lineToRelative(18.32f, 18.0f)
                close()
            }
        }
        .build()
        return _checkFat!!
    }

private var _checkFat: ImageVector? = null
