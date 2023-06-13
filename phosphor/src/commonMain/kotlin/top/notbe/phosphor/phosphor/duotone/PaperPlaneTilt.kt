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

public val DuotoneGroup.PaperPlaneTilt: ImageVector
    get() {
        if (_paperPlaneTilt != null) {
            return _paperPlaneTilt!!
        }
        _paperPlaneTilt = Builder(name = "PaperPlaneTilt", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(223.69f, 42.18f)
                lineToRelative(-58.22f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -14.92f, 1.25f)
                lineTo(110.0f, 149.81f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.8f, -3.8f)
                lineTo(20.58f, 105.45f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 1.25f, -14.92f)
                lineToRelative(192.0f, -58.22f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 223.69f, 42.18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.32f, 28.68f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -15.66f, -4.08f)
                lineToRelative(-0.15f, 0.0f)
                lineTo(19.57f, 82.84f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -2.42f, 29.84f)
                lineToRelative(85.62f, 40.55f)
                lineToRelative(40.55f, 85.62f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 157.74f, 248.0f)
                quadToRelative(0.69f, 0.0f, 1.38f, -0.06f)
                arcToRelative(15.88f, 15.88f, 0.0f, false, false, 14.0f, -11.51f)
                lineToRelative(58.2f, -191.94f)
                curveToRelative(0.0f, -0.05f, 0.0f, -0.1f, 0.0f, -0.15f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 227.32f, 28.68f)
                close()
                moveTo(157.83f, 231.85f)
                lineToRelative(-0.05f, 0.14f)
                lineTo(118.42f, 148.9f)
                lineToRelative(47.24f, -47.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, -11.31f)
                lineTo(107.1f, 137.58f)
                lineTo(24.0f, 98.22f)
                lineToRelative(0.14f, 0.0f)
                lineTo(216.0f, 40.0f)
                close()
            }
        }
        .build()
        return _paperPlaneTilt!!
    }

private var _paperPlaneTilt: ImageVector? = null
