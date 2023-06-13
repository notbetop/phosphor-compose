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

public val DuotoneGroup.CornersOut: ImageVector
    get() {
        if (_cornersOut != null) {
            return _cornersOut!!
        }
        _cornersOut = Builder(name = "CornersOut", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 48.0f)
                lineTo(208.0f, 88.0f)
                lineTo(168.0f, 48.0f)
                close()
                moveTo(48.0f, 208.0f)
                lineTo(88.0f, 208.0f)
                lineTo(48.0f, 168.0f)
                close()
                moveTo(208.0f, 208.0f)
                lineTo(208.0f, 168.0f)
                lineToRelative(-40.0f, 40.0f)
                close()
                moveTo(48.0f, 88.0f)
                lineTo(88.0f, 48.0f)
                lineTo(48.0f, 48.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 40.0f)
                lineTo(168.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 13.66f)
                lineToRelative(40.0f, 40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 88.0f)
                lineTo(216.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 40.0f)
                close()
                moveTo(200.0f, 68.69f)
                lineTo(187.31f, 56.0f)
                lineTo(200.0f, 56.0f)
                close()
                moveTo(53.66f, 162.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 40.0f, 168.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(88.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.66f, -13.66f)
                close()
                moveTo(56.0f, 200.0f)
                lineTo(56.0f, 187.31f)
                lineTo(68.69f, 200.0f)
                close()
                moveTo(211.06f, 160.61f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.72f, 1.73f)
                lineToRelative(-40.0f, 40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 168.0f, 216.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(216.0f, 168.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 211.06f, 160.61f)
                close()
                moveTo(200.0f, 200.0f)
                lineTo(187.31f, 200.0f)
                lineTo(200.0f, 187.31f)
                close()
                moveTo(88.0f, 40.0f)
                lineTo(48.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(40.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.66f, 5.66f)
                lineToRelative(40.0f, -40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 88.0f, 40.0f)
                close()
                moveTo(56.0f, 68.69f)
                lineTo(56.0f, 56.0f)
                lineTo(68.69f, 56.0f)
                close()
            }
        }
        .build()
        return _cornersOut!!
    }

private var _cornersOut: ImageVector? = null
