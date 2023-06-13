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

public val RegularGroup.DiamondsFour: ImageVector
    get() {
        if (_diamondsFour != null) {
            return _diamondsFour!!
        }
        _diamondsFour = Builder(name = "DiamondsFour", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.17f, 107.1f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.75f, 16.75f, 0.0f, false, false, 23.66f, 0.0f)
                lineTo(171.1f, 75.82f)
                arcToRelative(16.72f, 16.72f, 0.0f, false, false, 0.0f, -23.65f)
                lineTo(139.83f, 20.89f)
                arcToRelative(16.75f, 16.75f, 0.0f, false, false, -23.66f, 0.0f)
                lineTo(84.9f, 52.17f)
                arcToRelative(16.72f, 16.72f, 0.0f, false, false, 0.0f, 23.65f)
                close()
                moveTo(96.17f, 63.48f)
                lineTo(127.45f, 32.21f)
                arcToRelative(0.71f, 0.71f, 0.0f, false, true, 1.0f, 0.0f)
                lineToRelative(31.28f, 31.27f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(128.51f, 95.79f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, true, -1.0f, 0.0f)
                lineTo(96.21f, 64.51f)
                arcTo(0.74f, 0.74f, 0.0f, false, true, 96.21f, 63.48f)
                close()
                moveTo(235.07f, 116.17f)
                lineTo(203.83f, 84.89f)
                arcToRelative(16.74f, 16.74f, 0.0f, false, false, -23.65f, 0.0f)
                lineTo(148.9f, 116.17f)
                arcToRelative(16.75f, 16.75f, 0.0f, false, false, 0.0f, 23.66f)
                lineToRelative(31.28f, 31.28f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.74f, 16.74f, 0.0f, false, false, 23.65f, 0.0f)
                lineToRelative(31.28f, -31.28f)
                arcTo(16.75f, 16.75f, 0.0f, false, false, 235.11f, 116.17f)
                close()
                moveTo(223.8f, 128.51f)
                lineToRelative(-31.28f, 31.28f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, true, -1.0f, 0.0f)
                lineToRelative(-31.28f, -31.28f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, true, 0.0f, -1.0f)
                lineToRelative(31.28f, -31.28f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, true, 1.0f, 0.0f)
                lineToRelative(31.28f, 31.28f)
                arcTo(0.72f, 0.72f, 0.0f, false, true, 223.8f, 128.51f)
                close()
                moveTo(107.1f, 116.17f)
                lineTo(75.82f, 84.89f)
                arcToRelative(16.74f, 16.74f, 0.0f, false, false, -23.65f, 0.0f)
                lineTo(20.89f, 116.17f)
                arcToRelative(16.75f, 16.75f, 0.0f, false, false, 0.0f, 23.66f)
                lineToRelative(31.28f, 31.28f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.74f, 16.74f, 0.0f, false, false, 23.65f, 0.0f)
                lineToRelative(31.28f, -31.28f)
                arcTo(16.75f, 16.75f, 0.0f, false, false, 107.1f, 116.17f)
                close()
                moveTo(95.79f, 128.51f)
                lineTo(64.51f, 159.79f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, true, -1.0f, 0.0f)
                lineTo(32.2f, 128.51f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, true, 0.0f, -1.0f)
                lineTo(63.48f, 96.21f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, true, 1.0f, 0.0f)
                lineToRelative(31.28f, 31.28f)
                arcTo(0.72f, 0.72f, 0.0f, false, true, 95.79f, 128.51f)
                close()
                moveTo(139.79f, 148.9f)
                arcToRelative(16.75f, 16.75f, 0.0f, false, false, -23.66f, 0.0f)
                lineTo(84.9f, 180.18f)
                arcToRelative(16.72f, 16.72f, 0.0f, false, false, 0.0f, 23.65f)
                lineToRelative(31.27f, 31.28f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.75f, 16.75f, 0.0f, false, false, 23.66f, 0.0f)
                lineToRelative(31.27f, -31.28f)
                arcToRelative(16.72f, 16.72f, 0.0f, false, false, 0.0f, -23.65f)
                close()
                moveTo(159.79f, 192.52f)
                lineTo(128.51f, 223.79f)
                arcToRelative(0.71f, 0.71f, 0.0f, false, true, -1.0f, 0.0f)
                lineTo(96.21f, 192.52f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, true, 0.0f, -1.0f)
                lineToRelative(31.28f, -31.28f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, true, 1.0f, 0.0f)
                lineToRelative(31.28f, 31.28f)
                arcTo(0.74f, 0.74f, 0.0f, false, true, 159.79f, 192.52f)
                close()
            }
        }
        .build()
        return _diamondsFour!!
    }

private var _diamondsFour: ImageVector? = null
