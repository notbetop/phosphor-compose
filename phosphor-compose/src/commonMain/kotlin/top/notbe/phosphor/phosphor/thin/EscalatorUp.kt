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

public val ThinGroup.EscalatorUp: ImageVector
    get() {
        if (_escalatorUp != null) {
            return _escalatorUp!!
        }
        _escalatorUp = Builder(name = "EscalatorUp", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 44.0f)
                lineTo(171.5f, 44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.81f, 3.86f)
                lineTo(71.44f, 146.71f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 68.5f, 148.0f)
                lineTo(32.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(84.5f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.81f, -3.86f)
                lineToRelative(91.25f, -98.85f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 187.5f, 108.0f)
                lineTo(224.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(236.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 44.0f)
                close()
                moveTo(228.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(187.5f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.81f, 3.86f)
                lineTo(87.44f, 202.71f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 84.5f, 204.0f)
                lineTo(32.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(28.0f, 160.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(68.5f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.81f, -3.86f)
                lineToRelative(91.25f, -98.85f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 171.5f, 52.0f)
                lineTo(224.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(226.83f, 173.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f)
                lineTo(204.0f, 161.66f)
                lineTo(204.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(196.0f, 161.66f)
                lineToRelative(-17.17f, 17.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                close()
            }
        }
        .build()
        return _escalatorUp!!
    }

private var _escalatorUp: ImageVector? = null
