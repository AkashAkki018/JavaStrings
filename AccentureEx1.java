public class AccentureEx1 {

    public static void main(String[] args) {
        
        String a="1C0C1C1A0B1";

        int r=a.charAt(0) -'0';

        for(int i=1;i<a.length();i=i+2)
        {
            if(a.charAt(i)=='A')
            r=r & a.charAt(i+1) - '0';
            if(a.charAt(i)=='B') 
            r=r | a.charAt(i+1) - '0';
            if(a.charAt(i)=='C')
            r=r ^ a.charAt(i+1) - '0';
        }
            System.out.println(r);
    }
    
}
//A=AND operation
//B=OR operation
//C=EXOR operation