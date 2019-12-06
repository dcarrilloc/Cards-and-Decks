
import java.util.Arrays;

public class deck {
    public static void main(String[] args) {
        Baralla b1 = new Baralla();
        b1.imprimirBarallaVCheta();
    }
}

class Baralla {

    Carta [] baralla = new Carta[48];

    // const
    Baralla(){
        // oros
        Carta o1 = new Carta(Carta.Coll.OROS, Carta.Nombre.N1);
        baralla[0] = o1;
        Carta o2 = new Carta(Carta.Coll.OROS, Carta.Nombre.N2);
        baralla[1] = o2;
        Carta o3 = new Carta(Carta.Coll.OROS, Carta.Nombre.N3);
        baralla[2] = o3;
        Carta o4 = new Carta(Carta.Coll.OROS, Carta.Nombre.N4);
        Carta o5 = new Carta(Carta.Coll.OROS, Carta.Nombre.N5);
        Carta o6 = new Carta(Carta.Coll.OROS, Carta.Nombre.N6);
        Carta o7 = new Carta(Carta.Coll.OROS, Carta.Nombre.N7);
        Carta o8 = new Carta(Carta.Coll.OROS, Carta.Nombre.N8);
        Carta o9 = new Carta(Carta.Coll.OROS, Carta.Nombre.N9);
        Carta o10 = new Carta(Carta.Coll.OROS, Carta.Nombre.N10);
        Carta o11 = new Carta(Carta.Coll.OROS, Carta.Nombre.N11);
        Carta o12 = new Carta(Carta.Coll.OROS, Carta.Nombre.N12);

        // bastos
        Carta b1 = new Carta(Carta.Coll.BASTOS, Carta.Nombre.N1);
        Carta b2 = new Carta(Carta.Coll.BASTOS, Carta.Nombre.N2);
        Carta b3 = new Carta(Carta.Coll.BASTOS, Carta.Nombre.N3);
        Carta b4 = new Carta(Carta.Coll.BASTOS, Carta.Nombre.N4);
        Carta b5 = new Carta(Carta.Coll.BASTOS, Carta.Nombre.N5);
        Carta b6 = new Carta(Carta.Coll.BASTOS, Carta.Nombre.N6);
        Carta b7 = new Carta(Carta.Coll.BASTOS, Carta.Nombre.N7);
        Carta b8 = new Carta(Carta.Coll.BASTOS, Carta.Nombre.N8);
        Carta b9 = new Carta(Carta.Coll.BASTOS, Carta.Nombre.N9);
        Carta b10 = new Carta(Carta.Coll.BASTOS, Carta.Nombre.N10);
        Carta b11 = new Carta(Carta.Coll.BASTOS, Carta.Nombre.N11);
        Carta b12 = new Carta(Carta.Coll.BASTOS, Carta.Nombre.N12);

        // espases
        Carta e1 = new Carta(Carta.Coll.ESPASES, Carta.Nombre.N1);
        Carta e2 = new Carta(Carta.Coll.ESPASES, Carta.Nombre.N2);
        Carta e3 = new Carta(Carta.Coll.ESPASES, Carta.Nombre.N3);
        Carta e4 = new Carta(Carta.Coll.ESPASES, Carta.Nombre.N4);
        Carta e5 = new Carta(Carta.Coll.ESPASES, Carta.Nombre.N5);
        Carta e6 = new Carta(Carta.Coll.ESPASES, Carta.Nombre.N6);
        Carta e7 = new Carta(Carta.Coll.ESPASES, Carta.Nombre.N7);
        Carta e8 = new Carta(Carta.Coll.ESPASES, Carta.Nombre.N8);
        Carta e9 = new Carta(Carta.Coll.ESPASES, Carta.Nombre.N9);
        Carta e10 = new Carta(Carta.Coll.ESPASES, Carta.Nombre.N10);
        Carta e11 = new Carta(Carta.Coll.ESPASES, Carta.Nombre.N11);
        Carta e12 = new Carta(Carta.Coll.ESPASES, Carta.Nombre.N12);

        // copes
        Carta c1 = new Carta(Carta.Coll.COPES, Carta.Nombre.N1);
        Carta c2 = new Carta(Carta.Coll.COPES, Carta.Nombre.N2);
        Carta c3 = new Carta(Carta.Coll.COPES, Carta.Nombre.N3);
        Carta c4 = new Carta(Carta.Coll.COPES, Carta.Nombre.N4);
        Carta c5 = new Carta(Carta.Coll.COPES, Carta.Nombre.N5);
        Carta c6 = new Carta(Carta.Coll.COPES, Carta.Nombre.N6);
        Carta c7 = new Carta(Carta.Coll.COPES, Carta.Nombre.N7);
        Carta c8 = new Carta(Carta.Coll.COPES, Carta.Nombre.N8);
        Carta c9 = new Carta(Carta.Coll.COPES, Carta.Nombre.N9);
        Carta c10 = new Carta(Carta.Coll.COPES, Carta.Nombre.N10);
        Carta c11 = new Carta(Carta.Coll.COPES, Carta.Nombre.N11);
        Carta c12 = new Carta(Carta.Coll.COPES, Carta.Nombre.N12);
    }

    // imprimir pantalla vCheta
    void imprimirBarallaVCheta() {
        System.out.println(Arrays.toString(this.baralla));
    }

    // getter
    public Carta[] getBaralla() {
        return baralla;
    }
}
