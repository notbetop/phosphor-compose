package top.notbe.phosphor.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.ThinGroup

public val ThinGroup.GitDiff: ImageVector
    get() {
        if (_gitDiff != null) {
            return _gitDiff!!
        }
        _gitDiff = Builder(name = "GitDiff", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(38.34f)
                lineTo(72.89f, 163.23f)
                arcTo(43.71f, 43.71f, 0.0f, false, true, 60.0f, 132.12f)
                verticalLineTo(91.71f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -8.0f, 0.0f)
                verticalLineToRelative(40.41f)
                arcToRelative(51.66f, 51.66f, 0.0f, false, false, 15.23f, 36.77f)
                lineTo(102.34f, 204.0f)
                horizontalLineTo(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineTo(160.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 112.0f, 156.0f)
                close()
                moveTo(36.0f, 64.0f)
                arcTo(20.0f, 20.0f, 0.0f, true, true, 56.0f, 84.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 36.0f, 64.0f)
                close()
                moveTo(204.0f, 164.29f)
                verticalLineTo(123.88f)
                arcToRelative(51.66f, 51.66f, 0.0f, false, false, -15.23f, -36.77f)
                lineTo(153.66f, 52.0f)
                horizontalLineTo(192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineTo(144.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineTo(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(57.66f)
                lineToRelative(35.11f, 35.11f)
                arcTo(43.71f, 43.71f, 0.0f, false, true, 196.0f, 123.88f)
                verticalLineToRelative(40.41f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 8.0f, 0.0f)
                close()
                moveTo(200.0f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 200.0f, 212.0f)
                close()
            }
        }
        .build()
        return _gitDiff!!
    }

private var _gitDiff: ImageVector? = null
