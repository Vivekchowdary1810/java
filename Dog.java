public class Dog  {
	String name;
	String color;
	int cost;	
	void eat(){
		System.out.println("dog is eating");
	}
		void bark(){
			System.out.println("dog is barking");
		}
		void sleep(){
			System.out.println("dog is sleeping");
		}
		
	
		
	}
            class Launch {
			public static void main(String args[]) {
				Dog d1=new Dog();
				d1.eat();
				d1.bark();
				d1.sleep();
				Dog d2=new Dog();
				d2.name="jacky";
				d2.color="white";
				d2.cost=5000;
				System.out.println(d2.name);
				System.out.println(d2.color);
				System.out.println(d2.cost);
				
			}
		}
	

