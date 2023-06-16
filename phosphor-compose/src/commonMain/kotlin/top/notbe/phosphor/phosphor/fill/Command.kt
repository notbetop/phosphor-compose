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

public val FillGroup.Command: ImageVector
    get() {
        if (_command != null) {
            return _command!!
        }
        _command = Builder(name = "Command", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(100.0f, 86.38f)
                lineTo(100.0f, 100.0f)
                lineTo(86.38f, 100.0f)
                arcTo(14.25f, 14.25f, 0.0f, false, true, 72.0f, 87.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 87.0f, 72.0f)
                arcTo(14.25f, 14.25f, 0.0f, false, true, 100.0f, 86.38f)
                close()
                moveTo(72.0f, 169.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 15.0f, 15.0f)
                arcToRelative(14.25f, 14.25f, 0.0f, false, false, 13.0f, -14.34f)
                lineTo(100.0f, 156.0f)
                lineTo(86.38f, 156.0f)
                arcTo(14.25f, 14.25f, 0.0f, false, false, 72.0f, 169.0f)
                close()
                moveTo(184.0f, 87.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -15.0f, -15.0f)
                arcToRelative(14.25f, 14.25f, 0.0f, false, false, -13.0f, 14.34f)
                lineTo(156.0f, 100.0f)
                horizontalLineToRelative(13.62f)
                arcTo(14.25f, 14.25f, 0.0f, false, false, 184.0f, 87.0f)
                close()
                moveTo(224.0f, 64.0f)
                lineTo(224.0f, 192.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f)
                lineTo(64.0f, 224.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, -32.0f)
                lineTo(32.0f, 64.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 64.0f, 32.0f)
                lineTo(192.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 224.0f, 64.0f)
                close()
                moveTo(156.0f, 140.0f)
                lineTo(156.0f, 116.0f)
                horizontalLineToRelative(13.38f)
                curveToRelative(16.39f, 0.0f, 30.21f, -12.88f, 30.61f, -29.25f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 169.25f, 56.0f)
                curveTo(152.88f, 56.41f, 140.0f, 70.23f, 140.0f, 86.62f)
                lineTo(140.0f, 100.0f)
                lineTo(116.0f, 100.0f)
                lineTo(116.0f, 86.62f)
                curveTo(116.0f, 70.23f, 103.12f, 56.41f, 86.75f, 56.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 56.0f, 86.75f)
                curveTo(56.41f, 103.12f, 70.23f, 116.0f, 86.62f, 116.0f)
                lineTo(100.0f, 116.0f)
                verticalLineToRelative(24.0f)
                lineTo(86.62f, 140.0f)
                curveTo(70.23f, 140.0f, 56.41f, 152.88f, 56.0f, 169.25f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 86.75f, 200.0f)
                curveToRelative(16.37f, -0.4f, 29.25f, -14.22f, 29.25f, -30.61f)
                lineTo(116.0f, 156.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(13.38f)
                curveToRelative(0.0f, 16.39f, 12.88f, 30.21f, 29.25f, 30.61f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 200.0f, 169.25f)
                curveToRelative(-0.4f, -16.37f, -14.22f, -29.25f, -30.61f, -29.25f)
                close()
                moveTo(116.0f, 140.0f)
                horizontalLineToRelative(24.0f)
                lineTo(140.0f, 116.0f)
                lineTo(116.0f, 116.0f)
                close()
                moveTo(156.0f, 170.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, false, 14.0f, -14.0f)
                lineTo(156.0f, 156.0f)
                close()
            }
        }
        .build()
        return _command!!
    }

private var _command: ImageVector? = null
