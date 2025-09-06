package LinkedList;

import java.util.Scanner;

public class ReverseLinkList {

    public static Node<Integer> takeInput(){
        Node<Integer> head = null, tail = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
    
        while(data != -1){
            Node<Integer> newNode = new Node<Integer>(data);
    
            if(head.data == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode;
            }
            data = sc.nextInt();
        }
        return head;
    }


    public static void print(Node<Integer> head){
        while (head.data != null) {
            System.out.print(head.data+ " ");
            head = head.next;
        }
    }




    public static Node<Integer> reverse(Node<Integer> head){
        
    }



    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        print(head);
    }
    
}
