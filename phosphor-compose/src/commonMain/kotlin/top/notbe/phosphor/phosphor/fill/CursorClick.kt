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

public val FillGroup.CursorClick: ImageVector
    get() {
        if (_cursorClick != null) {
            return _cursorClick!!
        }
        _cursorClick = Builder(name = "CursorClick", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.85f, 28.42f)
                lineToRelative(8.0f, -16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.31f, 7.16f)
                lineToRelative(-8.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -14.31f, -7.16f)
                close()
                moveTo(16.0f, 104.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(16.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(96.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(104.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 96.0f, 32.0f)
                close()
                moveTo(28.42f, 120.85f)
                lineToRelative(-16.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.16f, 14.31f)
                lineToRelative(16.0f, -8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -7.16f, -14.31f)
                close()
                moveTo(164.07f, 136.75f)
                lineTo(214.41f, 114.87f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 213.0f, 85.07f)
                lineTo(52.92f, 32.8f)
                arcTo(15.95f, 15.95f, 0.0f, false, false, 32.8f, 52.92f)
                lineTo(85.07f, 213.0f)
                arcToRelative(15.82f, 15.82f, 0.0f, false, false, 14.41f, 11.0f)
                lineToRelative(0.78f, 0.0f)
                arcToRelative(15.84f, 15.84f, 0.0f, false, false, 14.61f, -9.59f)
                lineToRelative(21.88f, -50.34f)
                lineTo(192.0f, 219.31f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.63f, 0.0f)
                lineToRelative(4.68f, -4.68f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -22.63f)
                close()
            }
        }
        .build()
        return _cursorClick!!
    }

private var _cursorClick: ImageVector? = null
