import java.util.HashSet;
public class Print_all_the_subsequences_of_a_String {
    public static void subsequences(String str, int idx, String newString, HashSet<String> set)
    {
        if(idx==str.length())
        {
            if(set.contains(newString))
            {
                return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currentchar = str.charAt(idx);
        //to be
        subsequences(str, idx+1, newString+currentchar,set);
        //or not to be
        subsequences(str, idx+1, newString,set);
    }
    public static void main(String[] args) {
        String str ="xyz";
        HashSet<String> set = new HashSet<>();//hash set of remove same occurance
        subsequences(str, 0, "",set);
    }
}
