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

public val BoldGroup.Storefront: ImageVector
    get() {
        if (_storefront != null) {
            return _storefront!!
        }
        _storefront = Builder(name = "Storefront", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -0.44f, -3.3f)
                lineTo(221.2f, 42.51f)
                arcTo(20.08f, 20.08f, 0.0f, false, false, 202.0f, 28.0f)
                lineTo(54.0f, 28.0f)
                arcTo(20.08f, 20.08f, 0.0f, false, false, 34.8f, 42.51f)
                lineTo(20.46f, 92.7f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 96.0f)
                lineToRelative(0.0f, 16.0f)
                arcToRelative(43.94f, 43.94f, 0.0f, false, false, 16.0f, 33.92f)
                lineTo(36.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(200.0f, 228.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(220.0f, 145.92f)
                arcTo(43.94f, 43.94f, 0.0f, false, false, 236.0f, 112.0f)
                close()
                moveTo(212.0f, 112.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -40.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(40.0f)
                close()
                moveTo(44.0f, 112.0f)
                verticalLineToRelative(-4.0f)
                lineTo(84.0f, 108.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -40.0f, 0.0f)
                close()
                moveTo(108.0f, 108.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -40.0f, 0.0f)
                close()
                moveTo(57.05f, 52.0f)
                lineTo(199.0f, 52.0f)
                lineToRelative(9.14f, 32.0f)
                lineTo(47.91f, 84.0f)
                close()
                moveTo(196.0f, 204.0f)
                lineTo(60.0f, 204.0f)
                lineTo(60.0f, 155.81f)
                curveToRelative(1.32f, 0.12f, 2.65f, 0.19f, 4.0f, 0.19f)
                arcToRelative(43.86f, 43.86f, 0.0f, false, false, 32.0f, -13.85f)
                arcToRelative(43.89f, 43.89f, 0.0f, false, false, 64.0f, 0.0f)
                arcTo(43.86f, 43.86f, 0.0f, false, false, 192.0f, 156.0f)
                curveToRelative(1.35f, 0.0f, 2.68f, -0.07f, 4.0f, -0.19f)
                close()
            }
        }
        .build()
        return _storefront!!
    }

private var _storefront: ImageVector? = null
