package collections;

import java.util.HashSet;
import java.util.*;

class Hash{
    // By using the hash set
    // It follows sorting order
    static void hashset(){
        HashSet<Integer> s=new HashSet<>();
        s.add(5);
        s.add(6);
        s.add(7);
        s.add(1);
        s.add(9);
        s.add(0);
        s.add(40);
        System.out.println(s);
        System.out.println("Checking weather the set is empty : "+s.isEmpty());
        System.out.println("Size of hashset : "+s.size());
        System.out.println("Checking weather the set is containing element : "+s.contains(1));
        System.out.println("Converting set to String : "+ s.toString());
    }
}
// It doesn't follow the sorting order
class Linked{
   static void link(){
        Set<Integer> lh=new LinkedHashSet<>();
        lh.add(20);
        lh.add(40);
        lh.remove(20);
        lh.add(1);
        lh.add(3);
        lh.add(14);
        lh.add(7);
       System.out.println("By using hash linked list : "+lh);
    }
}


public class setHashsetEx {
    public static void main(String[] args) {
            Hash.hashset();
            Linked.link();
    }
}
