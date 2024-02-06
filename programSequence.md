# Program initialization
- Create graphical components that allow us to visualize and explore the maze
    - If we are in debug mode, show buttons for movement, load, and unload

# Start button
- Accept an optional seed from the textfield
- Make the REST call to initialize the maze and display it using the obtained data (length, height, starting point)
- Enable the maze exploration algorithm if we are not in debug mode

# Movement buttons
- Make the REST call for movement in the selected direction
- Automatically make the REST call to see nearby cells after movement since it does not use energy

# Load button
- Make the REST call for load

# Unload button
- Make the REST call for unload
- Display a message informing the user of victory

# Maze exploration algorithm
- Create a matrix to save the explored maze cells
- Loop through the following actions until the cup is found
  - Look around and save data of the cells in the matrix
  - Move towards unexplored cells preferring cells in counterclockwise order starting from the right
    - If a dead-end is encountered, backtrack through explored cells until an unexplored cell is found
- We are on the cup, with the data saved in the matrix, calculate the shortest path
