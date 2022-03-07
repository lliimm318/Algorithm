package com.company.highLevel.hash.pro2;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        String[] phone_book = {"119", "9767", "115"};
        boolean answer = true;

        HashMap<String, String> phone = new HashMap<>();

        for (String number : phone_book) {
            phone.put(number, number);
        }

        for (String number : phone_book) {
            for (int i = 0; i < number.length(); i++) {
                if (phone.containsKey(number.substring(0, i))) {
                    answer = false;
                }
            }
        }

    }
}
