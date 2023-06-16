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

public val BoldGroup.CursorClick: ImageVector
    get() {
        if (_cursorClick != null) {
            return _cursorClick!!
        }
        _cursorClick = Builder(name = "CursorClick", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(84.0f, 16.0f)
                lineTo(84.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(16.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(12.0f, 84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
                moveTo(128.2f, 39.38f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 15.18f, -7.59f)
                lineToRelative(4.0f, -12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -22.76f, -7.58f)
                lineToRelative(-4.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 128.2f, 39.38f)
                close()
                moveTo(24.2f, 120.62f)
                lineTo(12.2f, 124.62f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 7.58f, 22.76f)
                lineToRelative(12.0f, -4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -7.58f, -22.76f)
                close()
                moveTo(222.13f, 181.17f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, 28.29f)
                lineToRelative(-12.68f, 12.68f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -28.29f, 0.0f)
                lineToRelative(-45.51f, -45.51f)
                lineTo(118.54f, 216.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(19.81f, 19.81f, 0.0f, false, true, -18.27f, 12.0f)
                lineToRelative(-1.0f, 0.0f)
                arcToRelative(19.81f, 19.81f, 0.0f, false, true, -18.0f, -13.74f)
                lineTo(29.0f, 54.16f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 54.16f, 29.0f)
                lineTo(214.24f, 81.27f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 216.0f, 118.54f)
                lineToRelative(-39.37f, 17.12f)
                close()
                moveTo(202.33f, 195.31f)
                lineTo(155.5f, 148.47f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 161.67f, 116.0f)
                lineToRelative(35.0f, -15.21f)
                lineTo(54.29f, 54.29f)
                lineToRelative(46.49f, 142.37f)
                lineToRelative(15.21f, -35.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 130.6f, 150.0f)
                arcToRelative(19.74f, 19.74f, 0.0f, false, true, 3.74f, -0.36f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 14.13f, 5.86f)
                lineToRelative(46.84f, 46.84f)
                close()
            }
        }
        .build()
        return _cursorClick!!
    }

private var _cursorClick: ImageVector? = null
