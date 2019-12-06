
public class Card {
    Coll coll;
    Nombre nombre;

    // const
    public Card(Coll coll, Nombre nombre){
        this.coll = coll;
        this.nombre = nombre;
    }

    enum Coll {
        OROS,
        COPES,
        ESPASES,
        BASTOS
    }

    enum Nombre {
        N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12
    }

    public String toString(){
        return this.coll + ": " + this.nombre;
    }
}
