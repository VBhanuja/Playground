import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner st=new Scanner(System.in);
      int n=st.nextInt();
      int t=n%10;
      int s=(n/10)%10;
      int o=n/100;
      int res=(t*100)+(s*10)+o;
      System.out.println(res);        
	}
}