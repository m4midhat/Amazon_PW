package org.amazon.utility;

import java.util.List;

public class Util {
    public static Integer parseStringToInt(String s){
        s = s.replaceAll(",", ""); //remove commas
        return (int)Math.round(Double.parseDouble(s)); //return rounded double cast to int
    }

    public static boolean isSorted(List<Integer> array) {
        for (int i = 0; i < array.size() - 1; i++) {
            if (array.get(i) < array.get(i + 1)) {
                System.out.println("Failure upon comparing : " + array.get(i)+" & "+ array.get(i+1));
                return false;
            }
        }
        return true;
    }

}
