
public class Tower_of_Hanoi {
    public static void TowerOfHanoi(int n, String source, String helper, String destination)
    {
        if(n==1){
            System.out.println("transfer disk "+n+" from "+source+" to "+destination);
            return;
        }
        TowerOfHanoi(n-1, source, destination, helper);
        System.out.println("transfer disk "+n+" from "+source+" to "+destination);
        TowerOfHanoi(n-1, helper, source, destination);
    }
    public static void main(String[] args) {
        int n=7;
        TowerOfHanoi(n, "S", "H", "D");
    }
}
