package top.notbe.phosphor.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.ThinGroup

public val ThinGroup.MicrosoftOutlookLogo: ImageVector
    get() {
        if (_microsoftOutlookLogo != null) {
            return _microsoftOutlookLogo!!
        }
        _microsoftOutlookLogo = Builder(name = "MicrosoftOutlookLogo", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 100.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 88.0f, 100.0f)
                close()
                moveTo(88.0f, 148.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 88.0f, 148.0f)
                close()
                moveTo(216.0f, 108.0f)
                lineTo(204.0f, 108.0f)
                lineTo(204.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(112.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                lineTo(100.0f, 68.0f)
                lineTo(40.0f, 68.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(76.0f, 188.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(216.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 120.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 108.0f)
                close()
                moveTo(158.83f, 164.0f)
                lineTo(220.0f, 119.84f)
                arcToRelative(0.78f, 0.78f, 0.0f, false, true, 0.0f, 0.16f)
                verticalLineToRelative(88.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 0.17f)
                close()
                moveTo(211.63f, 116.0f)
                lineTo(204.0f, 121.51f)
                lineTo(204.0f, 116.0f)
                close()
                moveTo(108.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(79.29f)
                lineToRelative(-44.0f, 31.78f)
                lineToRelative(-4.0f, -2.89f)
                lineTo(148.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(108.0f, 68.0f)
                close()
                moveTo(36.0f, 176.0f)
                lineTo(36.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(40.0f, 180.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 36.0f, 176.0f)
                close()
                moveTo(84.0f, 208.0f)
                lineTo(84.0f, 188.0f)
                horizontalLineToRelative(52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineToRelative(-9.95f)
                lineTo(211.63f, 212.0f)
                lineTo(88.0f, 212.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 84.0f, 208.0f)
                close()
            }
        }
        .build()
        return _microsoftOutlookLogo!!
    }

private var _microsoftOutlookLogo: ImageVector? = null
