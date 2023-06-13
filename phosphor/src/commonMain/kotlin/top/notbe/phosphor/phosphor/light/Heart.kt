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

public val LightGroup.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(178.0f, 34.0f)
                curveToRelative(-21.0f, 0.0f, -39.26f, 9.47f, -50.0f, 25.34f)
                curveTo(117.26f, 43.47f, 99.0f, 34.0f, 78.0f, 34.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 18.0f, 94.0f)
                curveToRelative(0.0f, 29.2f, 18.2f, 59.59f, 54.1f, 90.31f)
                arcToRelative(334.68f, 334.68f, 0.0f, false, false, 53.06f, 37.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.68f, 0.0f)
                arcToRelative(334.68f, 334.68f, 0.0f, false, false, 53.06f, -37.0f)
                curveTo(219.8f, 153.59f, 238.0f, 123.2f, 238.0f, 94.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 178.0f, 34.0f)
                close()
                moveTo(128.0f, 209.11f)
                curveTo(111.59f, 199.64f, 30.0f, 149.72f, 30.0f, 94.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, true, 78.0f, 46.0f)
                curveToRelative(20.28f, 0.0f, 37.31f, 10.83f, 44.45f, 28.27f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 11.1f, 0.0f)
                curveTo(140.69f, 56.83f, 157.72f, 46.0f, 178.0f, 46.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, true, 48.0f, 48.0f)
                curveTo(226.0f, 149.72f, 144.41f, 199.64f, 128.0f, 209.11f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
