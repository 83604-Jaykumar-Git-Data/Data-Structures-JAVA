//Write a function to sort employees by their salary.
import java.util.Scanner;

class Employee
{
	int id;
	String name;
	double sal;
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public void add()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee id");
		id=sc.nextInt();
		System.out.println("enter name");
		name=sc.next();
		System.out.println("enter salary");
		sal=sc.nextDouble();		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
}


public class Q3 
{

	public static void main(String[] args) 
	{
		Employee arr[]=new Employee[3];
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < arr.length; i++)
		{
			arr[i]=new Employee();
			arr[i].add();			
		 System.out.println("==============================================================");
		}
		
		System.out.println("Employees before sort are : ");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i].toString());
		    	
		}
		//insertion sort
		for(int i = 1 ; i < arr.length ; i++) 
		{

			Employee temp = arr[i];	
			int j = i - 1;

			while(j >= 0 && arr[j].getSal() > temp.getSal()) 
			{							
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
		System.out.println("==============================================================");
		System.out.println("Employees after sort are : ");
		for (int i = 0; i < arr.length; i++)
		{
			
			System.out.println(arr[i].toString());		    	
		}

	}

}
