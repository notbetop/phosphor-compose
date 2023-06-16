package top.notbe.phosphor.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.BoldGroup

public val BoldGroup.Bird: ImageVector
    get() {
        if (_bird != null) {
            return _bird!!
        }
        _bird = Builder(name = "Bird", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 176.0f, 72.0f)
                close()
                moveTo(244.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -5.34f, 10.0f)
                lineTo(220.0f, 102.42f)
                lineTo(220.0f, 120.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, true, 112.0f, 228.0f)
                lineTo(12.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.52f, -19.3f)
                lineTo(92.0f, 91.93f)
                lineTo(92.0f, 76.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 216.58f, 55.29f)
                lineTo(238.66f, 70.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 244.0f, 80.0f)
                close()
                moveTo(210.37f, 80.0f)
                lineTo(199.68f, 72.87f)
                arcToRelative(11.94f, 11.94f, 0.0f, false, true, -5.0f, -7.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 116.0f, 76.0f)
                lineTo(116.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -2.48f, 7.3f)
                lineTo(36.32f, 204.0f)
                lineTo(112.0f, 204.0f)
                arcToRelative(84.09f, 84.09f, 0.0f, false, false, 84.0f, -84.0f)
                lineTo(196.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 5.34f, -10.0f)
                close()
                moveTo(128.63f, 126.48f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.82f, 2.22f)
                lineToRelative(-30.67f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 19.0f, 14.6f)
                lineToRelative(30.67f, -40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 128.63f, 126.48f)
                close()
            }
        }
        .build()
        return _bird!!
    }

private var _bird: ImageVector? = null
