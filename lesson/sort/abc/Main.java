package com.company.Algorithm.lesson.sort.abc;

import java.util.Scanner;

//백준 3047 ABC
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int tmp = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n -i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        String abc = sc.next();

        for(int i = 0; i < n; i++) {
            if(abc.charAt(i) == 'A') {
                System.out.println(arr[0]);
            }
            else if(abc.charAt(i) == 'B') {
                System.out.println(arr[1]);
            }
            else if(abc.charAt(i) == 'C') {
                System.out.println(arr[2]);
            }
        }
    }
}
