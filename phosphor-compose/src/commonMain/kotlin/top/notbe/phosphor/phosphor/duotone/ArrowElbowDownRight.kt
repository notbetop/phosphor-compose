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

public val DuotoneGroup.ArrowElbowDownRight: ImageVector
    get() {
        if (_arrowElbowDownRight != null) {
            return _arrowElbowDownRight!!
        }
        _arrowElbowDownRight = Builder(name = "ArrowElbowDownRight", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 176.0f)
                lineToRelative(-48.0f, 48.0f)
                verticalLineTo(128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.66f, 170.34f)
                lineToRelative(-48.0f, -48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 128.0f)
                verticalLineToRelative(40.0f)
                horizontalLineTo(72.0f)
                verticalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineTo(176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(88.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.66f, 5.66f)
                lineToRelative(48.0f, -48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 213.66f, 170.34f)
                close()
                moveTo(168.0f, 204.69f)
                verticalLineTo(147.31f)
                lineTo(196.69f, 176.0f)
                close()
            }
        }
        .build()
        return _arrowElbowDownRight!!
    }

private var _arrowElbowDownRight: ImageVector? = null
