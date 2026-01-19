package CoreProgramming.Methods.Level1;

import java.util.Scanner;

class ChocolateDistributionProgram{
    public static int[] findRemainderAndQuotient(int number,int divisor){
        int quotient=number/divisor;
        int remainder=number%divisor;
        return new int[]{quotient,remainder};
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int numberOfChocolates=scanner.nextInt();
        int numberOfChildren=scanner.nextInt();
        int[] result=findRemainderAndQuotient(numberOfChocolates,numberOfChildren);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
