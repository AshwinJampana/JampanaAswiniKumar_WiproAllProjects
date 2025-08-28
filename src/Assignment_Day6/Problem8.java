package Assignment_Day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem8 {

    enum Suit {
        CLUBS, DIAMONDS, HEARTS, SPADES
    }

    enum Rank {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, 
        NINE, TEN, JACK, QUEEN, KING
    }


    static class Card {
        private final Suit suit;
        private final Rank rank;

        public Card(Suit suit, Rank rank) {
            this.suit = suit;
            this.rank = rank;
        }

        @Override
        public String toString() {
            return rank + " of " + suit;
        }
    }


    static class Deck {
        private final List<Card> cards;

        public Deck() {
            cards = new ArrayList<>();
            for (Suit suit : Suit.values()) {
                for (Rank rank : Rank.values()) {
                    cards.add(new Card(suit, rank));
                }
            }
        }

        public void shuffle() {
            Collections.shuffle(cards);
        }

        public void printDeck() {
            for (Card card : cards) {
                System.out.println(card);
            }
        }
    }

    public static void main(String[] args) {
        Deck deck = new Deck();
        
        System.out.println("=== Original Deck ===");
        deck.printDeck();
        
        System.out.println("\n=== Shuffled Deck ===");
        deck.shuffle();
        deck.printDeck();
    }
}