import java.util.Scanner;
public class TicTacToe {
	private static boolean winCheck = false;				//lines 3-8 set up variables for global usage
	private static int finalX;
	private static int finalY;
	public static boolean pickState = true;
	public static char[][] board = new char[3][3];
	public static String whoWon;
	public static String whoLost;

	public static void main(String[] args) {
		makeIBoard();										//makes he 3x3 grid

		while(winCheck != true){

			pickMove();										// lines 14-21 runs through functions until win

			makeBoard();

			win();
		}
		System.out.println(whoWon + " wins!");				//writes winner
		System.out.println(whoLost + " loses!");				//writes loser
	}

	public static void makeIBoard(){						//function for initial Board

		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board.length; j++){
				board[j][i] = '*';
			}
		}
		for(int i = 0; i < board.length; i++){
			System.out.println(board[i]);
		}
	}

	public static void pickMove(){							//function for user coordinate input

		boolean makeMove = false;
		Scanner val = new Scanner(System.in);
		int xCoord = val.nextInt() - 1;						//42-46 take initial input
		int yCoord = val.nextInt() - 1;

		finalX = xCoord;
		finalY = yCoord;

		while(xCoord > 3 || yCoord > 3 || board[xCoord][yCoord] == 'X' || board[xCoord][yCoord] == 'O'){

			System.out.println("Invalid numbers chosen. Please pick other numbers between 1 and 3.");

			xCoord = val.nextInt() - 1;						//Lines 48-54 set parameters for
			yCoord = val.nextInt() - 1;						//values must be less than 3, and not overwriting
		}

		finalX = xCoord;
		finalY = yCoord;

		System.out.println("Valid numbers chosen");			//indicates a valid input

	}

	public static void makeBoard(){							//function for writing board in an ongoing game

		if(pickState == true){
			board[finalX][finalY] = 'X';
			pickState = false;
			System.out.println("It's O's turn");			//tells who's turn it it
		}
		else if(pickState != true){
			board[finalX][finalY] = 'O';
			pickState = true;
			System.out.println("It's X's turn");			//tells who's turn it it
		}
		for(int i = 0; i < board.length; i++){
			System.out.println(board[i]);
		}
	}

	public static void win(){								//function for determining wins, losses, and ties

		int tie = 9;

		for(int i = 0; i < 3; i++){
			//win statements HVD for X
			if(board[i][0] == 'X' && board[i][1] == 'X' && board[i][2] == 'X'){
				winCheck = true;							//Vertical
				whoWon = "X";
				whoLost = "O";
			}
			else if(board[0][i] == 'X' && board[1][i] == 'X' && board[2][i] == 'X'){
				winCheck = true;							//Horizontal
				whoWon = "X";
				whoLost = "O";
			}
			else if(board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X'){
				winCheck = true;							//Diagonal Down L -> R
				whoWon = "X";
				whoLost = "O";
			}
			else if(board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == 'X'){
				winCheck = true;							//Diagonal Up L -> R
				whoWon = "X";
				whoLost = "O";
			}

			//win statement HVD for O
			if(board[i][0] == 'O' && board[i][1] == 'O' && board[i][2] == 'O'){
				winCheck = true;							//Vertical
				whoWon = "O";
				whoLost = "X";
			}
			else if(board[0][i] == 'O' && board[1][i] == 'O' && board[2][i] == 'O'){
				winCheck = true;							//Horizontal
				whoWon = "O";
				whoLost = "X";
			}
			else if(board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O'){
				winCheck = true;							//Diagonal Down L -> R
				whoWon = "O";
				whoLost = "X";
			}
			else if(board[2][0] == 'O' && board[1][1] == 'O' && board[0][2] == 'O'){
				winCheck = true;							//Diagonal Up L -> R
				whoWon = "O";
				whoLost = "X";
			}

			//draw
			for(int j = 0; j < 3; j++){						//checks for the filling of all spots
				if(board[i][j] != '*'){
					tie--;
				}
			}
		}
		if(tie == 0 && winCheck == false){					//concludes tie if all spots are filled with no winner
			whoWon = "Nobody";
			whoLost = "Everybody";
			winCheck = true;
		}
	}
}