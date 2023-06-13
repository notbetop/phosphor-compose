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

public val FillGroup.FilmSlate: ImageVector
    get() {
        if (_filmSlate != null) {
            return _filmSlate!!
        }
        _filmSlate = Builder(name = "FilmSlate", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 104.0f)
                horizontalLineTo(102.09f)
                lineTo(210.0f, 75.51f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.68f, -9.84f)
                lineToRelative(-8.16f, -30.0f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, false, -19.42f, -11.13f)
                lineTo(35.81f, 64.74f)
                arcToRelative(15.75f, 15.75f, 0.0f, false, false, -9.7f, 7.4f)
                arcToRelative(15.51f, 15.51f, 0.0f, false, false, -1.55f, 12.0f)
                lineTo(32.0f, 111.56f)
                curveToRelative(0.0f, 0.14f, 0.0f, 0.29f, 0.0f, 0.44f)
                verticalLineToRelative(88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(112.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 104.0f)
                close()
                moveTo(136.44f, 54.72f)
                lineTo(164.57f, 71.0f)
                lineToRelative(-58.9f, 15.55f)
                lineTo(77.55f, 70.27f)
                close()
                moveTo(208.0f, 200.0f)
                horizontalLineTo(48.0f)
                verticalLineTo(120.0f)
                horizontalLineTo(208.0f)
                verticalLineToRelative(80.0f)
                close()
            }
        }
        .build()
        return _filmSlate!!
    }

private var _filmSlate: ImageVector? = null
