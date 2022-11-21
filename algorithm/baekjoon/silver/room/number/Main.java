package com.company.Algorithm.algorithm.baekjoon.silver.room.number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 1475번 방 번호
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        int[] number = new int[10];

        for (String a : n.split("")) {
            int i = Integer.parseInt(a);
            if (i == 9) i = 6;

            number[i]++;
        }
        number[6] = number[6]/2 + number[6]%2;

        Arrays.sort(number);

        System.out.println(number[9]);
    }
}
