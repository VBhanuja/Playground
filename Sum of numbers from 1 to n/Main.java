import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner st= new Scanner(System.in);
      int n=st.nextInt();
      int s=0;
      for(int i=1;i<=n;i++)
      {
        s=s+i;
      }
      System.out.println(s);
	}
}