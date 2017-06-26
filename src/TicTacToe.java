import java.util.Scanner;
public class TicTacToe {
	private static boolean moveCheck = false;
	private static int finalX;
	private static int finalY;
	private static int[] coordinates = new int[2];

	public static void main(String[] args) {
		while(moveCheck != true){
			makeIBoard();

			pickMove();
		}
		moveCheck = false;
		while(moveCheck != true){
			makeMove();

			makeBoard();
		}
	}
	public static void makeIBoard(){
		char[][] board = new char[3][3];

		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board.length; j++){
				board[j][i] = '*';
			}
		}
		for(int i = 0; i < board.length; i++){
			System.out.println(board[i]);
		}
	}
	public static void pickMove(){
		boolean makeMove = false;
		Scanner val = new Scanner(System.in);

		int xCoord = val.nextInt();
		int yCoord = val.nextInt();

		coordinates[0] = xCoord;
		coordinates[1] = yCoord;

		finalX = xCoord;
		finalY = yCoord;

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
		moveCheck = true;
	}
	public static void makeMove(){
		finalX = coordinates[0];
		finalY = coordinates[1];
		
	}
	public static void makeBoard(){
		char[][] board = new char[3][3];

		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board.length; j++){
				board[j][i] = '*';
			}
		}
		for(int i = 0; i < board.length; i++){
			System.out.println(board[i]);
		}
		board[coordinates[0]][coordinates[1]] = 'o';
		moveCheck = true;
	}
}