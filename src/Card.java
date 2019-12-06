
public class Card {
    Suite suite;
    int number;

    // const
    public Card(Suite suite, int number) {
        this.suite = suite;
        this.number = number;
    }

    enum Suite {
        OROS,
        COPAS,
        ESPADAS,
        BASTOS
    }

    public String toString() {
        return this.suite + ": " + this.number;
    }
}
