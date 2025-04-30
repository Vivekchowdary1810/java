import java.util.Scanner;
public class Twodimensional {
    public static void main(String args[]){
        int arr[][]=new int[3][4];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
              System.out.println("Enter the marks of class"+i+"Student"+j);
              arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);

            }
    }
    
}
}
