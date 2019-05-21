package io.data2viz.geo.projection

import io.data2viz.geo.*

fun equirectangularProjection() = equirectangularProjection {}
fun equirectangularProjection(init: Projection.() -> Unit) =
    projection(EquirectangularProjector()) {
        scale = 152.63
        init()
    }

class EquirectangularProjector : Projectable, Invertable {
    override fun projectLambda(lambda: Double, phi: Double): Double = lambda

    override fun projectPhi(lambda: Double, phi: Double): Double = phi

//    override fun project(lambda: Double, phi: Double) = doubleArrayOf(lambda, phi)
    override fun invert(x: Double, y: Double) = doubleArrayOf(x, y)
}