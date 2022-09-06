package com.bridgelabz;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main (String[] args){
        System.out.println("********************************************");
        System.out.println(" Welcome to Automorphic Number Program....");   //Printing Welcome Meassage
        System.out.println("********************************************");


        System.out.println("Enter A Number --->");
        Scanner sc = new Scanner(System.in); // creating a scanner object
        int num = sc.nextInt();

         int l = (""+num).length(); // finding length of a number
         int  a = num*num; // storing square in a varibale
         int  b = a % (int)Math.pow(10,l); // indentifying last digits of a no.

   if ( num == b) // printing outputs
   {
       System.out.println(num+" Is A Automorphic Number.");
   }
else
{
       System.out.println(num+" Is Not A Automorphic Number.");
   }
}
}











