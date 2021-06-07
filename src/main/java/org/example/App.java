/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 abdel nabut
 */


package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.print( "What is the quote? ");
        Scanner input = new Scanner(System.in);
        String quote = input.nextLine();
        System.out.print( "Who said it? ");
        String person = input.next();
        System.out.printf(person + " says, \"" + quote + ".\"");

    }
}
