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

public val FillGroup.PhoneIncoming: ImageVector
    get() {
        if (_phoneIncoming != null) {
            return _phoneIncoming!!
        }
        _phoneIncoming = Builder(name = "PhoneIncoming", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.88f, 175.08f)
                arcTo(56.26f, 56.26f, 0.0f, false, true, 176.0f, 224.0f)
                curveTo(96.6f, 224.0f, 32.0f, 159.4f, 32.0f, 80.0f)
                arcTo(56.26f, 56.26f, 0.0f, false, true, 80.92f, 24.12f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.62f, 9.52f)
                lineToRelative(21.12f, 47.15f)
                lineToRelative(0.0f, 0.12f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 117.39f, 96.0f)
                curveToRelative(-0.18f, 0.27f, -0.37f, 0.52f, -0.57f, 0.77f)
                lineTo(96.0f, 121.45f)
                curveToRelative(7.49f, 15.22f, 23.41f, 31.0f, 38.83f, 38.51f)
                lineToRelative(24.34f, -20.71f)
                arcToRelative(8.12f, 8.12f, 0.0f, false, true, 0.75f, -0.56f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 15.17f, -1.4f)
                lineToRelative(0.13f, 0.06f)
                lineToRelative(47.11f, 21.11f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 231.88f, 175.08f)
                close()
                moveTo(160.0f, 104.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(179.32f)
                lineToRelative(34.34f, -34.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f)
                lineTo(168.0f, 76.69f)
                verticalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineTo(96.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 104.0f)
                close()
            }
        }
        .build()
        return _phoneIncoming!!
    }

private var _phoneIncoming: ImageVector? = null
