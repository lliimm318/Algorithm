package com.company.Algorithm.programmers.level1.twozeroonesix;

//2016
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 24;

        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int date = 0;

        for(int i = 0; i < a-1; i++) {
            date +=month[i];
        }
        date += b-1;

        System.out.println(day[date%7]);
    }
}
