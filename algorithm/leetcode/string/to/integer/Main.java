package com.company.Algorithm.algorithm.leetcode.string.to.integer;

// String to Integer
public class Main {
    public static void main(String[] args) {
        String s = "3.14159";

        System.out.println(s.substring(3));
        System.out.println(s);

        System.out.println(myAtoi(s));
    }

    public static int myAtoi(String s) {
        int sign = 1;
        int len = s.length();
        int i =0;
        // Filer whitespace
        while(i < len && Character.isWhitespace(s.charAt(i))){
            i++;
        }
        // Sign
        if(i <len && s.charAt(i)== '-'){
            sign = -1;
            i++;
        } else if( i< len && s.charAt(i) == '+'){
            i++;
        }
        // Calculate value
        long res = 0;
        boolean applySign = true;
        for(int j=i; j< len; j++){
            // Stop if it is not Digit
            if(!Character.isDigit(s.charAt(j))) break;

            if(sign == -1){
                res = res * 10 - (s.charAt(j) - '0') ; // Important to handle negative value
            } else {
                res = res * 10 + s.charAt(j) - '0' ;
            }


            // Overflow
            if(res <= Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            } else if( res >= Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }

        }

        return (int)res;
    }

    //4트
    public static int myAtoi4(String s) {
        String str = s.stripLeading().split("\\s+")[0];
        int sign = 1;
        long num = 0;

        if (str.length() == 0) return 0;
        else if (str.charAt(0) == '-') {
            sign = -1;
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isDigit(c)) {
                num = num * 10 + Character.getNumericValue(c);
            }
        }

        if (num > Integer.MAX_VALUE) {
            num = Integer.MAX_VALUE;
        }

        int answer = Long.valueOf(num).intValue();
        return sign * answer;
    }

    //3트
    public static int myAtoi3(String s) {
        int sign = 1;
        if (s.contains("-")) sign = -1;

        String num = s.replaceAll("[^0-9]", "");

        int answer = 0;
        int cnt = 0;
        for (int i = num.length()-1; i >= 0; i --) {
            answer += Integer.parseInt(String.valueOf(num.charAt(i))) * Math.pow(10, cnt);
            cnt++;
        }

        return answer * sign;
    }

    // 2트
    public static int myAtoi2(String s) {
        boolean sign = s.contains("-");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (Character.isDigit(c)) {
                sb.append(c);
            }
        }

        if (sign) {
           return Integer.parseInt(sb.toString()) * (-1);
        }

        return Integer.parseInt(sb.toString());
    }

    // 1트
    public static int myAtoi1(String s) {
        boolean sign = s.contains("-");

        int num = Integer.parseInt(s.replaceAll("[^0-9]", ""));

        if (sign) {
            num = num * (-1);
        }

        return num;
    }
}
