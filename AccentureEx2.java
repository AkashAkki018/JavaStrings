public class AccentureEx2 {
    public static int CheckPassword(String arr)
    {
        if(arr.length()<4)
        return 0;
        if(arr.charAt(0) >= '0' && arr.charAt(0) <= '9')
        return 0;
        int cp=0;int d=0;

        for(int i=0;i<arr.length();i++)
        {
            if(arr.charAt(i) >= 'A' && arr.charAt(i) <= 'Z')
            cp++;
            if(arr.charAt(i) >= '1' && arr.charAt(i) <= '9')
            d++;
            if(arr.charAt(i) == ' ' || arr.charAt(i) == '/')
            return 0;
        }
        if(cp>0 && d>0)
        return 1;

        return -1;

    }


public static void main(String[] args) {
    
    String a="aA1_67";
    String b="a987 abC012";
    System.out.println(CheckPassword(a));
    System.out.println(CheckPassword(b));
 }
}

/* 

You are given a function.
int CheckPassword(char str[], int n);
The function accepts string str of size n as an argument. Implement the function which returns 1 if given string str is valid password else 0.
str is a valid password if it satisfies the below conditions.

– At least 4 characters
– At least one numeric digit
– At Least one Capital Letter
– Must not have space or slash (/)
– Starting character must not be a number
Assumption:
Input string will not be empty.

Example:

Input 1:
aA1_67
Input 2:
a987 abC012

Output 1:
1
Output 2:
0

*/