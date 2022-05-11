package com.company.Algorithm.programmers.level2.jump;

// 점프와 순간이동
public class Main {
    public static void main(String[] args) {
        System.out.println(solution(5));
    }
    public static int solution(int n) {
        return division(n);
    }
    public static int division(int k) {
        if(k == 1) {
            return 1;
        }
        else {
            return (division(k/2) + (k%2));
        }
    }
}
