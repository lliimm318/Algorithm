package com.company.Algorithm.algorithm.leetcode.addtwonumbers;

//Add Two Numbers
public class Main {
    public static void main(String[] args) {

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode answer = listNode;
        int temp = 0;

        while (l1 != null || l2 != null) {
            int sum = temp;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            if (sum > 9) {
                listNode.next = new ListNode(sum - 10);
                temp = 1;
            } else {
                listNode.next = new ListNode(sum);
                temp = 0;
            }

            listNode = listNode.next;
        }

        if (temp == 1) {
            listNode.next = new ListNode(1);
        }

        return answer.next;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
