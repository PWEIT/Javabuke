package com.company;

// 2016 S2 Q3(1) 泛型定义
public class Pair<K1, K2> {

    private K1 k1;
    private K2 k2;

    public Pair(K1 k1, K2 k2){

        this.k1 = k1;
        this.k2 = k2; //initial
    }

    public void setK1(K1 k1) {
        this.k1 = k1;
    }

    public K1 getK1(){
        return k1;
    }

    public void setK2(K2 k2) {
        this.k2 = k2;
    }

    public K2 getK2(){
        return k2;
    }
}
