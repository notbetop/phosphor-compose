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

public val FillGroup.ListBullets: ImageVector
    get() {
        if (_listBullets != null) {
            return _listBullets!!
        }
        _listBullets = Builder(name = "ListBullets", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 128.0f)
                close()
                moveTo(40.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, true, false, 56.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 48.0f)
                close()
                moveTo(40.0f, 176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 176.0f)
                close()
                moveTo(216.0f, 112.0f)
                lineTo(88.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(216.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(224.0f, 120.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 112.0f)
                close()
                moveTo(216.0f, 48.0f)
                lineTo(88.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(80.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(216.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(224.0f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 48.0f)
                close()
                moveTo(216.0f, 176.0f)
                lineTo(88.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(216.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(224.0f, 184.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 176.0f)
                close()
            }
        }
        .build()
        return _listBullets!!
    }

private var _listBullets: ImageVector? = null
