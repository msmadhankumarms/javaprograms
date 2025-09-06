package simpleprograms;

public class Enc {
    private int a;
    private String s;
    public int setData(int a){
        return this.a=a;
    }

    public String setStatus(String s){
        return this.s=s;
    }

    public int getData(){
        return a;
    }

    public String getStatus(){
        return s;
    }
}

class A{
    public static void main(String[] args) {
        Enc e= new Enc();
        e.setData(1);
        e.setStatus("Working Good ");
        System.out.println(e.getData());
        System.out.println(e.getStatus());
    }
}
