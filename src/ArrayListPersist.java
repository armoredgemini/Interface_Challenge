import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by ac003588 on 8/18/2017.
 */
public class ArrayListPersist implements IPersist {
    Integer index = 0;

    @Override
    public ArrayList readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    @Override
    public String setValues(Object o) {
        return o.toString();


    }
}
