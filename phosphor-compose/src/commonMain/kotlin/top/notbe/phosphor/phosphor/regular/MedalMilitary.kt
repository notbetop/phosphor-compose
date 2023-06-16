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

public val RegularGroup.MedalMilitary: ImageVector
    get() {
        if (_medalMilitary != null) {
            return _medalMilitary!!
        }
        _medalMilitary = Builder(name = "MedalMilitary", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(207.0f, 32.0f)
                horizontalLineTo(49.0f)
                arcTo(17.0f, 17.0f, 0.0f, false, false, 32.0f, 49.0f)
                verticalLineTo(98.21f)
                arcToRelative(17.0f, 17.0f, 0.0f, false, false, 10.0f, 15.47f)
                lineToRelative(62.6f, 28.45f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 46.88f, 0.0f)
                lineTo(214.0f, 113.68f)
                arcToRelative(17.0f, 17.0f, 0.0f, false, false, 10.0f, -15.47f)
                verticalLineTo(49.0f)
                arcTo(17.0f, 17.0f, 0.0f, false, false, 207.0f, 32.0f)
                close()
                moveTo(160.0f, 48.0f)
                verticalLineToRelative(72.67f)
                lineToRelative(-32.0f, 14.54f)
                lineTo(96.0f, 120.67f)
                verticalLineTo(48.0f)
                close()
                moveTo(48.0f, 98.21f)
                verticalLineTo(49.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineTo(80.0f)
                verticalLineToRelative(65.39f)
                lineTo(48.59f, 99.12f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 48.0f, 98.21f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 128.0f, 216.0f)
                close()
                moveTo(208.0f, 98.21f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.59f, 0.91f)
                lineTo(176.0f, 113.39f)
                verticalLineTo(48.0f)
                horizontalLineToRelative(31.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _medalMilitary!!
    }

private var _medalMilitary: ImageVector? = null
