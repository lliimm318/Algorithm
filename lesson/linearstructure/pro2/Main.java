package com.company.Algorithm.lesson.linearstructure.pro2;

//pro2
public class Main {
    public static void main(String[] args) {
        int[] arr = {20, 10, 35, 30, 7};

        int min = 1000000;
        int max = 0;

        for(int i = 0; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println(min + " " + max);
    }
}
