/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author Ankita Sinha
 */
public class Mavenproject1 {




    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // generate a random number between 1 and 100
        int maxAttempts = 10; // set a maximum number of attempts
        int score = 0; // initialize the score to zero
        int attempts = 0; // initialize the number of attempts to zero
        boolean guessedCorrectly = false; // initialize the flag to false
        
        do {
            String input = JOptionPane.showInputDialog(null, "Guess the number between 1 and 100:");
            int guess = Integer.parseInt(input);
            attempts++; // increment the number of attempts
            if (guess == numberToGuess) {
                guessedCorrectly = true;
                JOptionPane.showMessageDialog(null, "You guessed the number correctly in " + attempts + " attempts!");
                score = maxAttempts - attempts; // calculate the score based on the number of attempts
            } else if (guess < numberToGuess) {
                JOptionPane.showMessageDialog(null, "Your guess is too low.");
            } else {
                JOptionPane.showMessageDialog(null, "Your guess is too high.");
            }
        } while (!guessedCorrectly && attempts < maxAttempts);
        
        if (!guessedCorrectly) {
            JOptionPane.showMessageDialog(null, "Sorry, you didn't guess the number in " + maxAttempts + " attempts. The number was " + numberToGuess + ".");
        } else {
            JOptionPane.showMessageDialog(null, "Your score is " + score + ".");
        }
    }
}