package Q1;

public class Q1 {

	public static void main(String[] args) {
		SinglyLinearLinkedList list = new SinglyLinearLinkedList();

        list.addFirst(40);
        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);

        list.addLast(50);
        list.addLast(60);

        list.delFirst();
        list.delLast();  

        list.display();

	}

}
