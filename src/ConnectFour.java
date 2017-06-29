import java.util.Scanner;
public class ConnectFour {
	public static void main(String[] args) {
		char[][] board = new char[6][7];
		int xCoordPass = 0;
		initialBoard(board, xCoordPass);

		boolean switcher = false;
		while(1 > 0){
			if(switcher == false){
				switcher = true;
			}
			else if(switcher == true){
				switcher = false;
			}
			pickMove(board, switcher, xCoordPass);
		}
		//while(1 > 0){
			
		//}
	}

	public static void initialBoard(char[][] board, int xCoord){	
		for(int i = 0; i < 7; i++){
			for(int j = 0; j < 6; j++){
				board[j][i] = '*';
			}
		}
		System.out.println("Welcome to Connect Four!");
		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 7; j++){
				System.out.print(board[i][j]);
			}
			System.out.println();	
		}

	}

	public static int pickMove(char[][] board, boolean transfer, int xCoordPass){							


		Scanner val = new Scanner(System.in);
		int xCoord = val.nextInt() - 1;						

		while(xCoord > 7 || board[xCoord][/*tbd*/] == 'X' || board[xCoord][/*tbd*/] == 'O'){

			System.out.println("Invalid numbers chosen. Please pick other numbers between 1 and 3.");

			xCoord = val.nextInt() - 1;											
		}

		xCoordPass = xCoord;

		System.out.println("Valid numbers chosen");			
		makeBoard(xCoord, transfer, board);
		return(xCoordPass);
	}

	public static void makeBoard(int input, boolean pickState, char[][] board){							//function for writing board in an ongoing game

		if(pickState == true){
			board[input][/*tbd*/] = '@';
			pickState = false;
			System.out.println("It's o's turn");			
		}
		else if(pickState != true){
			board[input][/*tbd*/] = 'o';
			pickState = true;
			System.out.println("It's @'s turn");			
		}
		for(int i = 0; i < board.length; i++){
			System.out.println(board[i]);
		}
	}

}
