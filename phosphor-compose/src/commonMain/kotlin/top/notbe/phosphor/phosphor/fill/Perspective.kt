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

public val FillGroup.Perspective: ImageVector
    get() {
        if (_perspective != null) {
            return _perspective!!
        }
        _perspective = Builder(name = "Perspective", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 120.0f)
                horizontalLineTo(32.0f)
                verticalLineTo(77.09f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 45.14f, 61.35f)
                lineToRelative(160.0f, -29.09f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 48.0f)
                close()
                moveTo(32.0f, 178.91f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 13.14f, 15.74f)
                lineToRelative(160.0f, 29.09f)
                arcTo(16.47f, 16.47f, 0.0f, false, false, 208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(136.0f)
                horizontalLineTo(32.0f)
                close()
                moveTo(240.0f, 120.0f)
                horizontalLineTo(224.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(16.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineTo(32.0f)
                verticalLineTo(120.0f)
                close()
            }
        }
        .build()
        return _perspective!!
    }

private var _perspective: ImageVector? = null
