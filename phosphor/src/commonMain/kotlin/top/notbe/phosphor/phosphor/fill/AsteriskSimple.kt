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

public val FillGroup.AsteriskSimple: ImageVector
    get() {
        if (_asteriskSimple != null) {
            return _asteriskSimple!!
        }
        _asteriskSimple = Builder(name = "AsteriskSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(187.15f, 111.35f)
                lineTo(141.0f, 131.12f)
                lineToRelative(33.13f, 39.76f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.3f, 10.24f)
                lineTo(128.0f, 140.5f)
                lineTo(94.15f, 181.12f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.3f, -10.24f)
                lineTo(115.0f, 131.12f)
                lineTo(68.85f, 111.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 6.3f, -14.7f)
                lineTo(120.0f, 115.87f)
                lineTo(120.0f, 70.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(45.87f)
                lineToRelative(44.85f, -19.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 6.3f, 14.7f)
                close()
            }
        }
        .build()
        return _asteriskSimple!!
    }

private var _asteriskSimple: ImageVector? = null
