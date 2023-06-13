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

public val FillGroup.MicrosoftOutlookLogo: ImageVector
    get() {
        if (_microsoftOutlookLogo != null) {
            return _microsoftOutlookLogo!!
        }
        _microsoftOutlookLogo = Builder(name = "MicrosoftOutlookLogo", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 88.0f, 144.0f)
                close()
                moveTo(232.0f, 120.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -5.0f, 11.61f)
                arcToRelative(8.8f, 8.8f, 0.0f, false, true, -0.72f, 0.65f)
                arcTo(15.93f, 15.93f, 0.0f, false, true, 216.0f, 224.0f)
                lineTo(88.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(72.0f, 192.0f)
                lineTo(40.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(24.0f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 64.0f)
                lineTo(96.0f, 64.0f)
                lineTo(96.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(56.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(15.94f, 15.94f, 0.0f, false, true, 10.0f, 3.54f)
                lineToRelative(0.08f, 0.07f)
                lineToRelative(0.14f, 0.11f)
                arcToRelative(6.78f, 6.78f, 0.0f, false, true, 0.74f, 0.68f)
                arcTo(15.93f, 15.93f, 0.0f, false, true, 232.0f, 120.0f)
                close()
                moveTo(112.0f, 64.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(74.13f)
                lineToRelative(40.0f, -28.89f)
                lineTo(192.0f, 48.0f)
                lineTo(112.0f, 48.0f)
                close()
                moveTo(88.0f, 160.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 88.0f, 160.0f)
                close()
                moveTo(199.26f, 208.0f)
                lineTo(152.0f, 173.87f)
                lineTo(152.0f, 176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(88.0f, 192.0f)
                verticalLineToRelative(16.0f)
                close()
                moveTo(216.0f, 127.65f)
                lineTo(165.66f, 164.0f)
                lineTo(216.0f, 200.35f)
                close()
            }
        }
        .build()
        return _microsoftOutlookLogo!!
    }

private var _microsoftOutlookLogo: ImageVector? = null
