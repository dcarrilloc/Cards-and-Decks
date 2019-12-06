
public class Card {
    Suite suite;
    Number number;

    // const
    public Card(Suite suite, Number number) {
        this.suite = suite;
        this.number = number;
    }

    enum Suite {
        OROS,
        COPAS,
        ESPADAS,
        BASTOS
    }

    enum Number {
        N1, N2, N3, N4, N5, N6, N7, N8, N9, N10, N11, N12
    }

    public String toString() {
        return this.suite + ": " + this.number;
    }
}
