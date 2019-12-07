import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // initializing scanner
        Scanner sc = new Scanner(System.in);

        Deck deck;

        // printing menu
        System.out.printf("%n %s %n", "Deck type: ");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.printf("%-6s %-40s %s %n", "[1]", "Standard", "(48 cards)");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.printf("%-6s %-40s %s %n", "[2]", "Standard deck, except {8,9}", "(40 cards)");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.printf("%-6s %-40s %s %n", "[3]", "Customizable" ,"(Decide which cards won't be include)");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.print("Type your answer: ");
        int answer = sc.nextInt();

        switch (answer) {
            case 1:
                // standard
                Deck d1 = new Deck(1);
                System.out.println("Your deck is: ");
                d1.printDeck();
                break;
            case 2:
                // standard - {8, 9}
                Deck d2 = new Deck(2);
                System.out.println("Your deck is: ");
                d2.printDeck();
                break;
            case 3:
                // customizable
                System.out.print("Which are the numbers you don't want to appear in your deck?: ");
                String numbersToDelete = sc.next();
                Deck d3 = new Deck(numbersToDelete);
                System.out.println("Your deck is: ");
                d3.printDeck();
                break;
        }

        // why i can't work with d1/d2/d3...?¿

    }
}
