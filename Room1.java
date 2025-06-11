import java.util.Scanner;
public class Room1 {
    public static void main(String[] args) {      
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
      int a=scan.nextInt();
       int count=0;
       while(a>0){
       a/=10;
        count++;
       }
       System.out.println(count++);
       
    }
 }

