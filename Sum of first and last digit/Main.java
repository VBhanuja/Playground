import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int m=n;
      while(n>10)
        n=n/10;
      m=m%10;
      System.out.println(n+m);
	}
}