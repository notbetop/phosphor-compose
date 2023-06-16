package top.notbe.phosphor.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.LightGroup

public val LightGroup.Engine: ImageVector
    get() {
        if (_engine != null) {
            return _engine!!
        }
        _engine = Builder(name = "Engine", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 106.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(26.0f)
                lineTo(222.0f, 138.0f)
                lineTo(222.0f, 120.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(195.31f, 106.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.41f, -0.58f)
                lineTo(158.58f, 70.1f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, -9.89f, -4.1f)
                lineTo(126.0f, 66.0f)
                lineTo(126.0f, 46.0f)
                horizontalLineToRelative(26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(88.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(26.0f)
                lineTo(114.0f, 66.0f)
                lineTo(48.0f, 66.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 80.0f)
                verticalLineToRelative(58.0f)
                lineTo(14.0f, 138.0f)
                lineTo(14.0f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(14.0f, 150.0f)
                lineTo(34.0f, 150.0f)
                verticalLineToRelative(22.69f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 4.1f, 9.89f)
                lineTo(73.42f, 217.9f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 9.89f, 4.1f)
                horizontalLineToRelative(65.38f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 9.89f, -4.1f)
                lineToRelative(35.32f, -35.32f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.41f, -0.58f)
                lineTo(208.0f, 182.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(222.0f, 150.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(254.0f, 112.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 248.0f, 106.0f)
                close()
                moveTo(210.0f, 168.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(195.31f, 170.0f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, -9.89f, 4.1f)
                lineTo(150.1f, 209.42f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.41f, 0.58f)
                lineTo(83.31f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.41f, -0.58f)
                lineTo(46.58f, 174.1f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.58f, -1.41f)
                lineTo(46.0f, 80.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(148.69f, 78.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.41f, 0.58f)
                lineToRelative(35.32f, 35.32f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 9.89f, 4.1f)
                lineTo(208.0f, 118.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _engine!!
    }

private var _engine: ImageVector? = null
