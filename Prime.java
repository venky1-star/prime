package mycaptain_java;
import java.util.Scanner;
public class Prime {
public static void main(String args[])
{
     int num,f=1;
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the number : ");
     num=sc.nextInt();
     
     for(int i=2;i<=num/2;i++)
     {
    	 if(num%i==0)
    	 {
    		 f=0;
    		 break;
    	 }
     }
     if(f==1)
    	 System.out.print("Prime number");
     else
    	 System.out.print("Not prime");
}
}
