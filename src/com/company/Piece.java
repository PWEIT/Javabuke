package com.company;

public class Piece {

    protected int row;
    public int col;

    public Piece(){
        row = 10;
        col = 20;
    }

    public Piece(int row,int col){
        this.row = row;
        this.col = col;
    }

    public int move(){
        int test = this.row;
        int test2 = this.col;
        return col;
    }

    private int id;

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public boolean isValidMove(int toRow, int toCol) {
        return true;
    }
}
