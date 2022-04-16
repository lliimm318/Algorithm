package com.company.Algorithm.cording.test.star.pro3;

import java.util.Scanner;

//별찍기 3
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            for(int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
