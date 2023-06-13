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

public val DuotoneGroup.FileVideo: ImageVector
    get() {
        if (_fileVideo != null) {
            return _fileVideo!!
        }
        _fileVideo = Builder(name = "FileVideo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(112.0f, 175.67f)
                lineTo(144.0f, 160.0f)
                verticalLineToRelative(56.0f)
                lineToRelative(-32.0f, -16.82f)
                verticalLineTo(208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                close()
                moveTo(152.0f, 32.0f)
                verticalLineTo(88.0f)
                horizontalLineToRelative(56.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(148.23f, 153.21f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.75f, -0.39f)
                lineToRelative(-21.22f, 10.39f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 104.0f, 152.0f)
                lineTo(48.0f, 152.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.44f, -11.87f)
                lineToRelative(20.84f, 11.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 216.0f)
                lineTo(152.0f, 160.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 148.23f, 153.21f)
                close()
                moveTo(104.0f, 208.0f)
                lineTo(48.0f, 208.0f)
                lineTo(48.0f, 168.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(31.0f)
                curveToRelative(0.0f, 0.13f, 0.0f, 0.25f, 0.0f, 0.38f)
                lineTo(104.0f, 208.0f)
                close()
                moveTo(136.0f, 202.76f)
                lineTo(120.0f, 194.34f)
                lineTo(120.0f, 180.66f)
                lineToRelative(16.0f, -7.83f)
                close()
                moveTo(213.66f, 82.34f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 24.0f)
                lineTo(56.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(56.0f, 40.0f)
                horizontalLineToRelative(88.0f)
                lineTo(144.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(48.0f)
                lineTo(200.0f, 216.0f)
                lineTo(176.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 213.66f, 82.34f)
                close()
                moveTo(160.0f, 51.31f)
                lineTo(188.69f, 80.0f)
                lineTo(160.0f, 80.0f)
                close()
            }
        }
        .build()
        return _fileVideo!!
    }

private var _fileVideo: ImageVector? = null
