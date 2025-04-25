import java.util.Scanner;
public class Arthimetic{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your num1");
        int num1=sc.nextInt();
        System.out.println("Enter your num2");
        int num2=sc.nextInt();
        int result1=num1+num2;
        System.out.println("Addition result1:"+(result1));
        int result2=num1-num2;
        System.out.println("Subraction result2:"+(result2));
        int result3=num1*num2;
        System.out.println("Multiplication result3:"+(result3));
        int result4=num1-num2;
        System.out.println("Division result4:"+(result4));
    }
}