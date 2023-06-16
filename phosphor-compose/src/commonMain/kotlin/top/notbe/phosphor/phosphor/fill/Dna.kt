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

public val FillGroup.Dna: ImageVector
    get() {
        if (_dna != null) {
            return _dna!!
        }
        _dna = Builder(name = "Dna", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 204.5f)
                verticalLineTo(232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(204.5f)
                arcToRelative(63.67f, 63.67f, 0.0f, false, false, -35.38f, -57.25f)
                lineToRelative(-48.4f, -24.19f)
                arcTo(79.58f, 79.58f, 0.0f, false, true, 56.0f, 51.5f)
                verticalLineTo(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineTo(51.5f)
                arcToRelative(63.67f, 63.67f, 0.0f, false, false, 35.38f, 57.25f)
                lineToRelative(48.4f, 24.19f)
                arcTo(79.58f, 79.58f, 0.0f, false, true, 200.0f, 204.5f)
                close()
                moveTo(163.18f, 192.0f)
                horizontalLineTo(83.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.53f)
                arcTo(8.19f, 8.19f, 0.0f, false, true, 83.25f, 176.0f)
                horizontalLineTo(149.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.75f, -6.9f)
                arcToRelative(48.24f, 48.24f, 0.0f, false, false, -11.0f, -7.53f)
                lineTo(97.0f, 139.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.31f, 0.71f)
                horizontalLineToRelative(0.0f)
                arcTo(80.27f, 80.27f, 0.0f, false, false, 56.0f, 204.5f)
                verticalLineToRelative(27.23f)
                arcTo(8.18f, 8.18f, 0.0f, false, false, 63.47f, 240.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 72.0f, 232.0f)
                verticalLineTo(216.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineToRelative(-3.5f)
                arcToRelative(48.76f, 48.76f, 0.0f, false, false, -0.9f, -9.32f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 163.18f, 192.0f)
                close()
                moveTo(191.47f, 16.0f)
                arcTo(8.18f, 8.18f, 0.0f, false, false, 184.0f, 24.27f)
                verticalLineTo(40.0f)
                horizontalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(3.5f)
                arcToRelative(48.76f, 48.76f, 0.0f, false, false, 0.9f, 9.32f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 92.82f, 64.0f)
                horizontalLineToRelative(79.93f)
                arcTo(8.19f, 8.19f, 0.0f, false, true, 181.0f, 71.47f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 173.0f, 80.0f)
                horizontalLineTo(106.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.75f, 6.9f)
                arcToRelative(48.24f, 48.24f, 0.0f, false, false, 11.0f, 7.53f)
                lineTo(159.0f, 116.69f)
                arcToRelative(7.93f, 7.93f, 0.0f, false, false, 8.31f, -0.72f)
                horizontalLineToRelative(0.0f)
                arcTo(80.27f, 80.27f, 0.0f, false, false, 200.0f, 51.5f)
                verticalLineTo(24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 191.47f, 16.0f)
                close()
            }
        }
        .build()
        return _dna!!
    }

private var _dna: ImageVector? = null
