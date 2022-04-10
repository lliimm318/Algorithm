package com.company.Algorithm.programmers.level2.bracket;

//올바른 괄호
public class Main {
    public static void main(String[] args) {
        String s = ")()(";
        boolean answer = true;

        int bucket = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                bucket++;
            }
            else {
                if(bucket <= 0) {

                }
                bucket--;
            }
        }
        if(bucket!=0) {
            answer = false;
        }


    }
}
