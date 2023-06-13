package top.notbe.phosphor.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.DuotoneGroup

public val DuotoneGroup.ShieldChevron: ImageVector
    get() {
        if (_shieldChevron != null) {
            return _shieldChevron!!
        }
        _shieldChevron = Builder(name = "ShieldChevron", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(202.5f, 172.15f)
                curveToRelative(-21.39f, 40.41f, -61.72f, 56.0f, -72.0f, 59.44f)
                arcToRelative(7.54f, 7.54f, 0.0f, false, true, -4.92f, 0.0f)
                curveToRelative(-10.32f, -3.43f, -50.65f, -19.0f, -72.0f, -59.44f)
                lineTo(128.0f, 120.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 40.0f)
                lineTo(48.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 56.0f)
                verticalLineToRelative(58.77f)
                curveToRelative(0.0f, 89.61f, 75.82f, 119.34f, 91.0f, 124.39f)
                arcToRelative(15.53f, 15.53f, 0.0f, false, false, 10.0f, 0.0f)
                curveToRelative(15.2f, -5.05f, 91.0f, -34.78f, 91.0f, -124.39f)
                lineTo(224.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 40.0f)
                close()
                moveTo(128.0f, 224.0f)
                curveToRelative(-9.26f, -3.08f, -43.29f, -16.32f, -63.87f, -49.5f)
                lineTo(128.0f, 129.76f)
                lineToRelative(63.87f, 44.71f)
                curveTo(171.31f, 207.61f, 137.34f, 220.85f, 128.0f, 224.0f)
                close()
                moveTo(208.0f, 114.82f)
                curveToRelative(0.0f, 17.64f, -3.36f, 32.63f, -8.72f, 45.34f)
                lineToRelative(-66.69f, -46.68f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.18f, 0.0f)
                lineTo(56.72f, 160.13f)
                curveTo(51.36f, 147.42f, 48.0f, 132.43f, 48.0f, 114.79f)
                lineTo(48.0f, 56.0f)
                lineToRelative(160.0f, 0.0f)
                close()
            }
        }
        .build()
        return _shieldChevron!!
    }

private var _shieldChevron: ImageVector? = null
