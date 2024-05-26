package LinkedList;
import java.util.*;

public class LinkedListUse {
    
    // public static void main(String[] args) {
        
    //     Node<Integer> n1 = new Node<>(11);
    //     Node<Integer> n2 = new Node<>(22);
    //     Node<Integer> n3 = new Node<> (33);

    //     n1.next = n2;
    //     n2.next = n3;
    //     Node<Integer> head = n1;
    //     // System.out.println(n1.data);
    //     // System.out.println(n1.next);

    //     // System.out.println(n2);
    //     // System.out.println(n2.data);
    //     // System.out.println(n2.next);


    //     while(head != null){
    //         System.out.print(head.data +" ");
    //         head = head.next;
    //     }
        
    // }









    // take Input


    // public static Node<Integer> takeInput(){

    //     Node<Integer> head = null, tail = null;
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enterdata");
    //     int data = sc.nextInt();

    //     while(data != -1){
    //         Node<Integer> newNode = new Node<>(data);
    //         if(head == null){
    //             head = newNode;
    //             tail = newNode;
    //         }
    //         else{
    //             // Node<Integer> temp = head;
    //             // while(temp.next != null){    /* here we traverse the node to find the null node where we can place new node */
    //             //     temp = temp.next;
    //             // }
    //             // temp.next = newNode;

    //             tail.next = newNode;   /*When we use to save next node adddres by usin tail Node */
    //             tail = newNode;
    //         }
    //         data = sc.nextInt();
    //     }
    //     return head;
    // }

    // public static void Print(Node<Integer> head){
        
    //     while(head != null){
    //         System.out.print(head.data +" ");
    //         head = head.next;
    //     }
    //     System.out.println();
    // }

    // public static void main(String[] args) {
    //     Node<Integer> head = takeInput();
    //     Print(head);
    // }






















/* Insert a Node in  a linked list  */

    // public static Node<Integer> takeInput(){
    //     Node<Integer> head = null, tail = null;
    //     System.out.println("Enter data");
    //     Scanner sc = new Scanner(System.in);
    //     int data = sc.nextInt();

    //     while(data != -1){
            
    //         Node<Integer> newNode = new Node<>(data);
    //         if(head == null){
    //             head = newNode;
    //             tail = newNode;
    //         }
    //         else{
    //             tail.next = newNode;
    //             tail = newNode;
    //         }
    //         data = sc.nextInt();
    //     }
    //     return head;
    // }

    // public static void print(Node<Integer> head){
    //     while(head != null){
    //         System.out.print(head.data+" ");
    //         head = head.next;
    //     }
        
    // }

    // public static Node<Integer> Insert(Node<Integer> head, int data, int pos){
    //     Node<Integer> newNode = new Node<>(data);

    //     if(pos == 0){
    //         newNode.next = head;
    //         return newNode;
    //     }
    //     int i=0;
    //     Node<Integer> temp =head;
    //     while(i < pos-1){
    //         temp = temp.next;
    //         i++; 
    //     }
    //     newNode.next = temp.next;
    //     temp.next = newNode;
    //     return head;
    // }


    // public static Node<Integer> Delete(Node<Integer> head,int pos){
        
    //     if(head ==null || pos<0){
    //         return head;
    //     }
    //     if(pos == 0){
    //         return head.next;
    //     }
    //     Node<Integer> temp = head;
    //     int i=0;
    //     while(i < pos-1 ){
    //         temp = temp.next;
    //         i++;
    //     }
    //     temp.next = temp.next.next;
        
    //     return head;
    // }


    // public static void main(String[] args) {
    //     Node<Integer> head =  takeInput();
    //     head = Insert(head,30,2);
    //     print(head); 
    //     System.out.println();
    //     head = Delete(head,1);   
    //     print(head);
    // }




















    // public static Node<Integer> takeInput(){

    //     Node<Integer> head = null, tail = null;
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enterdata");
    //     int data = sc.nextInt();

    //     while(data != -1){
    //         Node<Integer> newNode = new Node<>(data);
    //         if(head == null){
    //             head = newNode;
    //             tail = newNode;
    //         }
    //         else{
    //             tail.next = newNode;   /*When we use to save next node adddres by usin tail Node */
    //             tail = newNode;
    //         }
    //         data = sc.nextInt();
    //     }
    //     return head;
    // }

    // public static void Print(Node<Integer> head, int pos) {
    //     Node<Integer> temp = head;
    //     int i = 0;
    //     while (i < pos && temp != null) {
    //         temp = temp.next;
    //         i++;
    //     }
    //     if (temp != null) {
    //         System.out.println(temp.data);
    //     } else {
    //         System.out.println("Position " + pos + " not found in the linked list.");
    //     }
    // }
    

    // public static void main(String[] args) {
    //     Node<Integer> head = takeInput();
    //     System.out.println("enter a index");
    //     Scanner sc = new Scanner(System.in);
    //     int pos = sc.nextInt();
    //     Print(head,pos);
    // }        
    


















}
