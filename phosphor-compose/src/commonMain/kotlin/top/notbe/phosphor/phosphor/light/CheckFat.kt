package top.notbe.phosphor.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.LightGroup

public val LightGroup.CheckFat: ImageVector
    get() {
        if (_checkFat != null) {
            return _checkFat!!
        }
        _checkFat = Builder(name = "CheckFat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.87f, 69.66f)
                lineToRelative(-24.0f, -23.56f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.77f, 0.0f)
                lineToRelative(-92.72f, 91.34f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.83f, 0.0f)
                lineToRelative(-0.09f, -0.08f)
                lineTo(65.85f, 102.05f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.75f, 0.0f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 19.79f)
                lineToRelative(71.62f, 72.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.8f, 0.0f)
                lineTo(241.91f, 89.5f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 241.87f, 69.66f)
                close()
                moveTo(233.42f, 81.0f)
                lineTo(105.0f, 209.41f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.81f, 0.0f)
                lineToRelative(-71.62f, -72.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.82f)
                lineToRelative(24.0f, -24.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 56.0f, 110.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.41f, 0.58f)
                lineToRelative(0.08f, 0.08f)
                lineToRelative(36.66f, 35.28f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.72f, 0.0f)
                lineToRelative(92.72f, -91.35f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.87f, 0.0f)
                lineToRelative(24.0f, 23.56f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 233.42f, 81.0f)
                close()
            }
        }
        .build()
        return _checkFat!!
    }

private var _checkFat: ImageVector? = null
