package top.notbe.phosphor.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.FillGroup

public val FillGroup.QrCode: ImageVector
    get() {
        if (_qrCode != null) {
            return _qrCode!!
        }
        _qrCode = Builder(name = "QrCode", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.0f, 40.0f)
                lineTo(104.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 120.0f, 56.0f)
                lineTo(120.0f, 104.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 104.0f, 120.0f)
                lineTo(56.0f, 120.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 104.0f)
                lineTo(40.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 40.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.0f, 136.0f)
                lineTo(104.0f, 136.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 120.0f, 152.0f)
                lineTo(120.0f, 200.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 104.0f, 216.0f)
                lineTo(56.0f, 216.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 200.0f)
                lineTo(40.0f, 152.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 136.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 40.0f)
                lineTo(200.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 216.0f, 56.0f)
                lineTo(216.0f, 104.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 200.0f, 120.0f)
                lineTo(152.0f, 120.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 136.0f, 104.0f)
                lineTo(136.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 152.0f, 40.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineTo(144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 144.0f, 184.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 152.0f)
                horizontalLineTo(184.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(56.0f)
                horizontalLineTo(144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineTo(168.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(192.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 184.0f)
                close()
            }
        }
        .build()
        return _qrCode!!
    }

private var _qrCode: ImageVector? = null
