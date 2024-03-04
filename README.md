#Tic Tac Toe Game using JavaFX

The JavaFX Tic-Tac-Toe game is a graphical user interface (GUI) implementation of 
the classic two-player game.It is a Java-based endeavor aimed at recreating the timeless 
classic in a dynamic and visually engaging manner. This undertaking showcases a 
blend of sophisticated object-oriented programming techniques and the powerful 
JavaFX library ,a robust UI library for creating interactive Java applications. The 
primary objective of this project is to provide a seamless and immersive gaming 
experience, all while adhering to sound programming principles.

Divided into two distinct packages, game and ui, the project demonstrates a well￾organized structure. The game package encapsulates the crucial backend logic, 
incorporating custom exceptions and intricate algorithms for determining game 
outcomes. Meanwhile, the ui package meticulously crafts the graphical interface, 
employing JavaFX elements to present an interactive and visually appealing game 
board.

##Game Logic
The core of the Tic Tac Toe game lies in its logical operations, determining winning conditions, managing player moves, and handling game state transitions. In this implementation, the game logic is encapsulated within the game package.

The game logic begins with the initialization of the game board, represented as a 3x3 grid. Each cell of the grid is initially empty, allowing players to make their moves by placing their marks (either "X" or "O") on the grid.

Win Conditions
The win conditions are essential for determining the outcome of the game. In this implementation, four types of win conditions are checked:vertical,horizontal,diagonal and opposite diagonal wins.

Handling Moves and Invalid Moves
The game logic also includes mechanisms for handling player moves and invalid moves. Each player's move is validated to ensure it is within the bounds of the grid and that the selected cell is not already occupied. If a player attempts to make an invalid move, an exception is thrown, and the player is prompted to make a valid move.

##Graphical User Interface (GUI)
The graphical user interface (GUI) is a crucial aspect of the Tic Tac Toe game, providing users with a visually appealing and intuitive platform for playing the game. In this implementation, the GUI is designed using the JavaFX library.

Layout and Components
The GUI layout is organized using a BorderPane, which allows for the placement of UI elements in different regions of the window. The main components of the GUI include:

Grid of Buttons: Representing the game board, a 3x3 grid of buttons is created using the GridPane layout. Each button corresponds to a cell on the game board, allowing players to make their moves by clicking on the buttons.

Labels: Labels are used to display game status, including messages indicating the current player's turn, the winner of the game, or a draw.

Play Button: A separate button is provided to start or restart the game. Clicking this button initializes or resets the game state, allowing players to begin a new game or replay the current one.

Styling and Interaction
The GUI elements are styled using CSS to enhance the visual appeal of the game. Buttons are styled to resemble traditional Tic Tac Toe grids, with appropriate spacing and alignment to ensure a clean and organized layout. Additionally, event handlers are implemented to manage user clicks on the game board buttons, updating the game state and responding to player actions accordingly.

User Interaction and Game Flow
The user interaction and game flow play a crucial role in ensuring an enjoyable gaming experience for players. In this implementation, the game flow is structured to guide players through the gameplay process smoothly.

Game Start and Restart
Players initiate the game by clicking on the "PLAY" button, which initializes the game board and enables player moves. Subsequent clicks on the "PLAY" button restart the game, allowing players to start a new game at any time.

Player Moves
Players take turns clicking on the grid buttons to place their marks on the game board. The current player's turn is indicated, and the game logic ensures that each player can only make one move per turn. After each move, the game checks for win conditions and updates the game status accordingly.

Determining a Winner
If a player wins the game or the game ends in a draw, a message is displayed indicating the outcome. Winning cells are highlighted on the game board, providing visual feedback to players.

Game Restart
Players have the option to restart the game at any time by clicking the "PLAY" button. This resets the game board and allows players to start a new game from the beginning.

Conclusion
In conclusion, the JavaFX Tic Tac Toe game provides users with an immersive and enjoyable gaming experience, combining robust game logic with a visually appealing graphical interface. The detailed implementation of game logic, graphical user interface, and user interaction/game flow ensures a smooth and engaging gameplay experience for players. This project serves as a valuable example of leveraging object-oriented programming techniques and JavaFX library capabilities to create interactive games.
