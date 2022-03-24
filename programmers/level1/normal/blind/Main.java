package com.company.Algorithm.programmers.level1.normal.blind;

//핸드폰 번호 가리기
public class Main {
    public static void main(String[] args) {
        String phone_number = "01033334444";

        StringBuffer sb = new StringBuffer();
        int str = phone_number.length();

        for(int i = 0; i < str-4; i++) {
            sb.append("*");
        }

        for (int i = str-4; i < str; i++) {
            sb.append(phone_number.charAt(i));
        }
        String answer = sb.toString();

    }
}
