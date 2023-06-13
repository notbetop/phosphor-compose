package top.notbe.phosphor.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.RegularGroup

public val RegularGroup.Storefront: ImageVector
    get() {
        if (_storefront != null) {
            return _storefront!!
        }
        _storefront = Builder(name = "Storefront", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 96.0f)
                arcToRelative(7.89f, 7.89f, 0.0f, false, false, -0.3f, -2.2f)
                lineTo(217.35f, 43.6f)
                arcTo(16.07f, 16.07f, 0.0f, false, false, 202.0f, 32.0f)
                lineTo(54.0f, 32.0f)
                arcTo(16.07f, 16.07f, 0.0f, false, false, 38.65f, 43.6f)
                lineTo(24.31f, 93.8f)
                arcTo(7.89f, 7.89f, 0.0f, false, false, 24.0f, 96.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 16.0f, 32.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(200.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 144.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 16.0f, -32.0f)
                close()
                moveTo(54.0f, 48.0f)
                lineTo(202.0f, 48.0f)
                lineToRelative(11.42f, 40.0f)
                lineTo(42.61f, 88.0f)
                close()
                moveTo(104.0f, 104.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -48.0f, 0.0f)
                close()
                moveTo(88.0f, 104.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -48.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(200.0f, 208.0f)
                lineTo(56.0f, 208.0f)
                lineTo(56.0f, 151.2f)
                arcToRelative(40.57f, 40.57f, 0.0f, false, false, 8.0f, 0.8f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 32.0f, -16.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 64.0f, 0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 32.0f, 16.0f)
                arcToRelative(40.57f, 40.57f, 0.0f, false, false, 8.0f, -0.8f)
                close()
                moveTo(192.0f, 136.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(8.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 192.0f, 136.0f)
                close()
            }
        }
        .build()
        return _storefront!!
    }

private var _storefront: ImageVector? = null
