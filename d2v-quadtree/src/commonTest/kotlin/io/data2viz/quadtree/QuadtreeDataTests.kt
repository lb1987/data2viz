/*
 * Copyright (c) 2018-2019. data2viz sàrl.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package io.data2viz.quadtree

import io.data2viz.test.JsName
import io.data2viz.test.TestBase
import kotlin.test.Test

class QuadtreeDataTests : TestBase() {

    @Test
    @JsName("quadtree_data_1")
    fun `quadtree data() returns an array of data in the quadtree`() {
        val quadtree = buildQuadtree()
        quadtree.data() shouldBe listOf()

        quadtree.add(arrayOf(0, 0))
        quadtree.add(arrayOf(1, 2))
        quadtree.data()[0] shouldBe arrayOf(0, 0)
        quadtree.data()[1] shouldBe arrayOf(1, 2)
    }

    @Test
    @JsName("quadtree_data_2")
    fun `quadtree data() correctly handles coincident nodes`() {
        val quadtree = buildQuadtree()
        quadtree.addAll(listOf(arrayOf(0, 0), arrayOf(0, 0)))
        quadtree.data()[0] shouldBe arrayOf(0, 0)
        quadtree.data()[1] shouldBe arrayOf(0, 0)
    }
}