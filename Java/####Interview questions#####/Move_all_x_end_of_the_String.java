
public class Move_all_x_end_of_the_String {
    public static void moveallX(String str, int idx,int count,String newString)
    {
        if(idx==str.length())
        {   for(int i=1;i<=count;i++)
            {
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        if(str.charAt(idx)=='x')
        {
            count++;
            moveallX(str, idx+1, count, newString);
        }
        else{
            newString+=str.charAt(idx);
            moveallX(str, idx+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str ="axbxxcxd";
        moveallX(str, 0, 0,"");
    }
}
