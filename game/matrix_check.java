package game;

public class matrix_check{
	public static boolean VericalWin(int[][] arr){  
        for(int j=0;j<3;j++){
            if(arr[0][j]==arr[1][j] && arr[0][j]==arr[2][j] && arr[0][j]!=0){
                arr[0][j]=arr[1][j]=arr[2][j]=3;//changing values of those indexes to 3 whic result in win
                return true;
            }
        }
        return false;
    } 
    public static boolean HorizontalWin(int[][] arr){ 
        for(int i=0;i<3;i++){
            if(arr[i][0]==arr[i][1] && arr[i][0]==arr[i][2] && arr[i][0]!=0){
                arr[i][0]=arr[i][1]=arr[i][2]=3;
                return true;
            }
        }
        return false;
    }
    public static boolean DiagonnalWin(int[][] arr)
    {
        if(arr[0][0]==arr[1][1])
        {
            if(arr[0][0]==arr[2][2])
            { 
                if (arr[0][0]!=0){
                    arr[0][0]=arr[1][1]=arr[2][2]=3;
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean OppDiagonalWin(int[][] arr)
    {
        if(arr[0][2]==arr[1][1])
        {
            if(arr[1][1]==arr[2][0])
            {
                if(arr[1][1]!=0){ 
                    arr[0][2]=arr[1][1]=arr[2][0]=3;
                    return true; 
                }
            }
       }
       return false;
    }

    public static void resetMatrix(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=0;
            }
        }
    }

}