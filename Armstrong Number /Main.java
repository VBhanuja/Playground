import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int number, temp, total = 0;
        number = n;

        for( ;number!=0;number /= 10)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
        }

        if(total == n)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not a Armstrong Number");
	}
}