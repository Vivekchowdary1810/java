
    import java.util.Scanner;
public class Primenumbers{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int flag=0;
        for(int i=2; i<n/2; i++){
            if(n%i==0){
                flag=1;
                break;
            }
        }
            System.out.println((flag==1)?"Not an prime":"prime");
            }
}


