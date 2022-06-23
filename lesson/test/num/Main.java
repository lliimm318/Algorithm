package com.company.Algorithm.lesson.test.num;

import java.util.Scanner;

//백준 2609 최대공약수와 최소공배수
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int s = Math.min(num1, num2);

        int sAnswer = 0;
        for (int i = s; i > 0; i--) {
            if(num1 % i == 0 && num2 % i == 0) {
                sAnswer = i;
                break;
            }
        }
        System.out.println(sAnswer);
        System.out.println(num1*num2/sAnswer);
    }
}
