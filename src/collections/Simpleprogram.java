package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Simpleprogram {
    void done(){
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(6);
        System.out.println("Removed from list : "+list.remove(0));
        int y= Collections.max(list);
        System.out.println("Maximum of Element is : "+y);
        int x = Collections.min(list);
        System.out.println("Minimum of a given list is : "+x);
        Collections.sort(list);
        System.out.println("Arranging of elements : "+list);
        Collections.reverse(list);
        System.out.println("Reverse of Elements : "+list);
        System.out.println("Sorted List is : "+list);
        System.out.println("Element found at : "+Collections.binarySearch(list,4));
    }
}

class A{
    public static void main(String[] args) {
        Simpleprogram s = new Simpleprogram();
        s.done();
    }
}
