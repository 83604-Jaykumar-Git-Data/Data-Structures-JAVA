import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,r,sum=0;
		   Scanner sc=new Scanner(System.in);
		   System.out.println("enter the number");
		   num=sc.nextInt();
		   int numcopy=num;
		   
		   while(num>0)
		   {
			r=num%10;
			sum=sum*10+r;
			num=num/10;
		   }
		   if(sum==numcopy)
		   {
			System.out.println("Is a palidrome");   
		   }
		   else
		   {
			System.out.println("not a palidrome");   
		   }

		   sc.close();
	}

}
