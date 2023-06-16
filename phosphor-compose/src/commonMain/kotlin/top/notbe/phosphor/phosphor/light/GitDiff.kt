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

public val LightGroup.GitDiff: ImageVector
    get() {
        if (_gitDiff != null) {
            return _gitDiff!!
        }
        _gitDiff = Builder(name = "GitDiff", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 154.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(33.52f)
                lineToRelative(-31.7f, -31.7f)
                arcTo(41.75f, 41.75f, 0.0f, false, true, 62.0f, 132.12f)
                lineTo(62.0f, 93.4f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, -12.0f, 0.0f)
                verticalLineToRelative(38.72f)
                arcTo(53.65f, 53.65f, 0.0f, false, false, 65.82f, 170.3f)
                lineTo(97.52f, 202.0f)
                lineTo(64.0f, 202.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(118.0f, 160.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 112.0f, 154.0f)
                close()
                moveTo(38.0f, 64.0f)
                arcTo(18.0f, 18.0f, 0.0f, true, true, 56.0f, 82.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 38.0f, 64.0f)
                close()
                moveTo(206.0f, 162.6f)
                lineTo(206.0f, 123.88f)
                arcTo(53.65f, 53.65f, 0.0f, false, false, 190.18f, 85.7f)
                lineTo(158.48f, 54.0f)
                lineTo(192.0f, 54.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(144.0f, 42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(138.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(150.0f, 62.48f)
                lineToRelative(31.7f, 31.7f)
                arcToRelative(41.75f, 41.75f, 0.0f, false, true, 12.3f, 29.7f)
                lineTo(194.0f, 162.6f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, 12.0f, 0.0f)
                close()
                moveTo(200.0f, 210.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 200.0f, 210.0f)
                close()
            }
        }
        .build()
        return _gitDiff!!
    }

private var _gitDiff: ImageVector? = null
