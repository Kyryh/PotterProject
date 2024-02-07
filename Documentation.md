# Documentation of The Doom Drone
In order to recover the cup in the undiscovered labyrinth, the drone will have to:

1. Initialize: The program begins with the drone positioned at the entrance of the maze and a blank map of the maze.

2. Explore & Mapping: The drone begins to explore the maze by moving systematically. As it explores, the drone collects information into a matrix about the walls of the maze and the location of the cup.

3. Cup Retrieval:The drone takes the cup.

4. Route Search: Once the cup has been taken, the program uses a route search algorithm to find the shortest route from the drone's current location to the location of the exit.

5. Route Execution: The drone follows the calculated route to return to the starting point, carrying the cup.

6. Leave the cup:The drone drops the cup at the starting point.

7. Conclusion: Once you return to the starting point, the program reports the completion of the mission.

This program requires management of exploration, mapping, route finding and drone control algorithms. Its effectiveness depends on the accuracy of the initial exploration and the efficiency of the path-finding algorithm.
