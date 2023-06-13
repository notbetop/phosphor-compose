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

public val LightGroup.GitMerge: ImageVector
    get() {
        if (_gitMerge != null) {
            return _gitMerge!!
        }
        _gitMerge = Builder(name = "GitMerge", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 114.0f)
                arcToRelative(30.05f, 30.05f, 0.0f, false, false, -29.4f, 24.0f)
                lineTo(152.0f, 138.0f)
                arcToRelative(42.2f, 42.2f, 0.0f, false, true, -33.6f, -16.8f)
                lineTo(90.56f, 84.08f)
                arcTo(30.0f, 30.0f, 0.0f, true, false, 74.0f, 85.4f)
                verticalLineToRelative(85.2f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, 12.0f, 0.0f)
                lineTo(86.0f, 98.0f)
                lineToRelative(22.8f, 30.4f)
                arcTo(54.26f, 54.26f, 0.0f, false, false, 152.0f, 150.0f)
                horizontalLineToRelative(26.6f)
                arcTo(30.0f, 30.0f, 0.0f, true, false, 208.0f, 114.0f)
                close()
                moveTo(62.0f, 56.0f)
                arcTo(18.0f, 18.0f, 0.0f, true, true, 80.0f, 74.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 62.0f, 56.0f)
                close()
                moveTo(98.0f, 200.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, -18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 98.0f, 200.0f)
                close()
                moveTo(208.0f, 162.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 208.0f, 162.0f)
                close()
            }
        }
        .build()
        return _gitMerge!!
    }

private var _gitMerge: ImageVector? = null
