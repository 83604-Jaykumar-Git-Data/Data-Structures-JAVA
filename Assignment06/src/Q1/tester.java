package Q1;
public class tester {

	public static void main(String[] args) {
		BST B= new BST();
		B.addNode(99, B.getNode());
		B.preOrder();
		BST.Node c=B.binarySearch(99, B.getNode());
		if(c.getData()==99)
		{
			System.out.println(" key is found!!!");
		}
		else
		{
			System.out.println(" key is not found");
		}
	}

}
