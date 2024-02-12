# Harry Potter and the doom drone




## Create the GUI

### As the user I want to see the maze even with unexplored tiles
- Rest call to know the size of the maze
- Create the maze in the GUI

### As the developer I want to see the debug buttons
- Create the methods that manually move the drone
- Create the buttons in the GUI (only for debug)

### As the user I want to see the information on the drone
- Create the icon for displaying the remaining battery
- Create the text field for inserting the seed
- Create the start/reset button



## Resolving the maze

### As the developer we must resolve the maze in the fewest possible moves
- Create a method for the exploration of the maze
- Save the information of every tile in the matrix

### As the developer there must be classes for the return of the rest call that translate them from JSON to data
- Create the class for the return of the look REST call
- Create the class for the return of the move REST call
- Create the class for the return of the init REST call
- Create the class for the return of the load and unload REST calls

### As the developer there must be a class that facilitates the creation and loading of JSON data
- Create the class for the translation of the data to JSON

### As the developer there must be a class that does REST calls
- Create the class for the REST calls



## Returning to the start point

### As the developer there must be a class to use an algorithm to find the shortest way to return to start
- Create te class that contains the maze return algorithm

### As the user I have to see the drone return to start in the fewest possible moves
- Create the class for the movement to return to the start point
