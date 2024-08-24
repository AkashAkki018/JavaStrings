/*
 * Question 8. You are given a program to find count of magical numbers from 1 
to N. A magical Number is defined by Following Criteria  
1. Replace 0 with 1 and 1 with 2 in binary string 
2. Calculate the sum of digits of modified binary string, if sum is odd it 
means its magical number. 
Input 1: 5 
Output 1: 2   
Explanation:  
1->1->2->even 
2->10->21->odd 
3->11->22->even 
 */

public class MagicalNumber {

    public static int countMagicalNumbers(int N) {
        int count = 0;
        
        for (int i = 1; i <= N; i++) {
            // Convert number to binary string
            String binaryString = Integer.toBinaryString(i);
            
            // Replace '0' with '1' and '1' with '2'
            StringBuilder modifiedString = new StringBuilder();
            for (char c : binaryString.toCharArray()) {
                if (c == '0') {
                    modifiedString.append('1');
                } else {
                    modifiedString.append('2');
                }
            }
            
            // Calculate the sum of digits
            int sum = 0;
            for (char c : modifiedString.toString().toCharArray()) {
                sum += Character.getNumericValue(c);
            }
            
            // Check if the sum is odd
            if (sum % 2 != 0) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        int N = 5;
        System.out.println("Count of magical numbers from 1 to " + N + " is: " + countMagicalNumbers(N));
    }
}
