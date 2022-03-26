package com.company.Algorithm.programmers.level1.normal.descending;

//문자열 내림차순으로 정렬하기
public class Main {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        String answer = "";

        char[] arr = new char[s.length()];
        int a = 0;
        for(int i = s.length(); i > 0; i--){
            arr[a] = s.charAt(i);
            a++;
        }
        answer = String.valueOf(arr);
        System.out.println(answer);

    }
}
