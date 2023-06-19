package com.sample.redbadgerchallenge

import org.junit.Before
import org.junit.Test

class MartianRobotsTest {

    private lateinit var martianRobots: MartianRobots

    @Before
    fun setUp() {
        martianRobots = MartianRobots()
    }

    @Test
    fun sampleInputFromTheChallenge() {
        val result = martianRobots.solveMartianRobotsProblem(
            5, 3,
            Robot(1, 1, "E", "RFRFRFRF"),
            Robot(3, 2, "N", "FRRFLLFFRRFLL"),
            Robot(0, 3, "W", "LLFFFLFLFL")
        )
        assert(result == listOf("1 1 E", "3 3 N LOST", "2 3 S"))
    }

    @Test
    fun oneLostRobot() {
        val result = martianRobots.solveMartianRobotsProblem(
            5, 3,
            Robot(3, 2, "N", "FRRFLLFFRRFLL"),
        )
        assert(result == listOf("3 3 N LOST"))
    }

    @Test
    fun noInstructions() {
        val result = martianRobots.solveMartianRobotsProblem(
            5, 3,
            Robot(3, 2, "N", ""),
        )
        assert(result == listOf("3 2 N"))
    }

    @Test
    fun illegalStartingPosition() {
        val result = martianRobots.solveMartianRobotsProblem(
            5, 3,
            Robot(-2, 2, "N", "FRRFLLFFRRFLL"),
        )
        assert(result == listOf("-2 2 N LOST"))
    }
}