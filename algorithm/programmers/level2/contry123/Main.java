package com.company.Algorithm.algorithm.programmers.level2.contry123;

// 12899번 124 나라의 숫자
public class Main {
    public static void main(String[] args) {
        int n = 3;
        String answer = "";

        int num = n;
        while (num > 0) {
            if(num%3 == 0) {
                answer = answer + "4";
                num--;
            }
            else if (num%3 == 1) {
                answer = answer + "1";
            } else {
                answer = answer + "2";
            }
            num /= 3;
        }

        System.out.println(answer);
    }
}
