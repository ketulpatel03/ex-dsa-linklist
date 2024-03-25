package com.java;

public class ConvertArray2LL {

    public static Node convertArray2LL(int[] arr) {
        int n = arr.length;
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i < n; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 8};
        System.out.println(convertArray2LL(arr));

    }

}
