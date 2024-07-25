class Palindrome
{

    public static boolean check(String a)
    {

         a=a.toLowerCase().replaceAll("[^a-bA-B]", "");

        int start=0,end=a.length()-1;
        while(start<=end)
        {
            if(a.charAt(start)!=a.charAt(end))
            {
                return false;
            }
            start++;end--;
        }

        return true;
    }


    public static void main(String[] args) {
        
        String str="race a car";
        System.out.println(check(str));
        String str2="A man, a plan, a canal: Panama";
        System.out.println(check(str));
    }
}