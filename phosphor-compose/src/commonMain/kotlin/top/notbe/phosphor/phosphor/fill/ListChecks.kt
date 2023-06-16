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

public val FillGroup.ListChecks: ImageVector
    get() {
        if (_listChecks != null) {
            return _listChecks!!
        }
        _listChecks = Builder(name = "ListChecks", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(93.66f, 106.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                lineToRelative(-16.0f, -16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineTo(56.0f, 132.69f)
                lineToRelative(26.34f, -26.35f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 93.66f, 106.34f)
                close()
                moveTo(82.34f, 42.34f)
                lineTo(56.0f, 68.69f)
                lineTo(45.66f, 58.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 34.34f, 69.66f)
                lineToRelative(16.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 0.0f)
                lineToRelative(32.0f, -32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 82.34f, 42.34f)
                close()
                moveTo(82.34f, 170.34f)
                lineTo(56.0f, 196.69f)
                lineTo(45.66f, 186.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 11.32f)
                lineToRelative(16.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 0.0f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f)
                close()
                moveTo(216.0f, 48.0f)
                lineTo(128.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(120.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(224.0f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 48.0f)
                close()
                moveTo(216.0f, 176.0f)
                lineTo(128.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(224.0f, 184.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 176.0f)
                close()
                moveTo(216.0f, 112.0f)
                lineTo(128.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(224.0f, 120.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 112.0f)
                close()
            }
        }
        .build()
        return _listChecks!!
    }

private var _listChecks: ImageVector? = null
