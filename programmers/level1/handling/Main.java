package com.company.Algorithm.programmers.level1.handling;

//문자열 다루기 기본
public class Main {
    public static void main(String[] args) {
        String s = "a1234";
        boolean answer = true;

        if(s.length() == 4 || s.length() == 6) {

            for (int i = 0; i < s.length(); i++) {
                if (!Character.isDigit(s.charAt(i))) {
                    answer = false;
                }
            }
        }
        System.out.println(answer);
    }
}


// Character.isDigit() -> 입력 값이 숫자인지 여부 판단
// Character.isLetter() -> 입력 값이 문자인지 여부 판단