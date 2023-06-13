package top.notbe.phosphor.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.RegularGroup

public val RegularGroup.TreeStructure: ImageVector
    get() {
        if (_treeStructure != null) {
            return _treeStructure!!
        }
        _treeStructure = Builder(name = "TreeStructure", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 112.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(168.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                lineTo(152.0f, 64.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, 32.0f)
                verticalLineToRelative(24.0f)
                lineTo(80.0f, 120.0f)
                verticalLineToRelative(-8.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 64.0f, 96.0f)
                lineTo(32.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(64.0f, 160.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 160.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(168.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(128.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                horizontalLineToRelative(8.0f)
                lineTo(152.0f, 96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 168.0f, 112.0f)
                close()
                moveTo(64.0f, 144.0f)
                lineTo(32.0f, 144.0f)
                lineTo(32.0f, 112.0f)
                lineTo(64.0f, 112.0f)
                verticalLineToRelative(32.0f)
                close()
                moveTo(168.0f, 160.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(48.0f)
                lineTo(168.0f, 208.0f)
                close()
                moveTo(168.0f, 48.0f)
                horizontalLineToRelative(48.0f)
                lineTo(216.0f, 96.0f)
                lineTo(168.0f, 96.0f)
                close()
            }
        }
        .build()
        return _treeStructure!!
    }

private var _treeStructure: ImageVector? = null
