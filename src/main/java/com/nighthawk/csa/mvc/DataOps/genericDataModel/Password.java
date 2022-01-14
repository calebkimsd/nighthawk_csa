package com.nighthawk.csa.mvc.DataOps.genericDataModel;

import java.util.Random;

public class Password extends Generics {

    private static String Password() {
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerLetters = "abcdefghijklmnopqrstuvwxyz";
        String specialcharacters = "!@#?]";
        String numbers = "1234567890";

        Random r = new Random();
        String password = "";
        for(int i = 0; i < 2; i++) {
            password += capitalLetters.charAt(r.nextInt(capitalLetters.length()));
            password += lowerLetters.charAt(r.nextInt(lowerLetters.length()));
            password += specialcharacters.charAt(r.nextInt(specialcharacters.length()));
            password += numbers.charAt(r.nextInt(numbers.length()));
        }

        return password;
    }



    public void tester() {

        for(int i = 0; i < 10; i++) {
            System.out.println(Password());
        }
    }


    @Override
    protected KeyTypes getKey() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }
}
