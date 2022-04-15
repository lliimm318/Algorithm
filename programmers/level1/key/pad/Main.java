package com.company.Algorithm.programmers.level1.key.pad;

//키패드 누르기
public class Main {
    public static void main(String[] args) {
        int[] number = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand = "left";

        String answer = "";
        int handL = 10;
        int handR = 12;

        for(int num : number) {
            if(num == 1 || num == 4 || num == 7) {
                answer += "L";
                handL = num;
            }
            else if(num == 3 || num == 6 || num == 9) {
                answer += "R";
                handR = num;
            }
            else {
                if(num == 0) {
                    num = 11;
                }
                int left = (Math.abs(handL - num)) / 3 + (Math.abs(handL-num)) %3;
                int right = (Math.abs(handR - num))/3 + (Math.abs(handR-num))%3;
                if (left > right) {
                    answer += "R";
                    handR = num;
                }
                else if(left < right) {
                    answer += "L";
                    handL = num;
                }
                else if(left == right) {
                    if(hand.equals("right")) {
                        answer += "R";
                        right = num;
                    }else {
                        answer += "L";
                        left = num;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
