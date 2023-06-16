package top.notbe.phosphor.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.LightGroup

public val LightGroup.BugDroid: ImageVector
    get() {
        if (_bugDroid != null) {
            return _bugDroid!!
        }
        _bugDroid = Builder(name = "BugDroid", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(189.0f, 43.47f)
                lineToRelative(15.22f, -15.23f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, -8.48f)
                lineTo(180.0f, 35.54f)
                arcTo(85.76f, 85.76f, 0.0f, false, false, 76.0f, 35.54f)
                lineTo(60.24f, 19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f)
                lineTo(67.0f, 43.47f)
                arcTo(85.7f, 85.7f, 0.0f, false, false, 42.0f, 104.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, false, 172.0f, 0.0f)
                lineTo(214.0f, 104.0f)
                arcTo(85.7f, 85.7f, 0.0f, false, false, 189.0f, 43.47f)
                close()
                moveTo(128.0f, 30.0f)
                arcToRelative(74.09f, 74.09f, 0.0f, false, true, 74.0f, 74.0f)
                verticalLineToRelative(10.0f)
                lineTo(54.0f, 114.0f)
                lineTo(54.0f, 104.0f)
                arcTo(74.09f, 74.09f, 0.0f, false, true, 128.0f, 30.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(74.09f, 74.09f, 0.0f, false, true, -74.0f, -74.0f)
                lineTo(54.0f, 126.0f)
                lineTo(202.0f, 126.0f)
                verticalLineToRelative(18.0f)
                arcTo(74.09f, 74.09f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(146.0f, 84.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 146.0f, 84.0f)
                close()
                moveTo(90.0f, 84.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 90.0f, 84.0f)
                close()
            }
        }
        .build()
        return _bugDroid!!
    }

private var _bugDroid: ImageVector? = null
