package com.company.Algorithm.lesson.linearStructure.pro3;

//pro3
public class Main {
    public static void main(String[] args) {
        int num = 10;
        int[] number = new int[num];

        for(int i = 1; i <= num; i++) {
            int a = i / 10;
            int b = i % 10;

            if(a == 3 || a == 6 || a == 9 || b == 3 || b == 6 || b == 9) {
                System.out.println("X" + " ");
            }
            System.out.println(i + " ");
        }
    }
}
