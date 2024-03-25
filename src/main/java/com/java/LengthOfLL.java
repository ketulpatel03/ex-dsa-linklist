package com.java;

public class LengthOfLL {

    public static void main(String[] args) {

        int[] arr = {2, 1, 4, 8};

        // function convertArray2LL returns the head of the LinkedList
        // assigning the head and keeping it intact
        Node head = ConvertArray2LL.convertArray2LL(arr);

        // assigning head to the temp
        Node temp = head;

        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        System.out.println(count);
    }

}
