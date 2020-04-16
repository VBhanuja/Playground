import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int num=n;
      int m,r,sum=0;
      while(n>0)
      {
		m=1;
        r=n%10;
        for(int i=1;i<=r;i++)
			m=m*i;
        sum=sum+m;
        n=n/10;
      }
	  
      if(sum==num)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}