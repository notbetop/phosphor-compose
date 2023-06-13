package top.notbe.phosphor.phosphor.fill

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
import top.notbe.phosphor.phosphor.FillGroup

public val FillGroup.CloudSlash: ImageVector
    get() {
        if (_cloudSlash != null) {
            return _cloudSlash!!
        }
        _cloudSlash = Builder(name = "CloudSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.92f, 34.62f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f)
                lineTo(81.32f, 88.55f)
                lineToRelative(-0.06f, 0.12f)
                arcTo(64.0f, 64.0f, 0.0f, true, false, 72.0f, 216.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(87.34f, 87.34f, 0.0f, false, false, 31.8f, -5.93f)
                lineToRelative(10.28f, 11.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 40.0f)
                arcToRelative(87.35f, 87.35f, 0.0f, false, false, -52.11f, 17.08f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -1.18f, 11.83f)
                lineTo(213.76f, 186.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.92f, 2.62f)
                horizontalLineToRelative(0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.94f, -2.67f)
                arcTo(88.0f, 88.0f, 0.0f, false, false, 160.0f, 40.0f)
                close()
            }
        }
        .build()
        return _cloudSlash!!
    }

private var _cloudSlash: ImageVector? = null
