package top.notbe.phosphor.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.ThinGroup

public val ThinGroup.CursorClick: ImageVector
    get() {
        if (_cursorClick != null) {
            return _cursorClick!!
        }
        _cursorClick = Builder(name = "CursorClick", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(166.82f, 137.16f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.23f, -6.5f)
                lineToRelative(44.76f, -19.46f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -1.05f, -22.33f)
                lineTo(51.68f, 36.6f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.6f, 51.68f)
                lineTo(88.87f, 211.76f)
                arcTo(11.88f, 11.88f, 0.0f, false, false, 99.67f, 220.0f)
                horizontalLineToRelative(0.59f)
                arcToRelative(11.85f, 11.85f, 0.0f, false, false, 10.94f, -7.19f)
                lineToRelative(19.46f, -44.76f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.5f, -1.23f)
                lineToRelative(49.67f, 49.67f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(12.69f, -12.69f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f)
                close()
                moveTo(210.82f, 198.16f)
                lineTo(198.13f, 210.85f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.65f, 0.0f)
                lineToRelative(-49.67f, -49.67f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.48f, -3.52f)
                arcToRelative(11.44f, 11.44f, 0.0f, false, false, -2.25f, 0.22f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.76f, 7.0f)
                lineToRelative(-19.46f, 44.76f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.39f, -0.35f)
                lineTo(44.21f, 49.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.0f, -5.0f)
                lineTo(209.27f, 96.48f)
                arcToRelative(3.95f, 3.95f, 0.0f, false, true, 0.35f, 7.38f)
                lineToRelative(-44.76f, 19.47f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.7f, 19.49f)
                lineToRelative(49.67f, 49.67f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 210.83f, 198.14f)
                close()
                moveTo(92.0f, 24.0f)
                lineTo(92.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
                moveTo(12.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(16.0f, 100.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 96.0f)
                close()
                moveTo(124.42f, 30.21f)
                lineToRelative(8.0f, -16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.16f, 3.58f)
                lineToRelative(-8.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.16f, -3.58f)
                close()
                moveTo(35.58f, 126.21f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.79f, 5.37f)
                lineToRelative(-16.0f, 8.0f)
                arcTo(4.05f, 4.05f, 0.0f, false, true, 16.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.79f, -7.58f)
                lineToRelative(16.0f, -8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 35.58f, 126.21f)
                close()
            }
        }
        .build()
        return _cursorClick!!
    }

private var _cursorClick: ImageVector? = null
