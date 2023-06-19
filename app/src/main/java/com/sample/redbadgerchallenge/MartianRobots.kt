package com.sample.redbadgerchallenge

class MartianRobots() {

    private val scent = mutableListOf<Pair<Int, Int>>()

    fun executeInstructions(maxX: Int, maxY: Int, vararg robots: Robot): List<String> {
        val result = mutableListOf<String>()
        for (robot in robots) {
            var lost = ""
            for (instruction in robot.instructions) {
                when (instruction) {
                    'L' -> {
                        robot.turnLeft()
                    }

                    'R' -> {
                        robot.turnRight()
                    }

                    'F' -> {
                        if (!robot.goForward(maxX, maxY, scent)) {
                            lost = "LOST"
                            scent.add(Pair(robot.currX, robot.currY))
                            break
                        }
                    }
                }
            }
            result.add("${robot.currX} ${robot.currY} ${robot.currDir} $lost".trim())
        }
        scent.clear()
        return result
    }

}

