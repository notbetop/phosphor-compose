package top.notbe.phosphor.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.DuotoneGroup

public val DuotoneGroup.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(209.94f, 113.94f)
                lineToRelative(-28.0f, 28.0f)
                arcToRelative(47.76f, 47.76f, 0.0f, false, true, -26.52f, 13.48f)
                arcToRelative(47.76f, 47.76f, 0.0f, false, true, -13.48f, 26.52f)
                lineToRelative(-28.0f, 28.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -67.88f, -67.88f)
                lineToRelative(28.0f, -28.0f)
                arcToRelative(47.76f, 47.76f, 0.0f, false, true, 26.52f, -13.48f)
                arcToRelative(47.76f, 47.76f, 0.0f, false, true, 13.48f, -26.52f)
                lineToRelative(28.0f, -28.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 67.88f, 67.88f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(137.54f, 186.36f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.31f)
                lineToRelative(-17.94f, 18.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 40.38f, 136.4f)
                lineTo(68.5f, 108.29f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 145.31f, 106.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -10.64f, 12.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -54.85f, 1.63f)
                lineTo(51.7f, 147.72f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 56.58f, 56.58f)
                lineToRelative(17.94f, -17.94f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 137.54f, 186.36f)
                close()
                moveTo(215.62f, 40.36f)
                arcToRelative(56.08f, 56.08f, 0.0f, false, false, -79.22f, 0.0f)
                lineTo(118.46f, 58.33f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.31f)
                lineTo(147.72f, 51.7f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 56.58f, 56.58f)
                lineTo(176.18f, 136.4f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 121.33f, 138.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 110.69f, 150.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 76.81f, -2.27f)
                lineToRelative(28.12f, -28.11f)
                arcTo(56.08f, 56.08f, 0.0f, false, false, 215.62f, 40.38f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
