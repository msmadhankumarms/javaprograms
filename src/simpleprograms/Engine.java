// Composition in inheritance it has a relation
package simpleprograms;
//Example 1
public class Engine {
    public void drive(){
        System.out.println("on first gear it is going on ");
    }
}

 class Car{
    private Engine engine;
    public  Car(){
    engine = new Engine();
    }
    public void drives(){
        engine.drive();
        System.out.println("Car is driving ");
    }
}

class ms{
    public static void main(String[] args) {
        Car c= new Car();
        c.drives();
        Family f=new Family();
        f.son();
    }
}

//Example 2
class Mother{
    public void data(){
        System.out.println("My mother has two children");
    }
}

class Family{
   private Mother mother;
   public  Family(){
       mother =new Mother();
   }
   public void son(){
        mother.data();
       System.out.println("Each Mother has its a Own Son");
   }
}

class B{
    public static void main(String[] args) {
        String s1=new String("hello").intern();
        String s2="hello";
        System.out.println(s1==s2);
    }
}