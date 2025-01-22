/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */

//Doug Meadows
//991176465

public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random random = new Random();

        // Generate 7 random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1); // Random value between 1 and 13
            c.setSuit(Card.SUITS[random.nextInt(4)]); // Random suit from SUITS array
            magicHand[i] = c; // Add card to the hand
        }

        //hard coded lucky card
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs");

        //check magic hand for lucky card
        boolean luckyCardFound = false;
        for (Card card : magicHand) {
            if (card.getValue() == luckyCard.getValue() && card.getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
                luckyCardFound = true;
                break;
            }
        }

        //output result
        if (luckyCardFound) {
            System.out.println("The lucky card (2 of Clubs) is in the magic hand!");
        } else {
            System.out.println("The lucky card (2 of Clubs) is not in the magic hand.");
        }

        //print magic hand
        System.out.println("************************");
        System.out.println("The magic hand contains:");
        for (int i = 0; i < magicHand.length; i++) {
            Card card = magicHand[i];
            System.out.println("Card " + (i + 1) + ": " + card.getValue() + " of " + card.getSuit());
        }
    }
}
