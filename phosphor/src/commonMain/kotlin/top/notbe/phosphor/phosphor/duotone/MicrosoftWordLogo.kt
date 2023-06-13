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

public val DuotoneGroup.MicrosoftWordLogo: ImageVector
    get() {
        if (_microsoftWordLogo != null) {
            return _microsoftWordLogo!!
        }
        _microsoftWordLogo = Builder(name = "MicrosoftWordLogo", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(152.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(144.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 152.0f, 80.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 24.0f)
                lineTo(72.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 40.0f)
                lineTo(56.0f, 64.0f)
                lineTo(40.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(56.0f, 192.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(200.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 200.0f, 24.0f)
                close()
                moveTo(160.0f, 104.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(48.0f)
                lineTo(160.0f, 152.0f)
                close()
                moveTo(72.0f, 40.0f)
                lineTo(200.0f, 40.0f)
                lineTo(200.0f, 88.0f)
                lineTo(160.0f, 88.0f)
                lineTo(160.0f, 80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(72.0f, 64.0f)
                close()
                moveTo(40.0f, 80.0f)
                lineTo(144.0f, 80.0f)
                verticalLineToRelative(79.83f)
                curveToRelative(0.0f, 0.06f, 0.0f, 0.11f, 0.0f, 0.17f)
                reflectiveCurveToRelative(0.0f, 0.11f, 0.0f, 0.17f)
                lineTo(144.0f, 176.0f)
                lineTo(40.0f, 176.0f)
                close()
                moveTo(72.0f, 216.0f)
                lineTo(72.0f, 192.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(48.0f)
                close()
                moveTo(68.24f, 153.94f)
                lineTo(56.24f, 105.94f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.52f, -3.88f)
                lineToRelative(6.76f, 27.0f)
                lineToRelative(6.32f, -12.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.32f, 0.0f)
                lineToRelative(6.32f, 12.66f)
                lineToRelative(6.76f, -27.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.52f, 3.88f)
                lineToRelative(-12.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.89f, 6.0f)
                arcToRelative(8.46f, 8.46f, 0.0f, false, true, -0.87f, 0.05f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.16f, -4.42f)
                lineTo(92.0f, 137.89f)
                lineToRelative(-8.84f, 17.69f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -14.92f, -1.64f)
                close()
            }
        }
        .build()
        return _microsoftWordLogo!!
    }

private var _microsoftWordLogo: ImageVector? = null
