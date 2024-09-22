public class Stringsum
{
	public static void main(String[] args) {
		System.out.println("Hello World");String a="123";
		int sum=0;
		for(int i=0;i<a.length();i++)
		{
		    sum=sum+Character.getNumericValue(a.charAt(i));
		}
		System.out.println(sum);
	}
}