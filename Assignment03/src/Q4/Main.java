package Q4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Q4 queue = new Q4(5);
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\nCircular Queue Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Check if Queue is Empty");
            System.out.println("5. Check if Queue is Full");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = sc.nextInt();
                    queue.push(value);
                    break;
                case 2:
                    int poppedValue = queue.pop();
                    if (poppedValue != -1) {
                        System.out.println("Popped value: " + poppedValue);
                    }
                    break;
                case 3:
                    int frontValue = queue.peek();
                    if (frontValue != -1) {
                        System.out.println("Front value: " + frontValue);
                    }
                    break;
                case 4:
                    System.out.println("Queue is " + (queue.isEmpty() ? "empty" : "not empty"));
                    break;
                case 5:
                    System.out.println("Queue is " + (queue.isFull() ? "full" : "not full"));
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        sc.close();
    }
}

