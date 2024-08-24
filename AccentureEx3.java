public class AccentureEx3 {

    public static String convert(String a)
    {
        if(a.length()==0) return "";
        String r="";int c=0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='1')
            c++;
            else
            {
                if(c>0)
                {
                    r=r+(char)  (64+c);
                    c=0;
                }
            }
        }
        if(c>0)
        r=r+(char)  (64+c);

        return r;
    }
    public static void main(String[] args) {
        String a="1101110111111";
        System.out.println(convert(a));
    }
}
  /* 
   * QUESTION
   * 11=B
   * 1=A
   * 111=C
   * 0 is next next character is coming
   * if input is 10110111 --> output is ABC
   * 
   * 
   * ascii value 0f A is 65 so if 1 comes c=1 and we add 64+1 and convert it to char and add it to results
   *                           if 111 comes c=3 and we add 64+3=67  64 to char is C
   */