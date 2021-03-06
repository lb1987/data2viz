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

package io.data2viz.time

class Day : Interval(
        fun (date:Date): Date {
            date.setHour(0)
            date.setMinute(0)
            date.setSecond(0)
            date.setMillisecond(0)
            return date
        },
        fun (date:Date, step:Long): Date {
            date.plusDays(step)
            return date
        },
        fun (start:Date, end:Date): Int {
            return start.daysBetween(end).toInt()
        },
        fun (date:Date): Int {
            return date.dayOfMonth() - 1
        }
)

val timeDay = Day()