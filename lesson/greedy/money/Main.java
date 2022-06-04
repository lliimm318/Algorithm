package com.company.Algorithm.lesson.greedy.money;

import java.util.Scanner;

//백준 5585 거스름돈
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int money = 1000 - n;
        int penny = 0;

        int[] coins = {500, 100, 50, 10, 5, 1};

        int cnt = 0;
        while (money > 0) {
            int s = money / coins[cnt];
            money -= s*coins[cnt];
            penny += s;
            cnt++;
        }

        System.out.println(penny);
    }
}
