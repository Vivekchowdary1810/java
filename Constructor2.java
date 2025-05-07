class Dog{
    String name;
    String color;
    int cost;
    Dog(){
        name="Rocky";
        color="White";
        cost=10000;
    }
    Dog(String name){
        this("Leo","Brown",20000);
        this.name=name;
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
//call from one constructor to another constructor within the same class
public class Constructor2 {
    public static void main(String args[]){
        Dog d = new Dog("Leo");
        d.display();
    }
    
}
