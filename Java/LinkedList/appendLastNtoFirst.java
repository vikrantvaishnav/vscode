package LinkedList;

import java.util.Scanner;

public class appendLastNtoFirst {
    
    public static Node<Integer> takeInput(){
        Node<Integer> head= null,tail = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data");
        int data = sc.nextInt();

        while(data != -1){

            Node<Integer> newNode = new Node<Integer>(data);

            if(head == null){
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
        while (head != null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
    
    public static Node<Integer> appendnode(Node<Integer> head,int pos){
        Node<Integer> temp = head;
        
        while(temp.next != null){
            temp = temp.next;

        }
        temp.next =head;

        Node<Integer> temp1 =head;
        int i=1;
        while(i != pos-1){
            temp1= temp1.next;
            i++;
        }
        head = temp1.next;
        temp1.next =null;

        return head;
    }





    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        head = appendnode(head, 4);
        print(head);
    }
}
