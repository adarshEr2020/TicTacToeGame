package com.tictactoegame;

import java.util.Scanner;

public class TicTacToeGame {
	
	// create play board
	public char[] playBoard() {
		char[] board = new char[10];
		for (int i = 0; i < board.length; i++) {
			board[i] = ' ';
		}
		return board;
	}

	// method for choose user letter for game
	public char[] chooseLetter() {
		char[] letter = { 'a', 'b' };
		Scanner userInput = new Scanner(System.in);
		System.out.println("Choose the letter O or X :");
		letter[0] = userInput.next().toUpperCase().charAt(0);
		if (letter[0] == 'X') {
			letter[1] = 'O';
		} else {
			letter[1] = 'X';
		}
		System.out.println("User letter: " + letter[0] + " ,Computer letter: " + letter[1]);
		return letter;
	}

	public void displayBoard(char[] boards) {
		System.out.println("Display tic tac toe board :");
		System.out.println("|" + boards[1] + " | " + boards[2] + " | " + boards[3] + " |");
		System.out.println("-----------");
		System.out.println("|" + boards[4] + " | " + boards[5] + " | " + boards[6] + " |");
		System.out.println("-----------");
		System.out.println("|" + boards[7] + " | " + boards[8] + " | " + boards[9] + " |");
	}

	// main method
	public static void main(String[] args) {
		System.out.println("welcome to tic tac toe game : ");
		TicTacToeGame tictactoe = new TicTacToeGame();
		char[] board = tictactoe.playBoard();
		char[] letter = tictactoe.chooseLetter();
		tictactoe.displayBoard(board);
	}

}
