/*
Author: Harrison Toppen-Ryan
Description : Lab 4, MyStringManipulator.java, CSCI 145
Date: Febuary 7th, 2021 
*/

// importing java scanner from java.lang 
import java.util.Scanner;

public class MyStringManipulator {
    public static void main(String[] args) {
        // setting a new scanner for a string to be manipulated 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to be manipualted: ");
        String yourString = scanner.nextLine();
        // true statemnet to keep while loop going 
        boolean cont = true; 
        while (cont) {
            // asking user for command
            System.out.println("Enter your command (quit, print reverse, replace all, replace single, remove)");
            String inputedString = scanner.nextLine();
            // if the user wants to quit; end while loop
            if (inputedString.equals("quit") || inputedString.equals("Quit") || inputedString.equals("QUIT")) {
                cont = false;
                System.out.print("Goodbye!");
                break;
            }
            // if user wants to print the reverse of a string 
            else if (inputedString.equals("print reverse") || inputedString.equals("Print reverse") || inputedString.equals("PRINT reverse") || inputedString.equals("print REVERSE") || inputedString.equals("PRINT REVERSE") || inputedString.equals("Print Reverse") || inputedString.equals("print Reverse")) {
              printReverse(yourString);
                
            }
            // if user wants to replace all of a character in the string 
            else if (inputedString.equals("replace all") || inputedString.equals("Replace all") || inputedString.equals("REPLACE all") || inputedString.equals("replace ALL") || inputedString.equals("REPLACE ALL") || inputedString.equals("Replace All") || inputedString.equals("replace All")){
                System.out.println(replaceAll(yourString));
               
            }
            // if the user wants to remove a character from a string
            else if (inputedString.equals("remove") || inputedString.equals("Remove") || inputedString.equals("REMOVE")) {
                System.out.println(remove(yourString));
                
            }
            //if the user wants to replace only the first instance of a character in a string
            else if (inputedString.equals("replace single") || inputedString.equals("Replace single") || inputedString.equals("REPLACE single") || inputedString.equals("Replace Single") || inputedString.equals("REPLACE SINGLE") || inputedString.equals("replace SINGLE") || inputedString.equals("replace Single")) {
                System.out.println(replaceSingle(yourString);
               
            }
            // if the user dosen't enter in a valid input 
            else {
                System.out.println("Error: Not a valid input. Try again");
                
            }
        }
    }
    // printReverse function 
    public static void printReverse(String yourStrings) {
        // if the input if null, just return the string as is
        if (yourStrings == null) {
            System.out.println(yourStrings);
        }
        // for loop iterating though the string and returning the last character first and the first chracter last
        String output = "";
        for (int i = yourStrings.length() - 1; i >= 0; i--) {
            output = output + yourStrings.charAt(i);
        }
        // return output
        System.out.println(output);
    }

    // replace all function 
    public static String replaceAll(String yourString) {
        // ask the user for a characracter to replace with a new character 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character to replace: ");
        char inputedChar = scanner.next().charAt(0); 
        System.out.println("Enter a new character: ");
        char inputedNewChar = scanner.next().charAt(0);
        // convert string into array 
        char[] myArray = yourString.toCharArray();
        // if the index in thr array is the user's char they wanted changed, then chnage it to the new character the user inputed
        for (int c = 0; c < myArray.length; c++) {
            if (myArray[c] == inputedChar) {
                myArray[c] = inputedNewChar; 
            }
        }
        // convert array back into a string and return 
        String myArray2 = String.valueOf(myArray);
        yourString = myArray2;
        return yourString;
        
    }
    // remove functiom 
    public static String remove(String yourString) {
        // ask the user for a chracter they wanted removed
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character to remove: ");
        char inputedChar = scanner.next().charAt(0);
        // conver into a array
        char[] myArray = yourString.toCharArray();
        // if the index if the char the user wanted removed, replace with a blank space 
        for (int c = 0; c < myArray.length; c++) {
            if (myArray[c] == inputedChar) {
                myArray[c] = ' ';
                // convert bacj to string
                String myArray2 = String.valueOf(myArray);
                // remove whitespace 
                myArray2 = myArray2.replaceAll("\\s+", "");
                yourString = myArray2;
            }
        }
        // return new string
        return yourString;
    }
    // replace single function
    public static String replaceSingle(String yourString) {
         // ask the user for a characracter to replace with a new character
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character to replace: ");
        char inputedChar = scanner.next().charAt(0); 
        System.out.println("Enter a new character: ");
        char inputedNewChar = scanner.next().charAt(0); 
         // convert string into array
        char[] myArray = yourString.toCharArray();
        // if the index in thr array is the user's char they wanted changed, then chnage it to the new character the user inputed
        for (int c = 0; c < myArray.length; c++) {
            if (myArray[c] == inputedChar) {
                myArray[c] = inputedNewChar;
                String myArray2 = String.valueOf(myArray);
                yourString = myArray2;
                //break before the for loop continues and replaces others 
                break;
            }
        }
        // return new string
        return yourString; 

    }
        
}

