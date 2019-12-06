
public class card {
    public static void main(String[] args) {
        Carta c1 = new Carta(Carta.Coll.BASTOS, Carta.Nombre.N1);
        Carta c2 = new Carta(Carta.Coll.COPES, Carta.Nombre.N12);
        Carta c3 = new Carta(Carta.Coll.ESPASES, Carta.Nombre.N3);
        Carta c4 = new Carta(Carta.Coll.OROS, Carta.Nombre.N5);
        Carta c5 = new Carta(Carta.Coll.COPES, Carta.Nombre.N6);
    }
}

class Carta {
    Coll coll;
    Nombre nombre;

    // const
    public Carta(Coll coll, Nombre nombre){
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
