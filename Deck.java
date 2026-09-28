//This class will represent a deck of cards that contains 52 cards 
public class Deck {
    private boolean isShuffled;

    private char[] suits = new char[]{'H', 'D', 'C', 'S'};
    private char[] values = new char[]{'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};

    //TODO: Modify the constructor to create a deck of 52 cards using the Card class
    public Deck() {
        this.isShuffled = false;
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
        for (char suit : suits) {
            for (char value : values) {
                System.out.println(value + " of " + suit);
            }
        }
    }
}
