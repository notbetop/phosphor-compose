package top.notbe.phosphor.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.ThinGroup

public val ThinGroup.MedalMilitary: ImageVector
    get() {
        if (_medalMilitary != null) {
            return _medalMilitary!!
        }
        _medalMilitary = Builder(name = "MedalMilitary", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(207.0f, 36.0f)
                lineTo(49.0f, 36.0f)
                arcTo(13.0f, 13.0f, 0.0f, false, false, 36.0f, 49.0f)
                lineTo(36.0f, 98.21f)
                arcTo(13.0f, 13.0f, 0.0f, false, false, 43.62f, 110.0f)
                lineToRelative(70.72f, 32.14f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 27.32f, 0.0f)
                lineTo(212.38f, 110.0f)
                arcTo(13.0f, 13.0f, 0.0f, false, false, 220.0f, 98.21f)
                lineTo(220.0f, 49.0f)
                arcTo(13.0f, 13.0f, 0.0f, false, false, 207.0f, 36.0f)
                close()
                moveTo(164.0f, 44.0f)
                verticalLineToRelative(79.24f)
                lineToRelative(-36.0f, 16.37f)
                lineTo(92.0f, 123.24f)
                lineTo(92.0f, 44.0f)
                close()
                moveTo(44.0f, 98.21f)
                lineTo(44.0f, 49.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, -5.0f)
                lineTo(84.0f, 44.0f)
                verticalLineToRelative(75.61f)
                lineTo(46.93f, 102.76f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 44.0f, 98.21f)
                close()
                moveTo(164.0f, 184.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, -36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 164.0f, 184.0f)
                close()
                moveTo(212.0f, 98.21f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -2.93f, 4.55f)
                lineTo(172.0f, 119.61f)
                lineTo(172.0f, 44.0f)
                horizontalLineToRelative(35.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _medalMilitary!!
    }

private var _medalMilitary: ImageVector? = null
