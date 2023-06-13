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

public val LightGroup.LadderSimple: ImageVector
    get() {
        if (_ladderSimple != null) {
            return _ladderSimple!!
        }
        _ladderSimple = Builder(name = "LadderSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(186.0f, 66.0f)
                lineTo(70.0f, 66.0f)
                lineTo(70.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(58.0f, 224.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(70.0f, 190.0f)
                lineTo(186.0f, 190.0f)
                verticalLineToRelative(34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(198.0f, 32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 192.0f, 26.0f)
                close()
                moveTo(186.0f, 78.0f)
                verticalLineToRelative(44.0f)
                lineTo(70.0f, 122.0f)
                lineTo(70.0f, 78.0f)
                close()
                moveTo(70.0f, 178.0f)
                lineTo(70.0f, 134.0f)
                lineTo(186.0f, 134.0f)
                verticalLineToRelative(44.0f)
                close()
            }
        }
        .build()
        return _ladderSimple!!
    }

private var _ladderSimple: ImageVector? = null
