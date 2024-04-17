package com.rk.javabnb.db;

public class DataChecker {

    public DataChecker() {

    }

    public static boolean checkTfn(int tfn) {
        String temp = String.valueOf(tfn);
        return temp.length() == 9? true : false;
    }

    public static boolean checkDNI(String DNI) {
        boolean correctLenght = false;
        boolean correctDigit = false;
        char[] letras = {'T', 'R','W', 'A','G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        try {
            int numeros = Integer.parseInt(DNI.substring(0, DNI.length()-1));
            int index = numeros % 23;

            if(DNI.charAt(DNI.length()) == letras[index]) { correctDigit = true; }
            if(DNI.length() == 9) { correctLenght = true; }

            return correctDigit&&correctDigit? true : false;

        }catch (Exception e) {
            return false;
        }


    }

    public static  boolean checkPass(char[] pass) {
        return pass.length >8 ? true : false;
    }

}
