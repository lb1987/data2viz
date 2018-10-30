package io.data2viz.color

import io.data2viz.math.Angle
import kotlin.math.max

/**
 * Create a color in the HCL color space (CIELCH)
 *
 * @param h hue: Angle in degree
 * @param c chroma: Float, the upper bound for chroma depends on hue and luminance (typically in 0..230)
 * @param luminance: Float a value in the range [0,100] giving the luminance of the colour (in percent)
 * @param alpha: Float between 0 and 1
 */
class HclColor

@Deprecated("Deprecated", ReplaceWith("Colors.hcl(h,c,l,alpha)", "io.data2viz.colors.Colors"))
internal constructor(val h: Angle, val c: Double, luminance: Double, a: Double = 1.0) : Color {

    val l = luminance.coerceIn(.0, 100.0)
    override val alpha = a.coerceIn(.0, 1.0)

    override val rgb = toRgb().rgb
    override val rgba = toRgb().rgba
    override val r = toRgb().r
    override val g = toRgb().g
    override val b = toRgb().b
    override val rgbHex: String = toRgb().rgbHex

    override fun toRgb():RgbColor = toLab().toRgb()
    override fun brighten(strength: Double): Color = Colors.hcl(h, c, (l + (Kn * strength)), alpha)
    override fun darken(strength: Double): Color = Colors.hcl(h, c, (l - (Kn * strength)), alpha)
    override fun saturate(strength: Double): Color = Colors.hcl(h, max(.0, (c + (Kn * strength))), l, alpha)
    override fun desaturate(strength: Double): Color = Colors.hcl(h, max(.0, (c - (Kn * strength))), l, alpha)
    override fun withAlpha(alpha: Double) = Colors.hcl(h, c, l, alpha)

    /*val displayable: Boolean
        get() = (s in 0..1) && (l in 0..1) && (alpha in 0..1)*/

    override fun equals(other: Any?): Boolean = (other != null && other is HclColor && h == other.h && c == other.c && l == other.l && alpha == other.alpha)

    override fun toString() = "hcla(${h.deg}°, $c, ${l * 100}%, $alpha)"
    override fun hashCode(): Int {
        var result = h.hashCode()
        result = 31 * result + c.hashCode()
        result = 31 * result + l.hashCode()
        result = 31 * result + alpha.hashCode()
        result = 31 * result + rgb
        result = 31 * result + rgba.hashCode()
        result = 31 * result + r
        result = 31 * result + g
        result = 31 * result + b
        result = 31 * result + rgbHex.hashCode()
        return result
    }
}