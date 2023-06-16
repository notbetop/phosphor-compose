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

public val ThinGroup.GoogleCardboardLogo: ImageVector
    get() {
        if (_googleCardboardLogo != null) {
            return _googleCardboardLogo!!
        }
        _googleCardboardLogo = Builder(name = "GoogleCardboardLogo", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 52.0f)
                lineTo(32.0f, 52.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 64.0f)
                lineTo(20.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(92.69f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.48f, -3.51f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(4.08f, 4.08f, 0.0f, false, true, 5.66f, 0.0f)
                lineToRelative(24.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.48f, 3.51f)
                lineTo(224.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(236.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 52.0f)
                close()
                moveTo(228.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(163.31f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.82f, -1.17f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineToRelative(-24.0f, 24.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 92.69f, 196.0f)
                lineTo(32.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(28.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(224.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(80.0f, 100.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 80.0f, 100.0f)
                close()
                moveTo(80.0f, 148.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 80.0f, 148.0f)
                close()
                moveTo(176.0f, 100.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 176.0f, 100.0f)
                close()
                moveTo(176.0f, 148.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 176.0f, 148.0f)
                close()
            }
        }
        .build()
        return _googleCardboardLogo!!
    }

private var _googleCardboardLogo: ImageVector? = null
