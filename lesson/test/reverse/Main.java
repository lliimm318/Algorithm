package com.company.Algorithm.lesson.test.reverse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int R = sc.nextInt();
        String S = sc.next();

        String[] arr = S.split("");
        int num = (R-L)%2 == 1 ? (R-L)/2 + 1 : (R-L)/2;

        L--;
        R--;
        for (int i = 0; i < num; i++) {
            String tmp = arr[L];
            arr[L] = arr[R];
            arr[R] = tmp;

            L++;
            R--;
        }

        StringBuffer sb = new StringBuffer();
        for (String n : arr) {
            sb.append(n);
        }
        System.out.println(sb);
    }
}
