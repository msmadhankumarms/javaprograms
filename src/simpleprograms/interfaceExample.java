package simpleprograms;

public interface interfaceExample {
public void rect();
public void circle();

}


class interfaceE implements interfaceExample{

    @Override
    public void circle() {
        System.out.println("Area of circle ");
    }

    @Override
    public void rect() {
        System.out.println("Area of rectangle");
    }
}

class b{
    public static void main(String[] args) {
        interfaceE s =  new interfaceE();
                s.rect();
                s.circle();
    }
}