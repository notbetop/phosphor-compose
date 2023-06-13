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

public val FillGroup.Unite: ImageVector
    get() {
        if (_unite != null) {
            return _unite!!
        }
        _unite = Builder(name = "Unite", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 160.0f)
                curveToRelative(0.0f, 3.2f, 0.16f, 6.37f, 0.47f, 9.49f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 105.0f, -105.0f)
                curveToRelative(-3.12f, -0.31f, -6.29f, -0.47f, -9.49f, -0.47f)
                arcTo(96.11f, 96.11f, 0.0f, false, false, 64.0f, 160.0f)
                close()
                moveTo(176.0f, 96.0f)
                arcToRelative(79.22f, 79.22f, 0.0f, false, false, -1.37f, -14.63f)
                arcTo(79.22f, 79.22f, 0.0f, false, false, 160.0f, 80.0f)
                arcToRelative(80.09f, 80.09f, 0.0f, false, false, -80.0f, 80.0f)
                arcToRelative(79.22f, 79.22f, 0.0f, false, false, 1.37f, 14.63f)
                arcTo(79.22f, 79.22f, 0.0f, false, false, 96.0f, 176.0f)
                arcTo(80.09f, 80.09f, 0.0f, false, false, 176.0f, 96.0f)
                close()
                moveTo(191.53f, 86.51f)
                curveToRelative(0.31f, 3.12f, 0.47f, 6.29f, 0.47f, 9.49f)
                arcToRelative(96.11f, 96.11f, 0.0f, false, true, -96.0f, 96.0f)
                curveToRelative(-3.2f, 0.0f, -6.37f, -0.16f, -9.49f, -0.47f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, 105.0f, -105.0f)
                close()
            }
        }
        .build()
        return _unite!!
    }

private var _unite: ImageVector? = null
