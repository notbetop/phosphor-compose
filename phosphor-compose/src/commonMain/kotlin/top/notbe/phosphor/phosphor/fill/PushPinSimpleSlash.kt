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

public val FillGroup.PushPinSimpleSlash: ImageVector
    get() {
        if (_pushPinSimpleSlash != null) {
            return _pushPinSimpleSlash!!
        }
        _pushPinSimpleSlash = Builder(name = "PushPinSimpleSlash", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.38f, 221.92f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.3f, -0.54f)
                lineTo(168.1f, 184.0f)
                horizontalLineTo(136.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(184.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(9.29f)
                lineTo(66.24f, 72.0f)
                lineTo(42.08f, 45.38f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 53.92f, 34.62f)
                lineToRelative(160.0f, 176.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 213.38f, 221.92f)
                close()
                moveTo(190.5f, 161.07f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.79f, -6.77f)
                lineTo(185.54f, 48.0f)
                horizontalLineTo(192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(91.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.92f, 13.38f)
                close()
            }
        }
        .build()
        return _pushPinSimpleSlash!!
    }

private var _pushPinSimpleSlash: ImageVector? = null
