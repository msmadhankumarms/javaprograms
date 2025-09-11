package collections;

import java.util.*;

public class BasedSetExample {
    public static void main(String[] args) {
        //Hash set is a fast and no ordering
        Set<Integer> numbers = new HashSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(1);

        //By adding collections to the list on set
        List<Integer> s=new ArrayList<>(numbers);
        s.add(50);
        s.add(25);
        System.out.println("Before Sorting Elements : "+s);
        Collections.sort(s);
        System.out.println("After Sorting Elements : "+s);
    }
}
