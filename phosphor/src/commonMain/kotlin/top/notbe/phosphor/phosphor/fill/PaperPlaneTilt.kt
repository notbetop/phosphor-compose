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

public val FillGroup.PaperPlaneTilt: ImageVector
    get() {
        if (_paperPlaneTilt != null) {
            return _paperPlaneTilt!!
        }
        _paperPlaneTilt = Builder(name = "PaperPlaneTilt", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.4f, 44.34f)
                reflectiveCurveToRelative(0.0f, 0.1f, 0.0f, 0.15f)
                lineToRelative(-58.2f, 191.94f)
                arcToRelative(15.88f, 15.88f, 0.0f, false, true, -14.0f, 11.51f)
                quadToRelative(-0.69f, 0.06f, -1.38f, 0.06f)
                arcToRelative(15.86f, 15.86f, 0.0f, false, true, -14.42f, -9.15f)
                lineToRelative(-35.71f, -75.39f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.79f, -4.54f)
                lineToRelative(57.26f, -57.27f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, -11.31f)
                lineTo(97.08f, 147.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.54f, 0.79f)
                lineToRelative(-75.0f, -35.53f)
                arcTo(16.37f, 16.37f, 0.0f, false, true, 8.0f, 97.36f)
                arcTo(15.89f, 15.89f, 0.0f, false, true, 19.57f, 82.84f)
                lineToRelative(191.94f, -58.2f)
                lineToRelative(0.15f, 0.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 231.4f, 44.34f)
                close()
            }
        }
        .build()
        return _paperPlaneTilt!!
    }

private var _paperPlaneTilt: ImageVector? = null
