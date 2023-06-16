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

public val FillGroup.Engine: ImageVector
    get() {
        if (_engine != null) {
            return _engine!!
        }
        _engine = Builder(name = "Engine", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 112.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(152.0f)
                horizontalLineTo(224.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(195.31f)
                lineTo(160.0f, 219.31f)
                arcTo(15.86f, 15.86f, 0.0f, false, true, 148.69f, 224.0f)
                horizontalLineTo(83.31f)
                arcTo(15.86f, 15.86f, 0.0f, false, true, 72.0f, 219.31f)
                lineTo(36.69f, 184.0f)
                arcTo(15.86f, 15.86f, 0.0f, false, true, 32.0f, 172.69f)
                verticalLineTo(152.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineTo(32.0f)
                verticalLineTo(80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 64.0f)
                horizontalLineToRelative(64.0f)
                verticalLineTo(48.0f)
                horizontalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(128.0f)
                verticalLineTo(64.0f)
                horizontalLineToRelative(20.69f)
                arcTo(15.86f, 15.86f, 0.0f, false, true, 160.0f, 68.69f)
                lineTo(195.31f, 104.0f)
                horizontalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
            }
        }
        .build()
        return _engine!!
    }

private var _engine: ImageVector? = null
