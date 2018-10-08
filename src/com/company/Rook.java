package com.company;

public class Rook extends Piece {

    public Rook(){
        this.col = 10;
        int bb = 20;
    }


    public Rook(int row,int col){
        super(row, col);
        this.col = col;
        this.row = row;
    }


    @Override
    public boolean isValidMove(int toRow, int toCol) {
        int row = 10;
        super.isValidMove(toRow,toCol);
        return (this.row == toRow) || (this.col == toCol);
    }

    public void Aa(){

    }
}