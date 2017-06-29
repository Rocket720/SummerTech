import java.util.Scanner;
public class ConnectFour {
	public static void main(String[] args) {
		char[][] board = new char[6][7];
		initialBoard(board);
	}
	public static void initialBoard(char[][] board){	
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
	
}
