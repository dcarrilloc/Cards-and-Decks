import java.util.Arrays;

public class Deck {

    Card[] deck = new Card[48];

    // const
    Deck() {
        // oros
        Card o1 = new Card(Card.Suite.OROS, Card.Number.N1);
        deck[0] = o1;
        Card o2 = new Card(Card.Suite.OROS, Card.Number.N2);
        deck[1] = o2;
        Card o3 = new Card(Card.Suite.OROS, Card.Number.N3);
        deck[2] = o3;
        Card o4 = new Card(Card.Suite.OROS, Card.Number.N4);
        Card o5 = new Card(Card.Suite.OROS, Card.Number.N5);
        Card o6 = new Card(Card.Suite.OROS, Card.Number.N6);
        Card o7 = new Card(Card.Suite.OROS, Card.Number.N7);
        Card o8 = new Card(Card.Suite.OROS, Card.Number.N8);
        Card o9 = new Card(Card.Suite.OROS, Card.Number.N9);
        Card o10 = new Card(Card.Suite.OROS, Card.Number.N10);
        Card o11 = new Card(Card.Suite.OROS, Card.Number.N11);
        Card o12 = new Card(Card.Suite.OROS, Card.Number.N12);

        // bastos
        Card b1 = new Card(Card.Suite.BASTOS, Card.Number.N1);
        Card b2 = new Card(Card.Suite.BASTOS, Card.Number.N2);
        Card b3 = new Card(Card.Suite.BASTOS, Card.Number.N3);
        Card b4 = new Card(Card.Suite.BASTOS, Card.Number.N4);
        Card b5 = new Card(Card.Suite.BASTOS, Card.Number.N5);
        Card b6 = new Card(Card.Suite.BASTOS, Card.Number.N6);
        Card b7 = new Card(Card.Suite.BASTOS, Card.Number.N7);
        Card b8 = new Card(Card.Suite.BASTOS, Card.Number.N8);
        Card b9 = new Card(Card.Suite.BASTOS, Card.Number.N9);
        Card b10 = new Card(Card.Suite.BASTOS, Card.Number.N10);
        Card b11 = new Card(Card.Suite.BASTOS, Card.Number.N11);
        Card b12 = new Card(Card.Suite.BASTOS, Card.Number.N12);

        // espadas
        Card e1 = new Card(Card.Suite.ESPADAS, Card.Number.N1);
        Card e2 = new Card(Card.Suite.ESPADAS, Card.Number.N2);
        Card e3 = new Card(Card.Suite.ESPADAS, Card.Number.N3);
        Card e4 = new Card(Card.Suite.ESPADAS, Card.Number.N4);
        Card e5 = new Card(Card.Suite.ESPADAS, Card.Number.N5);
        Card e6 = new Card(Card.Suite.ESPADAS, Card.Number.N6);
        Card e7 = new Card(Card.Suite.ESPADAS, Card.Number.N7);
        Card e8 = new Card(Card.Suite.ESPADAS, Card.Number.N8);
        Card e9 = new Card(Card.Suite.ESPADAS, Card.Number.N9);
        Card e10 = new Card(Card.Suite.ESPADAS, Card.Number.N10);
        Card e11 = new Card(Card.Suite.ESPADAS, Card.Number.N11);
        Card e12 = new Card(Card.Suite.ESPADAS, Card.Number.N12);

        // copas
        Card c1 = new Card(Card.Suite.COPAS, Card.Number.N1);
        Card c2 = new Card(Card.Suite.COPAS, Card.Number.N2);
        Card c3 = new Card(Card.Suite.COPAS, Card.Number.N3);
        Card c4 = new Card(Card.Suite.COPAS, Card.Number.N4);
        Card c5 = new Card(Card.Suite.COPAS, Card.Number.N5);
        Card c6 = new Card(Card.Suite.COPAS, Card.Number.N6);
        Card c7 = new Card(Card.Suite.COPAS, Card.Number.N7);
        Card c8 = new Card(Card.Suite.COPAS, Card.Number.N8);
        Card c9 = new Card(Card.Suite.COPAS, Card.Number.N9);
        Card c10 = new Card(Card.Suite.COPAS, Card.Number.N10);
        Card c11 = new Card(Card.Suite.COPAS, Card.Number.N11);
        Card c12 = new Card(Card.Suite.COPAS, Card.Number.N12);
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
