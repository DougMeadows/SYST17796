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

        //make 7 cards, add them to hand
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1); //random number for card value
            c.setSuit(Card.SUITS[random.nextInt(4)]); //random suit
            magicHand[i] = c; //put card in hand
        }

        //user picks card
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your cards value (1 for Ace, 11 for Jack, 12 for Queen, 13 for King):");
        int userValue = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your cards suit (Hearts, Diamonds, Spades, Clubs):");
        String userSuit = scanner.nextLine();

        //create users card
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

        //check magic hand for card
        boolean card_match = false;
        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equalsIgnoreCase(userCard.getSuit())) {
                card_match = true;
                break;
            }
        }

        //result
        if (card_match) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
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
