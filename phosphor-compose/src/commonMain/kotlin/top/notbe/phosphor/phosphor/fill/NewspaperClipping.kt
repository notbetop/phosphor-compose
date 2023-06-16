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

public val FillGroup.NewspaperClipping: ImageVector
    get() {
        if (_newspaperClipping != null) {
            return _newspaperClipping!!
        }
        _newspaperClipping = Builder(name = "NewspaperClipping", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(72.0f, 104.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(48.0f)
                lineTo(72.0f, 152.0f)
                close()
                moveTo(232.0f, 56.0f)
                lineTo(232.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.58f, 7.15f)
                lineTo(192.0f, 208.94f)
                lineToRelative(-28.42f, 14.21f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.16f, 0.0f)
                lineTo(128.0f, 208.94f)
                lineTo(99.58f, 223.15f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.16f, 0.0f)
                lineTo(64.0f, 208.94f)
                lineTo(35.58f, 223.15f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 24.0f, 216.0f)
                lineTo(24.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 40.0f)
                lineTo(216.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 56.0f)
                close()
                moveTo(120.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(64.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                close()
                moveTo(200.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(144.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 144.0f)
                close()
                moveTo(200.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(144.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 112.0f)
                close()
            }
        }
        .build()
        return _newspaperClipping!!
    }

private var _newspaperClipping: ImageVector? = null
