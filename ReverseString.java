/**
Assignment: Program to reverse String passed as input
Author: Michael Dada
Date: 17th May, 2019 
**/

import java.util.Scanner;
public class ReverseString {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

         
            String str = in.nextLine(); 
            String rev = " ";

        for(int s = str.length() - 1; s >= 0; s--) {
            rev = rev + str.charAt(s);
        }
        System.out.print("The reverse String is: " + rev);
        in.close();

    }
}