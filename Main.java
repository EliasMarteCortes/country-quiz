import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
    static ArrayList<Country> countries = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) throws FileNotFoundException {
        loadCountries();
        System.out.println("Loaded " + countries.size() + " countries.");
        boolean running = true;
        while (running) {
            printMenu();
            String choice = input.nextLine();

            if (choice.equals("1") || choice.equals("2") || choice.equals("3")) {
                System.out.println("Game");
            } else if (choice.equals("4")) {
                running = false;
                System.out.println("Thanks for playing!");
            } else {
                System.out.println("Please enter 1, 2, 3, or 4.");
            }
        }
    }

    public static void printMenu() {
        System.out.println();
        System.out.println("===== COUNTRY QUIZ =====");
        System.out.println("1. Guess from clues");
        System.out.println("2. Computer guesses your country");
        System.out.println("3. Country Hunt");
        System.out.println("4. Quit");
        System.out.print("Choose an option: ");
    }

    public static Country findCountry(String name) {
        for (Country c : countries) {
            if (c.getName().equalsIgnoreCase(name.trim())) {
                return c;
            }
        }
        return null;
    }

    public static Country randomCountry() {
        int index = random.nextInt(countries.size());
        return countries.get(index);
    }

    public static void loadCountries() throws FileNotFoundException {
        Scanner file = new Scanner(new File("countries.csv"));
        file.nextLine();
        while (file.hasNextLine()) {
            String[] parts = file.nextLine().split(",");
            String name = parts[0];
            String capital = parts[1];
            String region = parts[2];
            String subregion = parts[3];
            String languages = parts[4];
            boolean landlocked = parts[5].equals("yes");
            double latitude = Double.parseDouble(parts[6]);
            double longitude = Double.parseDouble(parts[7]);

            countries.add(new Country(name, capital, region, subregion, languages, landlocked, latitude, longitude));
        }
        file.close();
    }
}
