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

public val BoldGroup.IdentificationCard: ImageVector
    get() {
        if (_identificationCard != null) {
            return _identificationCard!!
        }
        _identificationCard = Builder(name = "IdentificationCard", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(156.0f, 120.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 144.0f, 108.0f)
                close()
                moveTo(156.0f, 160.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(156.0f, 136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
                moveTo(236.0f, 56.0f)
                lineTo(236.0f, 200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(40.0f, 220.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(20.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 40.0f, 36.0f)
                lineTo(216.0f, 36.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 236.0f, 56.0f)
                close()
                moveTo(212.0f, 60.0f)
                lineTo(44.0f, 60.0f)
                lineTo(44.0f, 196.0f)
                lineTo(212.0f, 196.0f)
                close()
                moveTo(54.28f, 159.37f)
                arcTo(43.82f, 43.82f, 0.0f, false, true, 67.53f, 142.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 56.94f, 0.0f)
                arcToRelative(43.84f, 43.84f, 0.0f, false, true, 13.26f, 17.37f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -22.15f, 9.26f)
                curveTo(112.48f, 161.19f, 104.42f, 156.0f, 96.0f, 156.0f)
                reflectiveCurveToRelative(-16.47f, 5.2f, -19.59f, 12.63f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -22.13f, -9.26f)
                close()
                moveTo(84.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 84.0f, 120.0f)
                close()
            }
        }
        .build()
        return _identificationCard!!
    }

private var _identificationCard: ImageVector? = null
