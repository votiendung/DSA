import java.util.LinkedList;
import java.util.Queue;

public class myQueue {
    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();
        numbers.offer(100);
        numbers.offer(2);
        numbers.offer(3);
        numbers.offer(4);
        System.out.println("Queue: " + numbers);
        System.out.println("---------");

        int accessedNumber = numbers.peek();
        int a = numbers.peek();
        System.out.println("truy nhap phan tu: " + accessedNumber );
        System.out.println(a);

    }
}
