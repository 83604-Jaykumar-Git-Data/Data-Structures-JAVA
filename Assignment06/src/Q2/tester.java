package Q2;

public class tester {

	public static void main(String[] args) {

		BST B= new BST();
		B.addNode(6, B.getNode());
		B.preOrder();
		BST.Node c=B.binarySearch(6, B.getNode());
		if(c.getData()==6)
		{
			System.out.println("key is found!!!");
		}
		else
		{
			System.out.println("key is not found");
		}

	}

}
