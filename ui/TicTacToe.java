package ui;
import game.*;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.text.*;
import javafx.scene.layout.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class TicTacToe extends Application {

    private boolean playEnabled = false;
    private boolean isFirstClick = true;
    private Button[][] buttons = new Button[3][3];
    int[][] matrix = {{0,0,0},{0,0,0},{0,0,0}};

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane layout = new BorderPane(); 

        Label lbl = new Label("Press play button to start the game");   
        lbl.setFont(Font.font("Arial", 50));
        BorderPane.setAlignment(lbl,Pos.CENTER);
        BorderPane.setMargin(lbl, new Insets(10, 10, 30, 10)); 
        layout.setBottom(lbl);              

        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setAlignment(Pos.CENTER);
        layout.setCenter(grid); 

        int[] count = {1};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Button button = new Button();
                buttons[i][j] = button;
                button.setFont(Font.font("Segoe UI", 100));
                button.setMinSize(220, 220);
                button.setStyle("-fx-background-color: black; -fx-text-fill: white; -fx-opacity: 1;");
                int finalI = i;
                int finalJ = j;
                button.setOnAction(e -> {
                    if (playEnabled) {
                        if (count[0] % 2 == 1){
                            button.setText("X");
                            lbl.setText("Player 2's turn");
                            matrix[finalI][finalJ]=1;
                            if(checkWinner.ifWinner(matrix,buttons)){
                                lbl.setText("Player 1 wins!!!");
                                playEnabled = false;
                                matrix_check.resetMatrix(matrix);
                                count[0]=1;
                            }
                        }
                        if (count[0] % 2 == 0){
                            button.setText("O");
                            lbl.setText("Player 1's turn");
                            matrix[finalI][finalJ]=2;
                            if(checkWinner.ifWinner(matrix,buttons)){
                                lbl.setText("Player 2 wins!!!");
                                playEnabled = false;
                                matrix_check.resetMatrix(matrix);
                                count[0]=1;
                            }
                        }
                        button.setDisable(true);
                        count[0]++;
                        if(count[0]==10){
                            lbl.setText("Game drawn!!!");
                            for (int a = 0; a < 3; a++) {
                                for (int b = 0; b < 3; b++){ 
                                    buttons[a][b].setStyle
                                    ("-fx-background-color: black; -fx-text-fill: white; -fx-opacity: 0.8;");
                                }   
                            }
                        }
                    }

                });
                grid.add(button, j, i);
            }
        }

        Button btnPlay = new Button("PLAY");
        btnPlay.setFont(Font.font("Segoe UI", 30));
        btnPlay.setMinSize(70, 70);
        btnPlay.setStyle("-fx-background-color: grey; -fx-text-fill: black; -fx-opacity:1");
        
        btnPlay.setOnAction(e -> {
            if (isFirstClick) {
                btnPlay.setText("RESTART");
                lbl.setText("Player 1's turn");
                playEnabled = true;
                isFirstClick = false;
            } 
            else {
                for (int a = 0; a < 3; a++) {
                    for (int b = 0; b < 3; b++){ 
                        buttons[a][b].setStyle
                        ("-fx-background-color: black; -fx-text-fill: white; -fx-opacity: 1;");
                    }   
                }
                for (Button[] row : buttons) {
                    for (Button button : row) {
                        button.setText("");
                        button.setDisable(false);
                    }
                }
                count[0] = 1;
                matrix_check.resetMatrix(matrix);
                lbl.setText("Player 1's turn");
                playEnabled = true;
                btnPlay.setText("Restart");
            }
        });
        BorderPane.setAlignment(btnPlay,Pos.CENTER);
        BorderPane.setMargin(btnPlay, new Insets(30, 10, 10, 10)); 
        layout.setTop(btnPlay);

        Scene scene = new Scene(layout, 1200, 1000);

        primaryStage.setTitle("Tic-Tac-Toe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
