import java.util.Scanner;
class Sumofdigits{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(sum(num));
    }
    public static int sum(int num){
        if(num==1)return 1;
        else return num+sum(num-1);
    }
    }

