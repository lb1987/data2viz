import io.data2viz.color.ColorTests
import io.data2viz.color.EncodedColorsTests
import io.data2viz.core.TicksTests
import io.data2viz.dsv.DsvTests
import io.data2viz.experiments.fantasymap.buildFantasyMap
import io.data2viz.interpolate.*
import io.data2viz.random.RandomTests
import io.data2viz.test.*


fun allTests() {
    htmlExecution(
            RandomTests(),
            DsvTests(),
            NumberTests(),
            ColorTests(),
            TicksTests(),
            EncodedColorsTests(),
            EaseTests(),
            ExceptionMatchers(),
            StringMatchers(),
            IntMatchers(),
            LongMatchers(),
            DoubleMatchers(),
            TestCollectionMatchers(),
            ScaleTests(),
            RGBTests(),
            HSLTests()
    )
}

fun bindingPerfs() = io.data2viz.experiments.bindingPerfs()
fun fantasyMap()    = buildFantasyMap()
//fun fantasyVoroinoMap()    = buildVoronoiFantasyMap()
fun voronoi()    = io.data2viz.experiments.voronoi.voronoi()
fun jsPerfs() = io.data2viz.experiments.perfs.jsPerfs()
