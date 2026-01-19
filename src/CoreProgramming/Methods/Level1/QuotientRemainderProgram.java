package CoreProgramming.Methods.Level1;

import java.util.Scanner;

class QuotientRemainderProgram{
    public static int[] findRemainderAndQuotient(int number,int divisor){
        int quotient=number/divisor;
        int remainder=number%divisor;
        return new int[]{quotient,remainder};
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int divisor=scanner.nextInt();
        int[] result=findRemainderAndQuotient(number,divisor);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
