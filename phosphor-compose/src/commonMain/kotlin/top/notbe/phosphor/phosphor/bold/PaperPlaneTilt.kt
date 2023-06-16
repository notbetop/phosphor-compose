package top.notbe.phosphor.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.BoldGroup

public val BoldGroup.PaperPlaneTilt: ImageVector
    get() {
        if (_paperPlaneTilt != null) {
            return _paperPlaneTilt!!
        }
        _paperPlaneTilt = Builder(name = "PaperPlaneTilt", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.14f, 25.86f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -19.57f, -5.11f)
                lineToRelative(-0.22f, 0.07f)
                lineTo(18.44f, 79.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -3.0f, 37.28f)
                lineToRelative(84.32f, 40.0f)
                lineToRelative(40.0f, 84.32f)
                arcToRelative(19.81f, 19.81f, 0.0f, false, false, 18.0f, 11.44f)
                curveToRelative(0.57f, 0.0f, 1.15f, 0.0f, 1.73f, -0.07f)
                arcTo(19.82f, 19.82f, 0.0f, false, false, 177.0f, 237.56f)
                lineTo(235.18f, 45.65f)
                arcToRelative(1.42f, 1.42f, 0.0f, false, false, 0.07f, -0.22f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 230.14f, 25.86f)
                close()
                moveTo(157.0f, 220.92f)
                lineToRelative(-33.72f, -71.19f)
                lineToRelative(45.25f, -45.25f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                lineToRelative(-45.25f, 45.25f)
                lineTo(35.08f, 99.0f)
                lineTo(210.0f, 46.0f)
                close()
            }
        }
        .build()
        return _paperPlaneTilt!!
    }

private var _paperPlaneTilt: ImageVector? = null
