import java.util.Arrays;

public class Deck {

    Card[] deck = new Card[48];

    // const
    Deck() {
        // oros
        for (int i = 0; i < 12; i++) {
            Card o = new Card(Card.Suite.OROS, i + 1);
            deck[i] = o;
        }

        // bastos
        for (int i = 0; i < 12; i++) {
            Card b = new Card(Card.Suite.BASTOS, i + 1);
            deck[i + 12] = b;
        }

        // espadas
        for (int i = 0; i < 12; i++) {
            Card e = new Card(Card.Suite.ESPADAS, i + 1);
            deck[i + 24] = e;
        }

        // copas
        for (int i = 0; i < 12; i++) {
            Card c = new Card(Card.Suite.COPAS, i + 1);
            deck[i + 36] = c;
        }
    }

    // printing Deck in console
    void printDeck() {
        System.out.println(Arrays.toString(this.deck));
    }

    // getter
    public Card[] getDeck() {
        return deck;
    }
}
