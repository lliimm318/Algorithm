package com.company.Algorithm.cording.test.passto.pro1;

public class Main {
    public static void main(String[] args) {
        int b = 5;

        int answer = 0;

        loop:
        for(int c=b+1; c <= b*b*2; c++){
            answer=  -1;
            for(int a=1; a<=b; a++){
                if((a*a)+(b*b)==(c*c)) {
                    answer = c;
                    break loop;
                }
                if((a*a)+(b*b)>(c*c)) {
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
