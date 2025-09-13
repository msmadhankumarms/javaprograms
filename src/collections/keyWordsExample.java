package collections;

class B {
    static int a = 5;

    static void keyword() {
        System.out.println(a);
    }

    static{
        System.out.println("Class loads at least once when we call within the static flower brackets");
    }
}
class V{
    final int x=10;
        final void data(){
            System.out.println(x);
        }
}


public class keyWordsExample {
    public static void main(String[] args) {
        //For Static methods without creating the object it executes
        B.keyword();

        V v= new V();
        v.data();
    }
}
