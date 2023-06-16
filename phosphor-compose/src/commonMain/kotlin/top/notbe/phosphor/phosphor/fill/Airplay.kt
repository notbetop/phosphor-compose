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

public val FillGroup.Airplay: ImageVector
    get() {
        if (_airplay != null) {
            return _airplay!!
        }
        _airplay = Builder(name = "Airplay", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(182.07f, 210.79f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 176.0f, 224.0f)
                horizontalLineTo(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.07f, -13.21f)
                lineToRelative(48.0f, -56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.15f, 0.0f)
                close()
                moveTo(208.0f, 40.0f)
                horizontalLineTo(48.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 24.0f, 64.0f)
                verticalLineTo(176.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineTo(60.26f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.0f, -1.4f)
                lineToRelative(46.48f, -54.22f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 36.44f, 0.0f)
                lineTo(192.7f, 198.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.0f, 1.4f)
                horizontalLineTo(208.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, -24.0f)
                verticalLineTo(64.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 208.0f, 40.0f)
                close()
            }
        }
        .build()
        return _airplay!!
    }

private var _airplay: ImageVector? = null
