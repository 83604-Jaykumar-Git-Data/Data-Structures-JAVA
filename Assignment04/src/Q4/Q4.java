package Q4;

public class Q4 {

	public static void main(String[] args) {
		List l1=new List();
		l1.addFirst(10);
		l1.addFirst(20);
		l1.addFirst(30);
		l1.addFirst(40);
		l1.addFirst(50);
		
		System.out.println("linked list is : ");
		l1.display();
		
		l1.rev();

	}

}
