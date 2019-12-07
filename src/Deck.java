import java.util.Arrays;

public class Deck {
    Card[] deck;

    // const
    Deck(int deckType) {
        int aux = 0;         // auxiliar
        switch (deckType){
            case 1:
                deck = new Card[48];
                // oros
                for (int i = 0; i < 12; i++) {
                    Card o = new Card(Card.Suite.OROS, i + 1);
                    deck[aux] = o;
                    aux++;
                }

                // bastos
                for (int i = 0; i < 12; i++) {
                    Card b = new Card(Card.Suite.BASTOS, i + 1);
                    deck[aux] = b;
                    aux++;
                }

                // espadas
                for (int i = 0; i < 12; i++) {
                    Card e = new Card(Card.Suite.ESPADAS, i + 1);
                    deck[aux] = e;
                    aux++;
                }

                // copas
                for (int i = 0; i < 12; i++) {
                    Card c = new Card(Card.Suite.COPAS, i + 1);
                    deck[aux] = c;
                    aux++;
                }

                break;

            case 2:
                deck = new Card[40];
                // oros
                for (int i = 0; i < 12; i++) {
                    if (i != 7 && i != 8) {
                        Card o = new Card(Card.Suite.OROS, i + 1);
                        deck[aux] = o;
                        aux++;
                    }
                }

                // bastos
                for (int i = 0; i < 12; i++) {
                    if (i != 7 && i != 8){
                        Card b = new Card(Card.Suite.BASTOS, i + 1);
                        deck[aux] = b;
                        aux++;
                    }
                }

                // espadas
                for (int i = 0; i < 12; i++) {
                    if (i != 7 && i != 8) {
                        Card e = new Card(Card.Suite.ESPADAS, i + 1);
                        deck[aux] = e;
                        aux++;
                    }
                }

                // copas
                for (int i = 0; i < 12; i++) {
                    if (i != 7 && i != 8) {
                        Card c = new Card(Card.Suite.COPAS, i + 1);
                        deck[aux] = c;
                        aux++;
                    }
                }

                break;

            case 3:
                deck = new Card[36];
                //TODO
                break;
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
