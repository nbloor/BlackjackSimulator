// This is a java class that will represent a playing card that contains a suit and value.
public class Card{

    private char suit;
    private char value;

    public Card(char suit, char value){
        this.suit = suit;
        this.value = value;
    }

    public char getSuit(){
        return this.suit;
    }

    public char getValue(){
        return this.value;
    }
}