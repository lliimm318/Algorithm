package com.company.Algorithm.programmers.level1.add.numbers;

//없는 숫자 더하기
public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
        int answer = 0;

        for(int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }

        System.out.println(45 - answer);

    }
}
