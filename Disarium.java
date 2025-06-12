import java.util.Scanner;
public class Disarium {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner scan = new Scanner(System.in);
        int number=scan.nextInt();
        int temp=number;
        int count=0;
        int result=0;
        while(number>0){
            number/=10;
            count++;
        }
        number=temp;
        while(number>0){
            int digit=number%10;
            result+=(int)Math.pow(digit,count);
            number/=10;
            count--;
        }
        if(temp==result){
            System.out.println("Given number is Disarium:"+result);
        }
        else{
            System.out.println("Given number is not an Disarium:"+result);
        }

    }
    
}
