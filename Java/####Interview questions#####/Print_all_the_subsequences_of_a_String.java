import java.util.HashSet;
// public class Print_all_the_subsequences_of_a_String {
//     public static void subsequences(String str, int idx, String newString, HashSet<String> set)
//     {
//         if(idx==str.length())
//         {
//             if(set.contains(newString))
//             {
//                 return;
//             }
//             else{
//                 System.out.println(newString);
//                 set.add(newString);
//                 return;
//             }
//         }
//         char currentchar = str.charAt(idx);
//         //to be
//         subsequences(str, idx+1, newString+currentchar,set);
//         //or not to be
//         subsequences(str, idx+1, newString,set);
//     }
//     public static void main(String[] args) {
//         String str ="abc";
//         HashSet<String> set = new HashSet<>();//hash set of remove same occurance
//         subsequences(str, 0, "",set);
//     }
// }




















import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

class Solution {

    public static void solve(String str,String output,ArrayList<String> ans ,int index){

        if(index == str.length()){
           
           if (!output.isEmpty()) { // Ensure non-empty subsequences are added
                ans.add(output);
            }
            return;
        }

        //EXCLUDE
        solve(str, output, ans, index+1);

        //Include
        output += str.charAt(index);
        solve(str, output, ans, index+1);
        

        
    }

    public static ArrayList<String> subsequences(String str) {
        // Write your code here
        ArrayList<String> ans = new ArrayList<String>();
        String output = "";
        int index =0;

        solve(str,output,ans,index);

        return ans;

    }
}
