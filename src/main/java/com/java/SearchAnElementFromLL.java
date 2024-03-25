package com.java;

public class SearchAnElementFromLL {

    public static int searchElementInLinkedList(int[] arr, int s) {
        // getting head of a LinkedList
        Node head = ConvertArray2LL.convertArray2LL(arr);
        Node temp = head;

        while (temp != null) {
            if (temp.data == s) {
                return 1;
            }
            temp = temp.next;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 8};
        System.out.println(searchElementInLinkedList(arr, 12));
    }

}
