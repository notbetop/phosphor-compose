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

public val FillGroup.EscalatorUp: ImageVector
    get() {
        if (_escalatorUp != null) {
            return _escalatorUp!!
        }
        _escalatorUp = Builder(name = "EscalatorUp", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 56.0f)
                lineTo(240.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(187.5f, 112.0f)
                lineTo(96.25f, 210.85f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 84.5f, 216.0f)
                lineTo(32.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(16.0f, 160.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                lineTo(68.5f, 144.0f)
                lineToRelative(91.25f, -98.85f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 171.5f, 40.0f)
                lineTo(224.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 240.0f, 56.0f)
                close()
                moveTo(205.66f, 146.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineTo(192.0f, 171.31f)
                lineTo(192.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(208.0f, 171.31f)
                lineToRelative(10.34f, 10.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                close()
            }
        }
        .build()
        return _escalatorUp!!
    }

private var _escalatorUp: ImageVector? = null
