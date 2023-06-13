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

public val BoldGroup.UserSwitch: ImageVector
    get() {
        if (_userSwitch != null) {
            return _userSwitch!!
        }
        _userSwitch = Builder(name = "UserSwitch", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.49f, 140.49f)
                lineToRelative(-20.0f, 20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f)
                lineToRelative(-20.0f, -20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 16.32f, -17.57f)
                arcTo(84.0f, 84.0f, 0.0f, false, false, 62.42f, 75.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -18.73f, -15.0f)
                arcToRelative(108.0f, 108.0f, 0.0f, false, true, 192.2f, 62.69f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 16.6f, 17.31f)
                close()
                moveTo(212.31f, 195.49f)
                arcToRelative(108.0f, 108.0f, 0.0f, false, true, -192.2f, -62.69f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.6f, -17.31f)
                lineToRelative(20.0f, -20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 0.0f)
                lineToRelative(20.0f, 20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.32f, 17.57f)
                arcToRelative(83.55f, 83.55f, 0.0f, false, false, 17.88f, 46.86f)
                arcToRelative(83.48f, 83.48f, 0.0f, false, true, 29.0f, -23.42f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, true, 74.0f, 0.0f)
                arcTo(83.39f, 83.39f, 0.0f, false, true, 194.0f, 180.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 18.3f, 15.49f)
                close()
                moveTo(128.0f, 148.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 128.0f, 148.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(83.6f, 83.6f, 0.0f, false, false, 48.48f, -15.37f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, -96.91f, -0.06f)
                arcTo(83.53f, 83.53f, 0.0f, false, false, 128.0f, 212.0f)
                close()
            }
        }
        .build()
        return _userSwitch!!
    }

private var _userSwitch: ImageVector? = null
