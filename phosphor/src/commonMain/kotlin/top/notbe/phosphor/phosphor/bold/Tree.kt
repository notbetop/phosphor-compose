package top.notbe.phosphor.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.BoldGroup

public val BoldGroup.Tree: ImageVector
    get() {
        if (_tree != null) {
            return _tree!!
        }
        _tree = Builder(name = "Tree", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.18f, 59.63f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, -146.36f, 0.0f)
                arcTo(76.29f, 76.29f, 0.0f, false, false, 12.0f, 127.79f)
                curveToRelative(-0.11f, 41.0f, 33.1f, 75.15f, 74.0f, 76.19f)
                arcToRelative(75.84f, 75.84f, 0.0f, false, false, 30.0f, -5.31f)
                verticalLineTo(232.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(198.67f)
                arcTo(75.79f, 75.79f, 0.0f, false, false, 168.0f, 204.0f)
                lineToRelative(2.0f, 0.0f)
                curveToRelative(40.94f, -1.0f, 74.15f, -35.22f, 74.0f, -76.19f)
                arcTo(76.29f, 76.29f, 0.0f, false, false, 201.18f, 59.63f)
                close()
                moveTo(169.35f, 180.0f)
                arcTo(51.51f, 51.51f, 0.0f, false, true, 140.0f, 171.8f)
                verticalLineTo(135.42f)
                lineToRelative(41.37f, -20.69f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -10.74f, -21.46f)
                lineTo(140.0f, 108.58f)
                verticalLineTo(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(44.58f)
                lineTo(85.37f, 117.27f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.74f, 21.46f)
                lineTo(116.0f, 159.42f)
                verticalLineTo(171.8f)
                arcTo(51.43f, 51.43f, 0.0f, false, true, 86.65f, 180.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 66.27f, 80.76f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 76.34f, 70.34f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, 103.32f, 0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 10.07f, 10.42f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 169.35f, 180.0f)
                close()
            }
        }
        .build()
        return _tree!!
    }

private var _tree: ImageVector? = null
