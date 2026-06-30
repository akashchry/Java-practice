package Basics;

public class palindrome {
    public static void main(String[] args) {
        int num=121;
        int temp =num;
        int rev =0;
        while(num>0){
            rev=rev*10+num%10;
            num/=10;
        }
        if(rev==temp){
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not Palindrome");
    }
}
