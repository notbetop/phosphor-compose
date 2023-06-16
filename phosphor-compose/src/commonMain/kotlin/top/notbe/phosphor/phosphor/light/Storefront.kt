package top.notbe.phosphor.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.LightGroup

public val LightGroup.Storefront: ImageVector
    get() {
        if (_storefront != null) {
            return _storefront!!
        }
        _storefront = Builder(name = "Storefront", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.0f, 96.0f)
                arcToRelative(6.19f, 6.19f, 0.0f, false, false, -0.22f, -1.65f)
                lineToRelative(-14.34f, -50.2f)
                arcTo(14.07f, 14.07f, 0.0f, false, false, 202.0f, 34.0f)
                lineTo(54.0f, 34.0f)
                arcTo(14.07f, 14.07f, 0.0f, false, false, 40.57f, 44.15f)
                lineTo(26.23f, 94.35f)
                arcTo(6.19f, 6.19f, 0.0f, false, false, 26.0f, 96.0f)
                verticalLineToRelative(16.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 42.0f, 143.0f)
                lineTo(42.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(200.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(214.0f, 143.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 230.0f, 112.0f)
                close()
                moveTo(52.11f, 47.45f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 54.0f, 46.0f)
                lineTo(202.0f, 46.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.92f, 1.45f)
                lineTo(216.05f, 90.0f)
                lineTo(40.0f, 90.0f)
                close()
                moveTo(102.0f, 102.0f)
                horizontalLineToRelative(52.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -52.0f, 0.0f)
                close()
                moveTo(38.0f, 102.0f)
                lineTo(90.0f, 102.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -52.0f, 0.0f)
                close()
                moveTo(202.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(56.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(54.0f, 148.66f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 42.0f, -16.21f)
                arcToRelative(37.95f, 37.95f, 0.0f, false, false, 64.0f, 0.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 42.0f, 16.21f)
                close()
                moveTo(192.0f, 138.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -26.0f, -26.0f)
                lineTo(166.0f, 102.0f)
                horizontalLineToRelative(52.0f)
                verticalLineToRelative(10.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 192.0f, 138.0f)
                close()
            }
        }
        .build()
        return _storefront!!
    }

private var _storefront: ImageVector? = null
