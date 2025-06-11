import java.util.Scanner;
public class Armstrong1 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        int temp=number;
        int result=0;
       int count=0;
       while(number>0){
       number/=10;
        count++;
       }
       number=temp;
       while(number>0){
        int digit=number%10;
        result=result+(int)Math.pow(digit,count);
       number/=10;
       }
       if(temp==result){
        System.out.println("Given number is Armstrong:"+result);
    }
    else{
        System.out.println("Given number is not an Armstrong:"+result);
    }   
    }
}
