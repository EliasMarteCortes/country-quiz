import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Country> countries = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        loadCountries();
        System.out.println("Loaded " + countries.size() + " countries.");
        System.out.println(countries.get(0));
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
