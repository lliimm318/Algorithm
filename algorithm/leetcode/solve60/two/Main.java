package com.company.Algorithm.algorithm.leetcode.solve60.two;

// AddTwoNumbers
// https://leetcode.com/problems/add-two-numbers/description/?envType=list&envId=xo2bgr0r

public class Main {
    public static void main(String[] args) {
        //[2,4,3];
        // [5,6,4]
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int addNum = 0; // 10의 자리 덧셈
        ListNode result = new ListNode(0);
        ListNode answer = result;

        while (l1 != null || l2 != null) {
            int sum = addNum;

            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            if (sum > 9) {
                sum = sum - 10;
                addNum = 1;
            } else {
                addNum = 0;
            }

            result.next = new ListNode(sum);
            result = result.next;
        }

        if (addNum == 1) {
            result.next = new ListNode(addNum);
        }

        return answer.next;
    }

    // 테스트케이스
    // https://jaime-note.tistory.com/66

}
