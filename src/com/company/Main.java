package com.company;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        int k = 8;
        String text = "We have to wait so long for Game of Thrones!";

        String text1 = rectEncryption(text, k);

//        Date date =
        TwoDHashMap.fhmap();

        Student student1 = new Student("111", 111);
        Student student2 = new Student("222", 222);

        ArrayList<Student> stuArrayList = new ArrayList<Student>();

        //add
        stuArrayList.add(student1);
        stuArrayList.add(student1);
        stuArrayList.add(student1);

        student1.setGPA(123);// stuArrayList 里面三个元素全部改为 "123"

        stuArrayList.add(0, student2); //在数组最前面添加元素

        String[] strArray1 = new String[4];

        strArray1 = new String[5];


        String[] strArray = new String[]{"str1", "str2", "str3", "str4"};

        for (String str222 : strArray) {
            System.out.println(str222);
        }


//        Student student = new Student();

//        String[] strArray = {"str1","str2","str3","str4"};
//        for(String str : strArray){
//            System.out.println(str);
//        }


        String a = "XIXI";

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

        //rook2.

        int col = piece.move();

       // String

        Movie movie = new Movie("Iron Man");

        Member matt = new Member(movie);

        System.out.println(matt.getFavouriteMovie().getTitle());

        Member ellie = new Member(matt);

        ellie.setFavouriteMovie(new Movie("Copper Man"));

        System.out.println(matt.getFavouriteMovie().getTitle());

        System.out.println(ellie.getFavouriteMovie().getTitle());

        System.out.println("end");
    }
// 2016 S2 Q2
    public static int num_discs(int n, int[] s) {

        int numDisk = 1;
        int memoryLeft = n - s[1];

        for (int i = 1; i < s.length; i++){

            if (memoryLeft >= s[i]){
                memoryLeft = memoryLeft - s[i];
            }
            else{

            }



        }
        return n;
    }

    public static String rectEncryption(String text, int k){

        String outPut = "";

        //确认行数
        int numRow = text.length()/k;

        int numStar = k - text.length() % k; //最后一行*的数量

        if(text.length() % k != 0){
            numRow = numRow + 1;
        }

        text = text.toUpperCase(); //全部变成大写
        text = text.replaceAll(" ","#"); //用#代替空格

        //在字符串最后加上相应数量的*
        for(int i = 0; i < numStar; i++){
            text = text + "*";
        }

        //循环遍历 重新排序
        for(int i = 0; i < k; i += 1){
            for(int j = i; j < text.length(); j += k){
                outPut = outPut + text.charAt(j);
            }
        }

        return outPut;
    }


}


