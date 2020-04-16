import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner st=new Scanner(System.in);
      int n=st.nextInt();
     int r=n/100;
      int s=n%10;
      System.out.println((r+s));        
	}
}