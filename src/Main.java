import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // MAD LIBS GAME
        String adjective1, noun, adjective2, verb, adjective3;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun (place or thing): ");
        noun = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb ending with -ing (action words): ");
        verb = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();

        scanner.close();

        System.out.println("\nTHE ZOO VISIT");
        System.out.println("Today I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun + "." );
        System.out.println(noun + " was " + adjective2 + " and " + verb + "!");
        System.out.println("I was " + adjective3 + "!");

    }
}
