public class Highest_Occuring_Character {
    public static void HighestOccurance(String str)
    {
        int max=0;
        int n=0;
        int ocr[]=new int[26];
        for(int i=0;i<str.length();i++)
        {
            ocr[str.charAt(i)-'a']++;
        }
        for(int i=0;i<ocr.length;i++)
        {
            if(max<ocr[i])
            {
                max=ocr[i];
                n=i;
            }
        }
        System.out.println((char)(n+'a'));
    }

    public static void main(String[] args) {
        String str="anfnsnaan";
       HighestOccurance(str);

    }
}
