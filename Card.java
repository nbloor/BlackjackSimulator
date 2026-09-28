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

    public int getCardValue(){
        switch(this.value){
            case 'A':
                return 11;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            case 'T':
            case 'J':
            case 'Q':
            case 'K':
                return 10;
            default:
                throw new IllegalArgumentException("Invalid card value: " + this.value);
        }
    }
}