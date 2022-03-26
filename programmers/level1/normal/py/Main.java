package com.company.Algorithm.programmers.level1.normal.py;

//문자열 내 p와 y의 개수
public class Main {
    public static void main(String[] args) {
        String s = "pPoooy";
        boolean answer = true;

        int cnt = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.substring(i, i+1).equals("p") || s.substring(i,i+1).equals("P")) {
                cnt++;
            }
            else if(s.substring(i, i+1).equals("y") || s.substring(i,i+1).equals("Y")) {
                cnt--;
            }

        }
        if(cnt !=0 ) {
            answer = false;
        }

        System.out.println(answer);
    }
}
