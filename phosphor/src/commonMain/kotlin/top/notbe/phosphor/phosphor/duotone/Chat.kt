package top.notbe.phosphor.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.DuotoneGroup

public val DuotoneGroup.Chat: ImageVector
    get() {
        if (_chat != null) {
            return _chat!!
        }
        _chat = Builder(name = "Chat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 64.0f)
                verticalLineTo(192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(82.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.15f, 1.88f)
                lineToRelative(-32.2f, 28.23f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 32.0f, 224.0f)
                verticalLineTo(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 48.0f)
                horizontalLineTo(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 64.0f)
                verticalLineTo(224.0f)
                arcToRelative(15.84f, 15.84f, 0.0f, false, false, 9.25f, 14.5f)
                arcTo(16.05f, 16.05f, 0.0f, false, false, 40.0f, 240.0f)
                arcToRelative(15.89f, 15.89f, 0.0f, false, false, 10.25f, -3.78f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, false, 0.13f, -0.11f)
                lineTo(82.5f, 208.0f)
                horizontalLineTo(216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 48.0f)
                close()
                moveTo(40.0f, 224.0f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(216.0f, 192.0f)
                horizontalLineTo(82.5f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -10.3f, 3.75f)
                lineToRelative(-0.12f, 0.11f)
                lineTo(40.0f, 224.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(216.0f)
                close()
            }
        }
        .build()
        return _chat!!
    }

private var _chat: ImageVector? = null
