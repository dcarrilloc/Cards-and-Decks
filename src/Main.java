import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // initializing scanner
        Scanner sc = new Scanner(System.in);

        // printing menu
        System.out.printf("%n %s %n", "Deck type: ");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.printf("%-6s %-40s %s %n", "[1]", "Standard", "(48 cards)");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.printf("%-6s %-40s %s %n", "[2]", "Standard deck, except [8,9]", "(40 cards)");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.printf("%-6s %-40s %s %n", "[3]", "Customizable" ,"(Decide which cards won't be include)");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.print("Type your answer: ");

        switch (sc.nextInt()) {
            case 1:
                Deck d1 = new Deck(1);
                d1.printDeck();
                break;
            case 2:
                Deck d2 = new Deck(2);
                d2.printDeck();
                break;
        }
    }
}
