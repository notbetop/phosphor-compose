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

public val FillGroup.ShootingStar: ImageVector
    get() {
        if (_shootingStar != null) {
            return _shootingStar!!
        }
        _shootingStar = Builder(name = "ShootingStar", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.39f, 84.07f)
                lineToRelative(-28.15f, 24.0f)
                lineToRelative(8.43f, 35.73f)
                arcToRelative(13.09f, 13.09f, 0.0f, false, true, -5.0f, 13.58f)
                arcToRelative(13.25f, 13.25f, 0.0f, false, true, -14.63f, 0.7f)
                lineToRelative(-32.0f, -19.0f)
                lineToRelative(-32.0f, 19.0f)
                arcToRelative(13.25f, 13.25f, 0.0f, false, true, -14.63f, -0.7f)
                arcToRelative(13.1f, 13.1f, 0.0f, false, true, -5.0f, -13.58f)
                lineToRelative(8.43f, -35.73f)
                lineToRelative(-28.16f, -24.0f)
                arcTo(13.13f, 13.13f, 0.0f, false, true, 100.1f, 61.0f)
                lineToRelative(37.23f, -3.15f)
                lineTo(151.85f, 24.0f)
                arcToRelative(13.24f, 13.24f, 0.0f, false, true, 24.31f, 0.0f)
                lineToRelative(14.52f, 33.87f)
                lineTo(227.9f, 61.0f)
                arcToRelative(13.12f, 13.12f, 0.0f, false, true, 7.49f, 23.06f)
                close()
                moveTo(85.66f, 114.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f)
                lineToRelative(-56.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineToRelative(56.0f, -56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 85.66f, 114.34f)
                close()
                moveTo(101.66f, 170.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f)
                lineToRelative(-56.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineToRelative(56.0f, -56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 101.66f, 170.34f)
                close()
                moveTo(162.35f, 170.34f)
                lineTo(106.35f, 226.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineToRelative(56.0f, -56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, -11.32f)
                close()
            }
        }
        .build()
        return _shootingStar!!
    }

private var _shootingStar: ImageVector? = null
