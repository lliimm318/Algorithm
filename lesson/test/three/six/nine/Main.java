package com.company.Algorithm.lesson.test.three.six.nine;

import java.util.Scanner;

//백준 17614 369게임
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int answer = 0;
        int tsn = 0;

        for(int i = 0; i <= num; i++) {
            tsn = i;
            while(tsn != 0) {
                if(tsn%10 == 3 || tsn%10 == 6 || tsn%10 == 9) answer ++;

                tsn /= 10;
            }
        }

        System.out.println(answer);
    }
}
