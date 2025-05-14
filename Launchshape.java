import java.util.Scanner;

abstract class shape{
    float area;
    abstract void acceptinput();
    abstract void compute();
    void display(){
    System.out.println(area);
}
}
class Triangle extends shape{
    float base;
    float height;
    void acceptinput(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the base");
        base=scan.nextFloat();
        System.out.println("Enter the height");
        height=scan.nextFloat();
    }
    void compute(){
        area=0.5f*base*height;
    }
}
class Rectangle extends shape{
    float length;
    float breadth;
void acceptinput(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length");
        length=scan.nextFloat();
        System.out.println("Enter the breadth");
        breadth=scan.nextFloat();
    }
    void compute(){
        area=length*breadth;
    }
}
class circle extends shape{
    float radius;
    void acceptinput(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the radius");
        radius=scan.nextFloat(); 
    }
    void compute(){
        area=3.142f*radius*radius;
    }
}
class Geometry{
    void permit(shape ref){
        ref.acceptinput();
        ref.compute();
        ref.display();
    }
}
public class Launchshape {
    public static void main(String[] args) {
        Triangle t=new Triangle();
        Rectangle r=new Rectangle();
        circle c=new circle();
        Geometry g=new Geometry();
        g.permit(t);
        g.permit(r);
        g.permit(c);
    }
    
}
