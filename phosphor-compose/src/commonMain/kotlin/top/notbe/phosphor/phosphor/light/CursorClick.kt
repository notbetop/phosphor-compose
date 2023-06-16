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

public val LightGroup.CursorClick: ImageVector
    get() {
        if (_cursorClick != null) {
            return _cursorClick!!
        }
        _cursorClick = Builder(name = "CursorClick", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.23f, 135.75f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.55f, -1.79f)
                arcToRelative(1.92f, 1.92f, 0.0f, false, true, 1.17f, -1.46f)
                lineTo(213.61f, 113.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 212.38f, 87.0f)
                lineTo(52.3f, 34.7f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.7f, 52.3f)
                lineTo(87.0f, 212.38f)
                arcTo(13.85f, 13.85f, 0.0f, false, false, 99.58f, 222.0f)
                curveToRelative(0.23f, 0.0f, 0.45f, 0.0f, 0.68f, 0.0f)
                arcTo(13.85f, 13.85f, 0.0f, false, false, 113.0f, 213.61f)
                horizontalLineToRelative(0.0f)
                lineToRelative(19.46f, -44.76f)
                arcToRelative(1.92f, 1.92f, 0.0f, false, true, 1.46f, -1.17f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.79f, 0.55f)
                lineToRelative(49.66f, 49.67f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.8f, 0.0f)
                lineToRelative(12.69f, -12.69f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, -19.8f)
                close()
                moveTo(209.41f, 196.75f)
                lineTo(196.73f, 209.43f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.83f, 0.0f)
                lineToRelative(-49.67f, -49.66f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -22.74f, 4.31f)
                lineTo(102.0f, 208.82f)
                arcToRelative(1.81f, 1.81f, 0.0f, false, true, -1.88f, 1.18f)
                arcToRelative(1.84f, 1.84f, 0.0f, false, true, -1.77f, -1.35f)
                lineTo(46.11f, 48.58f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 47.93f, 46.0f)
                arcToRelative(2.33f, 2.33f, 0.0f, false, true, 0.65f, 0.11f)
                lineTo(208.65f, 98.38f)
                arcToRelative(1.84f, 1.84f, 0.0f, false, true, 1.35f, 1.77f)
                arcToRelative(1.82f, 1.82f, 0.0f, false, true, -1.18f, 1.88f)
                lineToRelative(-44.76f, 19.46f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -4.31f, 22.74f)
                lineToRelative(49.66f, 49.67f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 209.41f, 196.73f)
                close()
                moveTo(90.0f, 24.0f)
                lineTo(90.0f, 16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                close()
                moveTo(10.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(16.0f, 102.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 10.0f, 96.0f)
                close()
                moveTo(122.63f, 29.32f)
                lineToRelative(8.0f, -16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 10.74f, 5.37f)
                lineToRelative(-8.0f, 16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -10.74f, -5.36f)
                close()
                moveTo(37.37f, 125.32f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.69f, 8.05f)
                lineToRelative(-16.0f, 8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.36f, -10.74f)
                lineToRelative(16.0f, -8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 37.37f, 125.32f)
                close()
            }
        }
        .build()
        return _cursorClick!!
    }

private var _cursorClick: ImageVector? = null
