package collectionsandstreams.collections.queue;

/*
 * Circular buffer using array-based queue
 */
public class CircularBuffer {

    private int[] buffer;
    private int size;
    private int index = 0;

    public CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
    }

    public void insert(int value) {
        buffer[index % size] = value;
        index++;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(buffer[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        CircularBuffer buffer = new CircularBuffer(3);
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        buffer.insert(4);

        buffer.display(); // [2, 3, 4]
    }
}
