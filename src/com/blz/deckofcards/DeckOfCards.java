package com.blz.deckofcards;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * @purpose :Deck of cards simulation
 * @file : DeckOfCards.java
 * @author : Karthik M C
 */
public class DeckOfCards {
    public static String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
    public static String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    public static String[] deckOfCard = new String[suit.length * rank.length];
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Player> playerList = new ArrayList<>();

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
    /*
     * @purpose : Ability to set player order
     * @param : No parameters
     * @function : Check for Number of players to play the game
     * @return : No return Value;
     */
    public void numOfPlayers() {
        System.out.println("Enter the number of players,range must be from 2 to 4");
        int playerCount = scanner.nextInt();
        if (playerCount >= 2 && playerCount <= 4) {

            for(int i =0;i<playerCount;i++){
                System.out.println("Enter player "+(i+1)+" name");
                String name = scanner.next();
                int playerNo = (i+1);
                playerList.add(new Player(name,playerNo));
            }
            System.out.println(playerCount + " players will play the game");
        } else {
            System.out.println("please enter the correct range");
            this.numOfPlayers();
            scanner.close();
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to deck of cards simulation");
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.getUniqueCards();
        System.out.println("Unique cards are");
        deckOfCards.printArray(deckOfCard);
        deckOfCards.numOfPlayers();
        System.out.println(playerList);
    }
}
