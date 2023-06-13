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

public val BoldGroup.SoccerBall: ImageVector
    get() {
        if (_soccerBall != null) {
            return _soccerBall!!
        }
        _soccerBall = Builder(name = "SoccerBall", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(204.0f, 92.25f)
                lineTo(182.0f, 99.4f)
                lineTo(140.0f, 69.78f)
                lineTo(140.0f, 44.87f)
                arcTo(84.23f, 84.23f, 0.0f, false, true, 204.0f, 92.25f)
                close()
                moveTo(104.5f, 160.0f)
                lineTo(90.21f, 117.33f)
                lineTo(128.0f, 90.68f)
                lineToRelative(37.79f, 26.65f)
                lineTo(151.5f, 160.0f)
                close()
                moveTo(116.0f, 44.87f)
                lineTo(116.0f, 69.78f)
                lineTo(74.0f, 99.4f)
                lineTo(52.0f, 92.25f)
                arcTo(84.23f, 84.23f, 0.0f, false, true, 116.0f, 44.87f)
                close()
                moveTo(44.0f, 128.0f)
                arcToRelative(84.26f, 84.26f, 0.0f, false, true, 1.0f, -12.79f)
                lineToRelative(21.57f, 7.0f)
                lineToRelative(16.0f, 47.74f)
                lineTo(69.36f, 188.06f)
                arcTo(83.72f, 83.72f, 0.0f, false, true, 44.0f, 128.0f)
                close()
                moveTo(88.73f, 202.23f)
                lineTo(102.0f, 184.0f)
                horizontalLineToRelative(52.0f)
                lineToRelative(13.25f, 18.23f)
                arcToRelative(83.81f, 83.81f, 0.0f, false, true, -78.54f, 0.0f)
                close()
                moveTo(186.64f, 188.06f)
                lineTo(173.48f, 170.0f)
                lineToRelative(16.0f, -47.74f)
                lineToRelative(21.57f, -7.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, -24.39f, 72.85f)
                close()
            }
        }
        .build()
        return _soccerBall!!
    }

private var _soccerBall: ImageVector? = null
