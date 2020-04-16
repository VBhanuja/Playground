import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int arr[]=new int[10];
      int r,sum=0,i=0;
      while(n>0)
      {
        r=n%10;
        arr[i]=r;
        n=n/10;
        i++;
      }     
      System.out.println(arr[i-2]);
	}
}