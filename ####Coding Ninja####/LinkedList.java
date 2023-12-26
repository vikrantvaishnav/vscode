public class LinkedList {
    //Linked List
    //  static Node head; 

    // public static class Node<N>{
    //     N data;
    //     Node<N> next;

    //     Node(N data)
    //     {
    //         this.data = data;
    //         this.next=null;
    //     }
    
    // }


    // public static void addfirst(int data)
    // {
    //     Node<Integer> newNode  = new Node<>(data);
        
    //     if(head==null)
    //     {
    //         head=newNode;
    //         return;
    //     }

    //     // System.out.println(head);
    //     newNode.next =head;
    //     head=newNode;
    //     // System.out.println(head);
    // }


    // public static void addlast(int data){
    //     Node<Integer> newNode = new Node<>(data);

    //     if(head==null)
    //     {
    //         head=newNode;
    //         return;
    //     }

    //     Node<Integer> curNode = head;
    //     while(curNode.next != null){
    //         curNode = curNode.next;
    //     }
    //     curNode.next = newNode;

    // }


    // public static void printList(){
    //     if(head==null)
    //     {
    //         System.out.println("empty");
    //         return;
    //     }

    //     Node<Integer> curNode = head;
    //     while(curNode != null){
    //         System.out.print(curNode.data+"->");
    //         curNode = curNode.next;
    //     }
    //     System.out.println("NULL");
        
    // }




    // public static void main(String[] args) {

    // LinkedList l = new LinkedList();
    // l.addfirst(20);
    // l.addfirst(30);
    // l.addlast(40);
    // l.printList();

    // // Node<Integer> n1 = new Node<>(10);
    // // Node<Integer> n2 = new Node<>(20);
    // // Node<Integer> n3 = new Node<>(30);
    // // Node<Integer> n4 = new Node<>(40);
     
    // // n1.next=n2;
    // // n2.next=n3;
    // // n3.next=n4;

  

    // // System.out.println(n2.data);
    // // System.out.println(n2.next);
    
    // }



























    // static Node head; 

    // public static class Node{
    //     Integer data;
    //     Node next;

    //     Node(int data)
    //     {
    //         this.data = data;
    //         this.next=null;
    //     }
    
    // }


    // public static void addfirst(int data)
    // {
    //     Node newNode  = new Node(data);
        
    //     if(head==null)
    //     {
    //         head=newNode;
    //         return;
    //     }

    //     newNode.next =head;
    //     head=newNode;
    // }


    // public static void addlast(int data){
    //     Node newNode = new Node(data);

    //     if(head==null)
    //     {
    //         head=newNode;
    //         return;
    //     }

    //     Node curNode = head;
    //     while(curNode.next != null){
    //         curNode = curNode.next;
    //     }
    //     curNode.next = newNode;

    // }


    // public static void printList(){
    //     if(head==null)
    //     {
    //         System.out.println("empty");
    //         return;
    //     }

    //     Node curNode = head;
    //     while(curNode != null){
    //         System.out.print(curNode.data+"->");
    //         curNode = curNode.next;
    //     }
    //     System.out.println("NULL");
        
    // }




    // public static void main(String[] args) {

    // LinkedList l = new LinkedList();
    // l.addfirst(10);
    // l.addfirst(0);
    // l.addlast(40);
    // l.printList();
    // }
  
















    int data;
    LinkedList next;
    LinkedList(int data)
    {
            this.data=data;
    }




    





    
}
