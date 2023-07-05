package com.company.Algorithm.algorithm.leetcode.zigzag.conversion;

public class Main {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;

        String s1 = convert(s, numRows);
        System.out.println(s1);
    }

    private static String convert(String s, int numRows) {
        String[] temp = new String[numRows];
        int row = 0;
        int end = 1;

        for (int i = 0; i < numRows; i++) {
            temp[i] = "";
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            temp[row] += c;
            if (row == numRows - 1){
                end = -1;
            }
            else if (row == 0){
                end = 1;
            }
            row = row + end;
            row = Math.max(0, row);
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numRows && s.length() > 0; i ++){
            result.append(temp[i]);
        }
        return result.toString();
    }
}
