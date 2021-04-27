package application;

import chess.ChessMatch;

public class Program {
	
	public static void main(String[] args) {
		//Author: Joao Vitor Souza Pioner | Date: 26/04/2021 10:38
		//Last edition: 27/04/21 9:55
		
		ChessMatch cm = new ChessMatch();
		
		UI.printBoard(cm.getPieces());
	}
}
