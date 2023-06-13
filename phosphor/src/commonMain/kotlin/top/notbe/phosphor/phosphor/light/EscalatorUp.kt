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

public val LightGroup.EscalatorUp: ImageVector
    get() {
        if (_escalatorUp != null) {
            return _escalatorUp!!
        }
        _escalatorUp = Builder(name = "EscalatorUp", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 42.0f)
                lineTo(171.5f, 42.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -10.28f, 4.5f)
                lineTo(70.0f, 145.36f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.47f, 0.64f)
                lineTo(32.0f, 146.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 14.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(84.5f, 214.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 10.28f, -4.5f)
                lineTo(186.0f, 110.64f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.47f, -0.64f)
                lineTo(224.0f, 110.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(238.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 224.0f, 42.0f)
                close()
                moveTo(226.0f, 96.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(187.5f, 98.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -10.28f, 4.5f)
                lineTo(86.0f, 201.36f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.47f, 0.64f)
                lineTo(32.0f, 202.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(30.0f, 160.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(68.5f, 158.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 10.28f, -4.5f)
                lineTo(170.0f, 54.64f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 171.5f, 54.0f)
                lineTo(224.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(228.24f, 171.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, 8.48f)
                lineTo(206.0f, 166.49f)
                lineTo(206.0f, 208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(194.0f, 166.49f)
                lineToRelative(-13.76f, 13.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 0.0f)
                close()
            }
        }
        .build()
        return _escalatorUp!!
    }

private var _escalatorUp: ImageVector? = null
