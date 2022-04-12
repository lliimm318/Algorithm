package com.company.Algorithm.programmers.level2.next.big;

//다음 큰 숫자
public class Main {
    public static void main(String[] args) {
        int n = 78;

        int answer = 0;

        int one = 0;
        String s = Integer.toBinaryString(n);

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1') {
                one++;
            }
        }
        for(int i = n+1; i < 1000000; i++) {
            String num = Integer.toBinaryString(i);
            int tmp = 0;
            for(int j = 0; j < num.length(); j++) {
                if(num.charAt(j) == '1') {
                    tmp++;
                }
            }
            if (tmp == one) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}
