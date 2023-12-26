package Java.linklist;

public class LinkedListUse {
    
    public static void main(String[] args) {
        
        nnode n1 = new nnode(11);
        nnode n2 = new nnode(12);

        n1.next = n2;
        System.out.println(n1.data);
        System.out.println(n1.next);

        System.out.println(n2);
        System.out.println(n2.data);
        System.out.println(n2.next);
        
    }
}
