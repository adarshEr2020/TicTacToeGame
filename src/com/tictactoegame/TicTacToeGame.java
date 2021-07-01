package com.tictactoegame;

import java.util.Scanner;

public class TicTacToeGame {
	
	// create play board
	public char[] playBoard(){
		char []board = new char[10];
		for(int i = 0; i < board.length; i++) {
			board[i] = ' ';
		}
		return board;
	}
	
	// method for choose user letter for game
	public char chooseLetter() {
		char letter;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Choose the letter O or X :");
		letter = userInput.next().toUpperCase().charAt(0);
		return letter;
	}
	
	// main method 
	public static void main(String[] args) {
		System.out.println("welcome to tic tac toe game : ");
		TicTacToeGame tictactoe = new TicTacToeGame();
		char []board = tictactoe.playBoard();
		char userLetter = tictactoe.chooseLetter();
		char computerLetter;
		
		if(userLetter == 'X') {
			computerLetter = 'O';
		}else {
			computerLetter = 'X';
		}
	System.out.println("Computer letter is : " +computerLetter +" "+"And User letter is : " +userLetter);
	}

	
}
