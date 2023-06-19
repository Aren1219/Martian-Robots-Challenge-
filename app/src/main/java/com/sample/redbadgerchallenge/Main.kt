package com.sample.redbadgerchallenge

fun main(args: Array<String>) {
    val martianRobots = MartianRobots()

    /*
    upper-right coordinates of the rectangular world, the lower-left coordinates are assumed to be 0, 0.
     */
    val maxX = 5
    val maxY = 3

    /*
    Set up the robots with their starting positions, directions and instructions
    currX, currY -> integers greater than 0 and smaller or equal to the upper-right coordinates
    currDir -> must be one of "N", "E", "W", "S"
    instructions -> a string containing all the instructions for the robot to perform:
    "R" for turning right, "L" for turning left, "F" for moving forward, e.g. "FRRFLLFFRRFLL"
    Each robot is processed sequentially, i.e., finishes executing the robot instructions before the next robot begins execution.
     */
    val robot1 = Robot(1, 1, "E", "RFRFRFRF")
    val robot2 = Robot(3, 2, "N", "FRRFLLFFRRFLL")
    val robot3 = Robot(0, 3, "W", "LLFFFLFLFL")

    /*
    result will be a list of strings. each string will contain the final position and orientation of the robot
    If a robot falls off the edge of the grid the word “LOST” will be printed after the position and orientation.
    */
    val result = martianRobots.solveMartianRobotsProblem(
        maxX, maxY,
        robot1,
        robot2,
        robot3
    )

    println(result)
}