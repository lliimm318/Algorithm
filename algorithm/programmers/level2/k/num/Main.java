package com.company.Algorithm.algorithm.programmers.level2.k.num;

// 92335번 k진수에서 소수 개수 구하기
public class Main {
    public static void main(String[] args) {
        solution(110011, 10);
    }
    public static int solution(int n, int k) {
        int answer = 0;
        StringBuilder number = new StringBuilder();

        while(n != 0){
            number.insert(0, n % k);
            n /= k;
        }

        String[] arr = number.toString().split("0");

        for(String s : arr){
            if(s.equals("")) continue;

            long num = Long.parseLong(s);
            if(num >= 2 && isPrime(num)) {
                answer++;
            }
        }

        return answer;
    }

    public static boolean isPrime (long a) {
        for(int i = 2; i <= Math.sqrt(a); i++) {
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }
}
