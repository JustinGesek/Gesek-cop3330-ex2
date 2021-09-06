/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 justin gesek
 */
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the input string? ");
        String inputString = scanner.nextLine();
        System.out.println(inputString + " has " + inputString.length() + " characters.");
    }
}

