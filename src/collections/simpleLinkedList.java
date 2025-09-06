package collections;

import java.util.LinkedList;

public class simpleLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(5);
        list.add(2);
        list.add(10);
        list.addFirst(9);
        list.addLast(0);
        System.out.println("The list is : "+list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println("Peek method : " + list.peek());
        System.out.println("Poll method : " + list.poll());
        System.out.println("After All methods the values are : " +list);
        try {
            System.out.println("Getting the First value of index : "+list.get(1));
        }
        catch(Exception e){
            System.out.println(" exception Occured "+ e);
        }
    }
}


