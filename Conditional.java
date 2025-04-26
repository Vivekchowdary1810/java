
import java.util.Scanner;
public class Conditional {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number 1");
        int number1 = sc.nextInt();
        System.out.println("Enter number 2");
        int number2 = sc.nextInt();
        System.out.println("Enter number 3");
        int number3 =sc. nextInt(); 
        if(number1>number2 && number1>number3){

            System.out.println(number1);
            System.out.println("greatest number 1");
        }
            else if(number2>number3){
                System.out.println(number2);
                System.out.println("greatest number 2");

            }
            else{
                System.out.println(number3);
                System.out.println("greatest number 3");
            }
        
    }
}
