package com.company.Algorithm.lesson.linearstructure.pro1;

//pro1
public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 29, 38, 12, 57, 74, 40, 85, 61};

        int max = 0;
        int cnt = 0;

        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
                cnt = i;
            }
        }
        System.out.println(max);
        System.out.println(cnt+1);
    }
}
