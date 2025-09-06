package LinkedList;

import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;

public class DetectLooop {

    // public static boolean detectloop(Node<?> head){
    //     if(head == null){
    //         return false;
    //     }
    //     Map<Node<?>, Boolean> visited = new HashMap<>();

    //     Node<?> temp = head;

    //     while(temp!= null){
    //         if(visited.containsKey(temp)){
    //             System.out.println("Present on element "+ temp.data);
    //             return true;
    //         }

    //         visited.put(temp, true);
    //         temp = temp.next;
    //     }
    //     return false;
    // }





// Floyd's cycle detection

    // static Node<?> detectloop(Node<?> head){
    //     if(head == null){
    //         return null;
    //     }
        
    //     Node<?> slow = head;
    //     Node<?> fast = head;

    //     while (slow != null &&fast != null && fast.next != null) {
    //         slow = slow.next;
    //         fast = fast.next.next;
    //         if(slow == fast){
    //             return slow;
    //         }
    //     }
    //     return null;
    // }

    // static Node<?> getStartNode(Node<?> head){
        
    //     Node<?> intersection = detectloop(head);
    //     if(intersection == null){
    //         return null;
    //     }
    //     Node<?> slow = head;

    //     while(slow != intersection){
    //         slow = slow.next;
    //         intersection = intersection.next;
    //     }
    //     return slow;

    // }


    // static void removeloop(Node<?> head){
    //     if(head == null){
    //         return;
    //     }

    //     Node<?> startloop = getStartNode(head);
    //     Node<?> temp = startloop;

    //     while(temp.next != startloop){
    //         temp = temp.next;
    //     }
    //     temp.next = null;
    // }












    public static int Length(Node<Integer> head){ 
        if(head == null){
            return 0;
        }
        Node<Integer> temp = head;
        int count=0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
        }


        public static Node<Integer> sort(Node<Integer> head){
            if(head ==null){
                return null;
            }

            int n= Length(head);

            
            for(int i=0;i<n;i++){
                Node<Integer> temp = head;
                for(int j=0;j<n-i-1;j++){
                    if(temp.next != null && temp.data > temp.next.data){
                        int swap = temp.data;
                        temp.data = temp.next.data;
                        temp.next.data = swap;
                    }
                    temp = temp.next;
                }
            }
            return head;
        }






public static void Print(Node<Integer> head){
        
        while(head != null){
            System.out.print(head.data +" ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node<Integer> n1 = new Node<>(1);
        Node<Integer> n2 = new Node<>(6);
        Node<Integer> n3 = new Node<>(9);
        Node<Integer> n4 = new Node<>(4);
        Node<Integer> n5 = new Node<>(3);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        Node<Integer> head = n1;


        head = sort(head);
        Print(head);

        // if (detectloop(head) != null) {
        //     System.out.println("Loop detected! ");
        //     System.out.println("Loop Present at:"+getStartNode(head).data);
        //     removeloop(head);
        //     System.out.print("After remove loop:");
        //     Print(head);
        // } else {
        //     System.out.println("No loop detected.");
        // }
    }
}
