package Q4;

public class Q4 {
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int count;

    public Q4(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
        count = 0;
    }

    public void push(int value) {
        if (count == size) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % size;
        arr[rear] = value;
        if (front == -1) {
            front = rear; // Initialize front if it's the first element
        }
        count++;
    }

    public int pop() {
        if (count == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int poppedValue = arr[front];
        if (front == rear) {
            front = rear = -1; // Reset front and rear if it's the last element
        } else {
            front = (front + 1) % size; // Move front circularly
        }
        count--;
        return poppedValue;
    }

    public int peek() {
        if (count == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == size;
    }
}

