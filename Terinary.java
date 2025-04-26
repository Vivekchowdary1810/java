import java.util.Scanner;
public class Terinary {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Emter the number");
        int number = sc.nextInt();
        String result ="none";
        result=number>0 ?"positive" :"Negative";
        System.out.println(result);
    
    }
    
}
