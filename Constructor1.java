class Dog{
    String name;
    String color;
     int cost;
    Dog(){
        name="Charlie";
        color="Black";
        cost=15000;
 
    }
    Dog(String name,String color,int cost){
       this.name=name;
        this.color=color;
        this.cost=cost;

    }
    void display(){
        System.out.println(name);
        System.out.println(color);
        System.out.println(cost);
    }


}
public class Constructor1{
    public static void main(String args[]){
        Dog d1= new Dog();
        d1.display();
        Dog d2 = new Dog("Rocky","White",10000);
        d2.display();
    }
}
