package collections;

import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> number= new LinkedList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(10);
        number.add(4);
        number.offer(20);
        System.out.println(number);
        PriorityQueue<Integer> s=new PriorityQueue<>();
        s.add(5);
        s.offer(20);
        System.out.println("Removes first element"+s.poll());
        System.out.println("Peek means first element"+s.peek());
        System.out.println(s);
        Deque<String> dq=new ArrayDeque<>();
        dq.addFirst("Madhan");
        dq.add("Going");
        dq.addFirst("I'am");
        dq.addLast("For Banglore");
        System.out.println("Dequeue Example done"+dq);
        //
        PriorityQueue<Integer> sp=new PriorityQueue<>(Comparator.naturalOrder());
       sp.add(2);
       sp.offer(20);
       sp.offer(10);
       sp.remove(1);
       sp.offer(5);
        System.out.println(sp.peek());
        System.out.println("Different methods we are trying"+sp);

        PriorityQueue<Integer> ms=new PriorityQueue<>(Comparator.reverseOrder());
        ms.add(2);
        ms.offer(20);
        ms.offer(10);
//        ms.remove(1);
        ms.offer(5);
        ms.add(10);
//        ms.poll();
        System.out.println("By reverse of order By priority Queue : " + ms);
    }
}
