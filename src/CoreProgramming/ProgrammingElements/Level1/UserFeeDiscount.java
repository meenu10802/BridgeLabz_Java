package CoreProgramming.ProgrammingElements.Level1;

import java.util.Scanner;

public class UserFeeDiscount {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double fee=input.nextDouble();
        double discountPercent=input.nextDouble();
        double discountAmount=fee*discountPercent/100;
        double finalFee=fee-discountAmount;
        System.out.println("The discount amount is INR "+discountAmount+" and final discounted fee is INR "+finalFee);
    }
}
