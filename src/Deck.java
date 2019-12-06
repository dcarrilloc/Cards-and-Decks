import java.util.Arrays;

public class Deck {

    Card[] baralla = new Card[48];

    // const
    Deck(){
        // oros
        Card o1 = new Card(Card.Coll.OROS, Card.Nombre.N1);
        baralla[0] = o1;
        Card o2 = new Card(Card.Coll.OROS, Card.Nombre.N2);
        baralla[1] = o2;
        Card o3 = new Card(Card.Coll.OROS, Card.Nombre.N3);
        baralla[2] = o3;
        Card o4 = new Card(Card.Coll.OROS, Card.Nombre.N4);
        Card o5 = new Card(Card.Coll.OROS, Card.Nombre.N5);
        Card o6 = new Card(Card.Coll.OROS, Card.Nombre.N6);
        Card o7 = new Card(Card.Coll.OROS, Card.Nombre.N7);
        Card o8 = new Card(Card.Coll.OROS, Card.Nombre.N8);
        Card o9 = new Card(Card.Coll.OROS, Card.Nombre.N9);
        Card o10 = new Card(Card.Coll.OROS, Card.Nombre.N10);
        Card o11 = new Card(Card.Coll.OROS, Card.Nombre.N11);
        Card o12 = new Card(Card.Coll.OROS, Card.Nombre.N12);

        // bastos
        Card b1 = new Card(Card.Coll.BASTOS, Card.Nombre.N1);
        Card b2 = new Card(Card.Coll.BASTOS, Card.Nombre.N2);
        Card b3 = new Card(Card.Coll.BASTOS, Card.Nombre.N3);
        Card b4 = new Card(Card.Coll.BASTOS, Card.Nombre.N4);
        Card b5 = new Card(Card.Coll.BASTOS, Card.Nombre.N5);
        Card b6 = new Card(Card.Coll.BASTOS, Card.Nombre.N6);
        Card b7 = new Card(Card.Coll.BASTOS, Card.Nombre.N7);
        Card b8 = new Card(Card.Coll.BASTOS, Card.Nombre.N8);
        Card b9 = new Card(Card.Coll.BASTOS, Card.Nombre.N9);
        Card b10 = new Card(Card.Coll.BASTOS, Card.Nombre.N10);
        Card b11 = new Card(Card.Coll.BASTOS, Card.Nombre.N11);
        Card b12 = new Card(Card.Coll.BASTOS, Card.Nombre.N12);

        // espases
        Card e1 = new Card(Card.Coll.ESPASES, Card.Nombre.N1);
        Card e2 = new Card(Card.Coll.ESPASES, Card.Nombre.N2);
        Card e3 = new Card(Card.Coll.ESPASES, Card.Nombre.N3);
        Card e4 = new Card(Card.Coll.ESPASES, Card.Nombre.N4);
        Card e5 = new Card(Card.Coll.ESPASES, Card.Nombre.N5);
        Card e6 = new Card(Card.Coll.ESPASES, Card.Nombre.N6);
        Card e7 = new Card(Card.Coll.ESPASES, Card.Nombre.N7);
        Card e8 = new Card(Card.Coll.ESPASES, Card.Nombre.N8);
        Card e9 = new Card(Card.Coll.ESPASES, Card.Nombre.N9);
        Card e10 = new Card(Card.Coll.ESPASES, Card.Nombre.N10);
        Card e11 = new Card(Card.Coll.ESPASES, Card.Nombre.N11);
        Card e12 = new Card(Card.Coll.ESPASES, Card.Nombre.N12);

        // copes
        Card c1 = new Card(Card.Coll.COPES, Card.Nombre.N1);
        Card c2 = new Card(Card.Coll.COPES, Card.Nombre.N2);
        Card c3 = new Card(Card.Coll.COPES, Card.Nombre.N3);
        Card c4 = new Card(Card.Coll.COPES, Card.Nombre.N4);
        Card c5 = new Card(Card.Coll.COPES, Card.Nombre.N5);
        Card c6 = new Card(Card.Coll.COPES, Card.Nombre.N6);
        Card c7 = new Card(Card.Coll.COPES, Card.Nombre.N7);
        Card c8 = new Card(Card.Coll.COPES, Card.Nombre.N8);
        Card c9 = new Card(Card.Coll.COPES, Card.Nombre.N9);
        Card c10 = new Card(Card.Coll.COPES, Card.Nombre.N10);
        Card c11 = new Card(Card.Coll.COPES, Card.Nombre.N11);
        Card c12 = new Card(Card.Coll.COPES, Card.Nombre.N12);
    }

    // imprimir pantalla vCheta
    void imprimirBarallaVCheta() {
        System.out.println(Arrays.toString(this.baralla));
    }

    // getter
    public Card[] getBaralla() {
        return baralla;
    }
}
