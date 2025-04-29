public class Profit {
    public static void main(String args[]){
        int arr[]={7,1,5,3,6,4};
        int profit=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
             
                int temp=arr[j]-arr[i];
                
                    profit=Math.max(profit,temp);
                }
            }
        
        System.out.println(profit);
    }
    
}
