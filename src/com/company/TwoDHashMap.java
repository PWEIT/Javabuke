package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TwoDHashMap{
    public static void fhmap(){

        HashMap<Integer, String> hMap = new HashMap<Integer, String>();

        hMap.put(11, "1st");
        hMap.put(22, "2nd");
        hMap.put(22, "3rd");

        String str = hMap.get(22);
    }

}