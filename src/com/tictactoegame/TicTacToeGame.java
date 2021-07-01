package com.tictactoegame;

public class TicTacToeGame {
	
	// create play board
	public char[] playBoard(){
		char []board = new char[10];
		for(int i = 0; i < board.length; i++) {
			board[i] = ' ';
		}
		return board;
	}
	

	public static void main(String[] args) {
		System.out.println("welcome to tic tac toe game : ");
		TicTacToeGame tictactoe = new TicTacToeGame();
		char []board = tictactoe.playBoard();
		System.out.println(tictactoe.playBoard());
	
	}
}
