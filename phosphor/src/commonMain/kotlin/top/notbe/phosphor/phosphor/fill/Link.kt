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

public val FillGroup.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(128.57f, 189.66f)
                lineToRelative(-5.46f, 5.45f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, -62.22f, -62.22f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(44.08f, 44.08f, 0.0f, false, true, 55.56f, -5.48f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.9f, 13.3f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 96.2f, 120.2f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 39.6f, 39.6f)
                lineToRelative(5.45f, -5.46f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                close()
                moveTo(195.11f, 123.11f)
                lineTo(171.11f, 147.11f)
                arcToRelative(44.08f, 44.08f, 0.0f, false, true, -55.56f, 5.48f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.9f, -13.3f)
                arcToRelative(28.06f, 28.06f, 0.0f, false, false, 35.35f, -3.49f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -39.6f, -39.6f)
                lineToRelative(-5.45f, 5.46f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineToRelative(5.46f, -5.45f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 62.22f, 62.22f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
