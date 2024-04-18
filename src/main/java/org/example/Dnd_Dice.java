package org.example;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Dnd_Dice {
    static void letsRoll() {

        Scanner scnr = new Scanner(System.in);
        Random random = new Random();
        System.out.println("\nWelcome to the DND Dice Roller " +  "Type in which Die you'd like to roll!");
        System.out.println("Choose from the dice below\nD4 (Outputs a number 1 - 4) \nD6 (Outputs a number 1 - 6)\nD8 (Outputs a number 1 - 9)\nD10 (Outputs a number 0 - 90 in tenths)\nD12 (Outputs a number 1 - 12)\nD100 (Outputs a number 0 - 9 and 0 - 90 using tenths)");
        String usersRoll = scnr.nextLine();

        int D4 = random.nextInt(4) + 1; // Outputs a number 1 - 4

        int D6 = random.nextInt(6) + 1; // Outputs a number 1 - 6

        int D8 = random.nextInt(8) + 1; // Outputs a number 1 - 9

        int D10 = random.nextInt(10); // Output 0 - 90 in tenths

        int D12 = random.nextInt(12) + 1; //Outputs a number 1 - 12

        int D20 = random.nextInt(20) + 1; //Outputs a number 1 - 20

        int D100 = random.nextInt(10); //Outputs a number 0 - 9

        switch (usersRoll) {
            case "D4":
                System.out.println(D4 + " is your roll!");
                break;
            case "D6":
                System.out.println(D6 + " is your roll!");
                break;
            case "D8":
                System.out.println(D8 + " is your roll!");
                break;
            case "D10":
                System.out.println(D10 * 10 + " is your roll!");
                break;
            case "D12":
                System.out.println(D12 + " is your roll!");
                break;
            case "D20":
                System.out.println(D20 + " is your roll!");
                break;
            case "D100":
                System.out.println(D100 + " & " + D10 * 10 + " is your roll!");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
    static void LetsContinue(){
        System.out.println("Want to roll again? if yes insert Y");
        Scanner scnr = new Scanner(System.in);
        String decide = scnr.nextLine();
        if(Objects.equals(decide,"Y")) {
            letsRoll();
            LetsContinue();
        } else {
            System.out.println("Thanks for using the Roller App!");
        }
    }
}
