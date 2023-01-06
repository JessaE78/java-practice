// Refreshing some java stuff while practicing getting comfy with git commands

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class stringPractice {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input string: ");
        String input = scan.nextLine();

        System.out.println("--------- STATS ---------");
        System.out.println("Length: " + input.length());
        System.out.println("Reversed: " + reverseString(input));
        System.out.println("Max recurring char: " + maxChar(input));


        scan.close();
    }

    public static String reverseString(String userString){
        String reversed = "";

        for(int i = userString.length() - 1; i >=0; i--){
            reversed += userString.charAt(i);
        }
        return reversed;
    }

    public static char maxChar(String userString){
        char maxRecur = ' ';

        int counter[] = new int[256];
        int max = 0;

        for(int i = 0; i < userString.length(); i++){
            counter[userString.charAt(i)]++;
        }

        for(int i = 0; i < userString.length(); i++){
            if(max < counter[userString.charAt(i)]){
                max = counter[userString.charAt(i)];
                maxRecur = userString.charAt(i);
            }
        }

        return maxRecur;
    }

}
