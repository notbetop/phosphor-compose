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

public val ThinGroup.TreeStructure: ImageVector
    get() {
        if (_treeStructure != null) {
            return _treeStructure!!
        }
        _treeStructure = Builder(name = "TreeStructure", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 108.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(168.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                lineTo(156.0f, 68.0f)
                lineTo(144.0f, 68.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -28.0f, 28.0f)
                verticalLineToRelative(28.0f)
                lineTo(76.0f, 124.0f)
                lineTo(76.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(32.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(64.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(76.0f, 132.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, 28.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(168.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(20.0f)
                lineTo(144.0f, 180.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(124.0f, 96.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, -20.0f)
                horizontalLineToRelative(12.0f)
                lineTo(156.0f, 96.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 168.0f, 108.0f)
                close()
                moveTo(68.0f, 144.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(32.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(28.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(64.0f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(164.0f, 160.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(168.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                close()
                moveTo(164.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(220.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(168.0f, 100.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _treeStructure!!
    }

private var _treeStructure: ImageVector? = null
