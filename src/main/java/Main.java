/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gebruiker
 */
public class Main {
    public static void main(String[] args) {
        java.util.Scanner inputGame = new java.util.Scanner(System.in);
        System.out.print("Number: ");
        int number=inputGame.nextInt(); 
        if (number%3==0 && number%5==0)
            System.out.println("FizzBuzz");  
        else if (number%5==0)
            System.out.println("Fizz");       
        else if (number%3==0)
            System.out.println("Buzz");            
        else 
            System.out.println(number);
    }
}