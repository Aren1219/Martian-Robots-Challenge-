package com.sample.redbadgerchallenge

import org.junit.Before
import org.junit.Test

class MartianRobotsTest {

    lateinit var martianRobots: MartianRobots

    @Before
    fun setUp() {
        martianRobots = MartianRobots()
    }

    @Test
    fun test1() {
        val result = martianRobots.executeInstructions(
            5, 3,
            Robot(1, 1, "E", "RFRFRFRF"),
            Robot(3, 2, "N", "FRRFLLFFRRFLL"),
            Robot(0, 3, "W", "LLFFFLFLFL")
        )
        assert(result == listOf("1 1 E", "3 3 N LOST", "2 3 S"))
    }
}