class Animal{
    void eat(){
    System.out.println("Animal is eating");

}
void sleep(){
    System.out.println("Animal is sleeping");
}
}
class Tiger extends Animal{
    void eat(){
    System.out.println("Tiger is hunt and eating");
}
}
class Monkey extends Animal{
    void eat(){
    System.out.println("Monkey is steal and eating");
}
}
class Deer extends Animal{
    void eat(){
    System.out.println("Deer is  searching and eating");
}
}
class Forest{
    void permit(Animal ref){
        ref.eat();
        ref.sleep();
    }
}

public class Launchanimal {
    public static void main(String args[]){
        Tiger t=new Tiger();
        Monkey m=new Monkey();
        Deer d=new Deer();

        Forest f=new Forest();
        f.permit(t);
        f.permit(m);
        f.permit(d);
    }
}
