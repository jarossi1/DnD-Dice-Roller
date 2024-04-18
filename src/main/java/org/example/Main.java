package org.example;
import java.util.Scanner;

import static org.example.Dnd_Dice.LetsContinue;
import static org.example.Dnd_Dice.letsRoll;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        letsRoll();
        LetsContinue();
    }
}