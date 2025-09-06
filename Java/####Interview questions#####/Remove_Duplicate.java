/* REMOVE DUPLICATE IN AN STRING */

public class Remove_Duplicate {
    // public static boolean arr[] = new boolean[26];
    // public static void removeDuplicate(String str, int idx, String newString )
    // {
    //     if(idx == str.length())
    //     {
    //         System.out.println(newString);
    //         return;
    //     }

    //     char currentchar= str.charAt(idx);
    //     if(arr[currentchar-'a'] == true)
    //     {
    //         removeDuplicate(str, idx+1, newString);
    //     }
    //     else{
    //         newString += currentchar;
    //         arr[currentchar-'a'] = true;
    //         removeDuplicate(str, idx+1, newString);
    //     }


       


    // }
    // public static void main(String[] args) {
    //     String str = "abaacbd";
    //     removeDuplicate(str, 0, "");
    // }























/* REMOVE DUPLICATE IN AN INTEGER ARRAY WITOUT USING ANOTHER ARRAY */


    static int removeDuplicate(int[] arr){
        int rd = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[rd] != arr[i]){
                rd++;
                arr[rd] = arr[i];
            }
            else{
                continue;
            }
           
        }
         return rd+1;
    }
    public static void main(String[] args){

        int rd =0;
        int[] arr ={2,2,3,3,4,6,6};
        rd = removeDuplicate(arr);

        for(int i=0; i<rd;i++){
             System.out.print(arr[i]+" ");
        }
    }
    



}
