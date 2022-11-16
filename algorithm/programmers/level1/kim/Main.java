package com.company.Algorithm.algorithm.programmers.level1.kim;

// 12919번 서울에서 김서방 찾기
public class Main {
    public static void main(String[] args) {

        String[] seoul = {"Jane", "Kim"};

        String answer = "";

        for(int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
            }
        }
        System.out.println(answer);

    }
}
