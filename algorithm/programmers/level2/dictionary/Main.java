package com.company.Algorithm.algorithm.programmers.level2.dictionary;

//모음사전
public class Main {
    public static void main(String[] args) {
        String word = "E";

        int answer = 0;
        int max= 3905;

        String dictionary = "AEIOU";

        for(String s : word.split("")) {
            answer += dictionary.indexOf(s) * (max / 5) +1;
        }
        System.out.println(answer);

    }
}
