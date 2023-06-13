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

public val LightGroup.Headphones: ImageVector
    get() {
        if (_headphones != null) {
            return _headphones!!
        }
        _headphones = Builder(name = "Headphones", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.47f, 64.07f)
                arcTo(101.37f, 101.37f, 0.0f, false, false, 128.77f, 34.0f)
                lineTo(128.0f, 34.0f)
                arcTo(102.0f, 102.0f, 0.0f, false, false, 26.0f, 136.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, 22.0f)
                lineTo(64.0f, 214.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, -22.0f)
                lineTo(86.0f, 152.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -22.0f, -22.0f)
                lineTo(38.2f, 130.0f)
                arcTo(90.12f, 90.12f, 0.0f, false, true, 192.0f, 72.52f)
                arcTo(89.41f, 89.41f, 0.0f, false, true, 217.81f, 130.0f)
                lineTo(192.0f, 130.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -22.0f, 22.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, 22.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, -22.0f)
                lineTo(230.0f, 136.0f)
                arcTo(101.44f, 101.44f, 0.0f, false, false, 200.47f, 64.07f)
                close()
                moveTo(64.0f, 142.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, 10.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, 10.0f)
                lineTo(48.0f, 202.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, -10.0f)
                lineTo(38.0f, 142.0f)
                close()
                moveTo(218.0f, 192.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, 10.0f)
                lineTo(192.0f, 202.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, -10.0f)
                lineTo(182.0f, 152.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, -10.0f)
                horizontalLineToRelative(26.0f)
                close()
            }
        }
        .build()
        return _headphones!!
    }

private var _headphones: ImageVector? = null
