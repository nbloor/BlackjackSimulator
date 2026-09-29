import java.util.ArrayList;

//This class will represent a deck of cards that contains 52 cards 
public class Deck {
    private boolean isShuffled;

    private char[] SUITS = new char[]{'H', 'D', 'C', 'S'};
    private char[] VALUES = new char[]{'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};
    private ArrayList<Card> deckOrder = new ArrayList<Card>(); 

    //TODO: Modify the constructor to create a deck of 52 cards using the Card class
    public Deck() {
        this.isShuffled = false;
        // Create the deck of 52 cards
        for (char suit : SUITS) {
            for (char value : VALUES) {
                deckOrder.add(new Card(value, suit));
            }
        }
    }

    private static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        deck.printDeck();
    }

    public void shuffle() {
        // TODO: Shuffle the deck of cards
        this.isShuffled = true;
    }

    public void printDeck() {
        // TODO: Print the deck of cards
        
    }

    public Card drawCard(){
        if (!deckOrder.isEmpty()) {
            return deckOrder.remove(deckOrder.size() - 1);
        } else {
            return null; // or throw an exception if preferred
        }
    }
}
