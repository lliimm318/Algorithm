package com.company.Algorithm.lesson.sort.add;

import java.util.Scanner;

//백준 11728번 배열 합치기
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] mer = new int[n+m];

        for(int i = 0; i < mer.length; i++) {

            System.out.println(mer[i]);
        }

    }
}
