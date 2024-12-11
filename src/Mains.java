public class Mains {
    public static void main(String[] args){
        Circle map = new Circle(5);
        Rectangle pom = new Rectangle(4, 6);
        System.out.println(map.calculateArea());
        System.out.println(pom.calculateArea());
        map.draw();
        pom.draw();

        Human pem = new Human();
        pem.run("Nikolya");
    }
}

abstract class Shape implements Drawbale{
    int vr;
    abstract public double calculateArea();
    Shape(int vr){
        this.vr = vr;
    }

    }

class Circle extends Shape{
    double pi=3.14;
    int r;
    Circle(int r){
        super(5);
        System.out.println(super.vr);
        this.r = r;
    }
    @Override
    public double calculateArea(){
        double S;
        S = pi*(r*r);
        return S;
    }

    @Override
    public void draw(){
        System.out.println("Circle");
    }
}

class Rectangle extends Shape{
    int a;
    int b;
    Rectangle(int a, int b){
        super(10);
        this.a = a;
        this.b = b;
    }
    @Override
    public double calculateArea(){
        double S;
        S = a*b;
        return S;
    }
    @Override
    public void draw(){
        System.out.println("Rectangle");
    }

}

interface Drawbale{
    public void draw();
}

interface Runnbole{
    void run(String name);

    int ram = 1; //static
}

class Human implements Runnbole{
    String name;
    @Override
    public void run(String name) {
        System.out.println("Run stop " + name);
    }
}