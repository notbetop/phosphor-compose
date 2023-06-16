package top.notbe.phosphor.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.DuotoneGroup

public val DuotoneGroup.CornersIn: ImageVector
    get() {
        if (_cornersIn != null) {
            return _cornersIn!!
        }
        _cornersIn = Builder(name = "CornersIn", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 96.0f)
                lineTo(160.0f, 96.0f)
                lineTo(160.0f, 48.0f)
                close()
                moveTo(96.0f, 208.0f)
                lineTo(96.0f, 160.0f)
                lineTo(48.0f, 160.0f)
                close()
                moveTo(160.0f, 208.0f)
                lineTo(208.0f, 160.0f)
                lineTo(160.0f, 160.0f)
                close()
                moveTo(96.0f, 96.0f)
                lineTo(96.0f, 48.0f)
                lineTo(48.0f, 96.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 104.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.66f, -13.66f)
                lineToRelative(-48.0f, -48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 48.0f)
                lineTo(152.0f, 96.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 104.0f)
                close()
                moveTo(168.0f, 67.31f)
                lineTo(188.69f, 88.0f)
                lineTo(168.0f, 88.0f)
                close()
                moveTo(96.0f, 152.0f)
                lineTo(48.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 13.66f)
                lineToRelative(48.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 208.0f)
                lineTo(104.0f, 160.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 96.0f, 152.0f)
                close()
                moveTo(88.0f, 188.69f)
                lineTo(67.31f, 168.0f)
                lineTo(88.0f, 168.0f)
                close()
                moveTo(208.0f, 152.0f)
                lineTo(160.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.66f, 5.66f)
                lineToRelative(48.0f, -48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 152.0f)
                close()
                moveTo(168.0f, 188.69f)
                lineTo(168.0f, 168.0f)
                horizontalLineToRelative(20.69f)
                close()
                moveTo(99.06f, 40.61f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.72f, 1.73f)
                lineToRelative(-48.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 48.0f, 104.0f)
                lineTo(96.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(104.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 99.06f, 40.61f)
                close()
                moveTo(88.0f, 88.0f)
                lineTo(67.31f, 88.0f)
                lineTo(88.0f, 67.31f)
                close()
            }
        }
        .build()
        return _cornersIn!!
    }

private var _cornersIn: ImageVector? = null
