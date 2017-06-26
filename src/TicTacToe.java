import java.util.Scanner;
public class TicTacToe {

	public static void main(String[] args) {

		while(1 > 0){
			makeBoard(); 
			makeMove();
		}
	}
	public static void makeBoard(){
		char[][] board = new char[3][3];

		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board.length; j++){
				board[j][i] = '*';
			}
			board[i][i] = '*';
		}
		for(int i = 0; i < board.length; i++){
			System.out.println(board[i]);
		}
	}
	public static int[] makeMove(int[] x, int[] y){
		Scanner val = new Scanner(System.in);

		int[] coordinates = new int[2];

		int xCoord = val.nextInt();
		int yCoord = val.nextInt();

		coordinates[0] = xCoord;
		coordinates[1] = yCoord;

		System.out.println("hi");
		while(xCoord > 3 || yCoord > 3){

			System.out.println("invalid input, try again");

			xCoord = val.nextInt();
			yCoord = val.nextInt();

			coordinates[0] = xCoord;
			coordinates[1] = yCoord;

		}
		System.out.println("Ok fine that one works");
		for(int i = 0; i < coordinates.length; i++){

			System.out.println(coordinates[i]);

		}
		return(coordinates);
	}
}