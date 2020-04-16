import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here  
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      System.out.println(sum(n));
	} 
  public static int sum(int n)
  {
    return (n*(n+1))/2;
  }
}