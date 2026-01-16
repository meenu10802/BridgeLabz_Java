package CoreProgramming.Strings.Level1;

import java.util.Scanner;

public class PrintLetters {
    public static char[] USerDefinedArray(String str) {
        char userDefinedStringArray[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            userDefinedStringArray[i] = str.charAt(i);
        }
        return userDefinedStringArray;
    }
    public static boolean compareArray(char[] text1,char[] text2){
        if(text1.length!=text2.length){
            return false;
        }
        for(int i=0;i<text1.length;i++){
            if(text1[i]!=text2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.next();
        char[] builtInStringArray=str.toCharArray();
        char[] userDefinedResult=USerDefinedArray(str);
        System.out.println("Both Array Matches:" +compareArray(builtInStringArray,userDefinedResult));
    }
}