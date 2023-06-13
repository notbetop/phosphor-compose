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

public val LightGroup.FigmaLogo: ImageVector
    get() {
        if (_figmaLogo != null) {
            return _figmaLogo!!
        }
        _figmaLogo = Builder(name = "FigmaLogo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.45f, 96.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 160.0f, 26.0f)
                lineTo(88.0f, 26.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 67.55f, 96.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 69.0f, 160.89f)
                arcTo(42.0f, 42.0f, 0.0f, true, false, 134.0f, 196.0f)
                lineTo(134.0f, 155.68f)
                arcTo(38.0f, 38.0f, 0.0f, true, false, 180.45f, 96.0f)
                close()
                moveTo(186.0f, 64.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -26.0f, 26.0f)
                lineTo(134.0f, 90.0f)
                lineTo(134.0f, 38.0f)
                horizontalLineToRelative(26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 186.0f, 64.0f)
                close()
                moveTo(62.0f, 64.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 88.0f, 38.0f)
                horizontalLineToRelative(34.0f)
                lineTo(122.0f, 90.0f)
                lineTo(88.0f, 90.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 62.0f, 64.0f)
                close()
                moveTo(88.0f, 154.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 0.0f, -52.0f)
                horizontalLineToRelative(34.0f)
                verticalLineToRelative(52.0f)
                lineTo(88.0f, 154.0f)
                close()
                moveTo(122.0f, 196.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, true, -30.0f, -30.0f)
                horizontalLineToRelative(30.0f)
                close()
                moveTo(160.0f, 154.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, 26.0f, -26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 160.0f, 154.0f)
                close()
            }
        }
        .build()
        return _figmaLogo!!
    }

private var _figmaLogo: ImageVector? = null
