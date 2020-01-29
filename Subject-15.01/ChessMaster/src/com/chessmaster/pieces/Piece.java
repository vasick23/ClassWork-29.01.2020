package com.chessmaster.pieces;

import com.chessmaster.config.PieceColor;

public abstract class Piece implements Blastable{
	public String color;
	public int power;
	public int id;
	public int row;
	public int col;
	public String signature;
	public Piece(String color, String signature, int row,int col) {
		this.color = color;
		this.row = row;
		this.col = col;
		this.signature = signature;
	}
	public String getSignature() {
		return (this.color == PieceColor.WHITE)?("w:" + this.signature):("b:" + this.signature);
	}
	public abstract boolean isMoveActionValid(int row,int col);
	public void move(int moveRow, int moveCol) {
		if(isMoveActionValid(row, col)) {
			this.row = moveRow;
			this.col = moveCol;
		}
	}
	public abstract void attack(int attackRow, int attackCol);
}
