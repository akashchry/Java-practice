package Basics;

public class Digit_count {
    public static void main(String [] args){
        int num =1234;
        int count =0;
        while(num>0){
            count +=1;
            num = num/10;
        }
    System.out.println(count);
    }
}
