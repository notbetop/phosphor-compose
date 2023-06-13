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

public val LightGroup.ShieldChevron: ImageVector
    get() {
        if (_shieldChevron != null) {
            return _shieldChevron!!
        }
        _shieldChevron = Builder(name = "ShieldChevron", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 42.0f)
                horizontalLineTo(48.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 56.0f)
                verticalLineToRelative(58.77f)
                curveToRelative(0.0f, 88.24f, 74.68f, 117.52f, 89.65f, 122.49f)
                arcToRelative(13.5f, 13.5f, 0.0f, false, false, 8.7f, 0.0f)
                curveToRelative(15.0f, -5.0f, 89.65f, -34.25f, 89.65f, -122.49f)
                verticalLineTo(56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 208.0f, 42.0f)
                close()
                moveTo(128.56f, 225.89f)
                arcToRelative(1.55f, 1.55f, 0.0f, false, true, -1.12f, 0.0f)
                curveToRelative(-9.46f, -3.14f, -45.14f, -17.0f, -66.0f, -52.0f)
                lineTo(128.0f, 127.32f)
                lineToRelative(66.56f, 46.59f)
                curveTo(173.7f, 208.93f, 138.0f, 222.75f, 128.56f, 225.89f)
                close()
                moveTo(210.0f, 114.79f)
                curveToRelative(0.0f, 19.0f, -3.83f, 35.0f, -9.85f, 48.39f)
                lineToRelative(-68.71f, -48.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.88f, 0.0f)
                lineToRelative(-68.71f, 48.1f)
                curveToRelative(-6.0f, -13.4f, -9.85f, -29.38f, -9.85f, -48.39f)
                verticalLineTo(56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineTo(208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _shieldChevron!!
    }

private var _shieldChevron: ImageVector? = null
