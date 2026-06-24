package Basics;

public class Simple_interest {
    public static void main(String[] args){
        double price=120000;
        double rate=2;
        double time=3;
        double Sipmle_interest=(price*rate*time)/100;
        System.out.println("Sipmle interest is "+Sipmle_interest);
        double Total_amount=price +Sipmle_interest;
        System.out.println("Total amount is "+Total_amount);

    }
}
