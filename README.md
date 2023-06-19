# Martian-Robots-Challenge

This project provides a solution to the Martian Robots Challenge. It simulates the movement of robots on a rectangular grid and determines their final positions and orientations.

## How to Run
To run the code, follow these steps:

Open the Main.kt file.

In the main function, you will find the setup for the Martian Robots simulation. Modify the following variables to define the rectangular world:

maxX: The maximum x-coordinate of the rectangular grid.
maxY: The maximum y-coordinate of the rectangular grid.
Set up the robots with their starting positions, directions, and instructions. You can define multiple robots by creating instances of the Robot class. Each Robot instance requires the following parameters:

currX: The x-coordinate of the robot's starting position.
currY: The y-coordinate of the robot's starting position.
currDir: The initial direction of the robot. Must be one of "N", "E", "W", or "S".
instructions: A string containing the instructions for the robot to perform. Use "R" for turning right, "L" for turning left, and "F" for moving forward. For example, "FRRFLLFFRRFLL".
Add as many robots as needed by creating additional Robot instances.

Once the setup is complete, the solveMartianRobotsProblem() method of the MartianRobots class is called to solve the Martian Robots problem. It takes the following parameters:

maxX: The maximum x-coordinate of the rectangular grid.
maxY: The maximum y-coordinate of the rectangular grid.
robot1, robot2, robot3, ...: The defined Robot instances.
The robots will be processed sequentially, with each robot executing its instructions before the next robot begins execution.

The result will be a list of strings, each containing the final position and orientation of a robot. If a robot falls off the edge of the grid, the word "LOST" will be printed after the position and orientation.

Run the code to see the result. The final positions and orientations of the robots will be printed to the console.

## Unit Tests
The ExampleUnitTest.kt file contains unit tests for the code. 
