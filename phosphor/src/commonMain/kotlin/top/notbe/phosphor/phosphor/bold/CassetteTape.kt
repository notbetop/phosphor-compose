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

public val BoldGroup.CassetteTape: ImageVector
    get() {
        if (_cassetteTape != null) {
            return _cassetteTape!!
        }
        _cassetteTape = Builder(name = "CassetteTape", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 44.0f)
                lineTo(32.0f, 44.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 12.0f, 64.0f)
                lineTo(12.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(224.0f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(244.0f, 64.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 224.0f, 44.0f)
                close()
                moveTo(86.42f, 188.0f)
                lineToRelative(8.0f, -12.0f)
                horizontalLineToRelative(67.16f)
                lineToRelative(8.0f, 12.0f)
                close()
                moveTo(220.0f, 188.0f)
                lineTo(198.42f, 188.0f)
                lineToRelative(-18.06f, -27.09f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 163.72f, 152.0f)
                lineTo(92.28f, 152.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -16.64f, 8.91f)
                lineTo(57.58f, 188.0f)
                lineTo(36.0f, 188.0f)
                lineTo(36.0f, 68.0f)
                lineTo(220.0f, 68.0f)
                close()
                moveTo(78.0f, 140.0f)
                lineTo(178.0f, 140.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 0.0f, -60.0f)
                lineTo(78.0f, 80.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 0.0f, 60.0f)
                close()
                moveTo(112.0f, 116.0f)
                lineTo(112.0f, 104.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(184.0f, 110.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(168.0f, 116.0f)
                lineTo(168.0f, 104.0f)
                horizontalLineToRelative(10.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 184.0f, 110.0f)
                close()
                moveTo(78.0f, 104.0f)
                lineTo(88.0f, 104.0f)
                verticalLineToRelative(12.0f)
                lineTo(78.0f, 116.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                close()
            }
        }
        .build()
        return _cassetteTape!!
    }

private var _cassetteTape: ImageVector? = null
