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

public val ThinGroup.Password: ImageVector
    get() {
        if (_password != null) {
            return _password!!
        }
        _password = Builder(name = "Password", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(44.0f, 56.0f)
                lineTo(44.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(36.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(133.2f, 114.31f)
                lineTo(108.0f, 122.49f)
                lineTo(108.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(26.49f)
                lineToRelative(-25.2f, -8.18f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -2.47f, 7.61f)
                lineToRelative(25.2f, 8.18f)
                lineTo(82.0f, 151.54f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 6.47f, 4.7f)
                lineTo(104.0f, 134.81f)
                lineToRelative(15.57f, 21.43f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.24f, 1.65f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.23f, -6.35f)
                lineTo(110.47f, 130.1f)
                lineToRelative(25.2f, -8.18f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.47f, -7.61f)
                close()
                moveTo(234.2f, 116.88f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.0f, -2.57f)
                lineTo(204.0f, 122.49f)
                lineTo(204.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(26.49f)
                lineToRelative(-25.2f, -8.18f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.47f, 7.61f)
                lineToRelative(25.2f, 8.18f)
                lineTo(178.0f, 151.54f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 6.47f, 4.7f)
                lineTo(200.0f, 134.81f)
                lineToRelative(15.57f, 21.43f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.24f, 1.65f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.23f, -6.35f)
                lineTo(206.47f, 130.1f)
                lineToRelative(25.2f, -8.18f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 234.24f, 116.88f)
                close()
            }
        }
        .build()
        return _password!!
    }

private var _password: ImageVector? = null
