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

public val FillGroup.HighHeel: ImageVector
    get() {
        if (_highHeel != null) {
            return _highHeel!!
        }
        _highHeel = Builder(name = "HighHeel", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 172.18f)
                lineTo(88.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(40.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(24.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(95.27f, 95.27f, 0.0f, false, true, 54.26f, 16.88f)
                lineToRelative(0.0f, 0.0f)
                arcTo(3.93f, 3.93f, 0.0f, false, true, 88.0f, 172.18f)
                close()
                moveTo(231.0f, 164.18f)
                lineTo(180.0f, 152.7f)
                lineTo(69.66f, 42.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.45f, -1.85f)
                arcTo(8.37f, 8.37f, 0.0f, false, false, 58.0f, 42.73f)
                curveTo(36.06f, 66.75f, 24.0f, 97.0f, 24.0f, 128.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(111.06f, 111.06f, 0.0f, false, true, 56.0f, 15.06f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(2.48f, 1.45f, 4.91f, 3.0f, 7.3f, 4.62f)
                arcToRelative(112.45f, 112.45f, 0.0f, false, true, 40.55f, 50.39f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 150.72f, 216.0f)
                lineTo(240.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-4.73f)
                arcTo(31.72f, 31.72f, 0.0f, false, false, 231.0f, 164.19f)
                close()
            }
        }
        .build()
        return _highHeel!!
    }

private var _highHeel: ImageVector? = null
