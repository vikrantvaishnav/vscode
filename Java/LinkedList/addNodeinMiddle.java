package LinkedList;

import java.util.Scanner;

public class addNodeinMiddle {

   
    public static Node<Integer> takeInput(){
       
        Node<Integer> head= null ,tail=null;
        Scanner sc =new Scanner(System.in);
        System.out.println("Entedata");
        int data = sc.nextInt();

        while (data != -1) {
            Node<Integer> currentNode = new Node<Integer>(data);

            if(head == null){
                head = currentNode;
                tail = currentNode;
            }
            else{
                tail.next = currentNode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;

    }

    public static void print(Node<Integer> head){
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next; 
            
        }
        System.out.println();
    }


    public static Node<Integer> addNode(Node<Integer> head,int add ,int i){
        Node<Integer> temp = head;
        int j=0;
        Node<Integer> newnode = new Node<Integer>(add);

        if(i == 0){
            newnode.next = head;
            head = newnode;

        }
        
        while(j<i && temp != null){
            if(j == i-1){
                newnode.next = temp.next;
                temp.next = newnode;
                j++;
            }
            else{
                temp = temp.next;
                j++;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        int add = 30;
        int i = 8;

        head = addNode(head,add,i);

        print(head);
    }


    
    
}
