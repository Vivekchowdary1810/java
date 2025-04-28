public class Palindrome {
    public static void main(String args[]){
        String s="abcba";
       String  ans="";
       for(int i=s.length()-1;i>-1;i--){
        ans=ans+s.charAt(i);
       }
       if(ans.equals(s)){
        System.out.println("Yes,ita a palindrome");
       }
       else{
        System.out.println("No,its not a palindrome");
       }

    }
}
