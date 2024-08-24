public class RemoveConsecutiveChars {

    public static String remove(String str)
    {
        String res="";
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)!=str.charAt(i+1))
            {
                res=res+str.charAt(i);
            }
        }

        res+=str.charAt(str.length()-1);
        return res;
    }
    public static void main(String[] args) {
        
        String str="aabbcdd";
        System.out.println(remove(str));
    }
    
}
