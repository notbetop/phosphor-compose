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

public val FillGroup.EscalatorDown: ImageVector
    get() {
        if (_escalatorDown != null) {
            return _escalatorDown!!
        }
        _escalatorDown = Builder(name = "EscalatorDown", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(170.34f, 85.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineTo(192.0f, 84.69f)
                verticalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineTo(84.69f)
                lineToRelative(10.34f, -10.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                close()
                moveTo(224.0f, 144.0f)
                horizontalLineTo(187.5f)
                lineTo(96.26f, 45.15f)
                arcTo(16.06f, 16.06f, 0.0f, false, false, 84.5f, 40.0f)
                horizontalLineTo(32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 16.0f, 56.0f)
                verticalLineTo(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(68.5f)
                lineToRelative(91.24f, 98.85f)
                arcTo(16.06f, 16.06f, 0.0f, false, false, 171.5f, 216.0f)
                horizontalLineTo(224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(160.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 224.0f, 144.0f)
                close()
            }
        }
        .build()
        return _escalatorDown!!
    }

private var _escalatorDown: ImageVector? = null
