package com.blz.deckofcards;

/*
 * @purpose :Deck of cards simulation
 * @file : DeckOfCards.java
 * @author : Karthik M C
 */
public class DeckOfCards {
    static String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
    static String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    static String[] deckOfCard = new String[suit.length * rank.length];

    /*
     * @purpose : Ability to Arrange Deck of cards uniquely
     * @param : No parameters
     * @function : Merging suit and rank to get unique deckofcards
     * @return : No return Value;
     */
    public void getUniqueCards() {
        int index = 0;// intialising deck index to zero
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                deckOfCard[index] = suit[i] + " : " + rank[j];
                index++;// incrementing index
            }
        }
    }

    /*
     * @purpose : Ability to print array
     * @param : String array
     * @function : Starts from index 0 of array and prints upto last indecies
     * @return : No return Value;
     */
    public void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to deck of cards simulation");
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.getUniqueCards();
        System.out.println("Unique cards are");
        deckOfCards.printArray(deckOfCard);
    }
}
