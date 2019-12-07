import java.util.Arrays;

public class Deck {
    Card[] deck;

    // const 1
    Deck(int deckType) {
        int aux = 0;         // auxiliar
        switch (deckType) {
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
                    if (i != 7 && i != 8) {
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
        }
    }

    // const 2
    Deck(String numbersToDelete) {

        // find how many numbers to delete
        int numberOfNoNumbers = 0;
        for (int i = 0; i < numbersToDelete.length(); i++) {
            if (i == numbersToDelete.length() - 1) {
                if (numbersToDelete.charAt(i) == ','){
                    numberOfNoNumbers++;
                }
            } else {
                if (numbersToDelete.charAt(i) == ','){
                    numberOfNoNumbers++;
                } else if (numbersToDelete.charAt(i + 1) >= 48 && numbersToDelete.charAt(i + 1) <= 57){
                    numberOfNoNumbers++;
                }
            }
        }

        // creating array of numbers to delete
        int[] numbers = new int[numbersToDelete.length() - numberOfNoNumbers];
        System.out.println(numbersToDelete.length() - numberOfNoNumbers);

        // find which numbers to delete
        int aux = 0;
        for (int i = 0; i < numbersToDelete.length(); i++) {
            String number = "";
            if (numbersToDelete.charAt(i) >= 48 && numbersToDelete.charAt(i) <= 57) {
                if (i == numbersToDelete.length() - 1) {
                    if (numbersToDelete.charAt(i - 1) >= 48 && numbersToDelete.charAt(i - 1) <= 57) {
                        break;
                    } else {
                        numbers[aux] = Integer.parseInt(String.valueOf(numbersToDelete.charAt(i)));
                    }
                } else {
                    if (numbersToDelete.charAt(i + 1) >= 48 && numbersToDelete.charAt(i + 1) <= 57) {
                        numbers[aux] = Integer.parseInt(number.concat(String.valueOf(numbersToDelete.charAt(i)) + String.valueOf(numbersToDelete.charAt(i + 1))));
                    } else {
                        numbers[aux] = Integer.parseInt(String.valueOf(numbersToDelete.charAt(i)));
                    }
                }
                aux++;
            }
        }

        // creating the deck
        deck = new Card[48 - (numbers.length * 4)];
        aux = 0;
        boolean validNumber = true;
        // oros
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i + 1 == numbers[j]) {
                    validNumber = false;
                    break;
                }
            }
            if (validNumber) {
                Card o = new Card(Card.Suite.OROS, i + 1);
                deck[aux] = o;
                aux++;
            }
            validNumber = true;
        }

        // copas
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i + 1 == numbers[j]) {
                    validNumber = false;
                    break;
                }
            }
            if (validNumber) {
                Card c = new Card(Card.Suite.COPAS, i + 1);
                deck[aux] = c;
                aux++;
            }
            validNumber = true;
        }

        // bastos
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i + 1 == numbers[j]) {
                    validNumber = false;
                    break;
                }
            }
            if (validNumber) {
                Card b = new Card(Card.Suite.BASTOS, i + 1);
                deck[aux] = b;
                aux++;
            }
            validNumber = true;
        }

        // espadas
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i + 1 == numbers[j]) {
                    validNumber = false;
                    break;
                }
            }
            if (validNumber) {
                Card e = new Card(Card.Suite.ESPADAS, i + 1);
                deck[aux] = e;
                aux++;
            }
            validNumber = true;
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
