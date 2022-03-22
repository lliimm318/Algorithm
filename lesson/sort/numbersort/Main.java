package com.company.Algorithm.lesson.sort.numbersort;

import java.util.Scanner;

//백준 2750 수 정렬하기
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int key = 0;
        int j = 0;

        for(int i = 1; i < n; i++) {
            key = arr[i];
            for(j = i-1; j >= 0 && arr[j] > key; j--) {
                arr[j+1] = arr[j];

            }
            arr[j+1] = key;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
