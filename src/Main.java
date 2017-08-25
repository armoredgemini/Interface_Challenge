import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by ac003588 on 8/15/2017.
 */
public class Main {
    public static void main(String[] args) {

        IPersist iface1 = new ArrayListPersist();
        Person person1 = new Person(iface1);

        person1.enterValues();
        person1.save();

        System.out.println(person1.toString());

    }
}

