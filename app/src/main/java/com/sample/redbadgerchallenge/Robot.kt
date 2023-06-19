package com.sample.redbadgerchallenge

class Robot(
    var currX: Int,
    var currY: Int,
    var currDir: String,
    val instructions: String,
) {
    fun turnRight() {
        when (currDir) {
            "N" -> currDir = "E"
            "E" -> currDir = "S"
            "S" -> currDir = "W"
            "W" -> currDir = "N"
        }
    }

    fun turnLeft() {
        when (currDir) {
            "N" -> currDir = "W"
            "E" -> currDir = "N"
            "S" -> currDir = "E"
            "W" -> currDir = "S"
        }
    }

    //return false if lost
    fun goForward(maxX: Int, maxY: Int, scent: List<Pair<Int, Int>>): Boolean {
        when (currDir) {
            "N" -> {
                return if (isOutOfBounds(currX, currY + 1, maxX, maxY)) {
                    scent.contains(Pair(currX, currY))
                } else {
                    currY++
                    true
                }
            }

            "E" -> {
                return if (isOutOfBounds(currX + 1, currY, maxX, maxY)) {
                    scent.contains(Pair(currX, currY))
                } else {
                    currX++
                    true
                }
            }

            "S" -> {
                return if (isOutOfBounds(currX, currY - 1, maxX, maxY)) {
                    scent.contains(Pair(currX, currY))
                } else {
                    currY--
                    true
                }
            }

            "W" -> {
                return if (isOutOfBounds(currX - 1, currY, maxX, maxY)) {
                    scent.contains(Pair(currX, currY))
                } else {
                    currX--
                    true
                }
            }

            else -> {
                return false
            }
        }
    }

    private fun isOutOfBounds(x: Int, y: Int, maxX: Int, maxY: Int): Boolean {
        return x < 0 || x > maxX || y < 0 || y > maxY
    }
}