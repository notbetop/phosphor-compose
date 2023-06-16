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

public val FillGroup.PencilSimpleSlash: ImageVector
    get() {
        if (_pencilSimpleSlash != null) {
            return _pencilSimpleSlash!!
        }
        _pencilSimpleSlash = Builder(name = "PencilSimpleSlash", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.93f, 210.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.84f, 10.76f)
                lineTo(154.4f, 168.92f)
                lineTo(104.0f, 219.31f)
                arcTo(15.86f, 15.86f, 0.0f, false, true, 92.69f, 224.0f)
                horizontalLineTo(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(163.31f)
                arcTo(15.89f, 15.89f, 0.0f, false, true, 36.68f, 152.0f)
                lineToRelative(53.6f, -53.6f)
                lineToRelative(-48.2f, -53.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 53.92f, 34.62f)
                close()
                moveTo(227.32f, 96.0f)
                lineTo(183.0f, 140.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.66f, 2.34f)
                horizontalLineToRelative(-0.19f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.73f, -2.62f)
                lineTo(118.07f, 81.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.26f, -11.0f)
                lineTo(160.0f, 28.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.63f, 0.0f)
                lineToRelative(44.69f, 44.68f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 227.32f, 96.0f)
                close()
                moveTo(216.0f, 84.69f)
                lineTo(171.32f, 40.0f)
                lineToRelative(-24.0f, 24.0f)
                lineTo(192.0f, 108.69f)
                close()
            }
        }
        .build()
        return _pencilSimpleSlash!!
    }

private var _pencilSimpleSlash: ImageVector? = null
