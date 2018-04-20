package CodeChallenge;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodingChall {

    public static void main(String[] args) {

        System.out.println(order("wings"));

        System.out.println(countVowels("cup stacking is crazy fun"));

        System.out.println(tempConvert(104));

        System.out.println(extract("geekdom"));

    }

    public static String order(String word) {
        char[] tempArray = word.toCharArray();

        Arrays.sort(tempArray);

        return new String(tempArray);
    }

    public static int countVowels (String word) {

        int counter = 0;
        char[] tempArray = word.toLowerCase().toCharArray();

        for (int i = 0; i < tempArray.length; i++) {
            if ( tempArray[i] == 'a' || tempArray[i] == 'e' || tempArray[i] == 'i' ||
                    tempArray[i] == 'o' || tempArray[i] == 'u') {
                counter += 1;
            }
        }
        return counter;
    }

    public static String extract (String word) {
        String temp = "";
        for (int i = 0; i < word.length(); i++) {
            char tempChar = word.charAt(i);
            if (temp.indexOf(tempChar) < 0) {
                temp = temp + tempChar;
            } else {
                temp = temp.replace(String.valueOf(tempChar), "");
            }
        }
        return temp;
    }

    public static String tempConvert (double temp) {

        DecimalFormat df2 = new DecimalFormat(".#####");

        double celsius = (temp - 32) * ( (double)5/9);
        double celResult = celsius;
        double kelvin = celsius + 273.15;

        return temp + "°F " + " is " + df2.format(celResult) + "°" + " C" + " which is " + df2.format(kelvin) + " K";

    }

//    public static String caseConvert(String word) {
//        String temp = "";
//        for (int i = 0; i < word.length(); i++) {
//            char tempChar = word.charAt(i);
//            if (tempChar == '-') {
//
//            }
//        }
//
//        return null;
//    }
}
