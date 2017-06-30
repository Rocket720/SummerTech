import java.util.Scanner;
public class ConnectFour {
	public static void main(String[] args) {
		char[][] board = new char[7][8];
		int xCoordPass = 0;
		int pseudoCoord = 5;
		String[] who = new String[3]; 
		who = win(who, board);

		initialBoard(board, xCoordPass);

		boolean switcher = false;
		while(who[2] != "true"){
			if(switcher == false){
				switcher = true;
			}
			else if(switcher == true){
				switcher = false;
			}
			pickMove(board, switcher, xCoordPass, pseudoCoord);
			who = win(who, board);
		}
		System.out.println("done fam squad");
	}

	public static void initialBoard(char[][] board, int xCoord){	
		for(int i = 0; i < 7; i++){
			if(i <= 6){
				for(int j = 0; j < 7; j++){
					board[i][j] = '*';
				}
			}
			else if(i == 7){
				for(int j = 0; j < 7; j++){
					board[i][j] = '_';
				}
			}
		}
		System.out.println("Welcome to Connect Four!");
		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 7; j++){
				System.out.print(board[i][j]);
				System.out.print(" ");
			}
			System.out.println();	
		}

	}
	public static int pickMove(char[][] board, boolean transfer, int xCoordPass, int pseudoCoord){							

		Scanner val = new Scanner(System.in);
		int xCoord = val.nextInt() - 1;						

		while(board[pseudoCoord][xCoord] != '*'){
			pseudoCoord--;
		}

		while(xCoord > 6 || board[pseudoCoord][xCoord] == '@' || board[pseudoCoord][xCoord] == 'o'){

			System.out.println("Invalid numbers chosen. Please pick other numbers between 1 and 7.");

			xCoord = val.nextInt() - 1;											
		}

		xCoordPass = xCoord;

		System.out.println("Valid numbers chosen");			
		makeBoard(xCoord, transfer, board, pseudoCoord);
		return(xCoordPass);
	}


	public static void makeBoard(int input, boolean pickState, char[][] board, int pseudoCoord){							//function for writing board in an ongoing game

		if(pickState == true){
			board[pseudoCoord][input] = '@';
			pickState = false;
			System.out.println("It's o's turn");			
		}
		else if(pickState != true){
			board[pseudoCoord][input] = 'o';
			pickState = true;
			System.out.println("It's @'s turn");			
		}
		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 7; j++){
				System.out.print(board[i][j]);
				System.out.print(" ");
			}
			System.out.println();	
		}
	}
	public static String[] win(String[] who, char[][] board){								//function for determining wins, losses, and ties
		//Note: who[0] = Loser, who[1] = Winner, who[2] = win state
		who[2] = "false";
		int tie = 42;

		for(int i = 0; i < 7; i++){
			for(int j = 0; j < 8; j++){
				if(board[i][j] == 'o' && board[i][j+1] == 'o' && board[i][j+2] == 'o' && board[i][j+3] == 'o'){
					who[2] = "true";
				}
				else if(board[i][j] == 'o' && board[i+1][j] == 'o' && board[i+2][j] == 'o' && board[i+3][j] == 'o'){
					who[2] = "true";
				}
			}
		}
		return(who);
	}
}

