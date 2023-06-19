package com.sample.redbadgerchallenge

fun main(args: Array<String>) {
    val martianRobots = MartianRobots()
    val result = martianRobots.solveMartianRobotsProblem(
        5, 3,
        Robot(1, 1, "E", "RFRFRFRF"),
        Robot(3, 2, "N", "FRRFLLFFRRFLL"),
        Robot(0, 3, "W", "LLFFFLFLFL")
    )
    println(result)
}