package tictactoe;

import java.util.Scanner;

public class TicTacToe {
	

	public static void main(String[] args) {
		char[][] board=new char[3][3];
//		
//		int rowLength=board.length;
//		int colLength=board[0].length;
//		
		
		char player='X';
		boolean gameOver=false;
		
		
		Scanner sc=new Scanner(System.in);
		
		//place spaces at each place
		
		for (int rows = 0; rows <board.length ; rows++) {
			for (int cols = 0; cols < board[0].length; cols++) {
				board[rows][cols]=' ';
				
			}
			
		}
		
		while(!gameOver) {
			printBoard(board);
			System.out.println("Player "+player +" enter place:");
			int rows=sc.nextInt();
			int cols=sc.nextInt();
			
			if(board[rows][cols]==' ') {
				board[rows][cols]=player;
				
				gameOver=haveWon(board,player);
				
				if(gameOver) {
					System.out.println(player+" has won the game..");
					printBoard(board);

				}
				else {
					player=(player=='X')? 'O':'X';
				}
				
//				 if(!drawGame(board)) {
//					System.out.println("match drawn....");
//						
//				}
				
			}
			else {
				System.out.println("invalid place you entered...");
			}
			
		}
		
		
		
		sc.close();
	}

	 static boolean haveWon(char[][] board, char player) {
		 //for rows
		 

			for (int rows = 0; rows <board.length ; rows++) {
				if(board[rows][0]==player && board[rows][1]==player && board[rows][2]==player) {
					return true;
				}	
			}
			
			//for columns
			
			for (int cols = 0; cols <board[0].length ; cols++) {
				if(board[0][cols]==player && board[1][cols]==player && board[2][cols]==player) {
					return true;
				}	
			}
			
			//for diagonals
			if(board[0][0]==player && board[1][1] ==player && board[2][2]== player) {
				return true;
			}
			if(board[0][2]==player && board[1][1] ==player && board[2][0]== player) {
				return true;
			}
			
			
		 
		
		
		return false;
	}

	 static void printBoard(char[][] board) {
		
		    System.out.println("----------- ");
		for (int rows = 0; rows <board.length ; rows++) {
			for (int cols = 0; cols < board[0].length; cols++) {
				System.out.print( "| "+board[rows][cols] );
				
				
			}
			System.out.println(" |  ");
			System.out.println("-----------");
			
			
		}
		
		
	}
	 
//	 static boolean drawGame(char[][] board,boolean[][] draw) {
//		
//		 
//		 for (int i = 0; i < board.length; i++) {
//			 for (int col = 0; col< board[0].length;col++) {
//				 if(board[i][col]=='X' || board[i][col]=='O') {
//					 draw[i][col]=true;
//					 
//				 }
//				 else {
//					 draw[i][col]=false;
//				 }
//				
//				
//			}
//			
//		}
//		 
//	 }

}
