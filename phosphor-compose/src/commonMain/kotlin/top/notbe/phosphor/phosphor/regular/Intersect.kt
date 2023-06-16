package top.notbe.phosphor.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.RegularGroup

public val RegularGroup.Intersect: ImageVector
    get() {
        if (_intersect != null) {
            return _intersect!!
        }
        _intersect = Builder(name = "Intersect", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.63f, 81.37f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, -93.26f, 93.26f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, 93.26f, -93.26f)
                close()
                moveTo(100.69f, 136.0f)
                lineTo(120.0f, 155.31f)
                arcTo(63.48f, 63.48f, 0.0f, false, true, 96.0f, 160.0f)
                arcTo(63.48f, 63.48f, 0.0f, false, true, 100.69f, 136.0f)
                close()
                moveTo(134.44f, 147.13f)
                lineTo(108.87f, 121.56f)
                arcToRelative(64.65f, 64.65f, 0.0f, false, true, 12.69f, -12.69f)
                lineToRelative(25.57f, 25.57f)
                arcTo(64.65f, 64.65f, 0.0f, false, true, 134.44f, 147.13f)
                close()
                moveTo(155.31f, 120.0f)
                lineTo(136.0f, 100.69f)
                arcTo(63.48f, 63.48f, 0.0f, false, true, 160.0f, 96.0f)
                arcTo(63.48f, 63.48f, 0.0f, false, true, 155.31f, 120.0f)
                close()
                moveTo(32.0f, 96.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 126.0f, -16.0f)
                arcTo(80.08f, 80.08f, 0.0f, false, false, 80.05f, 158.0f)
                arcTo(64.11f, 64.11f, 0.0f, false, true, 32.0f, 96.0f)
                close()
                moveTo(160.0f, 224.0f)
                arcTo(64.11f, 64.11f, 0.0f, false, true, 98.0f, 176.0f)
                arcTo(80.08f, 80.08f, 0.0f, false, false, 176.0f, 98.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 160.0f, 224.0f)
                close()
            }
        }
        .build()
        return _intersect!!
    }

private var _intersect: ImageVector? = null
