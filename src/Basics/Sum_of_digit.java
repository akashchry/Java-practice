package Basics;

public class Sum_of_digit {
    public static void main(String [] Args){
        int num =1234;
        int sum=0;
        while(num>0){
            sum=sum+num %10;
            num=num/10;
        }
        System.out.println(sum);
    }
}
