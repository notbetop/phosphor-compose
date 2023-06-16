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

public val FillGroup.GitMerge: ImageVector
    get() {
        if (_gitMerge != null) {
            return _gitMerge!!
        }
        _gitMerge = Builder(name = "GitMerge", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 112.0f)
                arcToRelative(32.06f, 32.06f, 0.0f, false, false, -31.0f, 24.0f)
                lineTo(152.0f, 136.0f)
                arcToRelative(40.19f, 40.19f, 0.0f, false, true, -32.0f, -16.0f)
                lineTo(93.69f, 84.92f)
                arcTo(32.0f, 32.0f, 0.0f, true, false, 72.0f, 87.0f)
                verticalLineToRelative(82.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 16.0f, 0.0f)
                lineTo(88.0f, 104.0f)
                lineToRelative(19.2f, 25.6f)
                arcTo(56.26f, 56.26f, 0.0f, false, false, 152.0f, 152.0f)
                horizontalLineToRelative(25.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 31.0f, -40.0f)
                close()
                moveTo(96.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 96.0f, 200.0f)
                close()
                moveTo(208.0f, 160.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(192.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                close()
            }
        }
        .build()
        return _gitMerge!!
    }

private var _gitMerge: ImageVector? = null
