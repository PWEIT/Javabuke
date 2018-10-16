package com.company;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {


        String a = "XIXI555555";

        String s = "Hello";
        String s2 = "Hello";
        System.out.println(s == s2);
        System.out.println(s.equals(s2));

        String s3 = "Hello";
        String s4 = new String("Hello");
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));




                /*// write your code here
        String s1 = "object1";
        String s2 = "object1";
        String s3 = "object1";

        int a = Integer.parseInt("6");

        System.out.println("1 + 1 = " + (1 + 1));

        int radius = 10;

        double area = Math.PI * (radius * radius);

        int b = radius ^ 2;

        System.out.println(area);

        if (true || false) {
            System.out.println("ok");
        }*/
        // Some constants for good programmers
        /*final String WORD_SEPARATOR = "|";
        final String NAME_SEPARATOR = "_";
        final String SEPARATOR_REPLACEMENT = " ";

        int index = -1;

        String data = "Eleanor_Elias McMurtry 123456 False";

        // Extract first name
        index = data.indexOf(WORD_SEPARATOR);
        String firstName = data.substring(0, index + 1)
                .replace(NAME_SEPARATOR, NAME_SEPARATOR);

        data = data.substring(index + 1);

        // Extract last name
        index = data.indexOf(WORD_SEPARATOR);
        String lastName = data.substring(0, index + 1);

        data = data.substring(index + 1);

        // Extract student number
        //index = data.indexOf(WORD_SEPARATOR);


        int firstSpace = data.indexOf(SEPARATOR_REPLACEMENT);
        int thirdSpace = data.lastIndexOf(SEPARATOR_REPLACEMENT);
        String lastNameandNum = data.substring(firstSpace+1, thirdSpace);

        int secondSpace = lastNameandNum.indexOf(SEPARATOR_REPLACEMENT);
        String Num = lastNameandNum.substring(secondSpace+1);

        int studentNumber = Integer.parseInt("gggg");



        //int studentNumber = Integer.parseInt(data.substring(0, index + 1));

        data = data.substring(index + 1);

        // Extract degree type
        boolean isPostgrad = Boolean.parseBoolean(data);

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(studentNumber);
        System.out.println(isPostgrad);*/

        Piece piece = new Piece();
        piece.isValidMove(4,5);

        int row = piece.row;

        Rook rook = new Rook();
        rook.isValidMove(4,5);

        Rook rook2 = new Rook(3,6);

        rook2.

        int col = piece.move();

        String

        Movie movie = new Movie("Iron Man");

        Member matt = new Member(movie);

        System.out.println(matt.getFavouriteMovie().getTitle());

        Member ellie = new Member(matt);

        ellie.setFavouriteMovie(new Movie("Copper Man"));

        System.out.println(matt.getFavouriteMovie().getTitle());

        System.out.println(ellie.getFavouriteMovie().getTitle());

        System.out.println("end");
    }
}


