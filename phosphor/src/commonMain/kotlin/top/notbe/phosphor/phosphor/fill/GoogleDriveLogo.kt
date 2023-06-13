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

public val FillGroup.GoogleDriveLogo: ImageVector
    get() {
        if (_googleDriveLogo != null) {
            return _googleDriveLogo!!
        }
        _googleDriveLogo = Builder(name = "GoogleDriveLogo", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.6f, 151.78f)
                lineTo(169.13f, 39.52f)
                arcTo(15.91f, 15.91f, 0.0f, false, false, 155.56f, 32.0f)
                lineTo(100.43f, 32.0f)
                arcToRelative(15.89f, 15.89f, 0.0f, false, false, -13.56f, 7.52f)
                lineToRelative(-0.05f, 0.07f)
                lineTo(18.44f, 151.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -0.33f, 16.42f)
                lineToRelative(27.32f, 47.82f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 59.32f, 224.0f)
                lineTo(196.67f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 13.89f, -8.06f)
                lineToRelative(27.32f, -47.82f)
                arcTo(15.91f, 15.91f, 0.0f, false, false, 237.6f, 151.78f)
                close()
                moveTo(219.0f, 152.0f)
                lineTo(172.52f, 152.0f)
                lineTo(137.33f, 93.33f)
                lineToRelative(22.75f, -37.92f)
                close()
                moveTo(92.53f, 168.0f)
                horizontalLineToRelative(70.94f)
                lineToRelative(24.0f, 40.0f)
                lineTo(68.53f, 208.0f)
                close()
                moveTo(102.13f, 152.0f)
                lineTo(128.0f, 108.88f)
                lineTo(153.87f, 152.0f)
                close()
                moveTo(95.91f, 55.41f)
                lineToRelative(22.76f, 37.92f)
                lineTo(83.47f, 152.0f)
                lineTo(37.0f, 152.0f)
                close()
            }
        }
        .build()
        return _googleDriveLogo!!
    }

private var _googleDriveLogo: ImageVector? = null
