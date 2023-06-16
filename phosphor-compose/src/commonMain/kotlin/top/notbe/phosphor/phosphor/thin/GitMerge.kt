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

public val ThinGroup.GitMerge: ImageVector
    get() {
        if (_gitMerge != null) {
            return _gitMerge!!
        }
        _gitMerge = Builder(name = "GitMerge", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 116.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -27.71f, 24.0f)
                lineTo(152.0f, 140.0f)
                arcToRelative(44.2f, 44.2f, 0.0f, false, true, -35.2f, -17.6f)
                lineTo(87.28f, 83.0f)
                arcTo(28.0f, 28.0f, 0.0f, true, false, 76.0f, 83.71f)
                verticalLineToRelative(88.58f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 8.0f, 0.0f)
                lineTo(84.0f, 92.0f)
                lineToRelative(26.4f, 35.2f)
                arcTo(52.26f, 52.26f, 0.0f, false, false, 152.0f, 148.0f)
                horizontalLineToRelative(28.29f)
                arcTo(28.0f, 28.0f, 0.0f, true, false, 208.0f, 116.0f)
                close()
                moveTo(60.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, true, true, 80.0f, 76.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 60.0f, 56.0f)
                close()
                moveTo(100.0f, 200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 100.0f, 200.0f)
                close()
                moveTo(208.0f, 164.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 208.0f, 164.0f)
                close()
            }
        }
        .build()
        return _gitMerge!!
    }

private var _gitMerge: ImageVector? = null
