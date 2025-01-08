package prec.logicalprograms.main;

import java.util.Scanner;
import prec.logicalprograms.CharacterCounting;

public class MainCharacterCounting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Create an instance of CharacterCounting and set the input string
        CharacterCounting charCounting = new CharacterCounting();
        charCounting.setVariable(userInput);

        // Call the method to count vowels and constants
        charCounting.countVowels();

        scanner.close();
    }
}
