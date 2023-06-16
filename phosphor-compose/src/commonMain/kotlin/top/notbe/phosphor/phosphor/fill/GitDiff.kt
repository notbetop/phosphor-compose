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

public val FillGroup.GitDiff: ImageVector
    get() {
        if (_gitDiff != null) {
            return _gitDiff!!
        }
        _gitDiff = Builder(name = "GitDiff", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 160.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(64.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(92.69f, 200.0f)
                lineTo(64.4f, 171.72f)
                arcTo(55.67f, 55.67f, 0.0f, false, true, 48.0f, 132.12f)
                lineTo(48.0f, 95.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 16.0f, 0.0f)
                verticalLineToRelative(37.13f)
                arcTo(39.71f, 39.71f, 0.0f, false, false, 75.72f, 160.4f)
                lineTo(104.0f, 188.69f)
                lineTo(104.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(208.0f, 161.0f)
                lineTo(208.0f, 123.88f)
                arcToRelative(55.67f, 55.67f, 0.0f, false, false, -16.4f, -39.6f)
                lineTo(163.31f, 56.0f)
                lineTo(192.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(144.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(136.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(152.0f, 67.31f)
                lineTo(180.28f, 95.6f)
                arcTo(39.71f, 39.71f, 0.0f, false, true, 192.0f, 123.88f)
                lineTo(192.0f, 161.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 16.0f, 0.0f)
                close()
            }
        }
        .build()
        return _gitDiff!!
    }

private var _gitDiff: ImageVector? = null
