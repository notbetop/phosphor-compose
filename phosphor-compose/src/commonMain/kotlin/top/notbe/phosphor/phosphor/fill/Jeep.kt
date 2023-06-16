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

public val FillGroup.Jeep: ImageVector
    get() {
        if (_jeep != null) {
            return _jeep!!
        }
        _jeep = Builder(name = "Jeep", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 103.47f)
                arcTo(8.17f, 8.17f, 0.0f, false, false, 239.73f, 96.0f)
                horizontalLineToRelative(-9.26f)
                lineToRelative(-9.29f, -43.35f)
                arcTo(16.08f, 16.08f, 0.0f, false, false, 205.53f, 40.0f)
                lineTo(50.47f, 40.0f)
                arcTo(16.08f, 16.08f, 0.0f, false, false, 34.82f, 52.65f)
                lineTo(25.53f, 96.0f)
                lineTo(16.27f, 96.0f)
                arcTo(8.17f, 8.17f, 0.0f, false, false, 8.0f, 103.47f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 16.0f, 112.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(64.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(80.0f, 184.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(104.0f, 136.27f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, true, 7.47f, -8.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.53f, 8.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(136.0f, 136.27f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, true, 7.47f, -8.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.53f, 8.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 112.0f)
                horizontalLineToRelative(8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 248.0f, 103.47f)
                close()
                moveTo(68.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 68.0f, 152.0f)
                close()
                moveTo(188.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 188.0f, 152.0f)
                close()
            }
        }
        .build()
        return _jeep!!
    }

private var _jeep: ImageVector? = null
