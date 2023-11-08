package game;

import javafx.scene.control.Button;
import javafx.scene.text.Font;

public class checkWinner{
	public static boolean ifWinner(int[][] arr,Button[][] buttons){
        if(matrix_check.HorizontalWin(arr) || matrix_check.VericalWin(arr) || 
        	matrix_check.DiagonnalWin(arr) || matrix_check.OppDiagonalWin(arr))
        {
            for(int a=0;a<3;a++){
                for(int b=0;b<3;b++){
                    if(arr[a][b]==3){
                        buttons[a][b].setStyle
                        ("-fx-background-color: green; -fx-text-fill: black; -fx-opacity: 1;");
                    }
                }
            }
            return true;
        }
        return false;
    }
}