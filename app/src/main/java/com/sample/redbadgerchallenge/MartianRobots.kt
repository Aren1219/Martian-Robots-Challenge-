package com.sample.redbadgerchallenge

class MartianRobots() {

    private val scents = mutableListOf<Pair<Int, Int>>()

    fun solveMartianRobotsProblem(maxX: Int, maxY: Int, vararg robots: Robot): List<String> {
        val results = mutableListOf<String>()
        for (robot in robots) {
            val result = robot.executeInstructions(maxX, maxY, scents)
            if (result.contains("LOST")) {
                scents.add(Pair(robot.currX, robot.currY))
            }
            results.add(result)
        }
        scents.clear()
        return results
    }

}

