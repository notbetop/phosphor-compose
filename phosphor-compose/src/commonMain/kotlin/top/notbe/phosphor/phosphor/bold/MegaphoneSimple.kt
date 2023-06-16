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

public val BoldGroup.MegaphoneSimple: ImageVector
    get() {
        if (_megaphoneSimple != null) {
            return _megaphoneSimple!!
        }
        _megaphoneSimple = Builder(name = "MegaphoneSimple", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.7f, 82.83f)
                lineToRelative(-176.1f, -54.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 48.0f)
                lineTo(20.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 19.94f, 20.0f)
                arcToRelative(20.38f, 20.38f, 0.0f, false, false, 5.66f, -0.81f)
                lineTo(124.0f, 187.14f)
                lineTo(124.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(196.0f, 165.05f)
                lineToRelative(25.7f, -7.88f)
                arcTo(20.12f, 20.12f, 0.0f, false, false, 236.0f, 138.0f)
                lineTo(236.0f, 102.0f)
                arcTo(20.12f, 20.12f, 0.0f, false, false, 221.7f, 82.83f)
                close()
                moveTo(124.0f, 162.0f)
                lineTo(44.0f, 186.58f)
                lineTo(44.0f, 53.42f)
                lineTo(124.0f, 78.0f)
                close()
                moveTo(172.0f, 188.0f)
                lineTo(148.0f, 188.0f)
                verticalLineToRelative(-8.22f)
                lineToRelative(24.0f, -7.36f)
                close()
                moveTo(212.0f, 135.0f)
                lineTo(148.0f, 154.63f)
                lineTo(148.0f, 85.33f)
                lineTo(212.0f, 105.0f)
                close()
            }
        }
        .build()
        return _megaphoneSimple!!
    }

private var _megaphoneSimple: ImageVector? = null
