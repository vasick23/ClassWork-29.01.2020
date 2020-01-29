package com.chessmaster.pieces;

public class King extends Piece{
	public King(String color, int row, int col){
		super(color,"K",row,col);
		this.power = 6;
		this.id = 5;
	}
	public boolean isMoveActionValid(int moveRow, int moveCol) {
		int moveRowCoeficient = this.row - moveRow;
		int moveColCoeficient = this.col - moveCol;		
		boolean isRowMoveValid = false;
		boolean isColMoveValid = false;
		if((moveRowCoeficient <= 1) && (moveColCoeficient == 0)) {
			isColMoveValid = true;
			isRowMoveValid = true;
		}else {
			if((moveRowCoeficient == 0)&& (moveColCoeficient <= 1)) {
				isColMoveValid = true;
				isRowMoveValid = true;
			}
		}
		return isRowMoveValid && isColMoveValid;
	}
	public boolean isMoveAction(int moveRow, int moveCol) {
		int StartPosition = this.row + this.col;
		int NextPosition = moveRow + moveCol;
		boolean isDiagonalValid = false;
		if(StartPosition == NextPosition) {
			isDiagonalValid = true;
		}else {
			if(StartPosition == (NextPosition + 2)) {
				isDiagonalValid = true;
			}else {
				if(StartPosition == (NextPosition - 2)) {
					isDiagonalValid = true;
				}
			}
		}
		return isDiagonalValid;
	}	
	public void move(int row, int col) {
	}
	public void renderKing() {
		
	}
	public boolean isAttackForKing(int attackRow, int attackCol) {
		int StartPosition = this.row + this.col;
		int NextPosition = attackRow + attackCol;
		boolean isAttack = false;
		if(StartPosition == NextPosition) {
			isAttack = true;
		}else {
			if(StartPosition == (NextPosition + 2)) {
				isAttack = true;
			}else {
				if(StartPosition == (NextPosition - 2)) {
					isAttack = true;
				}
			}
		}
		return isAttack;
	}
	@Override
	public void attack(int attackRow, int attackCol) {
		if(isAttackForKing(attackRow, attackCol)) {
			this.row = attackRow;
			this.col = attackCol;
		}
	}
	@Override
	public void blast() {
		
	}
}
