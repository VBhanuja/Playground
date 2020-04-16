import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    double n = in.nextInt();
      double a=in.nextInt();
      System.out.println(power(n,a));
	   
	}
	
	public static double power(double a,double b)
	{
	    double m=Math.pow(a,b);
      return m;
	}
}// End of Main class