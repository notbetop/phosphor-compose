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

public val FillGroup.Waves: ImageVector
    get() {
        if (_waves != null) {
            return _waves!!
        }
        _waves = Builder(name = "Waves", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 40.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f)
                lineTo(24.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(216.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f)
                close()
                moveTo(195.58f, 175.16f)
                curveToRelative(-0.72f, 0.36f, -17.89f, 8.84f, -35.58f, 8.84f)
                curveToRelative(-17.89f, 0.0f, -27.29f, -4.7f, -35.58f, -8.84f)
                curveTo(116.74f, 171.32f, 110.11f, 168.0f, 96.0f, 168.0f)
                curveToRelative(-13.84f, 0.0f, -28.29f, 7.09f, -28.43f, 7.16f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.15f, -14.32f)
                curveTo(61.14f, 160.48f, 78.31f, 152.0f, 96.0f, 152.0f)
                curveToRelative(17.89f, 0.0f, 27.29f, 4.7f, 35.58f, 8.84f)
                curveToRelative(7.68f, 3.84f, 14.31f, 7.16f, 28.42f, 7.16f)
                curveToRelative(13.84f, 0.0f, 28.29f, -7.09f, 28.43f, -7.16f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.15f, 14.32f)
                close()
                moveTo(195.58f, 135.16f)
                curveToRelative(-0.72f, 0.36f, -17.89f, 8.84f, -35.58f, 8.84f)
                curveToRelative(-17.89f, 0.0f, -27.29f, -4.7f, -35.58f, -8.84f)
                curveTo(116.74f, 131.32f, 110.11f, 128.0f, 96.0f, 128.0f)
                curveToRelative(-13.84f, 0.0f, -28.29f, 7.09f, -28.43f, 7.16f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.15f, -14.32f)
                curveTo(61.14f, 120.48f, 78.31f, 112.0f, 96.0f, 112.0f)
                curveToRelative(17.89f, 0.0f, 27.29f, 4.7f, 35.58f, 8.84f)
                curveToRelative(7.68f, 3.84f, 14.31f, 7.16f, 28.42f, 7.16f)
                curveToRelative(13.84f, 0.0f, 28.29f, -7.09f, 28.43f, -7.16f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.15f, 14.32f)
                close()
                moveTo(195.58f, 95.16f)
                curveToRelative(-0.72f, 0.36f, -17.89f, 8.84f, -35.58f, 8.84f)
                curveToRelative(-17.89f, 0.0f, -27.29f, -4.7f, -35.58f, -8.84f)
                curveTo(116.74f, 91.32f, 110.11f, 88.0f, 96.0f, 88.0f)
                curveToRelative(-13.84f, 0.0f, -28.29f, 7.09f, -28.43f, 7.16f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.15f, -14.32f)
                curveTo(61.14f, 80.48f, 78.31f, 72.0f, 96.0f, 72.0f)
                curveToRelative(17.89f, 0.0f, 27.29f, 4.7f, 35.58f, 8.84f)
                curveTo(139.26f, 84.68f, 145.89f, 88.0f, 160.0f, 88.0f)
                curveToRelative(13.84f, 0.0f, 28.29f, -7.09f, 28.43f, -7.16f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.15f, 14.32f)
                close()
            }
        }
        .build()
        return _waves!!
    }

private var _waves: ImageVector? = null
