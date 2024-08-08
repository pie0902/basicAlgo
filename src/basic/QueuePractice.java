package basic;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {
    public static void main(String[] args){
        int n = 5;
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i<=n; i++) {
            queue.add(i * 10);
        }
        for(int i = 0; i<n; i++) {
            System.out.println("Dequeue: " + queue.poll()); // 2
        }
    }
}
