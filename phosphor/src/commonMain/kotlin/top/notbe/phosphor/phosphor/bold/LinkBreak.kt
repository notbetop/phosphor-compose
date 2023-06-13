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

public val BoldGroup.LinkBreak: ImageVector
    get() {
        if (_linkBreak != null) {
            return _linkBreak!!
        }
        _linkBreak = Builder(name = "LinkBreak", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(148.48f, 67.93f)
                lineToRelative(-3.41f, 3.93f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -18.14f, -15.72f)
                lineToRelative(3.72f, -4.29f)
                curveToRelative(0.19f, -0.21f, 0.38f, -0.42f, 0.58f, -0.62f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 73.54f, 73.54f)
                curveToRelative(-0.2f, 0.2f, -0.41f, 0.39f, -0.62f, 0.58f)
                lineToRelative(-4.29f, 3.72f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -15.72f, -18.14f)
                lineToRelative(3.93f, -3.41f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -39.59f, -39.59f)
                close()
                moveTo(127.86f, 182.93f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.93f, 1.21f)
                lineToRelative(-3.41f, 3.93f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -39.59f, -39.59f)
                lineToRelative(3.93f, -3.41f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -15.72f, -18.14f)
                lineToRelative(-4.29f, 3.72f)
                curveToRelative(-0.21f, 0.19f, -0.42f, 0.38f, -0.62f, 0.58f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 73.54f, 73.54f)
                curveToRelative(0.2f, -0.2f, 0.39f, -0.41f, 0.58f, -0.62f)
                lineToRelative(3.72f, -4.29f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 127.86f, 182.93f)
                close()
                moveTo(208.0f, 148.0f)
                lineTo(188.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(48.0f, 108.0f)
                lineTo(68.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(48.0f, 84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
                moveTo(160.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(172.0f, 188.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 160.0f, 176.0f)
                close()
                moveTo(96.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(108.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                lineTo(84.0f, 68.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 96.0f, 80.0f)
                close()
            }
        }
        .build()
        return _linkBreak!!
    }

private var _linkBreak: ImageVector? = null
