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

public val BoldGroup.ChartBarHorizontal: ImageVector
    get() {
        if (_chartBarHorizontal != null) {
            return _chartBarHorizontal!!
        }
        _chartBarHorizontal = Builder(name = "ChartBarHorizontal", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 92.0f)
                lineTo(180.0f, 92.0f)
                lineTo(180.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(52.0f, 44.0f)
                lineTo(52.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                lineTo(28.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(148.0f, 164.0f)
                horizontalLineToRelative(68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 104.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 92.0f)
                close()
                moveTo(156.0f, 68.0f)
                lineTo(156.0f, 92.0f)
                lineTo(52.0f, 92.0f)
                lineTo(52.0f, 68.0f)
                close()
                moveTo(124.0f, 188.0f)
                lineTo(52.0f, 188.0f)
                lineTo(52.0f, 164.0f)
                horizontalLineToRelative(72.0f)
                close()
                moveTo(204.0f, 140.0f)
                lineTo(52.0f, 140.0f)
                lineTo(52.0f, 116.0f)
                lineTo(204.0f, 116.0f)
                close()
            }
        }
        .build()
        return _chartBarHorizontal!!
    }

private var _chartBarHorizontal: ImageVector? = null
