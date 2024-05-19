package Q2;

public class Q2 {

	public static void main(String[] args) {
		List l1=new List();
		
		l1.addFirst('y');
		l1.addFirst('a');
		l1.addFirst('j');
		l1.addFirst('*');
		l1.display();

		
		l1.addLast('k');
		l1.addLast('u');
		l1.addLast('m');
		l1.addLast('a');
		l1.addLast('r');
		l1.addLast('*');
		
		l1.display();
		
		l1.addPosition('U', 6);
		l1.display();
		
		l1.deleteFirst();
		l1.display();
		
		l1.deleteLast();
	
		l1.display();
	
		l1.addLast('*');
		l1.addLast('*');
		
		l1.display();
		
		l1.deletePosition(11);
		l1.display();
		
		
		l1.deletePosition(11);
		l1.display();
	}

}
