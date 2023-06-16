package top.notbe.phosphor.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.FillGroup

public val FillGroup.ShieldCheckered: ImageVector
    get() {
        if (_shieldCheckered != null) {
            return _shieldCheckered!!
        }
        _shieldCheckered = Builder(name = "ShieldCheckered", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 40.0f)
                horizontalLineTo(48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 56.0f)
                verticalLineToRelative(58.77f)
                curveToRelative(0.0f, 89.62f, 75.82f, 119.34f, 91.0f, 124.38f)
                arcToRelative(15.44f, 15.44f, 0.0f, false, false, 10.0f, 0.0f)
                curveToRelative(15.2f, -5.05f, 91.0f, -34.77f, 91.0f, -124.39f)
                verticalLineTo(56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 40.0f)
                close()
                moveTo(48.66f, 128.0f)
                horizontalLineTo(128.0f)
                verticalLineTo(56.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(58.77f)
                arcToRelative(130.51f, 130.51f, 0.0f, false, true, -0.66f, 13.21f)
                horizontalLineTo(128.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(0.0f)
                curveTo(115.26f, 219.73f, 55.59f, 196.26f, 48.66f, 128.0f)
                close()
            }
        }
        .build()
        return _shieldCheckered!!
    }

private var _shieldCheckered: ImageVector? = null
