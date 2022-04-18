package com.company.Algorithm.programmers.level1.weird;

//이상한 문자 구하기
public class Main {
    public static void main(String[] args) {
        String s = "try hello world";

        String answer = "";

        String[] arr = s.toLowerCase().split(" ");

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length(); j++) {
                if (j % 2 == 0) {
                    answer += (arr[i].charAt(j) + "").toUpperCase();
                } else {
                    answer += (arr[i].charAt(j) + "").toLowerCase();
                }
            }
            answer += " ";
        }
        answer = answer.substring(0, answer.length()-1);
        System.out.println(answer);

    }
}
