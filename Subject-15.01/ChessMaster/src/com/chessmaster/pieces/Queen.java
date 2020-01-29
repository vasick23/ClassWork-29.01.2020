package com.chessmaster.pieces;

public class Queen extends Piece{
	public Queen(String color, int row, int col){
		super(color, "Q",row,col);
		this.power = 10;
		this.id = 6;
	}
	public boolean isMoveActionValid(int moveRow, int moveCol) {
		int moveRowCoeficient = this.row - moveRow;
		int moveColCoeficient = this.col - moveCol;
		boolean isRowMoveValid = false;
		boolean isColMoveValid = false;
		if((moveRowCoeficient >= 0) && (moveColCoeficient <= 0)) {
			isColMoveValid = true;
			isRowMoveValid = true;
		}
		return isRowMoveValid && isColMoveValid;
	}
	public boolean isMoveDiagonalForQueen(int moveRow, int moveCol) {
		int moveRowCoeficient = this.row - moveRow;
		int moveColCoeficient = this.col - moveCol;
		int StartPosition = this.row + this.col;
		int NextPosition = moveRow + moveCol;
		boolean isDiagonalValid = false;
		if(StartPosition == NextPosition) {
			isDiagonalValid = true;
		}else {
			if(moveRowCoeficient == moveColCoeficient) {
				isDiagonalValid = true;
			}
		}
		return isDiagonalValid;
	}
	
	public void move(int row, int col) {
	}
	public void renderQueen() {
		
	}
	public boolean isAttackForQueen(int attackRow, int attackCol) {
		int attackRowCoeficient = this.row - attackRow;
		int attackColCoeficient = this.col - attackCol;
		boolean isRowAttackValid = false;
		boolean isColAttackValid = false;
		if((attackRowCoeficient >= 0) && (attackColCoeficient <= 0)) {
			isColAttackValid = true;
			isRowAttackValid = true;
		}
		return isRowAttackValid && isColAttackValid;
	}
	public boolean isAttackDiagonalForQueen(int attackRow, int attackCol) {
		int attackRowCoeficient = this.row - attackRow;
		int attackColCoeficient = this.col - attackCol;
		int StartPosition = this.row + this.col;
		int NextPosition = attackRow + attackCol;
		boolean isAttackValid = false;
		if(StartPosition == NextPosition) {
			isAttackValid = true;
		}else {
			if(attackRowCoeficient == attackColCoeficient) {
				isAttackValid = true;
			}
		}
		return isAttackValid;
	}
	@Override
	public void attack(int attackRow, int attackCol) {
		if((isAttackForQueen(attackRow, attackCol)) && (isAttackDiagonalForQueen(attackRow, attackCol))) {
			this.row = attackRow;
			this.col = attackCol;
		}
	}
	@Override
	public void blast() {

	}
}
